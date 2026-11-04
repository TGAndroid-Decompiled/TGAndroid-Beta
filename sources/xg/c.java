package xg;

import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import b8.ke;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import d2.o1;
import g9.s1;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledFuture;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.p1;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.rn;
import org.telegram.ui.LaunchActivity;
public final class c implements p1, gj0, xh.a, z2.k, Continuation, OnCompleteListener {
    public final int f58659a;
    public final Object f58660b;

    public c(Object obj, int i3) {
        this.f58659a = i3;
        this.f58660b = obj;
    }

    @Override
    public void b(float r19, float r20, int r21, android.view.View r22) {
        throw new UnsupportedOperationException("Method not decompiled: xg.c.b(float, float, int, android.view.View):void");
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public s1 c(int i3, o1 o1Var, int[] iArr) {
        z2.i iVar = (z2.i) this.f58660b;
        g9.f0 p10 = g9.i0.p();
        for (int i10 = 0; i10 < o1Var.f8252a; i10++) {
            p10.c(new z2.f(i3, o1Var, i10, iVar, iArr[i10]));
        }
        return p10.f();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f58659a) {
            case 0:
                TLRPC.TL_payments_giveawayInfoResults tL_payments_giveawayInfoResults = (TLRPC.TL_payments_giveawayInfoResults) this.f58660b;
                d2 Q = LaunchActivity.Q();
                if (Q != null) {
                    c0.e1(Q, tL_payments_giveawayInfoResults.gift_code_slug, null);
                    return;
                }
                return;
            case 1:
                ((rn) this.f58660b).run();
                return;
            default:
                ((r0) this.f58660b).run();
                return;
        }
    }

    @Override
    public void h(Canvas canvas, int i3) {
        xh.h hVar = (xh.h) this.f58660b;
        hVar.getClass();
        canvas.save();
        RectF rectF = hVar.f58857r;
        canvas.translate(-rectF.left, (-rectF.top) + org.telegram.messenger.g0.L(30.0f));
        hVar.e(canvas, true, i3);
        canvas.restore();
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f58659a) {
            case 9:
                za.x.b((Intent) this.f58660b);
                return;
            case 10:
                ((za.z) this.f58660b).f60346b.trySetResult(null);
                return;
            default:
                ((ScheduledFuture) this.f58660b).cancel(false);
                return;
        }
    }

    @Override
    public Object then(Task task) {
        Exception exception;
        switch (this.f58659a) {
            case 6:
                ((CountDownLatch) this.f58660b).countDown();
                return null;
            case 7:
                ke keVar = (ke) this.f58660b;
                keVar.getClass();
                if (!task.isSuccessful() && (exception = task.getException()) != null && !TextUtils.isEmpty(exception.getMessage()) && exception.getMessage().contains("FID_ALREADY_USED:")) {
                    Log.w("FirebaseMessaging", "FID_ALREADY_USED Detected. Retrying with FID cache clearing!");
                    ((ua.d) ((ua.e) keVar.d)).f55790c.F().delete();
                    return keVar.G();
                }
                return task;
            default:
                ((l2.e) this.f58660b).getClass();
                Bundle bundle = (Bundle) task.getResult(IOException.class);
                if (bundle != null) {
                    String string = bundle.getString("registration_id");
                    if (string != null || (string = bundle.getString("unregistered")) != null) {
                        return string;
                    }
                    String string2 = bundle.getString("error");
                    if (!"RST".equals(string2)) {
                        if (string2 != null) {
                            throw new IOException(string2);
                        }
                        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                        throw new IOException("SERVICE_NOT_AVAILABLE");
                    }
                    throw new IOException("INSTANCE_ID_RESET");
                }
                throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
