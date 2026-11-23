package th;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.g0;
import org.telegram.messenger.gj;
import org.telegram.messenger.t0;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.RadialProgress2;
public final class c extends sh.c {
    public final String f58255b;
    public final Uri f58256c;
    public final String d;
    public final long f58257e;
    public final String f58258f;
    public final Drawable h;
    public final StaticLayout f58259n;

    public c(String str) {
        long j3;
        this.f58255b = str;
        this.f58256c = null;
        File file = new File(str);
        try {
            j3 = file.length();
        } catch (Throwable unused) {
            j3 = 0;
        }
        this.f58257e = j3;
        String name = file.getName();
        this.d = name;
        String[] split = name.split("\\.");
        String str2 = split.length > 1 ? split[split.length - 1] : "?";
        this.f58258f = str2;
        int m12 = g0.m1(name, false);
        if (m12 != 0) {
            this.h = t0.f26931b.getResources().getDrawable(m12);
        } else {
            this.h = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(g0.L(13.0f));
            textPaint.setTypeface(g0.o());
            textPaint.setColor(m6.x0(null, m6.sj, false));
            this.f58259n = new StaticLayout(TextUtils.ellipsize(str2, textPaint, g0.L(34.0f), TextUtils.TruncateAt.END), textPaint, g0.L(34.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            return;
        }
        this.f58259n = null;
    }

    public static b d(View view, String str, String str2, TLRPC.Document document, gj gjVar) {
        b bVar = new b();
        bVar.f58244a.setColor(m6.x0(null, m6.G6, false));
        bVar.f58245b.setColor(m6.x0(null, m6.f29773y6, false));
        bVar.d = true;
        RadialProgress2 radialProgress2 = new RadialProgress2(view, null);
        bVar.f58246c = radialProgress2;
        radialProgress2.setCircleRadius(g0.L(21.0f));
        bVar.f58246c.g(m6.Ze, m6.f29332af, m6.f29535ld, m6.f29551md);
        if (gj.J3(document)) {
            if (gj.W2(document)) {
                TLRPC.PhotoSize w10 = w7.w(document.thumbs, g0.L(22.0f), true, null, false);
                bVar.f58246c.j(w7.w(document.thumbs, g0.L(44.0f), true, w10, true), w10, document, gjVar);
            } else {
                String t02 = gj.t0(document, true);
                if (!TextUtils.isEmpty(t02)) {
                    bVar.f58246c.h(t02);
                } else {
                    bVar.f58246c.i(null, null, null);
                }
            }
            bVar.f58246c.setIcon(0, false, false);
        } else {
            bVar.f58246c.setIcon(5, false, false);
        }
        if (str == null) {
            str = "";
        }
        bVar.f58247e = str;
        if (str2 == null) {
            str2 = "";
        }
        bVar.f58248f = str2;
        bVar.f58254m = -1;
        bVar.f58249g = null;
        bVar.h = null;
        bVar.invalidateSelf();
        view.addOnAttachStateChangeListener(new a(bVar));
        return bVar;
    }

    @Override
    public final void c(Canvas canvas, int i7, int i10) {
        Drawable drawable = this.h;
        if (drawable != null) {
            drawable.setBounds(0, 0, i7, i10);
            drawable.draw(canvas);
            canvas.save();
            canvas.translate((i7 - g0.L(34.0f)) / 2.0f, g0.L(15.0f));
            this.f58259n.draw(canvas);
            canvas.restore();
        }
    }

    public c(Uri uri) {
        this.f58255b = null;
        this.f58256c = uri;
        String A = MediaController.A(uri);
        A = A == null ? "?" : A;
        this.d = A;
        String[] split = A.split("\\.");
        String str = split.length > 1 ? split[split.length - 1] : "?";
        this.f58258f = str;
        this.f58257e = 0L;
        int m12 = g0.m1(A, false);
        if (m12 != 0) {
            this.h = t0.f26931b.getResources().getDrawable(m12);
        } else {
            this.h = null;
        }
        if (!TextUtils.isEmpty(str)) {
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(g0.L(13.0f));
            textPaint.setTypeface(g0.o());
            textPaint.setColor(m6.x0(null, m6.sj, false));
            this.f58259n = new StaticLayout(TextUtils.ellipsize(str, textPaint, g0.L(34.0f), TextUtils.TruncateAt.END), textPaint, g0.L(34.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            return;
        }
        this.f58259n = null;
    }
}
