package org.telegram.ui.web;

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
import h7.b6;
import h7.z5;
import hh.o6;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import lh.a8;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.lp0;
import org.telegram.ui.Components.zm;
import org.telegram.ui.i6;

public final class l extends FrameLayout {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public float F;
    public boolean G;
    public org.telegram.ui.b0 H;
    public org.telegram.ui.s I;
    public org.telegram.ui.s J;
    public AsyncTask K;

    public final i6 f43892a;

    public boolean f43893b;

    public final org.telegram.ui.Cells.z f43894c;
    public final FrameLayout d;

    public final FrameLayout f43895e;

    public final ImageView f43896f;
    public final org.telegram.ui.Cells.z h;

    public final ImageView f43897n;

    public final TextView f43898r;

    public final TextView f43899s;
    public final zm v;

    public final d f43900w;

    public final ArrayList f43901x;

    public final j f43902y;

    public l(Activity activity) {
        super(activity);
        int i10 = UserConfig.selectedAccount;
        this.f43901x = new ArrayList();
        this.F = 0.0f;
        setWillNotDraw(false);
        int i11 = UserConfig.selectedAccount;
        a8 a8Var = new a8(this, 13);
        a aVar = new a(this);
        i6 i6Var = new i6((c6) null);
        this.f43892a = i6Var;
        d dVar = new d(this, activity, i11, a8Var, aVar, i6Var);
        this.f43900w = dVar;
        dVar.U2.f26942r = false;
        dVar.setOverScrollMode(2);
        dVar.setPadding(0, 0, 0, 0);
        addView(dVar, z5.e(-1, -1, 119));
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.f43895e = frameLayout2;
        org.telegram.ui.Cells.z zVarZ = g6.Z(this.C, this.E, 15, 15);
        this.f43894c = zVarZ;
        frameLayout2.setBackground(zVarZ);
        b6.b(frameLayout2, 0.04f, 1.25f);
        frameLayout.addView(frameLayout2, z5.d(-1, -2.0f, 7, 12.0f, 0.0f, 12.0f, 15.0f));
        ImageView imageView = new ImageView(activity);
        this.f43896f = imageView;
        frameLayout2.addView(imageView, z5.d(24, 24.0f, 19, 16.0f, 16.0f, 16.0f, 16.0f));
        ImageView imageView2 = new ImageView(activity);
        this.f43897n = imageView2;
        b6.a(imageView2);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(R.drawable.msg_copy);
        org.telegram.ui.Cells.z zVarZ2 = g6.Z(0, 0, 6, 6);
        this.h = zVarZ2;
        imageView2.setBackground(zVarZ2);
        frameLayout2.addView(imageView2, z5.d(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        frameLayout2.addView(linearLayout, z5.d(-1, -2.0f, 16, 54.0f, 9.0f, 54.0f, 9.0f));
        TextView textView = new TextView(activity);
        this.f43898r = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setMaxLines(4);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, z5.t(-1, -2, 55, 0, 0, 0, 2));
        TextView textView2 = new TextView(activity);
        this.f43899s = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setMaxLines(3);
        textView2.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        linearLayout.addView(textView2, z5.t(-1, -2, 55, 0, 0, 0, 0));
        this.f43902y = new j(null, i10, new nh.f0(this, 20));
        this.v = new zm(activity, 27);
        int i12 = g6.Pk;
        c(g6.w0(null, i12, false), AndroidUtilities.computePerceivedBrightness(g6.w0(null, i12, false)) >= 0.721f ? -16777216 : -1);
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
        if (charSequence == null || charSequence.length() <= 0) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(messageObject.messageText);
        for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
            String url = uRLSpan.getURL();
            if (url != null && !url.startsWith("@") && !url.startsWith("#") && !url.startsWith("$")) {
                return url;
            }
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
                    kVar2.f43886c = jSONObject.optDouble("rank", 0.0d);
                    arrayList.add(kVar2);
                }
                Collections.sort(arrayList, new lp0(18));
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            try {
                k kVar3 = (k) arrayList.get(i11);
                if (TextUtils.equals(kVar3.f43884a, str)) {
                    kVar = kVar3;
                    break;
                }
            } catch (Exception e10) {
                FileLog.e(e10);
                return;
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (kVar != null) {
            kVar.f43886c += Math.exp((jCurrentTimeMillis - kVar.f43885b) / 2419200.0d);
        } else {
            kVar = new k(str, jCurrentTimeMillis);
            arrayList.add(kVar);
        }
        kVar.f43885b = jCurrentTimeMillis;
        JSONArray jSONArray2 = new JSONArray();
        for (int i12 = 0; i12 < Math.min(arrayList.size(), 20); i12++) {
            k kVar4 = (k) arrayList.get(i12);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("name", kVar4.f43884a);
            jSONObject2.put("rank", kVar4.f43886c);
            jSONObject2.put("usage", kVar4.f43885b);
            jSONArray2.put(jSONObject2);
        }
        sharedPreferences.edit().putString("queries_json", jSONArray2.toString()).apply();
    }

    public final void c(int i10, int i11) {
        if (this.A != i10) {
            this.A = i10;
            invalidate();
        }
        this.D = i11;
        float f10 = AndroidUtilities.computePerceivedBrightness(i10) >= 0.721f ? 0.0f : 1.0f;
        this.C = i0.b.d(AndroidUtilities.lerp(0.05f, 0.12f, f10), i10, i11);
        this.B = i10;
        this.E = i0.b.d(AndroidUtilities.lerp(0.12f, 0.22f, f10), i10, i11);
        int i12 = this.C;
        org.telegram.ui.Cells.z zVar = this.f43894c;
        g6.B1(zVar, i12, false);
        g6.B1(zVar, this.E, true);
        this.f43895e.invalidate();
        this.f43898r.setTextColor(i11);
        this.f43899s.setTextColor(g6.l1(0.6f, i11));
        ImageView imageView = this.f43896f;
        if (imageView.getColorFilter() != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        }
        this.f43897n.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        g6.B1(this.h, g6.l1(1.5f, this.E), true);
        int iV = g6.v(i10, g6.l1(0.05f, i11));
        int iV2 = g6.v(i10, g6.l1(0.55f, i11));
        i6 i6Var = this.f43892a;
        SparseIntArray sparseIntArray = (SparseIntArray) i6Var.f38984b;
        SparseIntArray sparseIntArray2 = (SparseIntArray) i6Var.f38984b;
        sparseIntArray.put(g6.f23053d6, this.B);
        sparseIntArray2.put(g6.G6, i11);
        sparseIntArray2.put(g6.f23073e7, iV);
        sparseIntArray2.put(g6.f23091f7, iV2);
        sparseIntArray2.put(g6.G8, g6.l1(0.2f, i11));
        sparseIntArray2.put(g6.f23144i6, g6.l1(AndroidUtilities.lerp(0.05f, 0.12f, f10), i11));
        this.f43900w.f1();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), getHeight() * this.F);
        canvas.drawColor(this.B);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.F < 0.3f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        j jVar = this.f43902y;
        if (jVar == null || !this.G) {
            return;
        }
        jVar.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j jVar = this.f43902y;
        if (jVar != null) {
            jVar.c();
        }
    }

    public void setInput(String str) {
        AsyncTask asyncTask = this.K;
        String string = null;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.K = null;
        }
        ArrayList arrayList = this.f43901x;
        boolean z10 = !arrayList.isEmpty();
        if (TextUtils.isEmpty(str)) {
            arrayList.clear();
            d dVar = this.f43900w;
            dVar.U2.N(true);
            if (z10 != (!arrayList.isEmpty())) {
                dVar.T2.h1(0, 0);
                return;
            }
            return;
        }
        f1 f1Var = new f1(new o6(5, this, z10));
        String str2 = k1.a().f43891c;
        if (str2 != null) {
            StringBuilder sbO = com.google.android.recaptcha.internal.a.o(str2);
            sbO.append(URLEncoder.encode(str));
            string = sbO.toString();
        }
        this.K = f1Var.execute(string);
    }

    public void setOpenProgress(float f10) {
        if (Math.abs(this.F - f10) > 1.0E-4f) {
            this.F = f10;
            int i10 = f10 <= 1.0E-4f ? 4 : 0;
            if (getImportantForAccessibility() != i10) {
                setImportantForAccessibility(i10);
            }
            invalidate();
        }
    }

    public void setOpened(boolean z10) {
        j jVar = this.f43902y;
        boolean z11 = z10 && jVar != null;
        this.G = z11;
        if (z11) {
            jVar.a();
        }
    }
}
