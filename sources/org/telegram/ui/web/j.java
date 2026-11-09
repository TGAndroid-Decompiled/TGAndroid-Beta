package org.telegram.ui.web;

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
import bi.b9;
import c8.ha;
import c8.ka;
import fi.g5;
import fi.w3;
import java.net.URLEncoder;
import java.util.ArrayList;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.o5;
import org.telegram.ui.Components.tm;
public final class j extends FrameLayout {
    public final h D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public float J;
    public boolean K;
    public org.telegram.ui.y L;
    public org.telegram.ui.q M;
    public org.telegram.ui.q N;
    public AsyncTask O;
    public final g5 f51145a;
    public boolean f51146b;
    public final org.telegram.ui.Cells.y f51147c;
    public final FrameLayout d;
    public final FrameLayout f51148e;
    public final ImageView f51149f;
    public final org.telegram.ui.Cells.y h;
    public final ImageView f51150n;
    public final TextView f51151r;
    public final TextView f51152s;
    public final tm f51153w;
    public final w3 f51154x;
    public final ArrayList f51155y;

    public j(Activity activity) {
        super(activity);
        int i7 = p10.f24470s0;
        this.f51155y = new ArrayList();
        this.J = 0.0f;
        setWillNotDraw(false);
        int i10 = p10.f24470s0;
        hi.u1 u1Var = new hi.u1(this, 20);
        a aVar = new a(this);
        g5 g5Var = new g5(2, null);
        this.f51145a = g5Var;
        w3 w3Var = new w3(this, activity, i10, u1Var, aVar, g5Var);
        this.f51154x = w3Var;
        w3Var.f37556f3.f35945r = false;
        w3Var.setOverScrollMode(2);
        w3Var.setPadding(0, 0, 0, 0);
        addView(w3Var, ha.e(-1, -1, 119));
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.f51148e = frameLayout2;
        org.telegram.ui.Cells.y b02 = l6.b0(this.G, this.I, 15, 15);
        this.f51147c = b02;
        frameLayout2.setBackground(b02);
        ka.b(frameLayout2, 0.04f, 1.25f);
        frameLayout.addView(frameLayout2, ha.d(-1, -2.0f, 7, 12.0f, 0.0f, 12.0f, 15.0f));
        ImageView imageView = new ImageView(activity);
        this.f51149f = imageView;
        frameLayout2.addView(imageView, ha.d(24, 24.0f, 19, 16.0f, 16.0f, 16.0f, 16.0f));
        ImageView imageView2 = new ImageView(activity);
        this.f51150n = imageView2;
        ka.a(imageView2);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(2131232103);
        org.telegram.ui.Cells.y b03 = l6.b0(0, 0, 6, 6);
        this.h = b03;
        imageView2.setBackground(b03);
        frameLayout2.addView(imageView2, ha.d(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        frameLayout2.addView(linearLayout, ha.d(-1, -2.0f, 16, 54.0f, 9.0f, 54.0f, 9.0f));
        TextView textView = new TextView(activity);
        this.f51151r = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setMaxLines(4);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, ha.t(-1, -2, 55, 0, 0, 0, 2));
        TextView textView2 = new TextView(activity);
        this.f51152s = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setMaxLines(3);
        textView2.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        linearLayout.addView(textView2, ha.t(-1, -2, 55, 0, 0, 0, 0));
        this.D = new h(null, i7, new o5(this, 9));
        this.f51153w = new tm(activity, 27);
        int i11 = l6.Dl;
        c(l6.x0(null, i11, false), org.telegram.messenger.g0.B(l6.x0(null, i11, false)) >= 0.721f ? -16777216 : -1);
        setOpenProgress(0.0f);
        setImportantForAccessibility(4);
    }

    public static String a(ij ijVar) {
        TLRPC.Message message = ijVar.f23262k;
        if (message != null) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                return messageMedia.webpage.url;
            }
        }
        CharSequence charSequence = ijVar.v;
        if (charSequence != null && charSequence.length() > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ijVar.v);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.j.b(android.content.Context, java.lang.String):void");
    }

    public final void c(int i7, int i10) {
        float f10;
        if (this.E != i7) {
            this.E = i7;
            invalidate();
        }
        this.H = i10;
        if (org.telegram.messenger.g0.B(i7) >= 0.721f) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        this.G = i0.a.f(org.telegram.messenger.g0.T1(0.05f, 0.12f, f10), i7, i10);
        this.F = i7;
        this.I = i0.a.f(org.telegram.messenger.g0.T1(0.12f, 0.22f, f10), i7, i10);
        int i11 = this.G;
        org.telegram.ui.Cells.y yVar = this.f51147c;
        l6.H1(yVar, i11, false);
        l6.H1(yVar, this.I, true);
        this.f51148e.invalidate();
        this.f51151r.setTextColor(i10);
        this.f51152s.setTextColor(l6.r1(0.6f, i10));
        ImageView imageView = this.f51149f;
        if (imageView.getColorFilter() != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
        this.f51150n.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        l6.H1(this.h, l6.r1(1.5f, this.I), true);
        int w10 = l6.w(i7, l6.r1(0.05f, i10));
        int w11 = l6.w(i7, l6.r1(0.55f, i10));
        g5 g5Var = this.f51145a;
        SparseIntArray sparseIntArray = (SparseIntArray) g5Var.f12069b;
        ((SparseIntArray) g5Var.f12069b).put(l6.f27865d6, this.F);
        sparseIntArray.put(l6.G6, i10);
        sparseIntArray.put(l6.f27885e7, w10);
        sparseIntArray.put(l6.f27904f7, w11);
        sparseIntArray.put(l6.G8, l6.r1(0.2f, i10));
        sparseIntArray.put(l6.f27957i6, l6.r1(org.telegram.messenger.g0.T1(0.05f, 0.12f, f10), i10));
        this.f51154x.g1();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), getHeight() * this.J);
        canvas.drawColor(this.F);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.J < 0.3f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        h hVar = this.D;
        if (hVar != null && this.K) {
            hVar.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h hVar = this.D;
        if (hVar != null) {
            hVar.c();
        }
    }

    public void setInput(String str) {
        AsyncTask asyncTask = this.O;
        String str2 = null;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.O = null;
        }
        ArrayList arrayList = this.f51155y;
        boolean z9 = !arrayList.isEmpty();
        if (TextUtils.isEmpty(str)) {
            arrayList.clear();
            w3 w3Var = this.f51154x;
            w3Var.f37556f3.O(true);
            if (z9 != (!arrayList.isEmpty())) {
                w3Var.f37555e3.h1(0, 0);
                return;
            }
            return;
        }
        a1 a1Var = new a1(new b9(9, this, z9));
        String str3 = f1.a().f51112c;
        if (str3 != null) {
            StringBuilder m10 = com.google.android.recaptcha.internal.a.m(str3);
            m10.append(URLEncoder.encode(str));
            str2 = m10.toString();
        }
        this.O = a1Var.execute(str2);
    }

    public void setOpenProgress(float f10) {
        int i7;
        if (Math.abs(this.J - f10) > 1.0E-4f) {
            this.J = f10;
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

    public void setOpened(boolean z9) {
        boolean z10;
        h hVar = this.D;
        if (z9 && hVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.K = z10;
        if (z10) {
            hVar.a();
        }
    }
}
