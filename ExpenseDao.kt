package com.vasundhra.expensetracker.data

interface ExpenseDao {
    fun insertExpense(expense: Expense)
    fun getAllExpenses(): List<Expense>
    fun deleteExpense(expense: Expense)
}
