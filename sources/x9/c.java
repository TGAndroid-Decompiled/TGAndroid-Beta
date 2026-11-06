package x9;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import da.e1;
import da.j2;
import hd.h;
import hd.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.j;
public final class c {
    public static final c f58572a = new Object();

    public static ArrayList a(Context context) {
        ActivityManager activityManager;
        List<ActivityManager.RunningAppProcessInfo> list;
        j.e(context, "context");
        int i7 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        if (systemService instanceof ActivityManager) {
            activityManager = (ActivityManager) systemService;
        } else {
            activityManager = null;
        }
        if (activityManager == null || (list = activityManager.getRunningAppProcesses()) == null) {
            list = n.f14474a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList.get(i11);
            i11++;
            if (((ActivityManager.RunningAppProcessInfo) obj2).uid == i7) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(h.d(arrayList2, 10));
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj3;
            ?? obj4 = new Object();
            String str2 = runningAppProcessInfo.processName;
            if (str2 != null) {
                obj4.f8322a = str2;
                obj4.f8323b = runningAppProcessInfo.pid;
                obj4.f8324c = runningAppProcessInfo.importance;
                obj4.f8325e = (byte) (((byte) (obj4.f8325e | 1)) | 2);
                obj4.d = j.a(str2, str);
                obj4.f8325e = (byte) (obj4.f8325e | 4);
                arrayList3.add(obj4.a());
            } else {
                throw new NullPointerException("Null processName");
            }
        }
        return arrayList3;
    }

    public final j2 b(Context context) {
        Object obj;
        String processName;
        j.e(context, "context");
        int myPid = Process.myPid();
        ArrayList a10 = a(context);
        int size = a10.size();
        int i7 = 0;
        while (true) {
            if (i7 < size) {
                obj = a10.get(i7);
                i7++;
                if (((e1) ((j2) obj)).f8338b == myPid) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        j2 j2Var = (j2) obj;
        if (j2Var == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 > 33) {
                processName = Process.myProcessName();
                j.b(processName);
            } else if (i10 < 28 || (processName = Application.getProcessName()) == null) {
                processName = "";
            }
            j.e(processName, "processName");
            ?? obj2 = new Object();
            obj2.f8322a = processName;
            obj2.f8323b = myPid;
            obj2.f8324c = 0;
            obj2.d = false;
            obj2.f8325e = (byte) (((byte) (((byte) (obj2.f8325e | 1)) | 2)) | 4);
            return obj2.a();
        }
        return j2Var;
    }
}
