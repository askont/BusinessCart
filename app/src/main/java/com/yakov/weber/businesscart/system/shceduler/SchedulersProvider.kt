package com.yakov.weber.businesscart.system.shceduler

import io.reactivex.Scheduler
import io.reactivex.schedulers.Schedulers

/**
 * Created on 11.12.18
 * @author YWeber
 * project BusinessCart */

interface SchedulersProvider {
    fun ui():Scheduler
    fun io():Scheduler
    fun newThread():Scheduler
    fun computation():Scheduler
    fun trampoline():Scheduler
}