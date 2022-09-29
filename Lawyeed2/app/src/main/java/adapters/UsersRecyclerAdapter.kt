package adapters

import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.lawyeed2.R
import model.User

class UsersRecyclerAdapter(private val listUsers: List<User>) : RecyclerView.Adapter<UsersRecyclerAdapter.UserViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_user_recycler, parent, false)

        return UserViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.textViewFName.text = listUsers[position].fname
        holder.textViewLName.text = listUsers[position].lname
        holder.textViewEmail.text = listUsers[position].email
        holder.textViewPassword.text = listUsers[position].password
    }

    override fun getItemCount(): Int {
        return listUsers.size
    }

    inner class UserViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var textViewFName: AppCompatTextView
        var textViewLName: AppCompatTextView
        var textViewEmail: AppCompatTextView
        var textViewPassword: AppCompatTextView

        init {
            textViewFName = view.findViewById<View>(R.id.textViewFName) as AppCompatTextView
            textViewLName = view.findViewById<View>(R.id.textViewLName) as AppCompatTextView
            textViewEmail = view.findViewById<View>(R.id.textViewEmail) as AppCompatTextView
            textViewPassword = view.findViewById<View>(R.id.textViewPassword) as AppCompatTextView
        }
    }

}