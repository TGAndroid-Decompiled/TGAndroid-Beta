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
import bi.y2;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.voip.r2;
import org.telegram.ui.Components.xn;
import org.telegram.ui.ds0;
import w7.b6;
import w7.z5;
public final class k extends FrameLayout {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public float J;
    public boolean K;
    public org.telegram.ui.z L;
    public org.telegram.ui.r M;
    public org.telegram.ui.r N;
    public AsyncTask O;
    public final m2.t f41092a;
    public boolean f41093b;
    public final org.telegram.ui.Cells.z f41094c;
    public final FrameLayout d;
    public final FrameLayout e;
    public final ImageView f41095f;
    public final org.telegram.ui.Cells.z h;
    public final ImageView f41096n;
    public final TextView f41097r;
    public final TextView f41098s;
    public final xn v;
    public final c f41099w;
    public final ArrayList f41100x;
    public final i f41101y;

    public k(Activity activity) {
        super(activity);
        int i10 = UserConfig.selectedAccount;
        this.f41100x = new ArrayList();
        this.J = 0.0f;
        setWillNotDraw(false);
        int i11 = UserConfig.selectedAccount;
        ii.a aVar = new ii.a(this, 6);
        a aVar2 = new a(this);
        m2.t tVar = new m2.t((c6) null);
        this.f41092a = tVar;
        c cVar = new c(this, activity, i11, aVar, aVar2, tVar);
        this.f41099w = cVar;
        cVar.W2.f23145r = false;
        cVar.setOverScrollMode(2);
        cVar.setPadding(0, 0, 0, 0);
        addView(cVar, z5.e(-1, -1, 119));
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.e = frameLayout2;
        org.telegram.ui.Cells.z a02 = g6.a0(this.G, this.I, 15, 15);
        this.f41094c = a02;
        frameLayout2.setBackground(a02);
        b6.b(frameLayout2, 0.04f, 1.25f);
        frameLayout.addView(frameLayout2, z5.a(-2.0f, 12.0f, 0.0f, 12.0f, 15.0f, -1, 7));
        ImageView imageView = new ImageView(activity);
        this.f41095f = imageView;
        frameLayout2.addView(imageView, z5.a(24.0f, 16.0f, 16.0f, 16.0f, 16.0f, 24, 19));
        ImageView imageView2 = new ImageView(activity);
        this.f41096n = imageView2;
        b6.a(imageView2);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(R.drawable.msg_copy);
        org.telegram.ui.Cells.z a03 = g6.a0(0, 0, 6, 6);
        this.h = a03;
        imageView2.setBackground(a03);
        frameLayout2.addView(imageView2, z5.a(32.0f, 14.0f, 14.0f, 14.0f, 14.0f, 32, 53));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        frameLayout2.addView(linearLayout, z5.a(-2.0f, 54.0f, 9.0f, 54.0f, 9.0f, -1, 16));
        TextView textView = new TextView(activity);
        this.f41097r = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setMaxLines(4);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, z5.t(-1, -2, 55, 0, 0, 0, 2));
        TextView textView2 = new TextView(activity);
        this.f41098s = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setMaxLines(3);
        textView2.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        linearLayout.addView(textView2, z5.t(-1, -2, 55, 0, 0, 0, 0));
        this.f41101y = new i(null, i10, new r2(this, 2));
        this.v = new xn(activity, 28);
        int i12 = g6.Pk;
        c(g6.x0(null, i12, false), AndroidUtilities.computePerceivedBrightness(g6.x0(null, i12, false)) >= 0.721f ? -16777216 : -1);
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
        j jVar = null;
        String string = sharedPreferences.getString("queries_json", null);
        ArrayList arrayList = new ArrayList();
        if (string != null) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                    j jVar2 = new j(jSONObject.optString("name"), jSONObject.optLong("usage", System.currentTimeMillis()));
                    jVar2.f41083c = jSONObject.optDouble("rank", 0.0d);
                    arrayList.add(jVar2);
                }
                Collections.sort(arrayList, new ds0(10));
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
                j jVar3 = (j) arrayList.get(i11);
                if (TextUtils.equals(jVar3.f41081a, str)) {
                    jVar = jVar3;
                    break;
                }
                i11++;
            } catch (Exception e7) {
                FileLog.e(e7);
                return;
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (jVar != null) {
            jVar.f41083c += Math.exp((currentTimeMillis - jVar.f41082b) / 2419200.0d);
        } else {
            jVar = new j(str, currentTimeMillis);
            arrayList.add(jVar);
        }
        jVar.f41082b = currentTimeMillis;
        JSONArray jSONArray2 = new JSONArray();
        for (int i12 = 0; i12 < Math.min(arrayList.size(), 20); i12++) {
            j jVar4 = (j) arrayList.get(i12);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("name", jVar4.f41081a);
            jSONObject2.put("rank", jVar4.f41083c);
            jSONObject2.put("usage", jVar4.f41082b);
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
        this.G = i0.a.d(AndroidUtilities.lerp(0.05f, 0.12f, f7), i10, i11);
        this.F = i10;
        this.I = i0.a.d(AndroidUtilities.lerp(0.12f, 0.22f, f7), i10, i11);
        int i12 = this.G;
        org.telegram.ui.Cells.z zVar = this.f41094c;
        g6.C1(zVar, i12, false);
        g6.C1(zVar, this.I, true);
        this.e.invalidate();
        this.f41097r.setTextColor(i11);
        this.f41098s.setTextColor(g6.m1(0.6f, i11));
        ImageView imageView = this.f41095f;
        if (imageView.getColorFilter() != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        }
        this.f41096n.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        g6.C1(this.h, g6.m1(1.5f, this.I), true);
        int v = g6.v(i10, g6.m1(0.05f, i11));
        int v10 = g6.v(i10, g6.m1(0.55f, i11));
        m2.t tVar = this.f41092a;
        SparseIntArray sparseIntArray = (SparseIntArray) tVar.f15110b;
        ((SparseIntArray) tVar.f15110b).put(g6.f19601d6, this.F);
        sparseIntArray.put(g6.G6, i11);
        sparseIntArray.put(g6.e7, v);
        sparseIntArray.put(g6.f7, v10);
        sparseIntArray.put(g6.G8, g6.m1(0.2f, i11));
        sparseIntArray.put(g6.f19690i6, g6.m1(AndroidUtilities.lerp(0.05f, 0.12f, f7), i11));
        this.f41099w.f1();
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
        i iVar = this.f41101y;
        if (iVar != null && this.K) {
            iVar.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i iVar = this.f41101y;
        if (iVar != null) {
            iVar.c();
        }
    }

    public void setInput(String str) {
        AsyncTask asyncTask = this.O;
        String str2 = null;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.O = null;
        }
        ArrayList arrayList = this.f41100x;
        boolean z10 = !arrayList.isEmpty();
        if (TextUtils.isEmpty(str)) {
            arrayList.clear();
            c cVar = this.f41099w;
            cVar.W2.N(true);
            if (z10 != (!arrayList.isEmpty())) {
                cVar.V2.h1(0, 0);
                return;
            }
            return;
        }
        j1 j1Var = new j1(new y2(8, this, z10));
        String str3 = o1.a().f41146c;
        if (str3 != null) {
            StringBuilder u10 = a1.g.u(str3);
            u10.append(URLEncoder.encode(str));
            str2 = u10.toString();
        }
        this.O = j1Var.execute(str2);
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
        i iVar = this.f41101y;
        if (z10 && iVar != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.K = z11;
        if (z11) {
            iVar.a();
        }
    }
}
