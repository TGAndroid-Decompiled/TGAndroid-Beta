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
import org.telegram.messenger.ij;
import org.telegram.messenger.t0;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.RadialProgress2;
public final class c extends sh.d {
    public final String f56058b;
    public final Uri f56059c;
    public final String d;
    public final long f56060e;
    public final String f56061f;
    public final Drawable h;
    public final StaticLayout f56062n;

    public c(String str) {
        long j3;
        this.f56058b = str;
        this.f56059c = null;
        File file = new File(str);
        try {
            j3 = file.length();
        } catch (Throwable unused) {
            j3 = 0;
        }
        this.f56060e = j3;
        String name = file.getName();
        this.d = name;
        String[] split = name.split("\\.");
        String str2 = split.length > 1 ? split[split.length - 1] : "?";
        this.f56061f = str2;
        int m12 = g0.m1(name, false);
        if (m12 != 0) {
            this.h = t0.f25566b.getResources().getDrawable(m12);
        } else {
            this.h = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(g0.L(13.0f));
            textPaint.setTypeface(g0.o());
            textPaint.setColor(l6.x0(null, l6.pj, false));
            this.f56062n = new StaticLayout(TextUtils.ellipsize(str2, textPaint, g0.L(34.0f), TextUtils.TruncateAt.END), textPaint, g0.L(34.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            return;
        }
        this.f56062n = null;
    }

    public static b d(View view, String str, String str2, TLRPC.Document document, ij ijVar) {
        b bVar = new b();
        bVar.f56047a.setColor(l6.x0(null, l6.G6, false));
        bVar.f56048b.setColor(l6.x0(null, l6.f28257y6, false));
        bVar.d = true;
        RadialProgress2 radialProgress2 = new RadialProgress2(view, null);
        bVar.f56049c = radialProgress2;
        radialProgress2.setCircleRadius(g0.L(21.0f));
        bVar.f56049c.g(l6.We, l6.Xe, l6.f27963id, l6.f27981jd);
        if (ij.J3(document)) {
            if (ij.W2(document)) {
                TLRPC.PhotoSize w10 = w7.w(document.thumbs, g0.L(22.0f), true, null, false);
                bVar.f56049c.j(w7.w(document.thumbs, g0.L(44.0f), true, w10, true), w10, document, ijVar);
            } else {
                String t02 = ij.t0(document, true);
                if (!TextUtils.isEmpty(t02)) {
                    bVar.f56049c.h(t02);
                } else {
                    bVar.f56049c.i(null, null, null);
                }
            }
            bVar.f56049c.setIcon(0, false, false);
        } else {
            bVar.f56049c.setIcon(5, false, false);
        }
        if (str == null) {
            str = "";
        }
        bVar.f56050e = str;
        if (str2 == null) {
            str2 = "";
        }
        bVar.f56051f = str2;
        bVar.f56057m = -1;
        bVar.f56052g = null;
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
            this.f56062n.draw(canvas);
            canvas.restore();
        }
    }

    public c(Uri uri) {
        this.f56058b = null;
        this.f56059c = uri;
        String A = MediaController.A(uri);
        A = A == null ? "?" : A;
        this.d = A;
        String[] split = A.split("\\.");
        String str = split.length > 1 ? split[split.length - 1] : "?";
        this.f56061f = str;
        this.f56060e = 0L;
        int m12 = g0.m1(A, false);
        if (m12 != 0) {
            this.h = t0.f25566b.getResources().getDrawable(m12);
        } else {
            this.h = null;
        }
        if (!TextUtils.isEmpty(str)) {
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(g0.L(13.0f));
            textPaint.setTypeface(g0.o());
            textPaint.setColor(l6.x0(null, l6.pj, false));
            this.f56062n = new StaticLayout(TextUtils.ellipsize(str, textPaint, g0.L(34.0f), TextUtils.TruncateAt.END), textPaint, g0.L(34.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            return;
        }
        this.f56062n = null;
    }
}
