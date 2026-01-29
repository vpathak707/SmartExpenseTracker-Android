package com.vasundhra.expensetracker.network

import com.vasundhra.expensetracker.data.Expense

interface ExpenseApi {
    suspend fun fetchExpenses(): List<Expense>
    suspend fun addExpense(expense: Expense)
}
