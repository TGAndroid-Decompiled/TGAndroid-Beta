package r7;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.mediarouter.app.b0;
import g7.l7;
import java.util.ArrayList;
import java.util.LinkedList;
import x5.q;
public final class j {
    public j4.c f47092a;
    public Bundle f47093b;
    public LinkedList f47094c;
    public final d f47095e;
    public final Context f47096f;
    public android.support.v4.media.c f47097g;
    public final android.support.v4.media.c d = new android.support.v4.media.c(this, 16);
    public final ArrayList h = new ArrayList();

    public j(d dVar, Context context) {
        this.f47095e = dVar;
        this.f47096f = context;
    }

    public static void a(d dVar) {
        u5.d dVar2 = u5.d.d;
        Context context = dVar.getContext();
        int d = dVar2.d(context, u5.e.f48109a);
        String c10 = q.c(context, d);
        String b10 = q.b(context, d);
        LinearLayout linearLayout = new LinearLayout(dVar.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        dVar.addView(linearLayout);
        TextView textView = new TextView(dVar.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(c10);
        linearLayout.addView(textView);
        Intent b11 = dVar2.b(context, null, d);
        if (b11 != null) {
            Button button = new Button(context);
            button.setId(16908313);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(b10);
            linearLayout.addView(button);
            button.setOnClickListener(new b0(context, b11));
        }
    }

    public final void b(int i9) {
        while (!this.f47094c.isEmpty() && ((h6.e) this.f47094c.getLast()).a() >= i9) {
            this.f47094c.removeLast();
        }
    }

    public final void c(Bundle bundle, h6.e eVar) {
        if (this.f47092a != null) {
            eVar.b();
            return;
        }
        if (this.f47094c == null) {
            this.f47094c = new LinkedList();
        }
        this.f47094c.add(eVar);
        if (bundle != null) {
            Bundle bundle2 = this.f47093b;
            if (bundle2 == null) {
                this.f47093b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        this.f47097g = this.d;
        ArrayList arrayList = this.h;
        Context context = this.f47096f;
        if (this.f47092a == null) {
            try {
                synchronized (e.class) {
                    e.a(context);
                }
                s7.g V0 = l7.a(context).V0(new h6.b(context));
                if (V0 != null) {
                    this.f47097g.M(new j4.c(this.f47095e, V0));
                    int size = arrayList.size();
                    int i9 = 0;
                    while (i9 < size) {
                        Object obj = arrayList.get(i9);
                        i9++;
                        this.f47092a.z((f) obj);
                    }
                    arrayList.clear();
                }
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            } catch (u5.f unused) {
            }
        }
    }
}
