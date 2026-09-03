package v7;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.mediarouter.app.b0;
import b6.r;
import java.util.ArrayList;
import java.util.LinkedList;
import k7.k8;
import s5.m;
public final class j {
    public m f48963a;
    public Bundle f48964b;
    public LinkedList f48965c;
    public final d f48966e;
    public final Context f48967f;
    public o5.i f48968g;
    public final o5.i d = new o5.i(this, 20);
    public final ArrayList h = new ArrayList();

    public j(d dVar, Context context) {
        this.f48966e = dVar;
        this.f48967f = context;
    }

    public static void a(d dVar) {
        y5.d dVar2 = y5.d.d;
        Context context = dVar.getContext();
        int d = dVar2.d(context, y5.e.f50804a);
        String c3 = r.c(context, d);
        String b10 = r.b(context, d);
        LinearLayout linearLayout = new LinearLayout(dVar.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        dVar.addView(linearLayout);
        TextView textView = new TextView(dVar.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(c3);
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

    public final void b(int i10) {
        while (!this.f48965c.isEmpty() && ((l6.e) this.f48965c.getLast()).a() >= i10) {
            this.f48965c.removeLast();
        }
    }

    public final void c(Bundle bundle, l6.e eVar) {
        if (this.f48963a != null) {
            eVar.b();
            return;
        }
        if (this.f48965c == null) {
            this.f48965c = new LinkedList();
        }
        this.f48965c.add(eVar);
        if (bundle != null) {
            Bundle bundle2 = this.f48964b;
            if (bundle2 == null) {
                this.f48964b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        this.f48968g = this.d;
        ArrayList arrayList = this.h;
        Context context = this.f48967f;
        if (this.f48963a == null) {
            try {
                synchronized (e.class) {
                    e.a(context);
                }
                w7.g V0 = k8.a(context).V0(new l6.b(context));
                if (V0 != null) {
                    this.f48968g.u(new m(this.f48966e, V0));
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        this.f48963a.j((f) obj);
                    }
                    arrayList.clear();
                }
            } catch (RemoteException e6) {
                throw new RuntimeException(e6);
            } catch (y5.f unused) {
            }
        }
    }
}
