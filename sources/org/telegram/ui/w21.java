package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public class w21 extends org.telegram.ui.ActionBar.m2 {
    public static final a0.f R;
    public static List S;
    public static boolean T;
    public q21 E;
    public org.telegram.ui.Components.lj0 F;
    public ImageView G;
    public Bitmap H;
    public Bitmap I;
    public org.telegram.ui.ActionBar.b4 J;
    public boolean K;
    public long L;
    public long M;
    public int N;
    public int O;
    public boolean P;
    public i0.b Q;
    public final o0.a f38872a;
    public final org.telegram.ui.ActionBar.b4 f38873b;
    public final Rect f38874c;
    public final a0.f d;
    public int[] e;
    public v21 f38875f;
    public org.telegram.ui.Components.mc0 h;
    public org.telegram.ui.Components.mc0 f38876n;
    public org.telegram.ui.Components.mc0 f38877r;
    public ValueAnimator f38878s;
    public ValueAnimator v;
    public n50 f38879w;
    public ci.m6 f38880x;
    public org.telegram.ui.Components.w9 f38881y;

    static {
        ?? mVar = new a0.m(0);
        R = mVar;
        mVar.put("🏠d", new int[]{-9324972, -13856649, -6636738, -9915042});
        mVar.put("🐥d", new int[]{-12344463, -7684788, -6442695, -8013488});
        mVar.put("⛄d", new int[]{-10051073, -10897938, -12469550, -7694337});
        mVar.put("💎d", new int[]{-11429643, -11814958, -5408261, -2128185});
        mVar.put("👨\u200d🏫d", new int[]{-6637227, -12015466, -13198627, -10631557});
        mVar.put("🌷d", new int[]{-1146812, -1991901, -1745517, -3443241});
        mVar.put("💜d", new int[]{-1156738, -1876046, -5412366, -28073});
        mVar.put("🎄d", new int[]{-1281978, -551386, -1870308, -742870});
        mVar.put("🎮d", new int[]{-15092782, -2333964, -1684365, -1269214});
        mVar.put("🏠n", new int[]{-15368239, -11899662, -15173939, -13850930});
        mVar.put("🐥n", new int[]{-11033320, -14780848, -9594089, -12604587});
        mVar.put("⛄n", new int[]{-13930790, -13665098, -14833975, -9732865});
        mVar.put("💎n", new int[]{-5089608, -9481473, -14378302, -13337899});
        mVar.put("👨\u200d🏫n", new int[]{-14447768, -9199261, -15356801, -15823723});
        mVar.put("🌷n", new int[]{-2534316, -2984177, -3258783, -5480504});
        mVar.put("💜n", new int[]{-3123030, -2067394, -2599576, -6067757});
        mVar.put("🎄n", new int[]{-2725857, -3242459, -3248848, -3569123});
        mVar.put("🎮n", new int[]{-3718333, -1278154, -16338695, -6076417});
        T = true;
    }

    public w21(Bundle bundle) {
        super(bundle);
        this.f38872a = new o0.a(this);
        org.telegram.ui.ActionBar.b4 b4Var = new org.telegram.ui.ActionBar.b4(this.currentAccount);
        b4Var.e = "🏠";
        b4Var.f18758c = fg.b.d("🏠");
        b4Var.d = TLRPC.ChatTheme.ofEmoticon(b4Var.e);
        org.telegram.ui.ActionBar.a4 a4Var = new org.telegram.ui.ActionBar.a4();
        a4Var.f18709a = org.telegram.ui.ActionBar.h6.N0("Blue");
        a4Var.e = 99;
        b4Var.f18759f.add(a4Var);
        org.telegram.ui.ActionBar.a4 a4Var2 = new org.telegram.ui.ActionBar.a4();
        a4Var2.f18709a = org.telegram.ui.ActionBar.h6.N0("Dark Blue");
        a4Var2.e = 0;
        b4Var.f18759f.add(a4Var2);
        this.f38873b = b4Var;
        this.f38874c = new Rect();
        this.d = new a0.m(0);
        this.e = null;
        this.h = new org.telegram.ui.Components.mc0();
        this.J = b4Var;
        this.O = -1;
        this.Q = i0.b.e;
    }

    public static void U(w21 w21Var) {
        if (w21Var.getParentActivity() == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23 && w21Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
            w21Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
        } else {
            f0(w21Var);
        }
    }

    public static void V(w21 w21Var) {
        T = false;
        List list = S;
        if (list != null && !list.isEmpty()) {
            w21Var.c0(S);
        } else {
            ChatThemeController.getInstance(w21Var.currentAccount).requestAllChatThemes(new k21(w21Var), true);
        }
    }

    public static void W(w21 w21Var, boolean z10, org.telegram.ui.ActionBar.b4 b4Var, org.telegram.ui.ActionBar.a5 a5Var) {
        o0.a aVar = w21Var.f38872a;
        if (z10) {
            aVar.f15482b = b4Var.b(((w21) aVar.f15483c).currentAccount, w21Var.K ? 1 : 0);
        } else {
            aVar.f15482b = w21Var.J.b(((w21) aVar.f15483c).currentAccount, w21Var.K ? 1 : 0);
        }
        a5Var.h = new h21(w21Var, 3);
        ((ActionBarLayout) w21Var.parentLayout).f(a5Var, null);
        LinearLayout linearLayout = w21Var.f38875f.v;
        if (linearLayout != null) {
            linearLayout.setBackground(org.telegram.ui.ActionBar.w5.d(new float[]{6.0f}, 0, i0.a.k(org.telegram.ui.ActionBar.w5.b(w21Var.getThemedColor(org.telegram.ui.ActionBar.h6.Oh)), 25)));
        }
    }

    public static void X(w21 w21Var) {
        w21Var.f38873b.n(w21Var.currentAccount);
        View view = w21Var.fragmentView;
        if (view == null) {
            return;
        }
        view.postDelayed(new h21(w21Var, 1), 17L);
    }

    public static void f0(org.telegram.ui.ActionBar.m2 m2Var) {
        u9.e0(m2Var.getParentActivity(), 1, new m21(m2Var.getCurrentAccount(), m2Var));
    }

    public final Bitmap b0(org.telegram.ui.ActionBar.b4 b4Var, boolean z10) {
        if (z10) {
            String str = b4Var.e;
            a0.f fVar = this.d;
            Bitmap bitmap = (Bitmap) fVar.get(str);
            if (bitmap == null) {
                bitmap = Bitmap.createBitmap(this.H.getWidth(), this.H.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                int[] iArr = (int[]) R.get(b4Var.e + "n");
                if (iArr != null) {
                    if (this.f38877r == null) {
                        this.f38877r = new org.telegram.ui.Components.mc0(true, 0, 0, 0, 0);
                    }
                    this.f38877r.n(iArr[0], iArr[1], iArr[2], iArr[3]);
                    this.f38877r.setBounds(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), canvas.getWidth() - AndroidUtilities.dp(6.0f), canvas.getHeight() - AndroidUtilities.dp(6.0f));
                    this.f38877r.draw(canvas);
                }
                canvas.drawBitmap(this.H, 0.0f, 0.0f, (Paint) null);
                canvas.setBitmap(null);
                fVar.put(b4Var.e, bitmap);
            }
            return bitmap;
        }
        return this.H;
    }

    public final void c0(List list) {
        if (list != null && !list.isEmpty() && this.f38875f != null) {
            list.set(0, this.f38873b);
            ArrayList arrayList = new ArrayList(list.size());
            for (int i10 = 0; i10 < list.size(); i10++) {
                org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) list.get(i10);
                b4Var.n(this.currentAccount);
                org.telegram.ui.Components.mp mpVar = new org.telegram.ui.Components.mp(b4Var);
                boolean z10 = this.K;
                mpVar.f26566c = z10 ? 1 : 0;
                mpVar.e = b0(b4Var, z10);
                arrayList.add(mpVar);
            }
            org.telegram.ui.Components.lp lpVar = this.f38875f.f38609b;
            lpVar.d = arrayList;
            lpVar.l();
            int i11 = 0;
            while (true) {
                if (i11 != arrayList.size()) {
                    if (fg.b.a(((org.telegram.ui.Components.mp) arrayList.get(i11)).f26564a.f18758c, this.J.f18758c)) {
                        this.f38875f.K = (org.telegram.ui.Components.mp) arrayList.get(i11);
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 != -1) {
                this.f38875f.b(i11);
            }
            v21 v21Var = this.f38875f;
            t21 t21Var = v21Var.F;
            t21Var.setAlpha(0.0f);
            t21Var.animate().alpha(1.0f).setDuration(150L).start();
            t21Var.setVisibility(0);
            org.telegram.ui.Components.u00 u00Var = v21Var.f38613r;
            u00Var.animate().alpha(0.0f).setListener(new org.telegram.ui.Components.ca(u00Var)).setDuration(150L).start();
            org.telegram.ui.Components.wl0 wl0Var = v21Var.f38617y;
            wl0Var.setAlpha(0.0f);
            wl0Var.animate().alpha(1.0f).setDuration(150L).start();
        }
    }

    @Override
    public final android.view.View createView(android.content.Context r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.w21.createView(android.content.Context):android.view.View");
    }

    public final void d0(int i10, org.telegram.ui.ActionBar.b4 b4Var, boolean z10) {
        float f7;
        String str;
        org.telegram.ui.ActionBar.g6 A0;
        this.O = i10;
        org.telegram.ui.ActionBar.b4 b4Var2 = this.J;
        final boolean z11 = this.K;
        this.J = b4Var;
        org.telegram.ui.ActionBar.a4 a4Var = (org.telegram.ui.ActionBar.a4) b4Var.f18759f.get(z11 ? 1 : 0);
        ValueAnimator valueAnimator = this.f38878s;
        if (valueAnimator != null) {
            f7 = Math.max(0.5f, 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 1.0f;
            this.f38878s.cancel();
        } else {
            f7 = 1.0f;
        }
        org.telegram.ui.Components.mc0 mc0Var = this.h;
        this.f38876n = mc0Var;
        mc0Var.q(false);
        this.f38876n.setAlpha(255);
        org.telegram.ui.Components.mc0 mc0Var2 = new org.telegram.ui.Components.mc0();
        this.h = mc0Var2;
        mc0Var2.setCallback(this.f38879w);
        this.h.n(a4Var.f18716k, a4Var.f18717l, a4Var.f18718m, a4Var.f18719n);
        this.h.r(this.f38879w);
        this.h.s(1.0f);
        org.telegram.ui.Components.mc0 mc0Var3 = this.h;
        mc0Var3.N = true;
        org.telegram.ui.Components.mc0 mc0Var4 = this.f38876n;
        if (mc0Var4 != null) {
            mc0Var3.h = mc0Var4.h;
        }
        this.E.f36737a.h = mc0Var3.h;
        TLRPC.WallPaper k10 = this.J.k(z11 ? 1 : 0);
        if (k10 != null) {
            org.telegram.ui.Components.mc0 mc0Var5 = this.h;
            mc0Var5.t(mc0Var5.f26452u, k10.settings.intensity);
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.J.o(z11 ? 1 : 0, new ResultCallback() {
                @Override
                public final void onComplete(Object obj) {
                    boolean z12;
                    Pair pair = (Pair) obj;
                    w21 w21Var = w21.this;
                    long i11 = w21Var.J.i(z11 ? 1 : 0);
                    if (pair != null && i11 != 0) {
                        long longValue = ((Long) pair.first).longValue();
                        Bitmap bitmap = ((dg.a) pair.second).f7709b;
                        if (longValue == i11 && bitmap != null) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            int i12 = w21Var.h.f26448q;
                            if (elapsedRealtime2 > 150) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            w21Var.e0(i12, bitmap, z12);
                        }
                    }
                }

                @Override
                public final void onError(Throwable th2) {
                    org.telegram.tgnet.l.a(this, th2);
                }

                @Override
                public final void onError(TLRPC.TL_error tL_error) {
                    org.telegram.tgnet.l.b(this, tL_error);
                }
            });
        } else {
            Utilities.themeQueue.postRunnable(new h21(this, 2), 35L);
        }
        org.telegram.ui.Components.mc0 mc0Var6 = this.h;
        mc0Var6.u(mc0Var6.f());
        a0.f fVar = R;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b4Var.e);
        if (z11) {
            str = "n";
        } else {
            str = "d";
        }
        sb2.append(str);
        int[] iArr = (int[]) fVar.get(sb2.toString());
        if (z10) {
            if (this.e == null) {
                int[] iArr2 = new int[4];
                this.e = iArr2;
                System.arraycopy(iArr, 0, iArr2, 0, 4);
            }
            this.h.setAlpha(255);
            org.telegram.ui.Components.mc0 mc0Var7 = this.h;
            mc0Var7.K = 0.0f;
            mc0Var7.i();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f38878s = ofFloat;
            ofFloat.addUpdateListener(new ai.x(23, this, iArr));
            this.f38878s.addListener(new org.telegram.ui.Components.al0(12, this, iArr));
            this.f38878s.setDuration((int) (f7 * 250.0f));
            this.f38878s.start();
        } else {
            if (iArr != null) {
                q21 q21Var = this.E;
                q21Var.f36737a.n(iArr[0], iArr[1], iArr[2], iArr[3]);
                q21Var.invalidate();
                System.arraycopy(iArr, 0, this.e, 0, 4);
            }
            this.f38876n = null;
            this.f38879w.invalidate();
        }
        if (this.K) {
            A0 = org.telegram.ui.ActionBar.h6.J;
        } else {
            A0 = org.telegram.ui.ActionBar.h6.A0();
        }
        org.telegram.ui.ActionBar.a5 a5Var = new org.telegram.ui.ActionBar.a5(null, A0.Y, this.K, !z10);
        a5Var.f18724f = false;
        a5Var.e = true;
        a5Var.f18730m = this.f38872a;
        a5Var.f18729l = (int) (f7 * 250.0f);
        AndroidUtilities.runOnUIThread(new ai.s4(this, z10, b4Var2, a5Var, 28));
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void e0(int i10, Bitmap bitmap, boolean z10) {
        if (bitmap != null) {
            this.h.t(bitmap, i10);
            ValueAnimator valueAnimator = this.v;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.v = ofFloat;
                ofFloat.addUpdateListener(new q11(this, 2));
                this.v.setDuration(250L);
                this.v.start();
                return;
            }
            this.h.s(1.0f);
        }
    }

    public final void g0() {
        Point point = AndroidUtilities.displaySize;
        int min = Math.min(point.x, point.y);
        Point point2 = AndroidUtilities.displaySize;
        int max = Math.max(point2.x, point2.y);
        float f7 = min;
        if ((max * 1.0f) / f7 > 1.92f) {
            max = (int) (f7 * 1.92f);
        }
        Bitmap createBitmap = Bitmap.createBitmap(min, max, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        this.f38880x.setVisibility(8);
        this.G.setVisibility(8);
        this.F.setVisibility(8);
        this.F.getAnimatedDrawable();
        q21 q21Var = this.E;
        if (q21Var != null) {
            q21Var.d(true);
        }
        this.fragmentView.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(max, 1073741824));
        this.fragmentView.layout(0, 0, min, max);
        this.fragmentView.draw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(this.F.getLeft(), this.F.getTop(), this.F.getRight(), this.F.getBottom());
        if (this.I != null) {
            canvas.drawBitmap(this.I, (Rect) null, rectF, new Paint(2));
        }
        canvas.setBitmap(null);
        this.f38880x.setVisibility(0);
        this.G.setVisibility(0);
        this.F.setVisibility(0);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView.getParent();
        this.fragmentView.layout(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
        q21 q21Var2 = this.E;
        if (q21Var2 != null) {
            q21Var2.d(false);
        }
        Uri bitmapShareUri = AndroidUtilities.getBitmapShareUri(createBitmap, "qr_tmp.jpg", Bitmap.CompressFormat.JPEG);
        if (bitmapShareUri != null) {
            try {
                getParentActivity().startActivityForResult(Intent.createChooser(new Intent("android.intent.action.SEND").setType("image/*").putExtra("android.intent.extra.STREAM", bitmapShareUri), LocaleController.getString(R.string.InviteByQRCode)), 500);
            } catch (ActivityNotFoundException e) {
                e.printStackTrace();
            }
        }
        AndroidUtilities.runOnUIThread(new h21(this, 0), 500L);
    }

    @Override
    public final org.telegram.ui.ActionBar.y3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.y3.f19939c;
    }

    @Override
    public final org.telegram.ui.ActionBar.d6 getResourceProvider() {
        return this.f38872a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.j6> themeDescriptions = super.getThemeDescriptions();
        v21 v21Var = this.f38875f;
        v21Var.getClass();
        u21 u21Var = new u21(v21Var);
        ArrayList arrayList = new ArrayList();
        Paint paint = v21Var.f38608a;
        int i10 = org.telegram.ui.ActionBar.h6.f19129h5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 1, null, paint, null, null, i10));
        int i11 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 32, null, null, new Drawable[]{v21Var.f38611f}, u21Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(v21Var.f38612n, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f19165j5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(v21Var.f38617y, 16, new Class[]{org.telegram.ui.Components.h21.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19147i5));
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ((org.telegram.ui.ActionBar.j6) obj).f19525o = v21Var.d.f38872a;
        }
        themeDescriptions.addAll(arrayList);
        oy0 oy0Var = new oy0(3, this);
        TextView textView = this.f38875f.f38614s;
        int i13 = org.telegram.ui.ActionBar.h6.Oh;
        themeDescriptions.add(new org.telegram.ui.ActionBar.j6(textView, 32, null, null, null, oy0Var, i13));
        themeDescriptions.add(new org.telegram.ui.ActionBar.j6(this.f38875f.f38614s, 65568, null, null, null, null, org.telegram.ui.ActionBar.h6.Qh));
        TextView textView2 = this.f38875f.f38615w;
        if (textView2 != null) {
            themeDescriptions.add(new org.telegram.ui.ActionBar.j6(textView2, 4, null, null, null, oy0Var, i13));
            themeDescriptions.add(new org.telegram.ui.ActionBar.j6(this.f38875f.f38616x, 8, null, null, null, oy0Var, i13));
        }
        int size2 = themeDescriptions.size();
        while (i11 < size2) {
            org.telegram.ui.ActionBar.j6 j6Var = themeDescriptions.get(i11);
            i11++;
            j6Var.f19525o = this.f38872a;
        }
        return themeDescriptions;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.L = this.arguments.getLong("user_id");
        this.M = this.arguments.getLong("chat_id");
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        a0.f fVar;
        v21 v21Var = this.f38875f;
        v21Var.getClass();
        NotificationCenter.getGlobalInstance().removeObserver(v21Var, NotificationCenter.emojiLoaded);
        this.f38875f = null;
        this.H.recycle();
        this.H = null;
        int i10 = 0;
        while (true) {
            fVar = this.d;
            if (i10 >= fVar.f30c) {
                break;
            }
            Bitmap bitmap = (Bitmap) fVar.h(i10);
            if (bitmap != null) {
                bitmap.recycle();
            }
            i10++;
        }
        fVar.clear();
        if (getParentActivity() != null) {
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.N);
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        if (getParentActivity() != null) {
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.N);
        }
        super.onPause();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i10 == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                f0(this);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f18661a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new g21(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.L5, false), null);
            alertDialog$Builder.o();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (getParentActivity() != null) {
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.N | 1028);
        }
    }
}
