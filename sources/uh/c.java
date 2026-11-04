package uh;

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
import org.telegram.messenger.t0;
import org.telegram.messenger.w7;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.RadialProgress2;
public final class c extends th.c {
    public final String f56350b;
    public final Uri f56351c;
    public final String d;
    public final long f56352e;
    public final String f56353f;
    public final Drawable h;
    public final StaticLayout f56354n;

    public c(String str) {
        long j10;
        this.f56350b = str;
        this.f56351c = null;
        File file = new File(str);
        try {
            j10 = file.length();
        } catch (Throwable unused) {
            j10 = 0;
        }
        this.f56352e = j10;
        String name = file.getName();
        this.d = name;
        String[] split = name.split("\\.");
        String str2 = split.length > 1 ? split[split.length - 1] : "?";
        this.f56353f = str2;
        int m1 = g0.m1(name, false);
        if (m1 != 0) {
            this.h = t0.f25457b.getResources().getDrawable(m1);
        } else {
            this.h = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(g0.L(13.0f));
            textPaint.setTypeface(g0.o());
            textPaint.setColor(k6.x0(null, k6.pj, false));
            this.f56354n = new StaticLayout(TextUtils.ellipsize(str2, textPaint, g0.L(34.0f), TextUtils.TruncateAt.END), textPaint, g0.L(34.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            return;
        }
        this.f56354n = null;
    }

    public static b d(View view, String str, String str2, TLRPC.Document document, zi ziVar) {
        b bVar = new b();
        bVar.f56339a.setColor(k6.x0(null, k6.G6, false));
        bVar.f56340b.setColor(k6.x0(null, k6.f28273y6, false));
        bVar.d = true;
        RadialProgress2 radialProgress2 = new RadialProgress2(view, null);
        bVar.f56341c = radialProgress2;
        radialProgress2.setCircleRadius(g0.L(21.0f));
        bVar.f56341c.g(k6.We, k6.Xe, k6.f27979id, k6.f27995jd);
        if (zi.K3(document)) {
            if (zi.X2(document)) {
                TLRPC.PhotoSize w10 = w7.w(document.thumbs, g0.L(22.0f), true, null, false);
                bVar.f56341c.j(w7.w(document.thumbs, g0.L(44.0f), true, w10, true), w10, document, ziVar);
            } else {
                String t02 = zi.t0(document, true);
                if (!TextUtils.isEmpty(t02)) {
                    bVar.f56341c.h(t02);
                } else {
                    bVar.f56341c.i(null, null, null);
                }
            }
            bVar.f56341c.setIcon(0, false, false);
        } else {
            bVar.f56341c.setIcon(5, false, false);
        }
        if (str == null) {
            str = "";
        }
        bVar.f56342e = str;
        if (str2 == null) {
            str2 = "";
        }
        bVar.f56343f = str2;
        bVar.f56349m = -1;
        bVar.f56344g = null;
        bVar.h = null;
        bVar.invalidateSelf();
        view.addOnAttachStateChangeListener(new a(bVar));
        return bVar;
    }

    @Override
    public final void c(Canvas canvas, int i3, int i10) {
        Drawable drawable = this.h;
        if (drawable != null) {
            drawable.setBounds(0, 0, i3, i10);
            drawable.draw(canvas);
            canvas.save();
            canvas.translate((i3 - g0.L(34.0f)) / 2.0f, g0.L(15.0f));
            this.f56354n.draw(canvas);
            canvas.restore();
        }
    }

    public c(Uri uri) {
        this.f56350b = null;
        this.f56351c = uri;
        String A = MediaController.A(uri);
        A = A == null ? "?" : A;
        this.d = A;
        String[] split = A.split("\\.");
        String str = split.length > 1 ? split[split.length - 1] : "?";
        this.f56353f = str;
        this.f56352e = 0L;
        int m1 = g0.m1(A, false);
        if (m1 != 0) {
            this.h = t0.f25457b.getResources().getDrawable(m1);
        } else {
            this.h = null;
        }
        if (!TextUtils.isEmpty(str)) {
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(g0.L(13.0f));
            textPaint.setTypeface(g0.o());
            textPaint.setColor(k6.x0(null, k6.pj, false));
            this.f56354n = new StaticLayout(TextUtils.ellipsize(str, textPaint, g0.L(34.0f), TextUtils.TruncateAt.END), textPaint, g0.L(34.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            return;
        }
        this.f56354n = null;
    }
}
