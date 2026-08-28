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
public class z11 extends org.telegram.ui.ActionBar.o2 {
    public static final a0.f N;
    public static List O;
    public static boolean P;
    public u11 A;
    public org.telegram.ui.Components.pi0 B;
    public ImageView C;
    public Bitmap D;
    public Bitmap E;
    public org.telegram.ui.ActionBar.b4 F;
    public boolean G;
    public long H;
    public long I;
    public int J;
    public int K;
    public boolean L;
    public i0.b M;
    public final org.telegram.ui.Cells.e3 f45000a;
    public final org.telegram.ui.ActionBar.b4 f45001b;
    public final Rect f45002c;
    public final a0.f d;
    public int[] f45003e;
    public y11 f45004f;
    public org.telegram.ui.Components.jb0 h;
    public org.telegram.ui.Components.jb0 f45005n;
    public org.telegram.ui.Components.jb0 f45006r;
    public ValueAnimator f45007s;
    public ValueAnimator v;
    public yi0 f45008w;
    public fh.v f45009x;
    public org.telegram.ui.Components.o9 f45010y;

    static {
        ?? kVar = new a0.k(0);
        N = kVar;
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
        P = true;
    }

    public z11(Bundle bundle) {
        super(bundle);
        this.f45000a = new org.telegram.ui.Cells.e3(this);
        org.telegram.ui.ActionBar.b4 b4Var = new org.telegram.ui.ActionBar.b4(this.currentAccount);
        b4Var.f22751e = "🏠";
        b4Var.f22750c = nf.b.d("🏠");
        b4Var.d = TLRPC.ChatTheme.ofEmoticon(b4Var.f22751e);
        org.telegram.ui.ActionBar.a4 a4Var = new org.telegram.ui.ActionBar.a4();
        a4Var.f22714a = org.telegram.ui.ActionBar.f6.N0("Blue");
        a4Var.f22717e = 99;
        b4Var.f22752f.add(a4Var);
        org.telegram.ui.ActionBar.a4 a4Var2 = new org.telegram.ui.ActionBar.a4();
        a4Var2.f22714a = org.telegram.ui.ActionBar.f6.N0("Dark Blue");
        a4Var2.f22717e = 0;
        b4Var.f22752f.add(a4Var2);
        this.f45001b = b4Var;
        this.f45002c = new Rect();
        this.d = new a0.k(0);
        this.f45003e = null;
        this.h = new org.telegram.ui.Components.jb0();
        this.F = b4Var;
        this.K = -1;
        this.M = i0.b.f10847e;
    }

    public static void T(z11 z11Var) {
        if (z11Var.getParentActivity() == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23 && z11Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
            z11Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
        } else {
            e0(z11Var);
        }
    }

    public static void U(z11 z11Var) {
        P = false;
        List list = O;
        if (list != null && !list.isEmpty()) {
            z11Var.b0(O);
        } else {
            ChatThemeController.getInstance(z11Var.currentAccount).requestAllChatThemes(new p11(z11Var), true);
        }
    }

    public static void V(z11 z11Var, boolean z10, org.telegram.ui.ActionBar.b4 b4Var, org.telegram.ui.ActionBar.a5 a5Var) {
        org.telegram.ui.Cells.e3 e3Var = z11Var.f45000a;
        if (z10) {
            e3Var.f24286b = b4Var.b(((z11) e3Var.f24287c).currentAccount, z11Var.G ? 1 : 0);
        } else {
            e3Var.f24286b = z11Var.F.b(((z11) e3Var.f24287c).currentAccount, z11Var.G ? 1 : 0);
        }
        a5Var.h = new m11(z11Var, 3);
        ((ActionBarLayout) z11Var.parentLayout).f(a5Var, null);
        LinearLayout linearLayout = z11Var.f45004f.v;
        if (linearLayout != null) {
            linearLayout.setBackground(org.telegram.ui.ActionBar.v5.d(new float[]{6.0f}, 0, i0.a.k(org.telegram.ui.ActionBar.v5.b(z11Var.getThemedColor(org.telegram.ui.ActionBar.f6.Oh)), 25)));
        }
    }

    public static void W(z11 z11Var) {
        z11Var.f45001b.n(z11Var.currentAccount);
        View view = z11Var.fragmentView;
        if (view == null) {
            return;
        }
        view.postDelayed(new m11(z11Var, 1), 17L);
    }

    public static void e0(org.telegram.ui.ActionBar.o2 o2Var) {
        s9.d0(o2Var.getParentActivity(), 1, new q11(o2Var.getCurrentAccount(), o2Var));
    }

    public final Bitmap a0(org.telegram.ui.ActionBar.b4 b4Var, boolean z10) {
        if (z10) {
            String str = b4Var.f22751e;
            a0.f fVar = this.d;
            Bitmap bitmap = (Bitmap) fVar.get(str);
            if (bitmap == null) {
                bitmap = Bitmap.createBitmap(this.D.getWidth(), this.D.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                int[] iArr = (int[]) N.get(b4Var.f22751e + "n");
                if (iArr != null) {
                    if (this.f45006r == null) {
                        this.f45006r = new org.telegram.ui.Components.jb0(true, 0, 0, 0, 0);
                    }
                    this.f45006r.n(iArr[0], iArr[1], iArr[2], iArr[3]);
                    this.f45006r.setBounds(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), canvas.getWidth() - AndroidUtilities.dp(6.0f), canvas.getHeight() - AndroidUtilities.dp(6.0f));
                    this.f45006r.draw(canvas);
                }
                canvas.drawBitmap(this.D, 0.0f, 0.0f, (Paint) null);
                canvas.setBitmap(null);
                fVar.put(b4Var.f22751e, bitmap);
            }
            return bitmap;
        }
        return this.D;
    }

    public final void b0(List list) {
        if (list != null && !list.isEmpty() && this.f45004f != null) {
            list.set(0, this.f45001b);
            ArrayList arrayList = new ArrayList(list.size());
            for (int i9 = 0; i9 < list.size(); i9++) {
                org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) list.get(i9);
                b4Var.n(this.currentAccount);
                org.telegram.ui.Components.bp bpVar = new org.telegram.ui.Components.bp(b4Var);
                boolean z10 = this.G;
                bpVar.f27263c = z10 ? 1 : 0;
                bpVar.f27264e = a0(b4Var, z10);
                arrayList.add(bpVar);
            }
            org.telegram.ui.Components.ap apVar = this.f45004f.f44675b;
            apVar.d = arrayList;
            apVar.l();
            int i10 = 0;
            while (true) {
                if (i10 != arrayList.size()) {
                    if (nf.b.a(((org.telegram.ui.Components.bp) arrayList.get(i10)).f27261a.f22750c, this.F.f22750c)) {
                        this.f45004f.G = (org.telegram.ui.Components.bp) arrayList.get(i10);
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 != -1) {
                this.f45004f.b(i10);
            }
            y11 y11Var = this.f45004f;
            w11 w11Var = y11Var.B;
            w11Var.setAlpha(0.0f);
            w11Var.animate().alpha(1.0f).setDuration(150L).start();
            w11Var.setVisibility(0);
            org.telegram.ui.Components.e00 e00Var = y11Var.f44680r;
            e00Var.animate().alpha(0.0f).setListener(new org.telegram.ui.Components.u9(e00Var)).setDuration(150L).start();
            org.telegram.ui.Components.wk0 wk0Var = y11Var.f44684y;
            wk0Var.setAlpha(0.0f);
            wk0Var.animate().alpha(1.0f).setDuration(150L).start();
        }
    }

    public final void c0(int i9, org.telegram.ui.ActionBar.b4 b4Var, boolean z10) {
        float f10;
        String str;
        org.telegram.ui.ActionBar.e6 A0;
        this.K = i9;
        org.telegram.ui.ActionBar.b4 b4Var2 = this.F;
        final boolean z11 = this.G;
        this.F = b4Var;
        org.telegram.ui.ActionBar.a4 a4Var = (org.telegram.ui.ActionBar.a4) b4Var.f22752f.get(z11 ? 1 : 0);
        ValueAnimator valueAnimator = this.f45007s;
        if (valueAnimator != null) {
            f10 = Math.max(0.5f, 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 1.0f;
            this.f45007s.cancel();
        } else {
            f10 = 1.0f;
        }
        org.telegram.ui.Components.jb0 jb0Var = this.h;
        this.f45005n = jb0Var;
        jb0Var.q(false);
        this.f45005n.setAlpha(255);
        org.telegram.ui.Components.jb0 jb0Var2 = new org.telegram.ui.Components.jb0();
        this.h = jb0Var2;
        jb0Var2.setCallback(this.f45008w);
        this.h.n(a4Var.f22722k, a4Var.f22723l, a4Var.f22724m, a4Var.f22725n);
        this.h.r(this.f45008w);
        this.h.s(1.0f);
        org.telegram.ui.Components.jb0 jb0Var3 = this.h;
        jb0Var3.N = true;
        org.telegram.ui.Components.jb0 jb0Var4 = this.f45005n;
        if (jb0Var4 != null) {
            jb0Var3.h = jb0Var4.h;
        }
        this.A.f43100a.h = jb0Var3.h;
        TLRPC.WallPaper k10 = this.F.k(z11 ? 1 : 0);
        if (k10 != null) {
            org.telegram.ui.Components.jb0 jb0Var5 = this.h;
            jb0Var5.t(jb0Var5.f29708u, k10.settings.intensity);
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.F.o(z11 ? 1 : 0, new ResultCallback() {
                @Override
                public final void onComplete(Object obj) {
                    boolean z12;
                    Pair pair = (Pair) obj;
                    z11 z11Var = z11.this;
                    long i10 = z11Var.F.i(z11 ? 1 : 0);
                    if (pair != null && i10 != 0) {
                        long longValue = ((Long) pair.first).longValue();
                        Bitmap bitmap = ((lf.a) pair.second).f16853b;
                        if (longValue == i10 && bitmap != null) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            int i11 = z11Var.h.f29704q;
                            if (elapsedRealtime2 > 150) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            z11Var.d0(i11, bitmap, z12);
                        }
                    }
                }

                @Override
                public final void onError(Throwable th) {
                    org.telegram.tgnet.k.a(this, th);
                }

                @Override
                public final void onError(TLRPC.TL_error tL_error) {
                    org.telegram.tgnet.k.b(this, tL_error);
                }
            });
        } else {
            Utilities.themeQueue.postRunnable(new m11(this, 2), 35L);
        }
        org.telegram.ui.Components.jb0 jb0Var6 = this.h;
        jb0Var6.u(jb0Var6.f());
        a0.f fVar = N;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b4Var.f22751e);
        if (z11) {
            str = "n";
        } else {
            str = "d";
        }
        sb2.append(str);
        int[] iArr = (int[]) fVar.get(sb2.toString());
        if (z10) {
            if (this.f45003e == null) {
                int[] iArr2 = new int[4];
                this.f45003e = iArr2;
                System.arraycopy(iArr, 0, iArr2, 0, 4);
            }
            this.h.setAlpha(255);
            org.telegram.ui.Components.jb0 jb0Var7 = this.h;
            jb0Var7.K = 0.0f;
            jb0Var7.i();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f45007s = ofFloat;
            ofFloat.addUpdateListener(new f2.g(19, this, iArr));
            this.f45007s.addListener(new org.telegram.ui.Components.su0(10, this, iArr));
            this.f45007s.setDuration((int) (f10 * 250.0f));
            this.f45007s.start();
        } else {
            if (iArr != null) {
                u11 u11Var = this.A;
                u11Var.f43100a.n(iArr[0], iArr[1], iArr[2], iArr[3]);
                u11Var.invalidate();
                System.arraycopy(iArr, 0, this.f45003e, 0, 4);
            }
            this.f45005n = null;
            this.f45008w.invalidate();
        }
        if (this.G) {
            A0 = org.telegram.ui.ActionBar.f6.J;
        } else {
            A0 = org.telegram.ui.ActionBar.f6.A0();
        }
        org.telegram.ui.ActionBar.a5 a5Var = new org.telegram.ui.ActionBar.a5(null, A0.U, this.G, !z10);
        a5Var.f22731f = false;
        a5Var.f22730e = true;
        a5Var.f22737m = this.f45000a;
        a5Var.f22736l = (int) (f10 * 250.0f);
        AndroidUtilities.runOnUIThread(new bg.d(this, z10, b4Var2, a5Var, 25));
    }

    @Override
    public final android.view.View createView(android.content.Context r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z11.createView(android.content.Context):android.view.View");
    }

    public final void d0(int i9, Bitmap bitmap, boolean z10) {
        if (bitmap != null) {
            this.h.t(bitmap, i9);
            ValueAnimator valueAnimator = this.v;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.v = ofFloat;
                ofFloat.addUpdateListener(new v01(this, 2));
                this.v.setDuration(250L);
                this.v.start();
                return;
            }
            this.h.s(1.0f);
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void f0() {
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
        this.f45009x.setVisibility(8);
        this.C.setVisibility(8);
        this.B.setVisibility(8);
        this.B.getAnimatedDrawable();
        u11 u11Var = this.A;
        if (u11Var != null) {
            u11Var.d(true);
        }
        this.fragmentView.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(max, 1073741824));
        this.fragmentView.layout(0, 0, min, max);
        this.fragmentView.draw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(this.B.getLeft(), this.B.getTop(), this.B.getRight(), this.B.getBottom());
        if (this.E != null) {
            canvas.drawBitmap(this.E, (Rect) null, rectF, new Paint(2));
        }
        canvas.setBitmap(null);
        this.f45009x.setVisibility(0);
        this.C.setVisibility(0);
        this.B.setVisibility(0);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView.getParent();
        this.fragmentView.layout(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
        u11 u11Var2 = this.A;
        if (u11Var2 != null) {
            u11Var2.d(false);
        }
        Uri bitmapShareUri = AndroidUtilities.getBitmapShareUri(createBitmap, "qr_tmp.jpg", Bitmap.CompressFormat.JPEG);
        if (bitmapShareUri != null) {
            try {
                getParentActivity().startActivityForResult(Intent.createChooser(new Intent("android.intent.action.SEND").setType("image/*").putExtra("android.intent.extra.STREAM", bitmapShareUri), LocaleController.getString(R.string.InviteByQRCode)), 500);
            } catch (ActivityNotFoundException e10) {
                e10.printStackTrace();
            }
        }
        AndroidUtilities.runOnUIThread(new m11(this, 0), 500L);
    }

    @Override
    public final org.telegram.ui.ActionBar.y3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.y3.f23979c;
    }

    @Override
    public final org.telegram.ui.ActionBar.b6 getResourceProvider() {
        return this.f45000a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.h6> themeDescriptions = super.getThemeDescriptions();
        y11 y11Var = this.f45004f;
        y11Var.getClass();
        x11 x11Var = new x11(y11Var);
        ArrayList arrayList = new ArrayList();
        Paint paint = y11Var.f44674a;
        int i9 = org.telegram.ui.ActionBar.f6.f23072h5;
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 1, null, paint, null, null, i9));
        int i10 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 32, null, null, new Drawable[]{y11Var.f44678f}, x11Var, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(y11Var.f44679n, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.f23108j5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(y11Var.f44684y, 16, new Class[]{org.telegram.ui.Components.a11.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23091i5));
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((org.telegram.ui.ActionBar.h6) obj).f23506o = y11Var.d.f45000a;
        }
        themeDescriptions.addAll(arrayList);
        sx0 sx0Var = new sx0(3, this);
        TextView textView = this.f45004f.f44681s;
        int i12 = org.telegram.ui.ActionBar.f6.Oh;
        themeDescriptions.add(new org.telegram.ui.ActionBar.h6(textView, 32, null, null, null, sx0Var, i12));
        themeDescriptions.add(new org.telegram.ui.ActionBar.h6(this.f45004f.f44681s, 65568, null, null, null, null, org.telegram.ui.ActionBar.f6.Qh));
        TextView textView2 = this.f45004f.f44682w;
        if (textView2 != null) {
            themeDescriptions.add(new org.telegram.ui.ActionBar.h6(textView2, 4, null, null, null, sx0Var, i12));
            themeDescriptions.add(new org.telegram.ui.ActionBar.h6(this.f45004f.f44683x, 8, null, null, null, sx0Var, i12));
        }
        int size2 = themeDescriptions.size();
        while (i10 < size2) {
            org.telegram.ui.ActionBar.h6 h6Var = themeDescriptions.get(i10);
            i10++;
            h6Var.f23506o = this.f45000a;
        }
        return themeDescriptions;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.H = this.arguments.getLong("user_id");
        this.I = this.arguments.getLong("chat_id");
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        a0.f fVar;
        y11 y11Var = this.f45004f;
        y11Var.getClass();
        NotificationCenter.getGlobalInstance().removeObserver(y11Var, NotificationCenter.emojiLoaded);
        this.f45004f = null;
        this.D.recycle();
        this.D = null;
        int i9 = 0;
        while (true) {
            fVar = this.d;
            if (i9 >= fVar.f28c) {
                break;
            }
            Bitmap bitmap = (Bitmap) fVar.h(i9);
            if (bitmap != null) {
                bitmap.recycle();
            }
            i9++;
        }
        fVar.clear();
        if (getParentActivity() != null) {
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.J);
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        if (getParentActivity() != null) {
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.J);
        }
        super.onPause();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i9, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i9 == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                e0(this);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f22702a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new l11(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.L5, false), null);
            alertDialog$Builder.o();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (getParentActivity() != null) {
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.J | 1028);
        }
    }
}
