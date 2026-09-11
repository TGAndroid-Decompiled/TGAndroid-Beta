package rg;

import android.content.ClipData;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import bi.u7;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g5;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wo0;
import zh.l3;
import zh.s5;
import zh.s7;
import zh.v7;
import zh.y3;
public final class p2 implements ImageReceiver.ImageReceiverDelegate, le.d, t0.f, pa.a, org.telegram.ui.ActionBar.a2, al0, vh.a, Continuation, x2.m, yf.m, r0.n, BillingController.ProductDetailsResponseListenerLegacy, i5.e, d5, Utilities.Callback5, wo0 {
    public final int f45415a;
    public final Object f45416b;

    public p2(Object obj, int i10) {
        this.f45415a = i10;
        this.f45416b = obj;
    }

    @Override
    public void E(int i10, float f7, float f10, le.e eVar) {
        switch (this.f45415a) {
            case 1:
                rh.c.a((rh.c) this.f45416b);
                return;
            default:
                View view = ((y3) this.f45416b).f52873b;
                if (view instanceof org.telegram.ui.Cells.w0) {
                    ((org.telegram.ui.Cells.w0) view).K();
                    return;
                } else {
                    view.invalidate();
                    return;
                }
        }
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        zh.e0 e0Var = (zh.e0) this.f45416b;
        if (z10) {
            long j3 = i10;
            if (e0Var.I != j3) {
                e0Var.I = j3;
                e0Var.f51811r.setText(zh.e0.o(j3));
            }
            e0Var.n(true);
        }
    }

    @Override
    public r0.l1 T0(View view, r0.l1 l1Var) {
        ((yh.j0) this.f45416b).h.i(l1Var);
        return r0.l1.f44710b;
    }

    @Override
    public void a(int i10) {
        switch (this.f45415a) {
            case 24:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f45416b;
                if (i10 == 1) {
                    callback2.run(Boolean.TRUE, null);
                    return;
                } else if (i10 != 3) {
                    callback2.run(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
            case 25:
                bi.f0 f0Var = (bi.f0) this.f45416b;
                if (i10 == 1) {
                    f0Var.run(Boolean.TRUE, null);
                    return;
                } else if (i10 != 3) {
                    f0Var.run(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
            default:
                d80 d80Var = (d80) this.f45416b;
                if (i10 == 1) {
                    d80Var.run(Boolean.TRUE, null);
                    return;
                } else if (i10 != 3) {
                    d80Var.run(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public Object apply(Object obj) {
        ((v8.s) this.f45416b).getClass();
        String y3 = za.b0.f51387b.y((za.a0) obj);
        kotlin.jvm.internal.i.d(y3, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: ".concat(y3));
        byte[] bytes = y3.getBytes(xd.a.f49336a);
        kotlin.jvm.internal.i.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override
    public e9.a1 b(int i10, b2.l1 l1Var, int[] iArr) {
        x2.i iVar = (x2.i) this.f45416b;
        e9.f0 u10 = e9.i0.u();
        for (int i11 = 0; i11 < l1Var.f2142a; i11++) {
            u10.b(new x2.f(i10, l1Var, i11, iVar, iArr[i11]));
        }
        return u10.i();
    }

    @Override
    public void c(long j3) {
        switch (this.f45415a) {
            case 14:
                ((yh.d) this.f45416b).a(j3, true);
                return;
            default:
                ((l3) this.f45416b).h();
                return;
        }
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        ug.a1.Q((ug.a1) this.f45416b, view);
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        xi0 lottieAnimation;
        q2 q2Var = (q2) this.f45416b;
        if (z10 && !z11 && (lottieAnimation = imageReceiver.getLottieAnimation()) != null) {
            q2Var.q(lottieAnimation);
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        g5.a(this, i10, str, drawable);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f45415a) {
            case 5:
                ((ug.u0) this.f45416b).run();
                return;
            case 6:
                TLRPC.TL_payments_giveawayInfoResults tL_payments_giveawayInfoResults = (TLRPC.TL_payments_giveawayInfoResults) this.f45416b;
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    ug.d0.T(R, tL_payments_giveawayInfoResults.gift_code_slug, null);
                    return;
                }
                return;
            case 7:
                ((org.telegram.messenger.t2) this.f45416b).run();
                return;
            case 8:
                ((ug.u0) this.f45416b).run();
                return;
            case 15:
                ((u7) this.f45416b).run();
                return;
            default:
                ((Utilities.Callback) this.f45416b).run(b2Var.g(i10, true, true));
                return;
        }
    }

    @Override
    public void h(pa.b bVar) {
        t9.a aVar = (t9.a) this.f45416b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        aVar.f46478b.set((t9.a) bVar.get());
    }

    @Override
    public boolean l(t0.j jVar, int i10, Bundle bundle) {
        r0.d dVar;
        m.s sVar = (m.s) this.f45416b;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 25 && (i10 & 1) != 0) {
            try {
                jVar.f46422a.d();
                Parcelable parcelable = (Parcelable) jVar.f46422a.i();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e7) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e7);
                return false;
            }
        }
        t0.i iVar = jVar.f46422a;
        ClipData clipData = new ClipData(iVar.getDescription(), new ClipData.Item(iVar.c()));
        if (i11 >= 31) {
            dVar = new j2.j(clipData, 2);
        } else {
            r0.e eVar = new r0.e();
            eVar.f44677b = clipData;
            eVar.f44678c = 2;
            dVar = eVar;
        }
        dVar.b(iVar.f());
        dVar.setExtras(bundle);
        if (r0.i0.i(sVar, dVar.build()) != null) {
            return false;
        }
        return true;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        g5.b(this, imageReceiver);
    }

    @Override
    public void onProductDetailsResponse(c5.h hVar, List list) {
        int i10;
        yh.p1 p1Var = (yh.p1) this.f45416b;
        ArrayList arrayList = p1Var.f50495n0;
        Iterator it = list.iterator();
        long j3 = 0;
        while (true) {
            i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            c5.o oVar = (c5.o) it.next();
            int size = arrayList.size();
            while (true) {
                if (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    sg.k kVar = (sg.k) obj;
                    if (kVar.h() != null && kVar.h().equals(oVar.f4422c)) {
                        kVar.h = oVar;
                        if (kVar.f() > j3) {
                            j3 = kVar.f();
                        }
                    }
                }
            }
        }
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            ((sg.k) obj2).f46129g = j3;
        }
        AndroidUtilities.runOnUIThread(new sg.p0(p1Var, 19));
    }

    @Override
    public void r(Canvas canvas, int i10) {
        vh.h hVar = (vh.h) this.f45416b;
        hVar.getClass();
        canvas.save();
        RectF rectF = hVar.f47889r;
        canvas.translate(-rectF.left, (-rectF.top) + AndroidUtilities.dp(30.0f));
        hVar.e(canvas, true, i10);
        canvas.restore();
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f45415a) {
            case 23:
                s5.b((s5) this.f45416b, (ArrayList) obj, (Integer) obj2, (Long) obj3, (ArrayList) obj4, (ArrayList) obj5);
                return;
            default:
                s7 s7Var = (s7) this.f45416b;
                h51 h51Var = (h51) obj;
                View view = (View) obj2;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                s7Var.getClass();
                if (h51Var.G instanceof TL_stars.StarsTransaction) {
                    v7.h1(s7Var.getContext(), false, 0L, s7Var.f52593c, (TL_stars.StarsTransaction) h51Var.G, s7Var.f52592b);
                    return;
                }
                return;
        }
    }

    @Override
    public Object then(Task task) {
        ((CountDownLatch) this.f45416b).countDown();
        return null;
    }

    @Override
    public void z(float f7, int i10) {
        int i11 = this.f45415a;
    }

    private final void e(float f7, int i10) {
    }

    private final void f(float f7, int i10) {
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
