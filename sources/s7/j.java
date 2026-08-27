package s7;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.mediarouter.app.z;
import h7.l7;
import java.util.ArrayList;
import java.util.LinkedList;
import y5.q;

public final class j {

    public j9.a f47812a;

    public Bundle f47813b;

    public LinkedList f47814c;

    public final d f47815e;

    public final Context f47816f;

    public ae.b f47817g;
    public final ae.b d = new ae.b(this, 18);
    public final ArrayList h = new ArrayList();

    public j(d dVar, Context context) {
        this.f47815e = dVar;
        this.f47816f = context;
    }

    public static void a(d dVar) {
        v5.d dVar2 = v5.d.d;
        Context context = dVar.getContext();
        int iD = dVar2.d(context, v5.e.f48794a);
        String strC = q.c(context, iD);
        String strB = q.b(context, iD);
        LinearLayout linearLayout = new LinearLayout(dVar.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        dVar.addView(linearLayout);
        TextView textView = new TextView(dVar.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(strC);
        linearLayout.addView(textView);
        Intent intentB = dVar2.b(context, null, iD);
        if (intentB != null) {
            Button button = new Button(context);
            button.setId(16908313);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(strB);
            linearLayout.addView(button);
            button.setOnClickListener(new z(context, intentB));
        }
    }

    public final void b(int i10) {
        while (!this.f47814c.isEmpty() && ((i6.e) this.f47814c.getLast()).a() >= i10) {
            this.f47814c.removeLast();
        }
    }

    public final void c(Bundle bundle, i6.e eVar) {
        if (this.f47812a != null) {
            eVar.b();
            return;
        }
        if (this.f47814c == null) {
            this.f47814c = new LinkedList();
        }
        this.f47814c.add(eVar);
        if (bundle != null) {
            Bundle bundle2 = this.f47813b;
            if (bundle2 == null) {
                this.f47813b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        this.f47817g = this.d;
        ArrayList arrayList = this.h;
        Context context = this.f47816f;
        if (this.f47812a == null) {
            try {
                synchronized (e.class) {
                    e.a(context);
                }
                t7.g gVarV0 = l7.a(context).V0(new i6.b(context));
                if (gVarV0 == null) {
                    return;
                }
                this.f47817g.X(new j9.a(this.f47815e, gVarV0));
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    this.f47812a.B((f) obj);
                }
                arrayList.clear();
            } catch (RemoteException e9) {
                throw new a7.c(e9);
            } catch (v5.f unused) {
            }
        }
    }
}
