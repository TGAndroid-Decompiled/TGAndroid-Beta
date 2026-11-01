package wh;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import b2.p1;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import e2.j;
import e9.k0;
import e9.n0;
import e9.x1;
import java.io.IOException;
import java.io.Serializable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledFuture;
import org.telegram.messenger.p20;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ju0;
import rh.e8;
import rh.g8;
import x2.l;
import xa.s;
import xa.v;
import xa.x;
import xh.i;
import xh.o;
import xh.s3;
import z3.h;
public final class b implements ju0, l, Continuation, OnSuccessListener, OnCompleteListener, u1, p20, j {
    public final int f52871a;
    public final Object f52872b;

    public b(Object obj, int i10) {
        this.f52871a = i10;
        this.f52872b = obj;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f52871a) {
            case 12:
                h hVar = (h) this.f52872b;
                z3.a aVar = (z3.a) obj;
                z3.g gVar = new z3.g(aVar.f54571b, oa.d.o4(aVar.f54570a, aVar.f54572c));
                hVar.f54581c.add(gVar);
                long j10 = hVar.f54585j;
                if (j10 == -9223372036854775807L || aVar.d >= j10) {
                    hVar.g(gVar);
                    return;
                }
                return;
            default:
                ((k0) this.f52872b).c((z3.a) obj);
                return;
        }
    }

    @Override
    public x1 b(int i10, p1 p1Var, int[] iArr) {
        x2.j jVar = (x2.j) this.f52872b;
        k0 t10 = n0.t();
        for (int i11 = 0; i11 < p1Var.f2187a; i11++) {
            t10.c(new x2.g(i10, p1Var, i11, jVar, iArr[i11]));
        }
        return t10.f();
    }

    @Override
    public float f(RecyclerView recyclerView) {
        return f1.c(recyclerView);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f52871a) {
            case 8:
                ((xh.d) this.f52872b).run();
                return;
            default:
                i iVar = (i) this.f52872b;
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = iVar.getMessagesController().n1(iVar.R);
                updatestarrefprogram.commission_permille = 0;
                org.telegram.ui.ActionBar.x1 x1Var2 = new org.telegram.ui.ActionBar.x1(3, iVar.getParentActivity(), null);
                x1Var2.r(150L);
                iVar.getConnectionsManager().sendRequest(updatestarrefprogram, new xh.b(iVar, x1Var2, 0));
                return;
        }
    }

    @Override
    public RecyclerView j(View view) {
        ((g8) this.f52872b).getClass();
        return ((e8) view).f46888a;
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        switch (this.f52871a) {
            case 10:
                View view = (View) obj2;
                Integer num = (Integer) number;
                Float f7 = (Float) serializable;
                Float f10 = (Float) serializable2;
                o.a0((o) this.f52872b, (b51) obj);
                return;
            default:
                View view2 = (View) obj2;
                Integer num2 = (Integer) number;
                Float f11 = (Float) serializable;
                Float f12 = (Float) serializable2;
                ((s3) this.f52872b).a0((b51) obj);
                return;
        }
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f52871a) {
            case 5:
                v.b((Intent) this.f52872b);
                return;
            case 6:
                ((x) this.f52872b).f53606b.trySetResult(null);
                return;
            default:
                ((ScheduledFuture) this.f52872b).cancel(false);
                return;
        }
    }

    @Override
    public void onSuccess(Object obj) {
        boolean z10;
        s sVar = (s) obj;
        if (((FirebaseMessaging) this.f52872b).e.r() && sVar.h.a() != null) {
            synchronized (sVar) {
                z10 = sVar.f53593g;
            }
            if (!z10) {
                sVar.h(0L);
            }
        }
    }

    @Override
    public void q(RecyclerView recyclerView) {
        f1.b(recyclerView);
    }

    @Override
    public Object then(Task task) {
        switch (this.f52871a) {
            case 2:
                ((CountDownLatch) this.f52872b).countDown();
                return null;
            default:
                ((j2.f) this.f52872b).getClass();
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
}
