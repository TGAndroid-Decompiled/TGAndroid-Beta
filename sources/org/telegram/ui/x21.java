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
public class x21 extends org.telegram.ui.ActionBar.n2 {
    public static final a0.f R;
    public static List S;
    public static boolean T;
    public r21 E;
    public org.telegram.ui.Components.bj0 F;
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
    public final o0.a f39169a;
    public final org.telegram.ui.ActionBar.c4 f39170b;
    public final Rect f39171c;
    public final a0.f d;
    public int[] e;
    public w21 f39172f;
    public org.telegram.ui.Components.bc0 h;
    public org.telegram.ui.Components.bc0 f39173n;
    public org.telegram.ui.Components.bc0 f39174r;
    public ValueAnimator f39175s;
    public ValueAnimator v;
    public p50 f39176w;
    public ci.m6 f39177x;
    public org.telegram.ui.Components.w9 f39178y;

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

    public x21(Bundle bundle) {
        super(bundle);
        this.f39169a = new o0.a(this);
        org.telegram.ui.ActionBar.c4 c4Var = new org.telegram.ui.ActionBar.c4(this.currentAccount);
        c4Var.e = "🏠";
        c4Var.f18535c = fg.b.d("🏠");
        c4Var.d = TLRPC.ChatTheme.ofEmoticon(c4Var.e);
        org.telegram.ui.ActionBar.b4 b4Var = new org.telegram.ui.ActionBar.b4();
        b4Var.f18486a = org.telegram.ui.ActionBar.h6.N0("Blue");
        b4Var.e = 99;
        c4Var.f18536f.add(b4Var);
        org.telegram.ui.ActionBar.b4 b4Var2 = new org.telegram.ui.ActionBar.b4();
        b4Var2.f18486a = org.telegram.ui.ActionBar.h6.N0("Dark Blue");
        b4Var2.e = 0;
        c4Var.f18536f.add(b4Var2);
        this.f39170b = c4Var;
        this.f39171c = new Rect();
        this.d = new a0.m(0);
        this.e = null;
        this.h = new org.telegram.ui.Components.bc0();
        this.J = c4Var;
        this.O = -1;
        this.Q = i0.b.e;
    }

    public static void U(x21 x21Var) {
        if (x21Var.getParentActivity() == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23 && x21Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
            x21Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
        } else {
            f0(x21Var);
        }
    }

    public static void V(x21 x21Var) {
        T = false;
        List list = S;
        if (list != null && !list.isEmpty()) {
            x21Var.c0(S);
        } else {
            ChatThemeController.getInstance(x21Var.currentAccount).requestAllChatThemes(new m21(x21Var), true);
        }
    }

    public static void W(x21 x21Var, boolean z10, org.telegram.ui.ActionBar.c4 c4Var, org.telegram.ui.ActionBar.b5 b5Var) {
        o0.a aVar = x21Var.f39169a;
        if (z10) {
            aVar.f15275b = c4Var.b(((x21) aVar.f15276c).currentAccount, x21Var.K ? 1 : 0);
        } else {
            aVar.f15275b = x21Var.J.b(((x21) aVar.f15276c).currentAccount, x21Var.K ? 1 : 0);
        }
        b5Var.h = new j21(x21Var, 3);
        ((ActionBarLayout) x21Var.parentLayout).f(b5Var, null);
        LinearLayout linearLayout = x21Var.f39172f.v;
        if (linearLayout != null) {
            linearLayout.setBackground(org.telegram.ui.ActionBar.x5.d(new float[]{6.0f}, 0, i0.a.k(org.telegram.ui.ActionBar.x5.b(x21Var.getThemedColor(org.telegram.ui.ActionBar.h6.Oh)), 25)));
        }
    }

    public static void X(x21 x21Var) {
        x21Var.f39170b.n(x21Var.currentAccount);
        View view = x21Var.fragmentView;
        if (view == null) {
            return;
        }
        view.postDelayed(new j21(x21Var, 1), 17L);
    }

    public static void f0(org.telegram.ui.ActionBar.n2 n2Var) {
        u9.e0(n2Var.getParentActivity(), 1, new n21(n2Var.getCurrentAccount(), n2Var));
    }

    public final Bitmap b0(org.telegram.ui.ActionBar.c4 c4Var, boolean z10) {
        if (z10) {
            String str = c4Var.e;
            a0.f fVar = this.d;
            Bitmap bitmap = (Bitmap) fVar.get(str);
            if (bitmap == null) {
                bitmap = Bitmap.createBitmap(this.H.getWidth(), this.H.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                int[] iArr = (int[]) R.get(c4Var.e + "n");
                if (iArr != null) {
                    if (this.f39174r == null) {
                        this.f39174r = new org.telegram.ui.Components.bc0(true, 0, 0, 0, 0);
                    }
                    this.f39174r.n(iArr[0], iArr[1], iArr[2], iArr[3]);
                    this.f39174r.setBounds(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), canvas.getWidth() - AndroidUtilities.dp(6.0f), canvas.getHeight() - AndroidUtilities.dp(6.0f));
                    this.f39174r.draw(canvas);
                }
                canvas.drawBitmap(this.H, 0.0f, 0.0f, (Paint) null);
                canvas.setBitmap(null);
                fVar.put(c4Var.e, bitmap);
            }
            return bitmap;
        }
        return this.H;
    }

    public final void c0(List list) {
        if (list != null && !list.isEmpty() && this.f39172f != null) {
            list.set(0, this.f39170b);
            ArrayList arrayList = new ArrayList(list.size());
            for (int i10 = 0; i10 < list.size(); i10++) {
                org.telegram.ui.ActionBar.c4 c4Var = (org.telegram.ui.ActionBar.c4) list.get(i10);
                c4Var.n(this.currentAccount);
                org.telegram.ui.Components.mp mpVar = new org.telegram.ui.Components.mp(c4Var);
                boolean z10 = this.K;
                mpVar.f26255c = z10 ? 1 : 0;
                mpVar.e = b0(c4Var, z10);
                arrayList.add(mpVar);
            }
            org.telegram.ui.Components.lp lpVar = this.f39172f.f38516b;
            lpVar.d = arrayList;
            lpVar.l();
            int i11 = 0;
            while (true) {
                if (i11 != arrayList.size()) {
                    if (fg.b.a(((org.telegram.ui.Components.mp) arrayList.get(i11)).f26253a.f18535c, this.J.f18535c)) {
                        this.f39172f.K = (org.telegram.ui.Components.mp) arrayList.get(i11);
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 != -1) {
                this.f39172f.b(i11);
            }
            w21 w21Var = this.f39172f;
            u21 u21Var = w21Var.F;
            u21Var.setAlpha(0.0f);
            u21Var.animate().alpha(1.0f).setDuration(150L).start();
            u21Var.setVisibility(0);
            org.telegram.ui.Components.u00 u00Var = w21Var.f38520r;
            u00Var.animate().alpha(0.0f).setListener(new org.telegram.ui.Components.ca(u00Var)).setDuration(150L).start();
            org.telegram.ui.Components.ml0 ml0Var = w21Var.f38524y;
            ml0Var.setAlpha(0.0f);
            ml0Var.animate().alpha(1.0f).setDuration(150L).start();
        }
    }

    @Override
    public final android.view.View createView(android.content.Context r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.x21.createView(android.content.Context):android.view.View");
    }

    public final void d0(int i10, org.telegram.ui.ActionBar.c4 c4Var, boolean z10) {
        float f7;
        String str;
        org.telegram.ui.ActionBar.g6 A0;
        this.O = i10;
        org.telegram.ui.ActionBar.c4 c4Var2 = this.J;
        final boolean z11 = this.K;
        this.J = c4Var;
        org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) c4Var.f18536f.get(z11 ? 1 : 0);
        ValueAnimator valueAnimator = this.f39175s;
        if (valueAnimator != null) {
            f7 = Math.max(0.5f, 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 1.0f;
            this.f39175s.cancel();
        } else {
            f7 = 1.0f;
        }
        org.telegram.ui.Components.bc0 bc0Var = this.h;
        this.f39173n = bc0Var;
        bc0Var.q(false);
        this.f39173n.setAlpha(255);
        org.telegram.ui.Components.bc0 bc0Var2 = new org.telegram.ui.Components.bc0();
        this.h = bc0Var2;
        bc0Var2.setCallback(this.f39176w);
        this.h.n(b4Var.f18493k, b4Var.f18494l, b4Var.f18495m, b4Var.f18496n);
        this.h.r(this.f39176w);
        this.h.s(1.0f);
        org.telegram.ui.Components.bc0 bc0Var3 = this.h;
        bc0Var3.N = true;
        org.telegram.ui.Components.bc0 bc0Var4 = this.f39173n;
        if (bc0Var4 != null) {
            bc0Var3.h = bc0Var4.h;
        }
        this.E.f36664a.h = bc0Var3.h;
        TLRPC.WallPaper k10 = this.J.k(z11 ? 1 : 0);
        if (k10 != null) {
            org.telegram.ui.Components.bc0 bc0Var5 = this.h;
            bc0Var5.t(bc0Var5.f22696u, k10.settings.intensity);
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.J.o(z11 ? 1 : 0, new ResultCallback() {
                @Override
                public final void onComplete(Object obj) {
                    boolean z12;
                    Pair pair = (Pair) obj;
                    x21 x21Var = x21.this;
                    long i11 = x21Var.J.i(z11 ? 1 : 0);
                    if (pair != null && i11 != 0) {
                        long longValue = ((Long) pair.first).longValue();
                        Bitmap bitmap = ((dg.a) pair.second).f7710b;
                        if (longValue == i11 && bitmap != null) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            int i12 = x21Var.h.f22692q;
                            if (elapsedRealtime2 > 150) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            x21Var.e0(i12, bitmap, z12);
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
        org.telegram.ui.Components.bc0 bc0Var6 = this.h;
        bc0Var6.u(bc0Var6.f());
        a0.f fVar = R;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c4Var.e);
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
            org.telegram.ui.Components.bc0 bc0Var7 = this.h;
            bc0Var7.K = 0.0f;
            bc0Var7.i();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f39175s = ofFloat;
            ofFloat.addUpdateListener(new ai.x(23, this, iArr));
            this.f39175s.addListener(new org.telegram.ui.Components.qk0(12, this, iArr));
            this.f39175s.setDuration((int) (f7 * 250.0f));
            this.f39175s.start();
        } else {
            if (iArr != null) {
                r21 r21Var = this.E;
                r21Var.f36664a.n(iArr[0], iArr[1], iArr[2], iArr[3]);
                r21Var.invalidate();
                System.arraycopy(iArr, 0, this.e, 0, 4);
            }
            this.f39173n = null;
            this.f39176w.invalidate();
        }
        if (this.K) {
            A0 = org.telegram.ui.ActionBar.h6.J;
        } else {
            A0 = org.telegram.ui.ActionBar.h6.A0();
        }
        org.telegram.ui.ActionBar.b5 b5Var = new org.telegram.ui.ActionBar.b5(null, A0.Y, this.K, !z10);
        b5Var.f18501f = false;
        b5Var.e = true;
        b5Var.f18507m = this.f39169a;
        b5Var.f18506l = (int) (f7 * 250.0f);
        AndroidUtilities.runOnUIThread(new ai.s4(this, z10, c4Var2, b5Var, 27));
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
                ofFloat.addUpdateListener(new s11(this, 2));
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
        this.f39177x.setVisibility(8);
        this.G.setVisibility(8);
        this.F.setVisibility(8);
        this.F.getAnimatedDrawable();
        r21 r21Var = this.E;
        if (r21Var != null) {
            r21Var.d(true);
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
        this.f39177x.setVisibility(0);
        this.G.setVisibility(0);
        this.F.setVisibility(0);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView.getParent();
        this.fragmentView.layout(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
        r21 r21Var2 = this.E;
        if (r21Var2 != null) {
            r21Var2.d(false);
        }
        Uri bitmapShareUri = AndroidUtilities.getBitmapShareUri(createBitmap, "qr_tmp.jpg", Bitmap.CompressFormat.JPEG);
        if (bitmapShareUri != null) {
            try {
                getParentActivity().startActivityForResult(Intent.createChooser(new Intent("android.intent.action.SEND").setType("image/*").putExtra("android.intent.extra.STREAM", bitmapShareUri), LocaleController.getString(R.string.InviteByQRCode)), 500);
            } catch (ActivityNotFoundException e) {
                e.printStackTrace();
            }
        }
        AndroidUtilities.runOnUIThread(new j21(this, 0), 500L);
    }

    @Override
    public final org.telegram.ui.ActionBar.z3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.z3.f19712c;
    }

    @Override
    public final org.telegram.ui.ActionBar.d6 getResourceProvider() {
        return this.f39169a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.j6> themeDescriptions = super.getThemeDescriptions();
        w21 w21Var = this.f39172f;
        w21Var.getClass();
        v21 v21Var = new v21(w21Var);
        ArrayList arrayList = new ArrayList();
        Paint paint = w21Var.f38515a;
        int i10 = org.telegram.ui.ActionBar.h6.f18859h5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 1, null, paint, null, null, i10));
        int i11 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 32, null, null, new Drawable[]{w21Var.f38518f}, v21Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w21Var.f38519n, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f18895j5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w21Var.f38524y, 16, new Class[]{org.telegram.ui.Components.t11.class}, null, null, null, org.telegram.ui.ActionBar.h6.f18877i5));
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ((org.telegram.ui.ActionBar.j6) obj).f19266o = w21Var.d.f39169a;
        }
        themeDescriptions.addAll(arrayList);
        qy0 qy0Var = new qy0(3, this);
        TextView textView = this.f39172f.f38521s;
        int i13 = org.telegram.ui.ActionBar.h6.Oh;
        themeDescriptions.add(new org.telegram.ui.ActionBar.j6(textView, 32, null, null, null, qy0Var, i13));
        themeDescriptions.add(new org.telegram.ui.ActionBar.j6(this.f39172f.f38521s, 65568, null, null, null, null, org.telegram.ui.ActionBar.h6.Qh));
        TextView textView2 = this.f39172f.f38522w;
        if (textView2 != null) {
            themeDescriptions.add(new org.telegram.ui.ActionBar.j6(textView2, 4, null, null, null, qy0Var, i13));
            themeDescriptions.add(new org.telegram.ui.ActionBar.j6(this.f39172f.f38523x, 8, null, null, null, qy0Var, i13));
        }
        int size2 = themeDescriptions.size();
        while (i11 < size2) {
            org.telegram.ui.ActionBar.j6 j6Var = themeDescriptions.get(i11);
            i11++;
            j6Var.f19266o = this.f39169a;
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
        w21 w21Var = this.f39172f;
        w21Var.getClass();
        NotificationCenter.getGlobalInstance().removeObserver(w21Var, NotificationCenter.emojiLoaded);
        this.f39172f = null;
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
            alertDialog$Builder.f18409a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new i21(this));
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
