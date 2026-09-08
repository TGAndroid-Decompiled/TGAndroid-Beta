package t9;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import hd.g;
import hd.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import y9.t0;
import y9.t1;
public final class c {
    public static final c f46508a = new Object();

    public static ArrayList a(Context context) {
        ActivityManager activityManager;
        i.e(context, "context");
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
            list = o.f10982a;
        }
        ArrayList f7 = g.f(list);
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
            ?? obj3 = new Object();
            String str2 = runningAppProcessInfo.processName;
            if (str2 != null) {
                obj3.f9520a = str2;
                obj3.f9521b = Integer.valueOf(runningAppProcessInfo.pid);
                obj3.f9522c = Integer.valueOf(runningAppProcessInfo.importance);
                obj3.d = Boolean.valueOf(i.a(runningAppProcessInfo.processName, str));
                arrayList2.add(obj3.g());
            } else {
                throw new NullPointerException("Null processName");
            }
        }
        return arrayList2;
    }

    public final t1 b(Context context) {
        Object obj;
        String processName;
        i.e(context, "context");
        int myPid = Process.myPid();
        ArrayList a2 = a(context);
        int size = a2.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                obj = a2.get(i10);
                i10++;
                if (((t0) ((t1) obj)).f49918b == myPid) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        t1 t1Var = (t1) obj;
        if (t1Var == null) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 33) {
                processName = Process.myProcessName();
                i.d(processName, "{\n      Process.myProcessName()\n    }");
            } else if (i11 < 28 || (processName = Application.getProcessName()) == null) {
                processName = "";
            }
            i.e(processName, "processName");
            ?? obj2 = new Object();
            obj2.f9520a = processName;
            obj2.f9521b = Integer.valueOf(myPid);
            obj2.f9522c = 0;
            obj2.d = false;
            return obj2.g();
        }
        return t1Var;
    }
}
