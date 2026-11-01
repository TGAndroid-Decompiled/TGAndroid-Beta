package r5;

import android.graphics.Bitmap;
import android.os.Looper;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import ig.b0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.t2;
import org.telegram.messenger.wp;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.wb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.hd1;
import rf.x;
import rh.e6;
import rh.h8;
import th.e5;
import th.h4;
import th.w0;
import xh.m2;
import zh.h;
public final class a implements Runnable {
    public final int f46330a;

    public a(int i10) {
        this.f46330a = i10;
    }

    @Override
    public final void run() {
        cc X;
        k2 c02;
        switch (this.f46330a) {
            case 0:
                int i10 = AlarmManagerSchedulerBroadcastReceiver.f4261a;
                return;
            case 1:
                a5.a aVar = rf.e.B;
                if (aVar != null) {
                    ArrayList arrayList = null;
                    for (int i11 = 0; i11 < rf.e.f46517y; i11++) {
                        if (((Bitmap[]) aVar.d)[i11] != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(((Bitmap[]) aVar.d)[i11]);
                        }
                        ((Bitmap[]) aVar.d)[i11] = null;
                        ((x[]) aVar.f282c)[i11] = null;
                    }
                    if (!arrayList.isEmpty()) {
                        Utilities.e.c(new b0(1, arrayList));
                    }
                    rf.e.B = null;
                    return;
                }
                return;
            case 2:
                k2 T = LaunchActivity.T();
                if ((T instanceof hd1) && (c02 = ((hd1) T).c0()) != null) {
                    T = c02;
                }
                if (T != null) {
                    X = cc.a0(T);
                } else {
                    X = cc.X();
                }
                wb Q = X.Q(2131624050, 36, dd.L0(2131750225, null));
                Q.f32211t = true;
                Q.j();
                return;
            case 3:
                t2.APP_ERROR.a();
                return;
            case 4:
                k2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    T2.presentFragment(new h8());
                    return;
                }
                return;
            case 5:
                e6[][] e6VarArr = e6.S;
                return;
            case 6:
                at.e().k(99, 512);
                return;
            case 7:
                return;
            case 8:
                at.e().k(175, new Object[0]);
                return;
            case 9:
                w0.b();
                return;
            case 10:
                w0 w0Var = w0.Z;
                w0Var.e.invalidate();
                if (!w0Var.e.isInLayout()) {
                    w0Var.e.requestLayout();
                    w0Var.d.requestLayout();
                    w0Var.f49566f.requestLayout();
                    return;
                }
                return;
            case 11:
                int i12 = h4.f49034n1;
                return;
            case 12:
                Comparator comparator = e5.X;
                return;
            case 13:
                int i13 = vh.x.f52138x0;
                return;
            case 14:
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 15:
                return;
            case 16:
                wp.d1().edit().putInt("storydualhint", wp.d1().getInt("storydualhint", 0) + 1).apply();
                return;
            case 17:
                HashSet hashSet = m2.f53888a1;
                return;
            case 18:
                return;
            default:
                int i14 = h.H;
                return;
        }
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }
}
