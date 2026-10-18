package qg;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Typeface;
import android.util.Base64;
import com.google.android.gms.internal.cast.z5;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import rg.m2;
public final class e0 implements j0, androidx.car.app.utils.b, r9.e, qa.a, r9.d, OnFailureListener, s5.e, a2 {
    public final int f44510a;

    public e0(int i10) {
        this.f44510a = i10;
    }

    @Override
    public Typeface a() {
        return AndroidUtilities.getTypeface("fonts/mw_bold.ttf");
    }

    @Override
    public Object apply(Object obj) {
        byte[] decode;
        Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (rawQuery.moveToNext()) {
                androidx.biometric.e a2 = l5.i.a();
                a2.v(rawQuery.getString(1));
                a2.d = v5.a.b(rawQuery.getInt(2));
                String string = rawQuery.getString(3);
                if (string == null) {
                    decode = null;
                } else {
                    decode = Base64.decode(string, 0);
                }
                a2.f2820c = decode;
                arrayList.add(a2.g());
            }
            return arrayList;
        } finally {
            rawQuery.close();
        }
    }

    @Override
    public void call() {
        throw null;
    }

    @Override
    public void g(b2 b2Var, int i10) {
        b2Var.dismiss();
    }

    @Override
    public Object j2(z5 z5Var) {
        switch (this.f44510a) {
            case 8:
                return FirebaseInstallationsRegistrar.a(z5Var);
            case 25:
                return (ScheduledExecutorService) ExecutorsRegistrar.f7585a.get();
            case 26:
                return (ScheduledExecutorService) ExecutorsRegistrar.f7587c.get();
            case 27:
                return (ScheduledExecutorService) ExecutorsRegistrar.f7586b.get();
            default:
                r9.n nVar = ExecutorsRegistrar.f7585a;
                return s9.k.f46143a;
        }
    }

    @Override
    public void onFailure(Exception exc) {
        int i10 = m2.f45504r0;
    }

    @Override
    public List v(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override
    public void h(qa.b bVar) {
    }
}
