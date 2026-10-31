package rh;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.Components.iu0;
import org.telegram.ui.Components.mu0;
import org.telegram.ui.Components.nu0;
public final class x6 implements iu0, s5.e, r9.d, qa.a, NativeInstance.AudioLevelsCallback, mu0, nu0, org.telegram.ui.ActionBar.u1 {
    public final int f47693a;

    public x6(int i10) {
        this.f47693a = i10;
    }

    @Override
    public java.lang.Object K(bh.d r44) {
        throw new UnsupportedOperationException("Method not decompiled: rh.x6.K(bh.d):java.lang.Object");
    }

    @Override
    public Object apply(Object obj) {
        byte[] decode;
        Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (rawQuery.moveToNext()) {
                android.support.v4.media.session.a0 a2 = l5.i.a();
                a2.y(rawQuery.getString(1));
                a2.d = v5.a.b(rawQuery.getInt(2));
                String string = rawQuery.getString(3);
                if (string == null) {
                    decode = null;
                } else {
                    decode = Base64.decode(string, 0);
                }
                a2.f876c = decode;
                arrayList.add(a2.f());
            }
            return arrayList;
        } finally {
            rawQuery.close();
        }
    }

    @Override
    public void b(Object obj, float f7) {
        th.w0 w0Var = (th.w0) obj;
        switch (this.f47693a) {
            case 26:
                WindowManager.LayoutParams layoutParams = w0Var.f49551c;
                w0Var.N = f7;
                layoutParams.x = (int) f7;
                org.telegram.messenger.i0.S3(w0Var.f49550b, w0Var.d, layoutParams);
                return;
            default:
                WindowManager.LayoutParams layoutParams2 = w0Var.f49551c;
                w0Var.O = f7;
                layoutParams2.y = (int) f7;
                org.telegram.messenger.i0.S3(w0Var.f49550b, w0Var.d, layoutParams2);
                return;
        }
    }

    @Override
    public float f(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.f1.c(recyclerView);
    }

    @Override
    public float get(Object obj) {
        th.w0 w0Var = (th.w0) obj;
        switch (this.f47693a) {
            case 25:
                return w0Var.N;
            default:
                return w0Var.O;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        x1Var.dismiss();
    }

    @Override
    public void i(qa.b bVar) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "AnalyticsConnector now available.", null);
        }
        bVar.get().getClass();
        throw new ClassCastException();
    }

    @Override
    public RecyclerView j(View view) {
        return ((e8) view).f46874a;
    }

    @Override
    public void p(RecyclerView recyclerView) {
        org.telegram.ui.Cells.f1.b(recyclerView);
    }

    public x6(Object obj, int i10) {
        this.f47693a = i10;
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
    }
}
