package za;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.List;
public abstract class q {
    public static ArrayList a(Context context) {
        ActivityManager activityManager;
        kotlin.jvm.internal.i.e(context, "context");
        int i10 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        List<ActivityManager.RunningAppProcessInfo> list = null;
        if (systemService instanceof ActivityManager) {
            activityManager = (ActivityManager) systemService;
        } else {
            activityManager = null;
        }
        if (activityManager != null) {
            list = activityManager.getRunningAppProcesses();
        }
        if (list == null) {
            list = hd.o.f10956a;
        }
        ArrayList f7 = hd.g.f(list);
        ArrayList arrayList = new ArrayList();
        int size = f7.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = f7.get(i12);
            i12++;
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i10) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(hd.i.d(arrayList));
        int size2 = arrayList.size();
        while (i11 < size2) {
            Object obj2 = arrayList.get(i11);
            i11++;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj2;
            String str2 = runningAppProcessInfo.processName;
            kotlin.jvm.internal.i.d(str2, "runningAppProcessInfo.processName");
            arrayList2.add(new p(str2, runningAppProcessInfo.pid, runningAppProcessInfo.importance, kotlin.jvm.internal.i.a(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    public static p b(Context context) {
        Object obj;
        kotlin.jvm.internal.i.e(context, "context");
        int myPid = Process.myPid();
        ArrayList a2 = a(context);
        int size = a2.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                obj = a2.get(i10);
                i10++;
                if (((p) obj).f51470b == myPid) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        p pVar = (p) obj;
        if (pVar == null) {
            return new p(c(), myPid, 0, false);
        }
        return pVar;
    }

    public static String c() {
        String processName;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            String myProcessName = Process.myProcessName();
            kotlin.jvm.internal.i.d(myProcessName, "myProcessName()");
            return myProcessName;
        } else if (i10 >= 28 && (processName = Application.getProcessName()) != null) {
            return processName;
        } else {
            String a2 = u6.d.a();
            if (a2 != null) {
                return a2;
            }
            return "";
        }
    }
}
