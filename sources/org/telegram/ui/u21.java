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
public class u21 extends org.telegram.ui.ActionBar.p2 {
    public static final a0.f O;
    public static List P;
    public static boolean Q;
    public o21 B;
    public org.telegram.ui.Components.jj0 C;
    public ImageView D;
    public Bitmap E;
    public Bitmap F;
    public org.telegram.ui.ActionBar.e4 G;
    public boolean H;
    public long I;
    public long J;
    public int K;
    public int L;
    public boolean M;
    public i0.b N;
    public final n7.qa f38674a;
    public final org.telegram.ui.ActionBar.e4 f38675b;
    public final Rect f38676c;
    public final a0.f d;
    public int[] e;
    public t21 f38677f;
    public org.telegram.ui.Components.ec0 h;
    public org.telegram.ui.Components.ec0 f38678n;
    public org.telegram.ui.Components.ec0 f38679r;
    public ValueAnimator f38680s;
    public ValueAnimator v;
    public nw0 f38681w;
    public ah.e f38682x;
    public org.telegram.ui.Components.p9 f38683y;

    static {
        ?? kVar = new a0.k(0);
        O = kVar;
        kVar.put("🏠d", new int[]{-9324972, -13856649, -6636738, -9915042});
        kVar.put("🐥d", new int[]{-12344463, -7684788, -6442695, -8013488});
        kVar.put("⛄d", new int[]{-10051073, -10897938, -12469550, -7694337});
        kVar.put("💎d", new int[]{-11429643, -11814958, -5408261, -2128185});
        kVar.put("👨\u200d🏫d", new int[]{-6637227, -12015466, -13198627, -10631557});
        kVar.put("🌷d", new int[]{-1146812, -1991901, -1745517, -3443241});
        kVar.put("💜d", new int[]{-1156738, -1876046, -5412366, -28073});
        kVar.put("🎄d", new int[]{-1281978, -551386, -1870308, -742870});
        kVar.put("🎮d", new int[]{-15092782, -2333964, -1684365, -1269214});
        kVar.put("🏠n", new int[]{-15368239, -11899662, -15173939, -13850930});
        kVar.put("🐥n", new int[]{-11033320, -14780848, -9594089, -12604587});
        kVar.put("⛄n", new int[]{-13930790, -13665098, -14833975, -9732865});
        kVar.put("💎n", new int[]{-5089608, -9481473, -14378302, -13337899});
        kVar.put("👨\u200d🏫n", new int[]{-14447768, -9199261, -15356801, -15823723});
        kVar.put("🌷n", new int[]{-2534316, -2984177, -3258783, -5480504});
        kVar.put("💜n", new int[]{-3123030, -2067394, -2599576, -6067757});
        kVar.put("🎄n", new int[]{-2725857, -3242459, -3248848, -3569123});
        kVar.put("🎮n", new int[]{-3718333, -1278154, -16338695, -6076417});
        Q = true;
    }

    public u21(Bundle bundle) {
        super(bundle);
        this.f38674a = new n7.qa(this);
        org.telegram.ui.ActionBar.e4 e4Var = new org.telegram.ui.ActionBar.e4(this.currentAccount);
        e4Var.e = "🏠";
        e4Var.f19640c = sf.b.d("🏠");
        e4Var.d = TLRPC.ChatTheme.ofEmoticon(e4Var.e);
        org.telegram.ui.ActionBar.d4 d4Var = new org.telegram.ui.ActionBar.d4();
        d4Var.f19596a = org.telegram.ui.ActionBar.j6.N0("Blue");
        d4Var.e = 99;
        e4Var.f19641f.add(d4Var);
        org.telegram.ui.ActionBar.d4 d4Var2 = new org.telegram.ui.ActionBar.d4();
        d4Var2.f19596a = org.telegram.ui.ActionBar.j6.N0("Dark Blue");
        d4Var2.e = 0;
        e4Var.f19641f.add(d4Var2);
        this.f38675b = e4Var;
        this.f38676c = new Rect();
        this.d = new a0.k(0);
        this.e = null;
        this.h = new org.telegram.ui.Components.ec0();
        this.G = e4Var;
        this.L = -1;
        this.N = i0.b.e;
    }

    public static void U(u21 u21Var) {
        if (u21Var.getParentActivity() == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23 && u21Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
            u21Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
        } else {
            f0(u21Var);
        }
    }

    public static void V(u21 u21Var) {
        Q = false;
        List list = P;
        if (list != null && !list.isEmpty()) {
            u21Var.c0(P);
        } else {
            ChatThemeController.getInstance(u21Var.currentAccount).requestAllChatThemes(new i21(u21Var), true);
        }
    }

    public static void W(u21 u21Var, boolean z4, org.telegram.ui.ActionBar.e4 e4Var, org.telegram.ui.ActionBar.d5 d5Var) {
        n7.qa qaVar = u21Var.f38674a;
        if (z4) {
            qaVar.f14687b = e4Var.b(((u21) qaVar.f14688c).currentAccount, u21Var.H ? 1 : 0);
        } else {
            qaVar.f14687b = u21Var.G.b(((u21) qaVar.f14688c).currentAccount, u21Var.H ? 1 : 0);
        }
        d5Var.h = new f21(u21Var, 3);
        ((ActionBarLayout) u21Var.parentLayout).f(d5Var, null);
        LinearLayout linearLayout = u21Var.f38677f.v;
        if (linearLayout != null) {
            linearLayout.setBackground(org.telegram.ui.ActionBar.z5.d(new float[]{6.0f}, 0, i0.a.k(org.telegram.ui.ActionBar.z5.b(u21Var.getThemedColor(org.telegram.ui.ActionBar.j6.Oh)), 25)));
        }
    }

    public static void X(u21 u21Var) {
        u21Var.f38675b.n(u21Var.currentAccount);
        View view = u21Var.fragmentView;
        if (view == null) {
            return;
        }
        view.postDelayed(new f21(u21Var, 1), 17L);
    }

    public static void f0(org.telegram.ui.ActionBar.p2 p2Var) {
        x9.e0(p2Var.getParentActivity(), 1, new k21(p2Var.getCurrentAccount(), p2Var));
    }

    public final Bitmap b0(org.telegram.ui.ActionBar.e4 e4Var, boolean z4) {
        if (z4) {
            String str = e4Var.e;
            a0.f fVar = this.d;
            Bitmap bitmap = (Bitmap) fVar.get(str);
            if (bitmap == null) {
                bitmap = Bitmap.createBitmap(this.E.getWidth(), this.E.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                int[] iArr = (int[]) O.get(e4Var.e + "n");
                if (iArr != null) {
                    if (this.f38679r == null) {
                        this.f38679r = new org.telegram.ui.Components.ec0(true, 0, 0, 0, 0);
                    }
                    this.f38679r.n(iArr[0], iArr[1], iArr[2], iArr[3]);
                    this.f38679r.setBounds(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), canvas.getWidth() - AndroidUtilities.dp(6.0f), canvas.getHeight() - AndroidUtilities.dp(6.0f));
                    this.f38679r.draw(canvas);
                }
                canvas.drawBitmap(this.E, 0.0f, 0.0f, (Paint) null);
                canvas.setBitmap(null);
                fVar.put(e4Var.e, bitmap);
            }
            return bitmap;
        }
        return this.E;
    }

    public final void c0(List list) {
        if (list != null && !list.isEmpty() && this.f38677f != null) {
            list.set(0, this.f38675b);
            ArrayList arrayList = new ArrayList(list.size());
            for (int i10 = 0; i10 < list.size(); i10++) {
                org.telegram.ui.ActionBar.e4 e4Var = (org.telegram.ui.ActionBar.e4) list.get(i10);
                e4Var.n(this.currentAccount);
                org.telegram.ui.Components.ip ipVar = new org.telegram.ui.Components.ip(e4Var);
                boolean z4 = this.H;
                ipVar.f25751c = z4 ? 1 : 0;
                ipVar.e = b0(e4Var, z4);
                arrayList.add(ipVar);
            }
            org.telegram.ui.Components.hp hpVar = this.f38677f.f38362b;
            hpVar.d = arrayList;
            hpVar.l();
            int i11 = 0;
            while (true) {
                if (i11 != arrayList.size()) {
                    if (sf.b.a(((org.telegram.ui.Components.ip) arrayList.get(i11)).f25749a.f19640c, this.G.f19640c)) {
                        this.f38677f.H = (org.telegram.ui.Components.ip) arrayList.get(i11);
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 != -1) {
                this.f38677f.b(i11);
            }
            t21 t21Var = this.f38677f;
            r21 r21Var = t21Var.C;
            r21Var.setAlpha(0.0f);
            r21Var.animate().alpha(1.0f).setDuration(150L).start();
            r21Var.setVisibility(0);
            org.telegram.ui.Components.u00 u00Var = t21Var.f38366r;
            u00Var.animate().alpha(0.0f).setListener(new org.telegram.ui.Components.m00(u00Var)).setDuration(150L).start();
            org.telegram.ui.Components.rl0 rl0Var = t21Var.f38370y;
            rl0Var.setAlpha(0.0f);
            rl0Var.animate().alpha(1.0f).setDuration(150L).start();
        }
    }

    @Override
    public final android.view.View createView(android.content.Context r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u21.createView(android.content.Context):android.view.View");
    }

    public final void d0(int i10, org.telegram.ui.ActionBar.e4 e4Var, boolean z4) {
        float f10;
        String str;
        org.telegram.ui.ActionBar.i6 A0;
        this.L = i10;
        org.telegram.ui.ActionBar.e4 e4Var2 = this.G;
        final boolean z10 = this.H;
        this.G = e4Var;
        org.telegram.ui.ActionBar.d4 d4Var = (org.telegram.ui.ActionBar.d4) e4Var.f19641f.get(z10 ? 1 : 0);
        ValueAnimator valueAnimator = this.f38680s;
        if (valueAnimator != null) {
            f10 = Math.max(0.5f, 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 1.0f;
            this.f38680s.cancel();
        } else {
            f10 = 1.0f;
        }
        org.telegram.ui.Components.ec0 ec0Var = this.h;
        this.f38678n = ec0Var;
        ec0Var.q(false);
        this.f38678n.setAlpha(255);
        org.telegram.ui.Components.ec0 ec0Var2 = new org.telegram.ui.Components.ec0();
        this.h = ec0Var2;
        ec0Var2.setCallback(this.f38681w);
        this.h.n(d4Var.f19603k, d4Var.f19604l, d4Var.f19605m, d4Var.f19606n);
        this.h.r(this.f38681w);
        this.h.s(1.0f);
        org.telegram.ui.Components.ec0 ec0Var3 = this.h;
        ec0Var3.N = true;
        org.telegram.ui.Components.ec0 ec0Var4 = this.f38678n;
        if (ec0Var4 != null) {
            ec0Var3.h = ec0Var4.h;
        }
        this.B.f36630a.h = ec0Var3.h;
        TLRPC.WallPaper k10 = this.G.k(z10 ? 1 : 0);
        if (k10 != null) {
            org.telegram.ui.Components.ec0 ec0Var5 = this.h;
            ec0Var5.t(ec0Var5.f24590u, k10.settings.intensity);
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.G.o(z10 ? 1 : 0, new ResultCallback() {
                @Override
                public final void onComplete(Object obj) {
                    boolean z11;
                    Pair pair = (Pair) obj;
                    u21 u21Var = u21.this;
                    long i11 = u21Var.G.i(z10 ? 1 : 0);
                    if (pair != null && i11 != 0) {
                        long longValue = ((Long) pair.first).longValue();
                        Bitmap bitmap = ((pf.a) pair.second).f41225b;
                        if (longValue == i11 && bitmap != null) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            int i12 = u21Var.h.f24586q;
                            if (elapsedRealtime2 > 150) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            u21Var.e0(i12, bitmap, z11);
                        }
                    }
                }

                @Override
                public final void onError(Throwable th2) {
                    org.telegram.tgnet.k.a(this, th2);
                }

                @Override
                public final void onError(TLRPC.TL_error tL_error) {
                    org.telegram.tgnet.k.b(this, tL_error);
                }
            });
        } else {
            Utilities.themeQueue.postRunnable(new f21(this, 2), 35L);
        }
        org.telegram.ui.Components.ec0 ec0Var6 = this.h;
        ec0Var6.u(ec0Var6.f());
        a0.f fVar = O;
        StringBuilder sb = new StringBuilder();
        sb.append(e4Var.e);
        if (z10) {
            str = "n";
        } else {
            str = "d";
        }
        sb.append(str);
        int[] iArr = (int[]) fVar.get(sb.toString());
        if (z4) {
            if (this.e == null) {
                int[] iArr2 = new int[4];
                this.e = iArr2;
                System.arraycopy(iArr, 0, iArr2, 0, 4);
            }
            this.h.setAlpha(255);
            org.telegram.ui.Components.ec0 ec0Var7 = this.h;
            ec0Var7.K = 0.0f;
            ec0Var7.i();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f38680s = ofFloat;
            ofFloat.addUpdateListener(new ag.a(22, this, iArr));
            this.f38680s.addListener(new org.telegram.ui.Components.ex0(9, this, iArr));
            this.f38680s.setDuration((int) (f10 * 250.0f));
            this.f38680s.start();
        } else {
            if (iArr != null) {
                o21 o21Var = this.B;
                o21Var.f36630a.n(iArr[0], iArr[1], iArr[2], iArr[3]);
                o21Var.invalidate();
                System.arraycopy(iArr, 0, this.e, 0, 4);
            }
            this.f38678n = null;
            this.f38681w.invalidate();
        }
        if (this.H) {
            A0 = org.telegram.ui.ActionBar.j6.J;
        } else {
            A0 = org.telegram.ui.ActionBar.j6.A0();
        }
        org.telegram.ui.ActionBar.d5 d5Var = new org.telegram.ui.ActionBar.d5(null, A0.V, this.H, !z4);
        d5Var.f19611f = false;
        d5Var.e = true;
        d5Var.f19617m = this.f38674a;
        d5Var.f19616l = (int) (f10 * 250.0f);
        AndroidUtilities.runOnUIThread(new cg.u0(this, z4, e4Var2, d5Var, 23));
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void e0(int i10, Bitmap bitmap, boolean z4) {
        if (bitmap != null) {
            this.h.t(bitmap, i10);
            ValueAnimator valueAnimator = this.v;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (z4) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.v = ofFloat;
                ofFloat.addUpdateListener(new o11(this, 2));
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
        float f10 = min;
        if ((max * 1.0f) / f10 > 1.92f) {
            max = (int) (f10 * 1.92f);
        }
        Bitmap createBitmap = Bitmap.createBitmap(min, max, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        this.f38682x.setVisibility(8);
        this.D.setVisibility(8);
        this.C.setVisibility(8);
        this.C.getAnimatedDrawable();
        o21 o21Var = this.B;
        if (o21Var != null) {
            o21Var.d(true);
        }
        this.fragmentView.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(max, 1073741824));
        this.fragmentView.layout(0, 0, min, max);
        this.fragmentView.draw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(this.C.getLeft(), this.C.getTop(), this.C.getRight(), this.C.getBottom());
        if (this.F != null) {
            canvas.drawBitmap(this.F, (Rect) null, rectF, new Paint(2));
        }
        canvas.setBitmap(null);
        this.f38682x.setVisibility(0);
        this.D.setVisibility(0);
        this.C.setVisibility(0);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView.getParent();
        this.fragmentView.layout(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
        o21 o21Var2 = this.B;
        if (o21Var2 != null) {
            o21Var2.d(false);
        }
        Uri bitmapShareUri = AndroidUtilities.getBitmapShareUri(createBitmap, "qr_tmp.jpg", Bitmap.CompressFormat.JPEG);
        if (bitmapShareUri != null) {
            try {
                getParentActivity().startActivityForResult(Intent.createChooser(new Intent("android.intent.action.SEND").setType("image/*").putExtra("android.intent.extra.STREAM", bitmapShareUri), LocaleController.getString(R.string.InviteByQRCode)), 500);
            } catch (ActivityNotFoundException e) {
                e.printStackTrace();
            }
        }
        AndroidUtilities.runOnUIThread(new f21(this, 0), 500L);
    }

    @Override
    public final org.telegram.ui.ActionBar.z3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.z3.f20759c;
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return this.f38674a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.l6> themeDescriptions = super.getThemeDescriptions();
        t21 t21Var = this.f38677f;
        t21Var.getClass();
        s21 s21Var = new s21(t21Var);
        ArrayList arrayList = new ArrayList();
        Paint paint = t21Var.f38361a;
        int i10 = org.telegram.ui.ActionBar.j6.f19952h5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 1, null, paint, null, null, i10));
        int i11 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 32, null, null, new Drawable[]{t21Var.f38364f}, s21Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(t21Var.f38365n, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f19987j5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(t21Var.f38370y, 16, new Class[]{org.telegram.ui.Components.w11.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19970i5));
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ((org.telegram.ui.ActionBar.l6) obj).f20417o = t21Var.d.f38674a;
        }
        themeDescriptions.addAll(arrayList);
        jy0 jy0Var = new jy0(3, this);
        TextView textView = this.f38677f.f38367s;
        int i13 = org.telegram.ui.ActionBar.j6.Oh;
        themeDescriptions.add(new org.telegram.ui.ActionBar.l6(textView, 32, null, null, null, jy0Var, i13));
        themeDescriptions.add(new org.telegram.ui.ActionBar.l6(this.f38677f.f38367s, 65568, null, null, null, null, org.telegram.ui.ActionBar.j6.Qh));
        TextView textView2 = this.f38677f.f38368w;
        if (textView2 != null) {
            themeDescriptions.add(new org.telegram.ui.ActionBar.l6(textView2, 4, null, null, null, jy0Var, i13));
            themeDescriptions.add(new org.telegram.ui.ActionBar.l6(this.f38677f.f38369x, 8, null, null, null, jy0Var, i13));
        }
        int size2 = themeDescriptions.size();
        while (i11 < size2) {
            org.telegram.ui.ActionBar.l6 l6Var = themeDescriptions.get(i11);
            i11++;
            l6Var.f20417o = this.f38674a;
        }
        return themeDescriptions;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.I = this.arguments.getLong("user_id");
        this.J = this.arguments.getLong("chat_id");
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        a0.f fVar;
        t21 t21Var = this.f38677f;
        t21Var.getClass();
        NotificationCenter.getGlobalInstance().removeObserver(t21Var, NotificationCenter.emojiLoaded);
        this.f38677f = null;
        this.E.recycle();
        this.E = null;
        int i10 = 0;
        while (true) {
            fVar = this.d;
            if (i10 >= fVar.f25c) {
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
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.K);
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        if (getParentActivity() != null) {
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.K);
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
            alertDialog$Builder.f19478a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new e21(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
            alertDialog$Builder.o();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (getParentActivity() != null) {
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.K | 1028);
        }
    }
}
