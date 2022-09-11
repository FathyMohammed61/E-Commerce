package deadCode.e_commerce.model.ComData

import androidx.fragment.app.Fragment

interface NavigationHost {

    fun navigateTo(fragment: Fragment, addToBackstack: Boolean)

    // (activity as NavigationHost).navigateTo(ProductGridFragment(), false)
}