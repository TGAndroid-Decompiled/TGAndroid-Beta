package org.telegram.ui.web;

import ai.y8;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
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
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.sn;
import org.telegram.ui.o70;
import w7.b6;
import w7.z5;
public final class l extends FrameLayout {
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
    public final f5 f43166a;
    public boolean f43167b;
    public final org.telegram.ui.Cells.y f43168c;
    public final FrameLayout d;
    public final FrameLayout e;
    public final ImageView f43169f;
    public final org.telegram.ui.Cells.y h;
    public final ImageView f43170n;
    public final TextView f43171r;
    public final TextView f43172s;
    public final sn v;
    public final d f43173w;
    public final ArrayList f43174x;
    public final j f43175y;

    public l(Activity activity) {
        super(activity);
        int i10 = UserConfig.selectedAccount;
        this.f43174x = new ArrayList();
        this.J = 0.0f;
        setWillNotDraw(false);
        int i11 = UserConfig.selectedAccount;
        hg.o oVar = new hg.o(this, 17);
        a aVar = new a(this);
        f5 f5Var = new f5(null);
        this.f43166a = f5Var;
        d dVar = new d(this, activity, i11, oVar, aVar, f5Var);
        this.f43173w = dVar;
        dVar.Z2.f24646r = false;
        dVar.setOverScrollMode(2);
        dVar.setPadding(0, 0, 0, 0);
        addView(dVar, z5.e(-1, -1, 119));
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.e = frameLayout2;
        org.telegram.ui.Cells.y a02 = k6.a0(this.G, this.I, 15, 15);
        this.f43168c = a02;
        frameLayout2.setBackground(a02);
        b6.b(frameLayout2, 0.04f, 1.25f);
        frameLayout.addView(frameLayout2, z5.d(-1, -2.0f, 7, 12.0f, 0.0f, 12.0f, 15.0f));
        ImageView imageView = new ImageView(activity);
        this.f43169f = imageView;
        frameLayout2.addView(imageView, z5.d(24, 24.0f, 19, 16.0f, 16.0f, 16.0f, 16.0f));
        ImageView imageView2 = new ImageView(activity);
        this.f43170n = imageView2;
        b6.a(imageView2);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(R.drawable.msg_copy);
        org.telegram.ui.Cells.y a03 = k6.a0(0, 0, 6, 6);
        this.h = a03;
        imageView2.setBackground(a03);
        frameLayout2.addView(imageView2, z5.d(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        frameLayout2.addView(linearLayout, z5.d(-1, -2.0f, 16, 54.0f, 9.0f, 54.0f, 9.0f));
        TextView textView = new TextView(activity);
        this.f43171r = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setMaxLines(4);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, z5.t(-1, -2, 55, 0, 0, 0, 2));
        TextView textView2 = new TextView(activity);
        this.f43172s = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setMaxLines(3);
        textView2.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        linearLayout.addView(textView2, z5.t(-1, -2, 55, 0, 0, 0, 0));
        this.f43175y = new j(null, i10, new ki.u(this, 22));
        this.v = new sn(activity, 28);
        int i12 = k6.Pk;
        c(k6.x0(null, i12, false), AndroidUtilities.computePerceivedBrightness(k6.x0(null, i12, false)) >= 0.721f ? -16777216 : -1);
        setOpenProgress(0.0f);
        setImportantForAccessibility(4);
    }

    public static String a(MessageObject messageObject) {
        TLRPC.Message message = messageObject.messageOwner;
        if (message != null) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                return messageMedia.webpage.url;
            }
        }
        CharSequence charSequence = messageObject.messageText;
        if (charSequence != null && charSequence.length() > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(messageObject.messageText);
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

    public static void b(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("webhistory", 0);
        k kVar = null;
        String string = sharedPreferences.getString("queries_json", null);
        ArrayList arrayList = new ArrayList();
        if (string != null) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                    k kVar2 = new k(jSONObject.optString("name"), jSONObject.optLong("usage", System.currentTimeMillis()));
                    kVar2.f43156c = jSONObject.optDouble("rank", 0.0d);
                    arrayList.add(kVar2);
                }
                Collections.sort(arrayList, new o70(14));
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        int i11 = 0;
        while (true) {
            try {
                if (i11 >= arrayList.size()) {
                    break;
                }
                k kVar3 = (k) arrayList.get(i11);
                if (TextUtils.equals(kVar3.f43154a, str)) {
                    kVar = kVar3;
                    break;
                }
                i11++;
            } catch (Exception e7) {
                FileLog.e(e7);
                return;
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (kVar != null) {
            kVar.f43156c += Math.exp((currentTimeMillis - kVar.f43155b) / 2419200.0d);
        } else {
            kVar = new k(str, currentTimeMillis);
            arrayList.add(kVar);
        }
        kVar.f43155b = currentTimeMillis;
        JSONArray jSONArray2 = new JSONArray();
        for (int i12 = 0; i12 < Math.min(arrayList.size(), 20); i12++) {
            k kVar4 = (k) arrayList.get(i12);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("name", kVar4.f43154a);
            jSONObject2.put("rank", kVar4.f43156c);
            jSONObject2.put("usage", kVar4.f43155b);
            jSONArray2.put(jSONObject2);
        }
        sharedPreferences.edit().putString("queries_json", jSONArray2.toString()).apply();
    }

    public final void c(int i10, int i11) {
        float f7;
        if (this.E != i10) {
            this.E = i10;
            invalidate();
        }
        this.H = i11;
        if (AndroidUtilities.computePerceivedBrightness(i10) >= 0.721f) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        this.G = i0.a.f(AndroidUtilities.lerp(0.05f, 0.12f, f7), i10, i11);
        this.F = i10;
        this.I = i0.a.f(AndroidUtilities.lerp(0.12f, 0.22f, f7), i10, i11);
        int i12 = this.G;
        org.telegram.ui.Cells.y yVar = this.f43168c;
        k6.E1(yVar, i12, false);
        k6.E1(yVar, this.I, true);
        this.e.invalidate();
        this.f43171r.setTextColor(i11);
        this.f43172s.setTextColor(k6.o1(0.6f, i11));
        ImageView imageView = this.f43169f;
        if (imageView.getColorFilter() != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        }
        this.f43170n.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        k6.E1(this.h, k6.o1(1.5f, this.I), true);
        int v = k6.v(i10, k6.o1(0.05f, i11));
        int v10 = k6.v(i10, k6.o1(0.55f, i11));
        f5 f5Var = this.f43166a;
        SparseIntArray sparseIntArray = f5Var.f20891b;
        SparseIntArray sparseIntArray2 = f5Var.f20891b;
        sparseIntArray.put(k6.f21184d6, this.F);
        sparseIntArray2.put(k6.G6, i11);
        sparseIntArray2.put(k6.e7, v);
        sparseIntArray2.put(k6.f7, v10);
        sparseIntArray2.put(k6.G8, k6.o1(0.2f, i11));
        sparseIntArray2.put(k6.f21273i6, k6.o1(AndroidUtilities.lerp(0.05f, 0.12f, f7), i11));
        this.f43173w.g1();
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
        j jVar = this.f43175y;
        if (jVar != null && this.K) {
            jVar.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j jVar = this.f43175y;
        if (jVar != null) {
            jVar.c();
        }
    }

    public void setInput(String str) {
        AsyncTask asyncTask = this.O;
        String str2 = null;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.O = null;
        }
        ArrayList arrayList = this.f43174x;
        boolean z10 = !arrayList.isEmpty();
        if (TextUtils.isEmpty(str)) {
            arrayList.clear();
            d dVar = this.f43173w;
            dVar.Z2.N(true);
            if (z10 != (!arrayList.isEmpty())) {
                dVar.Y2.h1(0, 0);
                return;
            }
            return;
        }
        i1 i1Var = new i1(new y8(9, this, z10));
        String str3 = n1.a().f43197c;
        if (str3 != null) {
            StringBuilder u10 = a1.g.u(str3);
            u10.append(URLEncoder.encode(str));
            str2 = u10.toString();
        }
        this.O = i1Var.execute(str2);
    }

    public void setOpenProgress(float f7) {
        int i10;
        if (Math.abs(this.J - f7) > 1.0E-4f) {
            this.J = f7;
            if (f7 <= 1.0E-4f) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            if (getImportantForAccessibility() != i10) {
                setImportantForAccessibility(i10);
            }
            invalidate();
        }
    }

    public void setOpened(boolean z10) {
        boolean z11;
        j jVar = this.f43175y;
        if (z10 && jVar != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.K = z11;
        if (z11) {
            jVar.a();
        }
    }
}
