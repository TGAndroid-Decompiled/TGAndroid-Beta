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
public class y21 extends org.telegram.ui.ActionBar.n2 {
    public static final a0.f R;
    public static List S;
    public static boolean T;
    public s21 E;
    public org.telegram.ui.Components.nj0 F;
    public ImageView G;
    public Bitmap H;
    public Bitmap I;
    public org.telegram.ui.ActionBar.c4 J;
    public boolean K;
    public long L;
    public long M;
    public int N;
    public int O;
    public boolean P;
    public i0.b Q;
    public final o0.a f43024a;
    public final org.telegram.ui.ActionBar.c4 f43025b;
    public final Rect f43026c;
    public final a0.f d;
    public int[] f43027e;
    public x21 f43028f;
    public org.telegram.ui.Components.pc0 h;
    public org.telegram.ui.Components.pc0 f43029n;
    public org.telegram.ui.Components.pc0 f43030r;
    public ValueAnimator f43031s;
    public ValueAnimator v;
    public n20 f43032w;
    public ci.m6 f43033x;
    public org.telegram.ui.Components.w9 f43034y;

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

    public y21(Bundle bundle) {
        super(bundle);
        this.f43024a = new o0.a(this);
        org.telegram.ui.ActionBar.c4 c4Var = new org.telegram.ui.ActionBar.c4(this.currentAccount);
        c4Var.f20507e = "🏠";
        c4Var.f20506c = fg.b.d("🏠");
        c4Var.d = TLRPC.ChatTheme.ofEmoticon(c4Var.f20507e);
        org.telegram.ui.ActionBar.b4 b4Var = new org.telegram.ui.ActionBar.b4();
        b4Var.f20454a = org.telegram.ui.ActionBar.i6.N0("Blue");
        b4Var.f20457e = 99;
        c4Var.f20508f.add(b4Var);
        org.telegram.ui.ActionBar.b4 b4Var2 = new org.telegram.ui.ActionBar.b4();
        b4Var2.f20454a = org.telegram.ui.ActionBar.i6.N0("Dark Blue");
        b4Var2.f20457e = 0;
        c4Var.f20508f.add(b4Var2);
        this.f43025b = c4Var;
        this.f43026c = new Rect();
        this.d = new a0.m(0);
        this.f43027e = null;
        this.h = new org.telegram.ui.Components.pc0();
        this.J = c4Var;
        this.O = -1;
        this.Q = i0.b.f11525e;
    }

    public static void S(y21 y21Var) {
        if (y21Var.getParentActivity() == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23 && y21Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
            y21Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
        } else {
            f0(y21Var);
        }
    }

    public static void T(y21 y21Var) {
        T = false;
        List list = S;
        if (list != null && !list.isEmpty()) {
            y21Var.c0(S);
        } else {
            ChatThemeController.getInstance(y21Var.currentAccount).requestAllChatThemes(new m21(y21Var), true);
        }
    }

    public static void U(y21 y21Var, boolean z10, org.telegram.ui.ActionBar.c4 c4Var, org.telegram.ui.ActionBar.b5 b5Var) {
        o0.a aVar = y21Var.f43024a;
        if (z10) {
            aVar.f16932b = c4Var.b(((y21) aVar.f16933c).currentAccount, y21Var.K ? 1 : 0);
        } else {
            aVar.f16932b = y21Var.J.b(((y21) aVar.f16933c).currentAccount, y21Var.K ? 1 : 0);
        }
        b5Var.h = new j21(y21Var, 3);
        ((ActionBarLayout) y21Var.parentLayout).f(b5Var, null);
        LinearLayout linearLayout = y21Var.f43028f.v;
        if (linearLayout != null) {
            linearLayout.setBackground(org.telegram.ui.ActionBar.x5.d(new float[]{6.0f}, 0, i0.a.k(org.telegram.ui.ActionBar.x5.b(y21Var.getThemedColor(org.telegram.ui.ActionBar.i6.Oh)), 25)));
        }
    }

    public static void W(y21 y21Var) {
        y21Var.f43025b.n(y21Var.currentAccount);
        View view = y21Var.fragmentView;
        if (view == null) {
            return;
        }
        view.postDelayed(new j21(y21Var, 1), 17L);
    }

    public static void f0(org.telegram.ui.ActionBar.n2 n2Var) {
        w9.e0(n2Var.getParentActivity(), 1, new o21(n2Var.getCurrentAccount(), n2Var));
    }

    public final Bitmap b0(org.telegram.ui.ActionBar.c4 c4Var, boolean z10) {
        if (z10) {
            String str = c4Var.f20507e;
            a0.f fVar = this.d;
            Bitmap bitmap = (Bitmap) fVar.get(str);
            if (bitmap == null) {
                bitmap = Bitmap.createBitmap(this.H.getWidth(), this.H.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                int[] iArr = (int[]) R.get(c4Var.f20507e + "n");
                if (iArr != null) {
                    if (this.f43030r == null) {
                        this.f43030r = new org.telegram.ui.Components.pc0(true, 0, 0, 0, 0);
                    }
                    this.f43030r.n(iArr[0], iArr[1], iArr[2], iArr[3]);
                    this.f43030r.setBounds(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), canvas.getWidth() - AndroidUtilities.dp(6.0f), canvas.getHeight() - AndroidUtilities.dp(6.0f));
                    this.f43030r.draw(canvas);
                }
                canvas.drawBitmap(this.H, 0.0f, 0.0f, (Paint) null);
                canvas.setBitmap(null);
                fVar.put(c4Var.f20507e, bitmap);
            }
            return bitmap;
        }
        return this.H;
    }

    public final void c0(List list) {
        if (list != null && !list.isEmpty() && this.f43028f != null) {
            list.set(0, this.f43025b);
            ArrayList arrayList = new ArrayList(list.size());
            for (int i10 = 0; i10 < list.size(); i10++) {
                org.telegram.ui.ActionBar.c4 c4Var = (org.telegram.ui.ActionBar.c4) list.get(i10);
                c4Var.n(this.currentAccount);
                org.telegram.ui.Components.op opVar = new org.telegram.ui.Components.op(c4Var);
                boolean z10 = this.K;
                opVar.f29430c = z10 ? 1 : 0;
                opVar.f29431e = b0(c4Var, z10);
                arrayList.add(opVar);
            }
            org.telegram.ui.Components.np npVar = this.f43028f.f42732b;
            npVar.d = arrayList;
            npVar.l();
            int i11 = 0;
            while (true) {
                if (i11 != arrayList.size()) {
                    if (fg.b.a(((org.telegram.ui.Components.op) arrayList.get(i11)).f29428a.f20506c, this.J.f20506c)) {
                        this.f43028f.K = (org.telegram.ui.Components.op) arrayList.get(i11);
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 != -1) {
                this.f43028f.b(i11);
            }
            x21 x21Var = this.f43028f;
            v21 v21Var = x21Var.F;
            v21Var.setAlpha(0.0f);
            v21Var.animate().alpha(1.0f).setDuration(150L).start();
            v21Var.setVisibility(0);
            org.telegram.ui.Components.w00 w00Var = x21Var.f42737r;
            w00Var.animate().alpha(0.0f).setListener(new org.telegram.ui.Components.da(w00Var)).setDuration(150L).start();
            org.telegram.ui.Components.zl0 zl0Var = x21Var.f42741y;
            zl0Var.setAlpha(0.0f);
            zl0Var.animate().alpha(1.0f).setDuration(150L).start();
        }
    }

    @Override
    public final android.view.View createView(android.content.Context r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y21.createView(android.content.Context):android.view.View");
    }

    public final void d0(int i10, org.telegram.ui.ActionBar.c4 c4Var, boolean z10) {
        float f7;
        String str;
        org.telegram.ui.ActionBar.h6 A0;
        this.O = i10;
        org.telegram.ui.ActionBar.c4 c4Var2 = this.J;
        final boolean z11 = this.K;
        this.J = c4Var;
        org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) c4Var.f20508f.get(z11 ? 1 : 0);
        ValueAnimator valueAnimator = this.f43031s;
        if (valueAnimator != null) {
            f7 = Math.max(0.5f, 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 1.0f;
            this.f43031s.cancel();
        } else {
            f7 = 1.0f;
        }
        org.telegram.ui.Components.pc0 pc0Var = this.h;
        this.f43029n = pc0Var;
        pc0Var.q(false);
        this.f43029n.setAlpha(255);
        org.telegram.ui.Components.pc0 pc0Var2 = new org.telegram.ui.Components.pc0();
        this.h = pc0Var2;
        pc0Var2.setCallback(this.f43032w);
        this.h.n(b4Var.f20462k, b4Var.f20463l, b4Var.f20464m, b4Var.f20465n);
        this.h.r(this.f43032w);
        this.h.s(1.0f);
        org.telegram.ui.Components.pc0 pc0Var3 = this.h;
        pc0Var3.N = true;
        org.telegram.ui.Components.pc0 pc0Var4 = this.f43029n;
        if (pc0Var4 != null) {
            pc0Var3.h = pc0Var4.h;
        }
        this.E.f40336a.h = pc0Var3.h;
        TLRPC.WallPaper k10 = this.J.k(z11 ? 1 : 0);
        if (k10 != null) {
            org.telegram.ui.Components.pc0 pc0Var5 = this.h;
            pc0Var5.t(pc0Var5.f29628u, k10.settings.intensity);
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.J.o(z11 ? 1 : 0, new ResultCallback() {
                @Override
                public final void onComplete(Object obj) {
                    boolean z12;
                    Pair pair = (Pair) obj;
                    y21 y21Var = y21.this;
                    long i11 = y21Var.J.i(z11 ? 1 : 0);
                    if (pair != null && i11 != 0) {
                        long longValue = ((Long) pair.first).longValue();
                        Bitmap bitmap = ((dg.a) pair.second).f8338b;
                        if (longValue == i11 && bitmap != null) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            int i12 = y21Var.h.f29624q;
                            if (elapsedRealtime2 > 150) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            y21Var.e0(i12, bitmap, z12);
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
            Utilities.themeQueue.postRunnable(new j21(this, 2), 35L);
        }
        org.telegram.ui.Components.pc0 pc0Var6 = this.h;
        pc0Var6.u(pc0Var6.f());
        a0.f fVar = R;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c4Var.f20507e);
        if (z11) {
            str = "n";
        } else {
            str = "d";
        }
        sb2.append(str);
        int[] iArr = (int[]) fVar.get(sb2.toString());
        if (z10) {
            if (this.f43027e == null) {
                int[] iArr2 = new int[4];
                this.f43027e = iArr2;
                System.arraycopy(iArr, 0, iArr2, 0, 4);
            }
            this.h.setAlpha(255);
            org.telegram.ui.Components.pc0 pc0Var7 = this.h;
            pc0Var7.K = 0.0f;
            pc0Var7.i();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f43031s = ofFloat;
            ofFloat.addUpdateListener(new ai.x(23, this, iArr));
            this.f43031s.addListener(new org.telegram.ui.Components.cl0(12, this, iArr));
            this.f43031s.setDuration((int) (f7 * 250.0f));
            this.f43031s.start();
        } else {
            if (iArr != null) {
                s21 s21Var = this.E;
                s21Var.f40336a.n(iArr[0], iArr[1], iArr[2], iArr[3]);
                s21Var.invalidate();
                System.arraycopy(iArr, 0, this.f43027e, 0, 4);
            }
            this.f43029n = null;
            this.f43032w.invalidate();
        }
        if (this.K) {
            A0 = org.telegram.ui.ActionBar.i6.J;
        } else {
            A0 = org.telegram.ui.ActionBar.i6.A0();
        }
        org.telegram.ui.ActionBar.b5 b5Var = new org.telegram.ui.ActionBar.b5(null, A0.Y, this.K, !z10);
        b5Var.f20471f = false;
        b5Var.f20470e = true;
        b5Var.f20477m = this.f43024a;
        b5Var.f20476l = (int) (f7 * 250.0f);
        AndroidUtilities.runOnUIThread(new ai.s4(this, z10, c4Var2, b5Var, 28));
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
                ofFloat.addUpdateListener(new b21(this, 1));
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
        this.f43033x.setVisibility(8);
        this.G.setVisibility(8);
        this.F.setVisibility(8);
        this.F.getAnimatedDrawable();
        s21 s21Var = this.E;
        if (s21Var != null) {
            s21Var.d(true);
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
        this.f43033x.setVisibility(0);
        this.G.setVisibility(0);
        this.F.setVisibility(0);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView.getParent();
        this.fragmentView.layout(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
        s21 s21Var2 = this.E;
        if (s21Var2 != null) {
            s21Var2.d(false);
        }
        Uri bitmapShareUri = AndroidUtilities.getBitmapShareUri(createBitmap, "qr_tmp.jpg", Bitmap.CompressFormat.JPEG);
        if (bitmapShareUri != null) {
            try {
                getParentActivity().startActivityForResult(Intent.createChooser(new Intent("android.intent.action.SEND").setType("image/*").putExtra("android.intent.extra.STREAM", bitmapShareUri), LocaleController.getString(R.string.InviteByQRCode)), 500);
            } catch (ActivityNotFoundException e7) {
                e7.printStackTrace();
            }
        }
        AndroidUtilities.runOnUIThread(new j21(this, 0), 500L);
    }

    @Override
    public final org.telegram.ui.ActionBar.z3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.z3.f21736c;
    }

    @Override
    public final org.telegram.ui.ActionBar.d6 getResourceProvider() {
        return this.f43024a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.k6> themeDescriptions = super.getThemeDescriptions();
        x21 x21Var = this.f43028f;
        x21Var.getClass();
        w21 w21Var = new w21(x21Var);
        ArrayList arrayList = new ArrayList();
        Paint paint = x21Var.f42731a;
        int i10 = org.telegram.ui.ActionBar.i6.f20894h5;
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 1, null, paint, null, null, i10));
        int i11 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 32, null, null, new Drawable[]{x21Var.f42735f}, w21Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(x21Var.f42736n, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.f20930j5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(x21Var.f42741y, 16, new Class[]{org.telegram.ui.Components.s21.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20912i5));
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ((org.telegram.ui.ActionBar.k6) obj).f21350o = x21Var.d.f43024a;
        }
        themeDescriptions.addAll(arrayList);
        qy0 qy0Var = new qy0(3, this);
        TextView textView = this.f43028f.f42738s;
        int i13 = org.telegram.ui.ActionBar.i6.Oh;
        themeDescriptions.add(new org.telegram.ui.ActionBar.k6(textView, 32, null, null, null, qy0Var, i13));
        themeDescriptions.add(new org.telegram.ui.ActionBar.k6(this.f43028f.f42738s, 65568, null, null, null, null, org.telegram.ui.ActionBar.i6.Qh));
        TextView textView2 = this.f43028f.f42739w;
        if (textView2 != null) {
            themeDescriptions.add(new org.telegram.ui.ActionBar.k6(textView2, 4, null, null, null, qy0Var, i13));
            themeDescriptions.add(new org.telegram.ui.ActionBar.k6(this.f43028f.f42740x, 8, null, null, null, qy0Var, i13));
        }
        int size2 = themeDescriptions.size();
        while (i11 < size2) {
            org.telegram.ui.ActionBar.k6 k6Var = themeDescriptions.get(i11);
            i11++;
            k6Var.f21350o = this.f43024a;
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
        x21 x21Var = this.f43028f;
        x21Var.getClass();
        NotificationCenter.getGlobalInstance().removeObserver(x21Var, NotificationCenter.emojiLoaded);
        this.f43028f = null;
        this.H.recycle();
        this.H = null;
        int i10 = 0;
        while (true) {
            fVar = this.d;
            if (i10 >= fVar.f33c) {
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
            alertDialog$Builder.f20372a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new i21(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.L5, false), null);
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
