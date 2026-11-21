package org.telegram.ui.web;

import ai.w2;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.AsyncTask;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.g6;
import c8.ma;
import c8.ra;
import com.google.android.gms.internal.vision.e2;
import hi.c5;
import java.net.URLEncoder;
import java.util.ArrayList;
import oi.c2;
import org.telegram.messenger.fj;
import org.telegram.messenger.j10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.ln;
public final class k extends FrameLayout {
    public final i E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public float K;
    public boolean L;
    public org.telegram.ui.x M;
    public org.telegram.ui.q N;
    public org.telegram.ui.q O;
    public AsyncTask P;
    public final c5 f53206a;
    public boolean f53207b;
    public final org.telegram.ui.Cells.y f53208c;
    public final FrameLayout d;
    public final FrameLayout f53209e;
    public final ImageView f53210f;
    public final org.telegram.ui.Cells.y h;
    public final ImageView f53211n;
    public final TextView f53212r;
    public final TextView f53213s;
    public final ln f53214w;
    public final g6 f53215x;
    public final ArrayList f53216y;

    public k(Activity activity) {
        super(activity);
        int i7 = j10.f24798t0;
        this.f53216y = new ArrayList();
        this.K = 0.0f;
        setWillNotDraw(false);
        int i10 = j10.f24798t0;
        b bVar = new b(this, 0);
        a aVar = new a(this);
        c5 c5Var = new c5(2, null);
        this.f53206a = c5Var;
        g6 g6Var = new g6(this, activity, i10, bVar, aVar, c5Var);
        this.f53215x = g6Var;
        g6Var.f35796g3.f34068r = false;
        g6Var.setOverScrollMode(2);
        g6Var.setPadding(0, 0, 0, 0);
        addView(g6Var, ma.e(-1, -1, 119));
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.f53209e = frameLayout2;
        org.telegram.ui.Cells.y b02 = m6.b0(this.H, this.J, 15, 15);
        this.f53208c = b02;
        frameLayout2.setBackground(b02);
        ra.b(frameLayout2, 0.04f, 1.25f);
        frameLayout.addView(frameLayout2, ma.d(-1, -2.0f, 7, 12.0f, 0.0f, 12.0f, 15.0f));
        ImageView imageView = new ImageView(activity);
        this.f53210f = imageView;
        frameLayout2.addView(imageView, ma.d(24, 24.0f, 19, 16.0f, 16.0f, 16.0f, 16.0f));
        ImageView imageView2 = new ImageView(activity);
        this.f53211n = imageView2;
        ra.a(imageView2);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(2131232105);
        org.telegram.ui.Cells.y b03 = m6.b0(0, 0, 6, 6);
        this.h = b03;
        imageView2.setBackground(b03);
        frameLayout2.addView(imageView2, ma.d(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        frameLayout2.addView(linearLayout, ma.d(-1, -2.0f, 16, 54.0f, 9.0f, 54.0f, 9.0f));
        TextView textView = new TextView(activity);
        this.f53212r = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setMaxLines(4);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, ma.t(-1, -2, 55, 0, 0, 0, 2));
        TextView textView2 = new TextView(activity);
        this.f53213s = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setMaxLines(3);
        textView2.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        linearLayout.addView(textView2, ma.t(-1, -2, 55, 0, 0, 0, 0));
        this.E = new i(null, i7, new c2(this, 25));
        this.f53214w = new ln(activity, 27);
        int i11 = m6.Gl;
        c(m6.x0(null, i11, false), org.telegram.messenger.g0.B(m6.x0(null, i11, false)) >= 0.721f ? -16777216 : -1);
        setOpenProgress(0.0f);
        setImportantForAccessibility(4);
    }

    public static String a(fj fjVar) {
        TLRPC.Message message = fjVar.f23993k;
        if (message != null) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                return messageMedia.webpage.url;
            }
        }
        CharSequence charSequence = fjVar.v;
        if (charSequence != null && charSequence.length() > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fjVar.v);
            for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
                String url = uRLSpan.getURL();
                if (url != null && !url.startsWith("@") && !url.startsWith("#") && !url.startsWith("$")) {
                    return url;
                }
            }
            return null;
        }
        return null;
    }

    public static void b(android.content.Context r15, java.lang.String r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.k.b(android.content.Context, java.lang.String):void");
    }

    public final void c(int i7, int i10) {
        float f10;
        if (this.F != i7) {
            this.F = i7;
            invalidate();
        }
        this.I = i10;
        if (org.telegram.messenger.g0.B(i7) >= 0.721f) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        this.H = i0.a.f(org.telegram.messenger.g0.T1(0.05f, 0.12f, f10), i7, i10);
        this.G = i7;
        this.J = i0.a.f(org.telegram.messenger.g0.T1(0.12f, 0.22f, f10), i7, i10);
        int i11 = this.H;
        org.telegram.ui.Cells.y yVar = this.f53208c;
        m6.H1(yVar, i11, false);
        m6.H1(yVar, this.J, true);
        this.f53209e.invalidate();
        this.f53212r.setTextColor(i10);
        this.f53213s.setTextColor(m6.r1(0.6f, i10));
        ImageView imageView = this.f53210f;
        if (imageView.getColorFilter() != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
        this.f53211n.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        m6.H1(this.h, m6.r1(1.5f, this.J), true);
        int w10 = m6.w(i7, m6.r1(0.05f, i10));
        int w11 = m6.w(i7, m6.r1(0.55f, i10));
        c5 c5Var = this.f53206a;
        SparseIntArray sparseIntArray = (SparseIntArray) c5Var.f14330b;
        ((SparseIntArray) c5Var.f14330b).put(m6.f29378d6, this.G);
        sparseIntArray.put(m6.G6, i10);
        sparseIntArray.put(m6.f29398e7, w10);
        sparseIntArray.put(m6.f29417f7, w11);
        sparseIntArray.put(m6.G8, m6.r1(0.2f, i10));
        sparseIntArray.put(m6.f29470i6, m6.r1(org.telegram.messenger.g0.T1(0.05f, 0.12f, f10), i10));
        this.f53215x.g1();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), getHeight() * this.K);
        canvas.drawColor(this.G);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.K < 0.3f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        i iVar = this.E;
        if (iVar != null && this.L) {
            iVar.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i iVar = this.E;
        if (iVar != null) {
            iVar.c();
        }
    }

    public void setInput(String str) {
        AsyncTask asyncTask = this.P;
        String str2 = null;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.P = null;
        }
        ArrayList arrayList = this.f53216y;
        boolean z10 = !arrayList.isEmpty();
        if (TextUtils.isEmpty(str)) {
            arrayList.clear();
            g6 g6Var = this.f53215x;
            g6Var.f35796g3.O(true);
            if (z10 != (!arrayList.isEmpty())) {
                g6Var.f35795f3.h1(0, 0);
                return;
            }
            return;
        }
        y0 y0Var = new y0(new w2(10, this, z10));
        String str3 = e1.a().f53124c;
        if (str3 != null) {
            StringBuilder m10 = e2.m(str3);
            m10.append(URLEncoder.encode(str));
            str2 = m10.toString();
        }
        this.P = y0Var.execute(str2);
    }

    public void setOpenProgress(float f10) {
        int i7;
        if (Math.abs(this.K - f10) > 1.0E-4f) {
            this.K = f10;
            if (f10 <= 1.0E-4f) {
                i7 = 4;
            } else {
                i7 = 0;
            }
            if (getImportantForAccessibility() != i7) {
                setImportantForAccessibility(i7);
            }
            invalidate();
        }
    }

    public void setOpened(boolean z10) {
        boolean z11;
        i iVar = this.E;
        if (z10 && iVar != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.L = z11;
        if (z11) {
            iVar.a();
        }
    }
}
