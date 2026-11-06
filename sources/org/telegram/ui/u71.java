package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Scroller;
import android.widget.TextView;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
public class u71 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.x5, org.telegram.messenger.ls {
    public FrameLayout A0;
    public l71 A1;
    public org.telegram.ui.Components.y20 B0;
    public l71 B1;
    public AnimatorSet C0;
    public Object C1;
    public final int D;
    public t4 D0;
    public Bitmap D1;
    public final int E;
    public t61 E0;
    public boolean E1;
    public final int F;
    public t61 F0;
    public boolean F1;
    public final int G;
    public ImageView G0;
    public boolean G1;
    public final int H;
    public ImageView H0;
    public String H1;
    public final boolean I;
    public AnimatorSet I0;
    public int I1;
    public final long J;
    public AnimatorSet J0;
    public t71 J1;
    public final long K;
    public org.telegram.ui.Components.w61[] K0;
    public long K1;
    public final long L;
    public org.telegram.ui.Components.w61[] L0;
    public boolean L1;
    public final long M;
    public final FrameLayout[] M0;
    public boolean M1;
    public final float N;
    public final TextView[] N0;
    public boolean N1;
    public final String O;
    public final TextView[] O0;
    public org.telegram.ui.Components.zg0 O1;
    public final int P;
    public final FrameLayout[] P0;
    public org.telegram.ui.ActionBar.r0 P1;
    public long Q;
    public e61 Q0;
    public ValueAnimator Q1;
    public y70 R;
    public s71 R0;
    public bi.m5 R1;
    public final org.telegram.ui.ActionBar.q5 S;
    public v4.b0 S0;
    public s61 S1;
    public final org.telegram.ui.ActionBar.q5 T;
    public org.telegram.ui.Cells.n4 T0;
    public final org.telegram.ui.Components.z00 T1;
    public final org.telegram.ui.ActionBar.q5 U;
    public org.telegram.ui.Cells.h0 U0;
    public boolean U1;
    public final org.telegram.ui.ActionBar.q5 V;
    public ArrayList V0;
    public boolean V1;
    public org.telegram.ui.Components.vp W;
    public final HashMap W0;
    public TL_stories.TL_premium_boostsStatus W1;
    public int X;
    public TLRPC.TL_wallPaper X0;
    public float X1;
    public int Y;
    public TLRPC.TL_wallPaper Y0;
    public float Y1;
    public final Runnable Z;
    public TLRPC.TL_wallPaper Z0;
    public float Z1;
    public final v61 f50265a;
    public boolean f50266a0;
    public int f50267a1;
    public float f50268a2;
    public final int f50269b;
    public fi.p5 f50270b0;
    public int f50271b1;
    public boolean f50272b2;
    public Scroller f50273c;
    public FrameLayout f50274c0;
    public int f50275c1;
    public int f50276c2;
    public final boolean d;
    public TextView f50277d0;
    public int f50278d1;
    public ValueAnimator d2;
    public fi.w2 f50279e;
    public TextView f50280e0;
    public int f50281e1;
    public boolean f50282e2;
    public org.telegram.ui.ActionBar.r0 f50283f;
    public final org.telegram.ui.ActionBar.j6 f50284f0;
    public int f50285f1;
    public TextView f50286f2;
    public final boolean f50287g0;
    public int f50288g1;
    public WeakReference f50289g2;
    public TextView h;
    public final boolean f50290h0;
    public int f50291h1;
    public BitmapDrawable f50292h2;
    public final boolean f50293i0;
    public int f50294i1;
    public cc f50295i2;
    public ArrayList f50296j0;
    public int f50297j1;
    public float f50298j2;
    public c5.k f50299k0;
    public int f50300k1;
    public ValueAnimator f50301k2;
    public bi.x5 f50302l0;
    public int l1;
    public UndoView m0;
    public float f50303m1;
    public int f50304n;
    public FrameLayout f50305n0;
    public float n1;
    public org.telegram.ui.Components.pj0 f50306o0;
    public float f50307o1;
    public l4 f50308p0;
    public float f50309p1;
    public org.telegram.ui.Components.p00 f50310q0;
    public m71 f50311q1;
    public Drawable f50312r;
    public org.telegram.messenger.ij f50313r0;
    public org.telegram.ui.Components.wp f50314r1;
    public int f50315s;
    public boolean f50316s0;
    public AnimatorSet f50317s1;
    public org.telegram.ui.ActionBar.k f50318t0;
    public final PorterDuff.Mode f50319t1;
    public org.telegram.ui.ActionBar.l0 f50320u0;
    public int f50321u1;
    public q61 f50322v0;
    public org.telegram.ui.Components.f9 f50323v1;
    public final org.telegram.ui.ActionBar.h6 f50324w;
    public q71 f50325w0;
    public org.telegram.ui.Components.y61 f50326w1;
    public boolean f50327x;
    public final k71[] f50328x0;
    public Bitmap f50329x1;
    public final int f50330y;
    public k71 f50331y0;
    public Bitmap f50332y1;
    public FrameLayout f50333z0;
    public float f50334z1;

    public u71(Object obj, Bitmap bitmap, boolean z9) {
        super(null);
        this.f50265a = new v61(this);
        this.d = true;
        this.f50304n = 1;
        org.telegram.ui.ActionBar.q5 q5Var = new org.telegram.ui.ActionBar.q5(this, 0, false);
        this.S = q5Var;
        org.telegram.ui.ActionBar.q5 q5Var2 = new org.telegram.ui.ActionBar.q5(this, 0, true);
        this.T = q5Var2;
        org.telegram.ui.ActionBar.q5 q5Var3 = new org.telegram.ui.ActionBar.q5(this, 1, false);
        this.U = q5Var3;
        org.telegram.ui.ActionBar.q5 q5Var4 = new org.telegram.ui.ActionBar.q5(this, 1, true);
        this.V = q5Var4;
        this.Y = -1;
        this.Z = new i61(this, 0);
        this.f50328x0 = new k71[2];
        this.M0 = new FrameLayout[2];
        this.N0 = new TextView[2];
        this.O0 = new TextView[2];
        this.P0 = new FrameLayout[2];
        this.W0 = new HashMap();
        this.f50303m1 = 0.5f;
        this.f50307o1 = 0.0f;
        this.f50319t1 = PorterDuff.Mode.SRC_IN;
        this.f50334z1 = 1.0f;
        this.H1 = "640_360";
        this.I1 = 1920;
        this.L1 = true;
        this.T1 = new org.telegram.ui.Components.z00(getParentActivity(), new x61(this));
        this.U1 = false;
        this.V1 = false;
        this.f50269b = 2;
        this.C1 = obj;
        this.D1 = bitmap;
        this.E1 = z9;
        if (obj instanceof oc1) {
            oc1 oc1Var = (oc1) obj;
            this.F1 = oc1Var.f48378j;
            TLRPC.TL_wallPaper tL_wallPaper = oc1Var.f48376g;
            this.X0 = tL_wallPaper;
            if (tL_wallPaper != null) {
                float f10 = oc1Var.h;
                this.f50303m1 = f10;
                if (f10 < 0.0f && !org.telegram.ui.ActionBar.k6.I.q()) {
                    this.f50303m1 *= -1.0f;
                }
            }
        }
        q5Var.v = true;
        q5Var3.v = true;
        q5Var2.v = true;
        q5Var4.v = true;
    }

    public static void Z(u71 u71Var, org.telegram.messenger.e3 e3Var) {
        if (u71Var.getParentActivity() == null) {
            return;
        }
        ug.i0 i0Var = new ug.i0(23, u71Var.currentAccount, u71Var.getParentActivity(), u71Var, u71Var.f50265a);
        i0Var.A1(e3Var);
        i0Var.z1(u71Var.W1, true);
        i0Var.B1(u71Var.K1);
        if (!u71Var.Z0()) {
            i0Var.I2 = new i61(u71Var, 1);
        }
        u71Var.showDialog(i0Var);
    }

    public static void a0(u71 u71Var) {
        org.telegram.ui.ActionBar.h6 k10;
        org.telegram.ui.ActionBar.j6 j6Var = org.telegram.ui.ActionBar.k6.M;
        if (j6Var == null) {
            return;
        }
        int i7 = j6Var.Z;
        if (i7 >= 0) {
            k10 = (org.telegram.ui.ActionBar.h6) j6Var.f27627a0.get(i7);
        } else {
            k10 = j6Var.k(false);
        }
        if (u71Var.f50324w != null) {
            u71Var.b1();
            org.telegram.ui.ActionBar.k6.z1(u71Var.f50284f0, true, false, false, false, false);
            if (org.telegram.ui.ActionBar.k6.M != null) {
                org.telegram.ui.ActionBar.k6.O = false;
                org.telegram.ui.ActionBar.k6.P = false;
                org.telegram.ui.ActionBar.k6.M = null;
            }
            org.telegram.ui.ActionBar.k6.u(u71Var.f50284f0, true, u71Var.f50287g0);
            ((ActionBarLayout) u71Var.parentLayout).X(false, false);
        } else {
            ((ActionBarLayout) u71Var.parentLayout).X(false, false);
            File file = new File(u71Var.f50284f0.f27628b);
            org.telegram.ui.ActionBar.j6 j6Var2 = u71Var.f50284f0;
            org.telegram.ui.ActionBar.k6.v(file, j6Var2.f27626a, j6Var2.F, false);
            org.telegram.messenger.qp.s1(u71Var.f50284f0.E).x4(u71Var.f50284f0, null, false, false);
            SharedPreferences.Editor edit = org.telegram.messenger.t0.f25563b.getSharedPreferences("themeconfig", 0).edit();
            edit.putString("lastDayTheme", u71Var.f50284f0.m());
            edit.commit();
        }
        org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) u71Var.getParentLayout().getFragmentStack().get(Math.max(0, u71Var.getParentLayout().getFragmentStack().size() - 2));
        u71Var.finishFragment();
        if (u71Var.f50269b == 0) {
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25046p4, j6Var, k10, Boolean.valueOf(u71Var.f50293i0));
        }
        org.telegram.ui.ActionBar.k6.M1(f2Var);
    }

    public static void b0(u71 u71Var, TLObject tLObject) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        HashMap hashMap = u71Var.W0;
        org.telegram.ui.ActionBar.h6 h6Var = u71Var.f50324w;
        if (tLObject instanceof TL_account.TL_wallPapers) {
            TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
            u71Var.V0.clear();
            hashMap.clear();
            int size = tL_wallPapers.wallpapers.size();
            boolean z9 = false;
            for (int i7 = 0; i7 < size; i7++) {
                if (tL_wallPapers.wallpapers.get(i7) instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) tL_wallPapers.wallpapers.get(i7);
                    if (tL_wallPaper2.pattern) {
                        TLRPC.Document document = tL_wallPaper2.document;
                        if (document != null && !hashMap.containsKey(Long.valueOf(document.f26959id))) {
                            u71Var.V0.add(tL_wallPaper2);
                            hashMap.put(Long.valueOf(tL_wallPaper2.document.f26959id), tL_wallPaper2);
                        }
                        if (h6Var != null && (str = h6Var.f27528o) != null && str.equals(tL_wallPaper2.slug)) {
                            u71Var.X0 = tL_wallPaper2;
                            u71Var.g1(false);
                            u71Var.o1();
                        } else if (h6Var == null) {
                            TLRPC.TL_wallPaper tL_wallPaper3 = u71Var.X0;
                            if (tL_wallPaper3 != null) {
                                String str2 = tL_wallPaper3.slug;
                                if (str2 != null) {
                                    if (!str2.equals(tL_wallPaper2.slug)) {
                                    }
                                }
                            }
                        }
                        z9 = true;
                    }
                }
            }
            if (!z9 && (tL_wallPaper = u71Var.X0) != null) {
                u71Var.V0.add(0, tL_wallPaper);
            }
            s71 s71Var = u71Var.R0;
            if (s71Var != null) {
                s71Var.f();
            }
            org.telegram.messenger.yr.a0(u71Var.currentAccount).p1(1, tL_wallPapers.wallpapers);
        }
        if (u71Var.X0 == null && h6Var != null && !TextUtils.isEmpty(h6Var.f27528o)) {
            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
            tL_inputWallPaperSlug.slug = h6Var.f27528o;
            getwallpaper.wallpaper = tL_inputWallPaperSlug;
            ConnectionsManager.getInstance(u71Var.currentAccount).bindRequestToGuid(u71Var.getConnectionsManager().sendRequest(getwallpaper, new o61(u71Var, 0)), u71Var.classGuid);
        }
    }

    @Override
    public final void C(boolean z9) {
        o1();
    }

    @Override
    public final void M(String str) {
        o1();
    }

    public final void Q0() {
        AnimatorSet animatorSet = this.C0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.C0 = animatorSet2;
        if (this.F1) {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f50331y0, View.SCALE_X, this.f50334z1), ObjectAnimator.ofFloat(this.f50331y0, View.SCALE_Y, this.f50334z1));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f50331y0, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f50331y0, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.f50331y0, View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.f50331y0, View.TRANSLATION_Y, 0.0f));
        }
        this.C0.setInterpolator(org.telegram.ui.Components.xq.f40346g);
        this.C0.addListener(new z61(this, 1));
        this.C0.start();
    }

    public final void R0(boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u71.R0(boolean):void");
    }

    public final void S0(boolean z9) {
        int i7 = this.f50269b;
        if (i7 == 2) {
            if (!z9) {
                finishFragment();
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.k6.p();
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25113z4);
        org.telegram.ui.ActionBar.h6 h6Var = this.f50324w;
        if (i7 == 1) {
            if (this.f50290h0) {
                h6Var.f27518c = this.f50330y;
                h6Var.d = this.D;
                h6Var.f27519e = this.E;
                h6Var.f27520f = this.F;
                h6Var.f27521g = this.G;
                h6Var.h = this.H;
                h6Var.f27522i = this.I;
                h6Var.f27523j = this.J;
                h6Var.f27524k = this.K;
                h6Var.f27525l = this.L;
                h6Var.f27526m = this.M;
                h6Var.f27527n = this.P;
                h6Var.f27528o = this.O;
                h6Var.f27529p = this.N;
            }
            org.telegram.ui.ActionBar.k6.z1(this.f50284f0, false, true, false, false, false);
        } else {
            if (h6Var != null) {
                org.telegram.ui.ActionBar.k6.z1(this.f50284f0, false, this.f50293i0, false, false, false);
            }
            ((ActionBarLayout) this.parentLayout).X(false, false);
            if (this.f50293i0) {
                org.telegram.ui.ActionBar.j6 j6Var = this.f50284f0;
                if (j6Var.f27628b != null && org.telegram.ui.ActionBar.k6.H.get(j6Var.m()) == null) {
                    new File(j6Var.f27628b).delete();
                }
            }
        }
        if (!z9) {
            finishFragment();
        }
    }

    public final BitmapDrawable T0(Drawable drawable) {
        WeakReference weakReference = this.f50289g2;
        if (weakReference != null && weakReference.get() == drawable) {
            return this.f50292h2;
        }
        WeakReference weakReference2 = this.f50289g2;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.f50289g2 = null;
        if (drawable != null && drawable.getIntrinsicWidth() != 0 && drawable.getIntrinsicHeight() != 0) {
            this.f50289g2 = new WeakReference(drawable);
            int intrinsicWidth = (int) ((drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) * 24.0f);
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, 24, Bitmap.Config.ARGB_8888);
            drawable.setBounds(0, 0, intrinsicWidth, 24);
            ColorFilter colorFilter = drawable.getColorFilter();
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.3f);
            org.telegram.messenger.g0.n2(colorMatrix, 0.94f);
            drawable.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            drawable.draw(new Canvas(createBitmap));
            drawable.setColorFilter(colorFilter);
            Utilities.blurBitmap(createBitmap, 3);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(getParentActivity().getResources(), createBitmap);
            this.f50292h2 = bitmapDrawable;
            bitmapDrawable.setFilterBitmap(true);
            return this.f50292h2;
        }
        this.f50292h2 = null;
        return null;
    }

    public final boolean U0(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u71.U0(boolean):boolean");
    }

    public final void V0() {
        int themedColor;
        fi.w2 w2Var = this.f50279e;
        int i7 = 0;
        if (w2Var != null) {
            w2Var.H(getThemedColor(org.telegram.ui.ActionBar.k6.G8));
            this.f50279e.O(getThemedColor(org.telegram.ui.ActionBar.k6.E8), false);
        }
        if (this.f50312r != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f27849d6)) != this.f50315s) {
            this.f50315s = themedColor;
            this.f50312r.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        }
        t4 t4Var = this.D0;
        if (t4Var != null) {
            t4Var.invalidate();
        }
        if (this.f50311q1 != null) {
            org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
            if (q4Var != null && q4Var.getBottomSheet() != null) {
                this.parentLayout.getBottomSheet().O(getThemedColor(org.telegram.ui.ActionBar.k6.f27922h5));
                if (this.f50269b == 2 && this.K1 != 0) {
                    this.parentLayout.getBottomSheet().E0(-16777216);
                }
            } else {
                setNavigationBarColor(getThemedColor(org.telegram.ui.ActionBar.k6.f27922h5));
            }
        }
        if (this.K0 != null) {
            int i10 = 0;
            while (true) {
                org.telegram.ui.Components.w61[] w61VarArr = this.K0;
                if (i10 >= w61VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.w61 w61Var = w61VarArr[i10];
                if (w61Var != null) {
                    w61Var.invalidate();
                }
                i10++;
            }
        }
        if (this.L0 != null) {
            while (true) {
                org.telegram.ui.Components.w61[] w61VarArr2 = this.L0;
                if (i7 >= w61VarArr2.length) {
                    break;
                }
                org.telegram.ui.Components.w61 w61Var2 = w61VarArr2[i7];
                if (w61Var2 != null) {
                    w61Var2.invalidate();
                }
                i7++;
            }
        }
        TextView textView = this.f50286f2;
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, this.f50265a);
        }
        org.telegram.ui.Components.vp vpVar = this.W;
        if (vpVar != null) {
            vpVar.invalidate();
        }
        org.telegram.ui.Components.p00 p00Var = this.f50310q0;
        if (p00Var != null) {
            p00Var.updateColors();
        }
    }

    public final int W0() {
        if (org.telegram.messenger.t3.U(this.currentAccount, -this.K1)) {
            return getMessagesController().f24904u5;
        }
        return getMessagesController().f24952z5;
    }

    public final ArrayList X0() {
        f6 f6Var = new f6(23, this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f50299k0, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28129s8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f50318t0, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.k6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f50318t0, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.k6.E8));
        org.telegram.ui.Components.vp vpVar = this.W;
        if (vpVar != null) {
            org.telegram.ui.ActionBar.r0 r0Var = vpVar.I;
            EditTextBoldCursor[] editTextBoldCursorArr = vpVar.E;
            for (int i7 = 0; i7 < editTextBoldCursorArr.length; i7++) {
                arrayList.add(new org.telegram.ui.ActionBar.t6(editTextBoldCursorArr[i7], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(editTextBoldCursorArr[i7], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27978k6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(editTextBoldCursorArr[i7], 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27996l6));
            }
            arrayList.add(new org.telegram.ui.ActionBar.t6(vpVar.F, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.I5));
            if (r0Var != null) {
                org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(vpVar, 2);
                arrayList.add(new org.telegram.ui.ActionBar.t6(r0Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(r0Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.E8));
                arrayList.add(new org.telegram.ui.ActionBar.t6(r0Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.F8));
                arrayList.add(new org.telegram.ui.ActionBar.t6(r0Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.G8));
            }
        }
        FrameLayout[] frameLayoutArr = this.M0;
        if (frameLayoutArr != null) {
            for (int i10 = 0; i10 < frameLayoutArr.length; i10++) {
            }
            for (int i11 = 0; i11 < this.P0.length; i11++) {
            }
            for (int i12 = 0; i12 < this.O0.length; i12++) {
            }
            for (int i13 = 0; i13 < this.N0.length; i13++) {
            }
            org.telegram.ui.ActionBar.q5 q5Var = this.S;
            org.telegram.ui.ActionBar.q5 q5Var2 = this.U;
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.f50322v0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, new Drawable[]{q5Var, q5Var2}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28113rb));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.f50322v0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, new Drawable[]{q5Var, q5Var2}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28131sb));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.f50322v0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, new Drawable[]{q5Var, q5Var2}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28150tb));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.f50322v0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Kd));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.f50322v0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Qb));
        }
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            ((org.telegram.ui.ActionBar.t6) arrayList.get(i14)).f28543n = this.f50265a;
        }
        return arrayList;
    }

    public final boolean Y0(int i7) {
        int E0;
        long j3;
        if (this.f50290h0) {
            return false;
        }
        org.telegram.ui.ActionBar.h6 h6Var = this.f50324w;
        if (i7 == 1 || i7 == 2) {
            long j10 = this.J;
            if (j10 != 0) {
                if (j10 != h6Var.f27523j) {
                    return true;
                }
            } else {
                int E02 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.Be);
                int i10 = (int) h6Var.f27523j;
                if (i10 == 0) {
                    i10 = E02;
                }
                if (i10 != E02) {
                    return true;
                }
            }
            long j11 = this.K;
            int i11 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
            long j12 = this.M;
            long j13 = this.L;
            if (i11 == 0 && j13 == 0 && j12 == 0) {
                for (int i12 = 0; i12 < 3; i12++) {
                    if (i12 == 0) {
                        E0 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.Ce);
                        j3 = h6Var.f27524k;
                    } else if (i12 == 1) {
                        E0 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.De);
                        j3 = h6Var.f27525l;
                    } else {
                        E0 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.Ee);
                        j3 = h6Var.f27526m;
                    }
                    int i13 = (int) j3;
                    if (i13 == 0 && j3 != 0) {
                        i13 = 0;
                    } else if (i13 == 0) {
                        i13 = E0;
                    }
                    if (i13 != E0) {
                        return true;
                    }
                }
            } else if (j11 != h6Var.f27524k || j13 != h6Var.f27525l || j12 != h6Var.f27526m) {
                return true;
            }
            if (h6Var.f27527n != this.P) {
                return true;
            }
        }
        if (i7 == 1 || i7 == 3) {
            if (this.f50330y != h6Var.d) {
                return true;
            }
            int i14 = this.E;
            if (i14 != 0) {
                if (i14 != h6Var.f27519e) {
                    return true;
                }
            } else {
                int i15 = h6Var.f27519e;
                if (i15 != 0 && i15 != h6Var.f27518c) {
                    return true;
                }
            }
            int i16 = this.F;
            if (i16 != 0) {
                if (i16 != h6Var.f27520f) {
                    return true;
                }
            } else if (h6Var.f27520f != 0) {
                return true;
            }
            int i17 = this.G;
            if (i17 != 0) {
                if (i17 != h6Var.f27521g) {
                    return true;
                }
            } else if (h6Var.f27521g != 0) {
                return true;
            }
            int i18 = this.H;
            if (i18 != 0) {
                if (i18 != h6Var.h) {
                    return true;
                }
            } else if (h6Var.h != 0) {
                return true;
            }
            if (this.I != h6Var.f27522i) {
                return true;
            }
        }
        return false;
    }

    public boolean Z0() {
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && q4Var.getBottomSheet() != null) {
            return true;
        }
        return false;
    }

    public final void a1() {
        float f10;
        bi.m5 m5Var = this.R1;
        if (m5Var != null) {
            m5Var.invalidate();
        }
        FrameLayout frameLayout = this.f50333z0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                this.f50333z0.getChildAt(i7).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.A0;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i10 = 0; i10 < childCount2; i10++) {
                this.A0.getChildAt(i10).invalidate();
            }
        }
        if (this.K0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.w61[] w61VarArr = this.K0;
                if (i11 >= w61VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.w61 w61Var = w61VarArr[i11];
                if (w61Var != null) {
                    if (this.N1) {
                        f10 = this.f50307o1 * this.f50309p1;
                    } else {
                        f10 = 0.0f;
                    }
                    w61Var.setDimAmount(f10);
                    this.K0[i11].invalidate();
                }
                i11++;
            }
        }
        if (this.f50306o0 != null) {
            for (int i12 = 0; i12 < this.f50306o0.getChildCount(); i12++) {
                View childAt = this.f50306o0.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.t0) {
                    i1((org.telegram.ui.Cells.t0) childAt);
                    childAt.invalidate();
                }
            }
        }
        if (this.f50322v0 != null) {
            for (int i13 = 0; i13 < this.f50322v0.getChildCount(); i13++) {
                View childAt2 = this.f50322v0.getChildAt(i13);
                if (childAt2 instanceof org.telegram.ui.Cells.t0) {
                    i1((org.telegram.ui.Cells.t0) childAt2);
                    childAt2.invalidate();
                }
            }
        }
        l71 l71Var = this.A1;
        if (l71Var != null) {
            l71Var.invalidate();
        }
        l71 l71Var2 = this.B1;
        if (l71Var2 != null) {
            l71Var2.invalidate();
        }
        t4 t4Var = this.D0;
        if (t4Var != null) {
            t4Var.invalidate();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27940i5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27922h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27850d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27818bc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27839ce));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27910gc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27819be));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Od));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Md));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Id));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27911gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28263zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28245yb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28227xb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Tc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Sc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28094qb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28074pb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28054ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28149ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28112ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Jj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Hj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ge));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.He));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28129s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B8));
    }

    public final void b1() {
        org.telegram.ui.ActionBar.h6 h6Var = this.f50324w;
        if (h6Var != null && !TextUtils.isEmpty(h6Var.f27528o)) {
            try {
                File e10 = h6Var.e();
                Drawable background = this.f50331y0.getBackground();
                Bitmap n10 = this.f50331y0.getImageReceiver().n();
                if (background instanceof org.telegram.ui.Components.qa0) {
                    FileOutputStream fileOutputStream = new FileOutputStream(e10);
                    n10.compress(Bitmap.CompressFormat.PNG, 87, fileOutputStream);
                    fileOutputStream.close();
                    return;
                }
                Bitmap createBitmap = Bitmap.createBitmap(n10.getWidth(), n10.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                background.setBounds(0, 0, n10.getWidth(), n10.getHeight());
                background.draw(canvas);
                Paint paint = new Paint(2);
                paint.setColorFilter(new PorterDuffColorFilter(this.f50300k1, this.f50319t1));
                paint.setAlpha((int) (this.f50303m1 * 255.0f));
                canvas.drawBitmap(n10, 0.0f, 0.0f, paint);
                FileOutputStream fileOutputStream2 = new FileOutputStream(e10);
                createBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream2);
                fileOutputStream2.close();
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
    }

    public final void c1() {
        d1(2, true);
    }

    @Override
    public final android.view.View createView(android.content.Context r52) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u71.createView(android.content.Context):android.view.View");
    }

    public final void d1(int i7, boolean z9) {
        org.telegram.ui.ActionBar.h6 h6Var;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        if (getParentActivity() != null && this.f50304n != i7 && this.f50317s1 == null && (h6Var = this.f50324w) != null) {
            if (z9 && i7 == 2 && (org.telegram.ui.ActionBar.k6.c1() || h6Var.f27523j == 4294967296L)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = org.telegram.messenger.hd.M0(2131752550, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
                u1Var.R = M0;
                if (org.telegram.ui.ActionBar.k6.c1() && (!org.telegram.ui.ActionBar.k6.c1() || org.telegram.ui.ActionBar.k6.I.f27639i0.d == 0)) {
                    u1Var.T = org.telegram.messenger.hd.M0(2131752529, null);
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752552, null), new k61(this, 7));
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                } else {
                    u1Var.T = org.telegram.messenger.hd.M0(2131752549, null);
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746119, null), new k61(this, 5));
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751771, null), new k61(this, 6));
                }
                showDialog(u1Var);
                return;
            }
            int i17 = this.f50304n;
            this.f50304n = i7;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 == 3) {
                        this.h.setText(org.telegram.messenger.hd.M0(2131752014, null));
                        if (h6Var.f27520f != 0) {
                            if (h6Var.h != 0) {
                                i16 = 4;
                            } else if (h6Var.f27521g != 0) {
                                i16 = 3;
                            } else {
                                i16 = 2;
                            }
                        } else {
                            i16 = 1;
                        }
                        org.telegram.ui.Components.vp vpVar = this.W;
                        Y0(3);
                        vpVar.f(2, 4, i16, true);
                        this.W.e(h6Var.h, 3);
                        this.W.e(h6Var.f27521g, 2);
                        this.W.e(h6Var.f27520f, 1);
                        org.telegram.ui.Components.vp vpVar2 = this.W;
                        int i18 = h6Var.f27519e;
                        if (i18 == 0) {
                            i18 = h6Var.f27518c;
                        }
                        vpVar2.e(i18, 0);
                        this.L0[1].b(0, h6Var.f27519e);
                        this.L0[1].b(1, h6Var.f27520f);
                        this.L0[1].b(2, h6Var.f27521g);
                        this.L0[1].b(3, h6Var.h);
                        if (h6Var.f27521g != 0) {
                            if (i17 == 1) {
                                this.f50325w0.i(0);
                            } else {
                                this.f50325w0.g(0);
                            }
                        } else if (i17 == 2) {
                            this.f50325w0.s(0);
                        }
                        this.f50322v0.w0(0, org.telegram.messenger.g0.L(60.0f), null);
                        j1();
                    }
                    i10 = i17;
                } else {
                    this.h.setText(org.telegram.messenger.hd.M0(2131752016, null));
                    int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.Be);
                    int i19 = org.telegram.ui.ActionBar.k6.Ce;
                    if (org.telegram.ui.ActionBar.k6.f1(i19)) {
                        i12 = getThemedColor(i19);
                    } else {
                        i12 = 0;
                    }
                    int i20 = org.telegram.ui.ActionBar.k6.De;
                    if (org.telegram.ui.ActionBar.k6.f1(i20)) {
                        i13 = getThemedColor(i20);
                    } else {
                        i13 = 0;
                    }
                    int i21 = org.telegram.ui.ActionBar.k6.Ee;
                    if (org.telegram.ui.ActionBar.k6.f1(i21)) {
                        i14 = getThemedColor(i21);
                    } else {
                        i14 = 0;
                    }
                    long j3 = h6Var.f27524k;
                    int i22 = (int) j3;
                    if (i22 == 0 && j3 != 0) {
                        i12 = 0;
                    }
                    long j10 = h6Var.f27525l;
                    int i23 = (int) j10;
                    if (i23 == 0 && j10 != 0) {
                        i13 = 0;
                    }
                    long j11 = h6Var.f27526m;
                    int i24 = (int) j11;
                    if (i24 == 0 && j11 != 0) {
                        i14 = 0;
                    }
                    int i25 = (int) h6Var.f27523j;
                    if (i22 == 0 && i12 == 0) {
                        i15 = 1;
                    } else if (i24 == 0 && i14 == 0) {
                        if (i23 == 0 && i13 == 0) {
                            i15 = 2;
                        } else {
                            i15 = 3;
                        }
                    } else {
                        i15 = 4;
                    }
                    org.telegram.ui.Components.vp vpVar3 = this.W;
                    Y0(2);
                    vpVar3.f(2, 4, i15, false);
                    org.telegram.ui.Components.vp vpVar4 = this.W;
                    if (i24 == 0) {
                        i24 = i14;
                    }
                    vpVar4.e(i24, 3);
                    org.telegram.ui.Components.vp vpVar5 = this.W;
                    if (i23 == 0) {
                        i23 = i13;
                    }
                    vpVar5.e(i23, 2);
                    org.telegram.ui.Components.vp vpVar6 = this.W;
                    if (i22 == 0) {
                        i22 = i12;
                    }
                    vpVar6.e(i22, 1);
                    org.telegram.ui.Components.vp vpVar7 = this.W;
                    if (i25 != 0) {
                        themedColor = i25;
                    }
                    vpVar7.e(themedColor, 0);
                    i10 = i17;
                    if (i10 != 1 && h6Var.f27521g != 0) {
                        this.f50325w0.g(0);
                    } else {
                        this.f50325w0.i(0);
                    }
                    this.f50322v0.w0(0, org.telegram.messenger.g0.L(60.0f), null);
                }
            } else {
                i10 = i17;
                this.h.setText(org.telegram.messenger.hd.M0(2131752015, null));
                if (h6Var.d != 0) {
                    i11 = 2;
                } else {
                    i11 = 1;
                }
                org.telegram.ui.Components.vp vpVar8 = this.W;
                Y0(1);
                vpVar8.f(1, 2, i11, false);
                this.W.e(h6Var.f27518c, 0);
                int i26 = h6Var.d;
                if (i26 != 0) {
                    this.W.e(i26, 1);
                }
                if (i10 == 2 || (i10 == 3 && h6Var.f27521g != 0)) {
                    this.f50325w0.s(0);
                }
            }
            if (i7 != 1 && i7 != 3) {
                this.W.setMinBrightness(0.0f);
                this.W.setMaxBrightness(1.0f);
                return;
            }
            if (i10 == 2 && this.M0[1].getVisibility() == 0) {
                k1(0, true, true);
            }
            if (i7 == 1) {
                if (this.f50284f0.q()) {
                    this.W.setMinBrightness(0.2f);
                    return;
                }
                this.W.setMinBrightness(0.05f);
                this.W.setMaxBrightness(0.8f);
                return;
            }
            this.W.setMinBrightness(0.0f);
            this.W.setMaxBrightness(1.0f);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        if (i7 == org.telegram.messenger.qs.f25045p3) {
            if (this.K1 == ((Long) objArr[2]).longValue()) {
                this.W1 = (TL_stories.TL_premium_boostsStatus) objArr[0];
                m1(true);
            }
        } else if (i7 == org.telegram.messenger.qs.f25009i4) {
            org.telegram.ui.Components.pj0 pj0Var = this.f50306o0;
            if (pj0Var != null) {
                int childCount = pj0Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = this.f50306o0.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.t2) {
                        ((org.telegram.ui.Cells.t2) childAt).j0(0, true);
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.qs.f25014j4) {
            q61 q61Var = this.f50322v0;
            if (q61Var != null) {
                q61Var.g1();
            }
        } else if (i7 == org.telegram.messenger.qs.f25113z4) {
            if (this.f50320u0 != null) {
                g1(true);
            }
        } else if (i7 == org.telegram.messenger.qs.f24991f4) {
            Object obj = this.C1;
            if (obj instanceof pc1) {
                pc1 pc1Var = (pc1) obj;
                if (pc1Var.f48797a == null) {
                    pc1Var.f48797a = (String) objArr[0];
                }
            }
        } else {
            long j3 = 0;
            if (i7 == org.telegram.messenger.qs.f24985e4) {
                ArrayList arrayList = (ArrayList) objArr[0];
                this.V0.clear();
                HashMap hashMap = this.W0;
                hashMap.clear();
                int size = arrayList.size();
                boolean z9 = false;
                for (int i12 = 0; i12 < size; i12++) {
                    TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) arrayList.get(i12);
                    if ((wallPaper instanceof TLRPC.TL_wallPaper) && wallPaper.pattern) {
                        TLRPC.Document document = wallPaper.document;
                        if (document != null && !hashMap.containsKey(Long.valueOf(document.f26959id))) {
                            this.V0.add(wallPaper);
                            hashMap.put(Long.valueOf(wallPaper.document.f26959id), wallPaper);
                        }
                        org.telegram.ui.ActionBar.h6 h6Var = this.f50324w;
                        if (h6Var != null && (str = h6Var.f27528o) != null && str.equals(wallPaper.slug)) {
                            this.X0 = (TLRPC.TL_wallPaper) wallPaper;
                            g1(false);
                            o1();
                        } else if (h6Var == null) {
                            TLRPC.TL_wallPaper tL_wallPaper2 = this.X0;
                            if (tL_wallPaper2 != null) {
                                String str2 = tL_wallPaper2.slug;
                                if (str2 != null) {
                                    if (!str2.equals(wallPaper.slug)) {
                                    }
                                }
                            }
                        }
                        z9 = true;
                    }
                }
                if (!z9 && (tL_wallPaper = this.X0) != null) {
                    this.V0.add(0, tL_wallPaper);
                }
                s71 s71Var = this.R0;
                if (s71Var != null) {
                    s71Var.f();
                }
                int size2 = arrayList.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) arrayList.get(i13);
                    if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                        j3 = org.telegram.messenger.ui.p(j3, wallPaper2.f27107id);
                    }
                }
                TL_account.getWallPapers getwallpapers = new TL_account.getWallPapers();
                getwallpapers.hash = j3;
                ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new o61(this, 1)), this.classGuid);
            } else if (i7 == org.telegram.messenger.qs.f25080u5 && this.K1 != 0) {
                finishFragment();
            }
        }
    }

    public final void e1(int i7) {
        TLRPC.TL_wallPaper tL_wallPaper;
        if (i7 >= 0 && i7 < this.V0.size()) {
            tL_wallPaper = (TLRPC.TL_wallPaper) this.V0.get(i7);
        } else {
            tL_wallPaper = this.Z0;
        }
        TLRPC.TL_wallPaper tL_wallPaper2 = tL_wallPaper;
        if (tL_wallPaper2 == null) {
            return;
        }
        ValueAnimator valueAnimator = this.d2;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.d2.cancel();
        }
        k71[] k71VarArr = this.f50328x0;
        k71 k71Var = k71VarArr[0];
        k71 k71Var2 = k71VarArr[1];
        k71VarArr[0] = k71Var2;
        k71VarArr[1] = k71Var;
        this.f50320u0.removeView(k71Var2);
        this.f50320u0.addView(k71VarArr[0], this.f50320u0.indexOfChild(k71VarArr[1]) + 1);
        k71 k71Var3 = k71VarArr[0];
        this.f50331y0 = k71Var3;
        k71Var3.setBackground(k71VarArr[1].getBackground());
        p1();
        k71VarArr[1].setVisibility(0);
        k71VarArr[1].setAlpha(1.0f);
        this.f50331y0.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d2 = ofFloat;
        ofFloat.addUpdateListener(new ii(2, this));
        this.d2.addListener(new z61(this, 0));
        this.d2.setInterpolator(org.telegram.ui.Components.xq.f40345f);
        this.d2.setDuration(300L);
        this.d2.start();
        this.f50331y0.getImageReceiver().f21216s1 = 300;
        this.f50331y0.getImageReceiver().r0(org.telegram.messenger.hc.b(tL_wallPaper2.document), this.H1, null, null, null, tL_wallPaper2.document.size, "jpg", tL_wallPaper2, 1);
        this.f50331y0.d();
        this.X0 = tL_wallPaper2;
        this.F1 = this.K0[2].f39881s;
        o1();
    }

    public final void f1(int i7, int i10, boolean z9) {
        org.telegram.ui.Components.qa0 qa0Var;
        if (i10 == 0) {
            this.f50267a1 = i7;
        } else if (i10 == 1) {
            this.f50275c1 = i7;
        } else if (i10 == 2) {
            this.f50278d1 = i7;
        } else if (i10 == 3) {
            this.f50281e1 = i7;
        }
        r1(z9);
        if (this.K0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.w61[] w61VarArr = this.K0;
                if (i11 >= w61VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.w61 w61Var = w61VarArr[i11];
                if (w61Var != null) {
                    w61Var.b(i10, i7);
                }
                i11++;
            }
        }
        if (this.f50278d1 != 0) {
            if (this.U0 != null && org.telegram.ui.ActionBar.k6.I.q()) {
                this.U0.setTwoSided(true);
            }
            Drawable background = this.f50331y0.getBackground();
            if (background instanceof org.telegram.ui.Components.qa0) {
                qa0Var = (org.telegram.ui.Components.qa0) background;
            } else {
                qa0Var = new org.telegram.ui.Components.qa0();
                qa0Var.q(this.f50331y0);
                if (this.E1) {
                    qa0Var.m(false);
                }
            }
            qa0Var.n(this.f50267a1, this.f50275c1, this.f50278d1, this.f50281e1);
            this.f50331y0.setBackground(qa0Var);
            this.f50300k1 = qa0Var.f();
            this.l1 = 754974720;
        } else if (this.f50275c1 != 0) {
            this.f50331y0.setBackground(new GradientDrawable(org.telegram.ui.Components.k9.d(this.f50294i1), new int[]{this.f50267a1, this.f50275c1}));
            int V0 = org.telegram.messenger.g0.V0(org.telegram.messenger.g0.w0(this.f50267a1, this.f50275c1), false);
            this.l1 = V0;
            this.f50300k1 = V0;
        } else {
            this.f50331y0.setBackgroundColor(this.f50267a1);
            int V02 = org.telegram.messenger.g0.V0(this.f50267a1, false);
            this.l1 = V02;
            this.f50300k1 = V02;
        }
        int i12 = org.telegram.ui.ActionBar.k6.Zc;
        boolean f12 = org.telegram.ui.ActionBar.k6.f1(i12);
        v61 v61Var = this.f50265a;
        if (f12 && !(this.f50331y0.getBackground() instanceof org.telegram.ui.Components.qa0)) {
            if (org.telegram.ui.ActionBar.k6.t0() instanceof org.telegram.ui.Components.qa0) {
                getThemedColor(i12);
                v61Var.k(this.f50331y0.getBackground(), this.f50331y0.getBackground(), Float.valueOf(this.f50303m1));
            }
        } else {
            v61Var.k(this.f50331y0.getBackground(), this.f50331y0.getBackground(), Float.valueOf(this.f50303m1));
        }
        ImageView imageView = this.G0;
        if (imageView != null) {
            org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.Wc, v61Var, PorterDuff.Mode.MULTIPLY);
        }
        ImageView imageView2 = this.H0;
        if (imageView2 != null) {
            org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.Wc, v61Var, PorterDuff.Mode.MULTIPLY);
        }
        k71 k71Var = this.f50331y0;
        if (k71Var != null) {
            k71Var.getImageReceiver().f21206o1 = new PorterDuffColorFilter(this.f50300k1, this.f50319t1);
            this.f50331y0.getImageReceiver().setAlpha(Math.abs(this.f50303m1));
            this.f50331y0.invalidate();
            if (org.telegram.ui.ActionBar.k6.I.q() && (this.f50331y0.getBackground() instanceof org.telegram.ui.Components.qa0)) {
                org.telegram.ui.Cells.h0 h0Var = this.U0;
                if (h0Var != null) {
                    h0Var.setTwoSided(true);
                }
                if (this.f50303m1 < 0.0f) {
                    this.f50331y0.getImageReceiver().m0(((org.telegram.ui.Components.qa0) this.f50331y0.getBackground()).f37230k);
                }
            } else {
                this.f50331y0.getImageReceiver().m0(null);
                org.telegram.ui.Cells.h0 h0Var2 = this.U0;
                if (h0Var2 != null) {
                    h0Var2.setTwoSided(false);
                }
            }
            org.telegram.ui.Cells.h0 h0Var3 = this.U0;
            if (h0Var3 != null) {
                h0Var3.setProgress(this.f50303m1);
            }
        }
        q61 q61Var = this.f50322v0;
        if (q61Var != null) {
            q61Var.g1();
        }
        FrameLayout frameLayout = this.f50333z0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                this.f50333z0.getChildAt(i13).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.A0;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                this.A0.getChildAt(i14).invalidate();
            }
        }
    }

    public final void g1(boolean z9) {
        org.telegram.ui.Components.qa0 qa0Var;
        org.telegram.ui.Components.qa0 qa0Var2;
        int i7;
        int g10;
        TLRPC.PhotoSize photoSize;
        org.telegram.ui.ActionBar.h6 h6Var = this.f50324w;
        int i10 = this.f50269b;
        if (i10 == 0 && h6Var == null) {
            this.f50331y0.setBackground(org.telegram.ui.ActionBar.k6.s0());
        } else {
            TLRPC.PhotoSize photoSize2 = null;
            BitmapDrawable bitmapDrawable = null;
            if (i10 == 2) {
                Object obj = this.C1;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
                    if (z9) {
                        photoSize = org.telegram.messenger.w7.w(tL_wallPaper.document.thumbs, 100, false, null, false);
                    } else {
                        photoSize = null;
                    }
                    if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                        bitmapDrawable = new BitmapDrawable(org.telegram.messenger.gc.F("b", photoSize.bytes));
                    }
                    k71 k71Var = this.f50331y0;
                    k71Var.f35582a.r0(org.telegram.messenger.hc.b(tL_wallPaper.document), this.H1, org.telegram.messenger.hc.c(photoSize, tL_wallPaper.document), "100_100_b", bitmapDrawable, tL_wallPaper.document.size, "jpg", tL_wallPaper, 1);
                    k71Var.d();
                } else if (obj instanceof oc1) {
                    oc1 oc1Var = (oc1) obj;
                    int i11 = oc1Var.f48375f;
                    int i12 = oc1Var.f48374e;
                    int i13 = oc1Var.d;
                    int i14 = oc1Var.f48373c;
                    int i15 = oc1Var.f48372b;
                    this.f50294i1 = i11;
                    f1(i15, 0, false);
                    if (i14 != 0) {
                        f1(i14, 1, false);
                    }
                    f1(i13, 2, false);
                    f1(i12, 3, false);
                    TLRPC.TL_wallPaper tL_wallPaper2 = this.X0;
                    if (tL_wallPaper2 != null) {
                        k71 k71Var2 = this.f50331y0;
                        org.telegram.messenger.hc b10 = org.telegram.messenger.hc.b(tL_wallPaper2.document);
                        String str = this.H1;
                        TLRPC.TL_wallPaper tL_wallPaper3 = this.X0;
                        k71Var2.g(1, tL_wallPaper3.document.size, tL_wallPaper3, str, null, "jpg", b10, null);
                    } else if ("d".equals(oc1Var.f48371a)) {
                        Point point = org.telegram.messenger.g0.f22544q;
                        int min = Math.min(point.x, point.y);
                        int max = Math.max(point.x, point.y);
                        if (Build.VERSION.SDK_INT >= 29) {
                            g10 = 1459617792;
                        } else {
                            g10 = org.telegram.ui.Components.qa0.g(i15, i14, i13, i12);
                        }
                        this.f50331y0.setImageBitmap(org.telegram.messenger.sz.d(2131623997, min, max, g10));
                    }
                } else if (obj instanceof pc1) {
                    Bitmap bitmap = this.D1;
                    if (bitmap != null) {
                        this.f50331y0.setImageBitmap(bitmap);
                    } else {
                        pc1 pc1Var = (pc1) obj;
                        File file = pc1Var.f48800e;
                        if (file != null) {
                            this.f50331y0.h(file.getAbsolutePath(), this.H1, null);
                        } else {
                            File file2 = pc1Var.d;
                            if (file2 != null) {
                                this.f50331y0.h(file2.getAbsolutePath(), this.H1, null);
                            } else if ("t".equals(pc1Var.f48797a)) {
                                k71 k71Var3 = this.f50331y0;
                                k71Var3.setImageDrawable(org.telegram.ui.ActionBar.k6.Z0(k71Var3, false));
                            } else {
                                int i16 = pc1Var.f48798b;
                                if (i16 != 0) {
                                    this.f50331y0.setImageResource(i16);
                                }
                            }
                        }
                    }
                } else if (obj instanceof org.telegram.messenger.kf) {
                    org.telegram.messenger.kf kfVar = (org.telegram.messenger.kf) obj;
                    TLRPC.Photo photo = kfVar.K;
                    if (photo != null) {
                        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, 100, false, null, false);
                        TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(kfVar.K.sizes, this.I1, true, null, false);
                        if (w11 != w10) {
                            photoSize2 = w11;
                        }
                        if (photoSize2 != null) {
                            i7 = photoSize2.size;
                        } else {
                            i7 = 0;
                        }
                        this.f50331y0.g(1, i7, kfVar, this.H1, "100_100_b", "jpg", org.telegram.messenger.hc.i(photoSize2, kfVar.K), org.telegram.messenger.hc.i(w10, kfVar.K));
                    } else {
                        k71 k71Var4 = this.f50331y0;
                        String str2 = kfVar.C;
                        String str3 = this.H1;
                        String str4 = kfVar.D;
                        k71Var4.getClass();
                        k71Var4.n(org.telegram.messenger.hc.g(str2), str3, org.telegram.messenger.hc.g(str4), "100_100_b", null, null, 0, null);
                    }
                }
            } else if (h6Var == null) {
                this.f50331y0.setBackground(org.telegram.ui.ActionBar.k6.s0());
            } else {
                org.telegram.ui.Components.f9 f9Var = this.f50323v1;
                if (f9Var != null) {
                    f9Var.dispose();
                    this.f50323v1 = null;
                }
                int E0 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.Be);
                int i17 = (int) h6Var.f27523j;
                if (i17 != 0) {
                    E0 = i17;
                }
                int E02 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.Ce);
                long j3 = h6Var.f27524k;
                int i18 = (int) j3;
                if (i18 == 0 && j3 != 0) {
                    E02 = 0;
                } else if (i18 != 0) {
                    E02 = i18;
                }
                int E03 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.De);
                long j10 = h6Var.f27525l;
                int i19 = (int) j10;
                if (i19 == 0 && j10 != 0) {
                    E03 = 0;
                } else if (i19 != 0) {
                    E03 = i19;
                }
                int E04 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.Ee);
                long j11 = h6Var.f27526m;
                int i20 = (int) j11;
                if (i20 == 0 && j11 != 0) {
                    E04 = 0;
                } else if (i20 != 0) {
                    E04 = i20;
                }
                if (!TextUtils.isEmpty(h6Var.f27528o) && !org.telegram.ui.ActionBar.k6.c1()) {
                    if (E03 != 0) {
                        Drawable background = this.f50331y0.getBackground();
                        if (background instanceof org.telegram.ui.Components.qa0) {
                            qa0Var2 = (org.telegram.ui.Components.qa0) background;
                        } else {
                            org.telegram.ui.Components.qa0 qa0Var3 = new org.telegram.ui.Components.qa0();
                            qa0Var3.q(this.f50331y0);
                            qa0Var2 = qa0Var3;
                            if (this.E1) {
                                qa0Var3.m(false);
                                qa0Var2 = qa0Var3;
                            }
                        }
                        qa0Var2.n(E0, E02, E03, E04);
                        qa0Var = qa0Var2;
                    } else if (E02 != 0) {
                        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(org.telegram.ui.Components.k9.d(h6Var.f27527n), new int[]{E0, E02});
                        this.f50323v1 = k9Var.f(org.telegram.ui.Components.n.x(0.5f, 3), new d71(this, 0), 100L);
                        qa0Var = k9Var;
                    } else {
                        qa0Var = new ColorDrawable(E0);
                    }
                    this.f50331y0.setBackground(qa0Var);
                    TLRPC.TL_wallPaper tL_wallPaper4 = this.X0;
                    if (tL_wallPaper4 != null) {
                        k71 k71Var5 = this.f50331y0;
                        org.telegram.messenger.hc b11 = org.telegram.messenger.hc.b(tL_wallPaper4.document);
                        String str5 = this.H1;
                        TLRPC.TL_wallPaper tL_wallPaper5 = this.X0;
                        k71Var5.g(1, tL_wallPaper5.document.size, tL_wallPaper5, str5, null, "jpg", b11, null);
                    }
                } else {
                    Drawable t02 = org.telegram.ui.ActionBar.k6.t0();
                    if (t02 != null) {
                        if (t02 instanceof org.telegram.ui.Components.qa0) {
                            ((org.telegram.ui.Components.qa0) t02).q(this.f50331y0);
                        }
                        this.f50331y0.setBackground(t02);
                    }
                }
                if (E02 == 0) {
                    int V0 = org.telegram.messenger.g0.V0(E0, false);
                    this.l1 = V0;
                    this.f50300k1 = V0;
                } else if (E03 != 0) {
                    this.f50300k1 = org.telegram.ui.Components.qa0.g(E0, E02, E03, E04);
                    this.l1 = 754974720;
                } else {
                    int V02 = org.telegram.messenger.g0.V0(org.telegram.messenger.g0.w0(E0, E02), false);
                    this.l1 = V02;
                    this.f50300k1 = V02;
                }
                k71 k71Var6 = this.f50331y0;
                if (k71Var6 != null) {
                    k71Var6.getImageReceiver().f21206o1 = new PorterDuffColorFilter(this.f50300k1, this.f50319t1);
                    this.f50331y0.getImageReceiver().setAlpha(Math.abs(this.f50303m1));
                    this.f50331y0.invalidate();
                    if (org.telegram.ui.ActionBar.k6.I.q() && (this.f50331y0.getBackground() instanceof org.telegram.ui.Components.qa0)) {
                        org.telegram.ui.Cells.h0 h0Var = this.U0;
                        if (h0Var != null) {
                            h0Var.setTwoSided(true);
                        }
                        if (this.f50303m1 < 0.0f) {
                            this.f50331y0.getImageReceiver().m0(((org.telegram.ui.Components.qa0) this.f50331y0.getBackground()).f37230k);
                        }
                    } else {
                        this.f50331y0.getImageReceiver().m0(null);
                        org.telegram.ui.Cells.h0 h0Var2 = this.U0;
                        if (h0Var2 != null) {
                            h0Var2.setTwoSided(false);
                        }
                    }
                    org.telegram.ui.Cells.h0 h0Var3 = this.U0;
                    if (h0Var3 != null) {
                        h0Var3.setProgress(this.f50303m1);
                    }
                }
                if (this.K0 != null) {
                    int i21 = 0;
                    while (true) {
                        org.telegram.ui.Components.w61[] w61VarArr = this.K0;
                        if (i21 >= w61VarArr.length) {
                            break;
                        }
                        w61VarArr[i21].b(0, E0);
                        this.K0[i21].b(1, E02);
                        this.K0[i21].b(2, E03);
                        this.K0[i21].b(3, E04);
                        i21++;
                    }
                }
                ImageView imageView = this.G0;
                v61 v61Var = this.f50265a;
                if (imageView != null) {
                    org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.Wc, v61Var, PorterDuff.Mode.MULTIPLY);
                }
                ImageView imageView2 = this.H0;
                if (imageView2 != null) {
                    org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.Wc, v61Var, PorterDuff.Mode.MULTIPLY);
                }
                a1();
            }
        }
        this.E1 = false;
    }

    @Override
    public final int getObserverTag() {
        return this.f50321u1;
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return this.f50265a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        if (this.M1) {
            return X0();
        }
        return super.getThemeDescriptions();
    }

    public final void h1(long j3) {
        boolean z9;
        this.K1 = j3;
        if (j3 != 0 && j3 != getUserConfig().e()) {
            z9 = false;
        } else {
            z9 = true;
        }
        this.L1 = z9;
    }

    public final void i1(org.telegram.ui.Cells.t0 t0Var) {
        v61 v61Var;
        float f10;
        if (this.f50331y0 == null) {
            return;
        }
        Bitmap bitmap = this.f50265a.f50589i;
        float f11 = 0.0f;
        if (bitmap != null) {
            float width = bitmap.getWidth();
            f10 = ((this.f50331y0.getMeasuredWidth() - (Math.max(this.f50331y0.getMeasuredWidth() / width, this.f50331y0.getMeasuredHeight() / v61Var.f50589i.getHeight()) * width)) / 2.0f) + this.Y1 + 0.0f;
        } else {
            f10 = this.Y1 + 0.0f;
        }
        float y10 = t0Var.getY() - ((-this.f50331y0.J) + 0.0f);
        int measuredHeight = this.f50331y0.getMeasuredHeight();
        if (this.N1) {
            f11 = this.f50307o1 * this.f50309p1;
        }
        t0Var.f30355w0 = true;
        t0Var.f30352v0 = measuredHeight;
        t0Var.f30348t0 = y10;
        t0Var.f30350u0 = f10;
        t0Var.f30297b2 = f11;
        t0Var.f30300c2.setColor(i0.a.o(-16777216, (int) (f11 * 255.0f)));
        t0Var.invalidate();
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.f50269b == 2) {
            if (this.f50272b2 && motionEvent != null) {
                if (motionEvent.getY() > org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22538m) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public final void j1() {
        if (this.f50320u0 != null && this.L0 != null && this.f50324w.f27521g != 0) {
            SharedPreferences e12 = org.telegram.messenger.qp.e1();
            if (!e12.getBoolean("bganimationhint", false)) {
                if (this.B0 == null) {
                    org.telegram.ui.Components.y20 y20Var = new org.telegram.ui.Components.y20(getParentActivity(), 8);
                    this.B0 = y20Var;
                    y20Var.setShowingDuration(5000L);
                    this.B0.setAlpha(0.0f);
                    this.B0.setVisibility(4);
                    this.B0.setText(org.telegram.messenger.hd.M0(2131753751, null));
                    this.B0.setExtraTranslationY(org.telegram.messenger.g0.L(6.0f));
                    this.f50302l0.addView(this.B0, c8.ha.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                }
                org.telegram.messenger.g0.i3(new by0(14, this, e12), 500L);
            }
        }
    }

    public final void k1(int i7, boolean z9, boolean z10) {
        boolean z11;
        char c10;
        char c11;
        FrameLayout frameLayout;
        float f10;
        int i10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        int i11;
        FrameLayout frameLayout2;
        int i12;
        float f16;
        FrameLayout frameLayout3;
        float f17;
        float f18;
        float f19;
        int i13;
        int i14;
        int i15;
        char c12 = 0;
        if (z9 && i7 == 1 && this.X0 != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i16 = this.f50269b;
        if (z9) {
            if (i7 == 0) {
                if (i16 == 2) {
                    this.f50271b1 = this.f50267a1;
                    int i17 = this.f50275c1;
                    this.f50285f1 = i17;
                    int i18 = this.f50278d1;
                    this.f50288g1 = i18;
                    int i19 = this.f50281e1;
                    this.f50291h1 = i19;
                    this.f50297j1 = this.P;
                    if (i19 != 0) {
                        i15 = 4;
                    } else if (i18 != 0) {
                        i15 = 3;
                    } else if (i17 != 0) {
                        i15 = 2;
                    } else {
                        i15 = 1;
                    }
                    this.W.f(0, 4, i15, false);
                    this.W.e(this.f50281e1, 3);
                    this.W.e(this.f50278d1, 2);
                    this.W.e(this.f50275c1, 1);
                    this.W.e(this.f50267a1, 0);
                }
            } else {
                this.Y0 = this.X0;
                this.n1 = this.f50303m1;
                this.R0.f();
                ArrayList arrayList = this.V0;
                if (arrayList != null) {
                    TLRPC.TL_wallPaper tL_wallPaper = this.X0;
                    if (tL_wallPaper == null) {
                        i14 = 0;
                    } else {
                        int indexOf = arrayList.indexOf(tL_wallPaper);
                        if (i16 == 2) {
                            i13 = 1;
                        } else {
                            i13 = 0;
                        }
                        i14 = indexOf + i13;
                    }
                    this.S0.h1(i14, (this.Q0.getMeasuredWidth() - org.telegram.messenger.g0.L(124.0f)) / 2);
                }
            }
        }
        if (i16 == 1 || i16 == 2) {
            org.telegram.ui.Components.w61[] w61VarArr = this.K0;
            if (z11) {
                c10 = 2;
            } else {
                c10 = 0;
            }
            w61VarArr[c10].setVisibility(0);
        }
        if (i7 == 1) {
            org.telegram.ui.Cells.h0 h0Var = this.U0;
            if (!h0Var.M) {
                float f20 = this.f50303m1;
                if (f20 < 0.0f) {
                    float f21 = -f20;
                    this.f50303m1 = f21;
                    h0Var.setProgress(f21);
                }
            }
        }
        int i20 = 58;
        float f22 = 1.0f;
        FrameLayout[] frameLayoutArr = this.M0;
        if (z10) {
            this.f50317s1 = new AnimatorSet();
            ArrayList arrayList2 = new ArrayList();
            if (i7 == 0) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            if (z9) {
                frameLayoutArr[i7].setVisibility(0);
                if (i16 == 1) {
                    q61 q61Var = this.f50322v0;
                    Property property = View.TRANSLATION_Y;
                    if (i7 == 1) {
                        f17 = -org.telegram.messenger.g0.L(21.0f);
                    } else {
                        f17 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(q61Var, property, f17));
                    org.telegram.ui.Components.w61 w61Var = this.K0[2];
                    Property property2 = View.ALPHA;
                    if (z11) {
                        f18 = 1.0f;
                    } else {
                        f18 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(w61Var, property2, f18));
                    org.telegram.ui.Components.w61 w61Var2 = this.K0[0];
                    if (z11) {
                        f19 = 0.0f;
                    } else {
                        f19 = 1.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(w61Var2, property2, f19));
                    if (i7 == 1) {
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i7], property2, 0.0f, 1.0f));
                    } else {
                        frameLayoutArr[i7].setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i11], property2, 0.0f));
                    }
                    org.telegram.messenger.g0.v1(this.W.E[1]);
                } else if (i16 == 2) {
                    q61 q61Var2 = this.f50322v0;
                    Property property3 = View.TRANSLATION_Y;
                    int i21 = -frameLayoutArr[i7].getMeasuredHeight();
                    if (this.B1 == null) {
                        i20 = 0;
                    }
                    int L = org.telegram.messenger.g0.L(i20 + 72) + i21;
                    if (Z0()) {
                        i12 = org.telegram.messenger.g0.f22539n;
                    } else {
                        i12 = 0;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(q61Var2, property3, L + i12));
                    org.telegram.ui.Components.w61 w61Var3 = this.K0[2];
                    Property property4 = View.ALPHA;
                    if (z11) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(w61Var3, property4, f16));
                    org.telegram.ui.Components.w61 w61Var4 = this.K0[0];
                    if (z11) {
                        f22 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(w61Var4, property4, f22));
                    if (frameLayoutArr[i11].getVisibility() == 0) {
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i11], property4, 0.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i7], property4, 0.0f, 1.0f));
                        frameLayoutArr[i7].setTranslationY(0.0f);
                    } else {
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i7], property3, frameLayout3.getMeasuredHeight(), 0.0f));
                    }
                } else {
                    if (i7 == 1) {
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i7], View.ALPHA, 0.0f, 1.0f));
                    } else {
                        frameLayoutArr[i7].setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i11], View.ALPHA, 0.0f));
                    }
                    org.telegram.messenger.g0.v1(this.W.E[1]);
                }
            } else {
                q61 q61Var3 = this.f50322v0;
                Property property5 = View.TRANSLATION_Y;
                arrayList2.add(ObjectAnimator.ofFloat(q61Var3, property5, 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i7], property5, frameLayout2.getMeasuredHeight()));
                org.telegram.ui.Components.w61 w61Var5 = this.K0[0];
                Property property6 = View.ALPHA;
                arrayList2.add(ObjectAnimator.ofFloat(w61Var5, property6, 1.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.K0[2], property6, 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.f50331y0, property6, 1.0f));
            }
            this.f50317s1.playTogether(arrayList2);
            this.f50317s1.addListener(new c71(this, z9, i11, i7, z11));
            this.f50317s1.setInterpolator(org.telegram.ui.Components.xq.f40346g);
            this.f50317s1.setDuration(200L);
            this.f50317s1.start();
            return;
        }
        if (i7 == 0) {
            c11 = 1;
        } else {
            c11 = 0;
        }
        if (z9) {
            frameLayoutArr[i7].setVisibility(0);
            if (i16 == 1) {
                q61 q61Var4 = this.f50322v0;
                if (i7 == 1) {
                    f13 = -org.telegram.messenger.g0.L(21.0f);
                } else {
                    f13 = 0.0f;
                }
                q61Var4.setTranslationY(f13);
                org.telegram.ui.Components.w61 w61Var6 = this.K0[2];
                if (z11) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                w61Var6.setAlpha(f14);
                org.telegram.ui.Components.w61 w61Var7 = this.K0[0];
                if (z11) {
                    f15 = 0.0f;
                } else {
                    f15 = 1.0f;
                }
                w61Var7.setAlpha(f15);
                if (i7 == 1) {
                    frameLayoutArr[i7].setAlpha(1.0f);
                } else {
                    frameLayoutArr[i7].setAlpha(1.0f);
                    frameLayoutArr[c11].setAlpha(0.0f);
                }
                org.telegram.messenger.g0.v1(this.W.E[1]);
            } else if (i16 == 2) {
                q61 q61Var5 = this.f50322v0;
                if (i7 == 0) {
                    f10 = 343.0f;
                } else {
                    f10 = 316.0f;
                }
                int i22 = -org.telegram.messenger.g0.L(f10);
                if (this.B1 == null) {
                    i20 = 0;
                }
                int L2 = org.telegram.messenger.g0.L(i20 + 72) + i22;
                if (Z0()) {
                    i10 = org.telegram.messenger.g0.f22539n;
                } else {
                    i10 = 0;
                }
                q61Var5.setTranslationY(L2 + i10);
                org.telegram.ui.Components.w61 w61Var8 = this.K0[2];
                if (z11) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                w61Var8.setAlpha(f11);
                org.telegram.ui.Components.w61 w61Var9 = this.K0[0];
                if (z11) {
                    f12 = 0.0f;
                } else {
                    f12 = 1.0f;
                }
                w61Var9.setAlpha(f12);
                if (frameLayoutArr[c11].getVisibility() == 0) {
                    frameLayoutArr[c11].setAlpha(0.0f);
                    frameLayoutArr[i7].setAlpha(1.0f);
                    frameLayoutArr[i7].setTranslationY(0.0f);
                } else {
                    frameLayoutArr[i7].setTranslationY(0.0f);
                }
            } else {
                if (i7 == 1) {
                    frameLayoutArr[i7].setAlpha(1.0f);
                } else {
                    frameLayoutArr[i7].setAlpha(1.0f);
                    frameLayoutArr[c11].setAlpha(0.0f);
                }
                org.telegram.messenger.g0.v1(this.W.E[1]);
            }
        } else {
            this.f50322v0.setTranslationY(0.0f);
            frameLayoutArr[i7].setTranslationY(frameLayout.getMeasuredHeight());
            this.K0[0].setAlpha(1.0f);
            this.K0[2].setAlpha(1.0f);
            this.f50331y0.setAlpha(1.0f);
        }
        if (z9 && frameLayoutArr[c11].getVisibility() == 0) {
            frameLayoutArr[c11].setAlpha(1.0f);
            frameLayoutArr[c11].setVisibility(4);
        } else if (!z9) {
            frameLayoutArr[i7].setVisibility(4);
        }
        if (i16 != 1 && i16 != 2) {
            if (i7 == 1) {
                frameLayoutArr[c11].setAlpha(0.0f);
                return;
            }
            return;
        }
        org.telegram.ui.Components.w61[] w61VarArr2 = this.K0;
        if (!z11) {
            c12 = 2;
        }
        w61VarArr2[c12].setVisibility(4);
    }

    public final void l1() {
        Window window;
        if (this.f50295i2 != null) {
            return;
        }
        if (Z0()) {
            window = this.parentLayout.getBottomSheet().getWindow();
        } else {
            window = getParentActivity().getWindow();
        }
        FrameLayout frameLayout = (FrameLayout) window.getDecorView();
        Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        this.P1.setAlpha(0.0f);
        frameLayout.draw(canvas);
        this.P1.setAlpha(1.0f);
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        paint2.setFilterBitmap(true);
        int[] iArr = new int[2];
        this.P1.getLocationInWindow(iArr);
        float f10 = iArr[0];
        float f11 = iArr[1];
        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.g0.f22539n;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        cc ccVar = new cc(this, getParentActivity(), canvas, (this.P1.getMeasuredWidth() / 2.0f) + f10, (this.P1.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 2);
        this.f50295i2 = ccVar;
        ccVar.setOnTouchListener(new ei.b(2));
        this.f50298j2 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f50301k2 = ofFloat;
        ofFloat.addUpdateListener(new fi.ea(this, 3));
        this.f50301k2.addListener(new z61(this, 4));
        this.f50301k2.setDuration(400L);
        this.f50301k2.setInterpolator(org.telegram.ui.Components.ks.f35403e);
        this.f50301k2.start();
        frameLayout.addView(this.f50295i2, new ViewGroup.LayoutParams(-1, -1));
        org.telegram.messenger.g0.h3(new i61(this, 2));
    }

    public final void m1(boolean z9) {
        int i7 = (this.K1 > 0L ? 1 : (this.K1 == 0L ? 0 : -1));
        if (i7 > 0) {
            this.A1.d(org.telegram.messenger.hd.M0(2131754212, null));
        } else if (i7 < 0) {
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-this.K1));
            if (M0 != null) {
                this.A1.d(org.telegram.messenger.hd.a0(null, null, 2131754213, M0.title));
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.W1;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < W0()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                    if (this.f50314r1 == null) {
                        org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(2131231976, 0);
                        this.f50314r1 = wpVar;
                        wpVar.f40069n = 1;
                    }
                    spannableStringBuilder.setSpan(this.f50314r1, 0, 1, 33);
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) org.telegram.messenger.hd.G(W0(), "ReactionLevelRequiredBtn", new Object[0]));
                    this.A1.c(spannableStringBuilder, z9);
                    return;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.W1;
                if (tL_premium_boostsStatus2 == null) {
                    if (this.K1 < 0 && !this.U1 && !this.V1 && tL_premium_boostsStatus2 == null) {
                        this.U1 = true;
                        getMessagesController().G0().a(this.K1, new l61(this, 1));
                        return;
                    }
                    return;
                }
                this.A1.c(null, z9);
                return;
            }
            this.A1.d(org.telegram.messenger.hd.a0(null, null, 2131754213, org.telegram.messenger.hd.M0(2131754904, null).toLowerCase()));
        } else {
            this.A1.d(org.telegram.messenger.hd.M0(2131754214, null));
        }
    }

    public final void n1() {
        if (this.G1 && this.f50329x1 == null) {
            Bitmap bitmap = this.D1;
            if (bitmap != null) {
                this.f50332y1 = bitmap;
                this.f50329x1 = Utilities.e(bitmap);
            } else {
                ImageReceiver imageReceiver = this.f50331y0.getImageReceiver();
                if (imageReceiver.L() || imageReceiver.m0 != null) {
                    this.f50332y1 = imageReceiver.n();
                    this.f50329x1 = Utilities.e(imageReceiver.n());
                }
            }
        }
        if (this.G1) {
            Bitmap bitmap2 = this.f50329x1;
            if (bitmap2 != null) {
                this.f50331y0.setImageBitmap(bitmap2);
                return;
            }
            return;
        }
        g1(false);
    }

    public final void o1() {
        File A;
        String name;
        int i7;
        long j3;
        File file;
        String str;
        float f10;
        FrameLayout frameLayout;
        float f11;
        Object obj = this.X0;
        if (obj == null) {
            obj = this.C1;
        }
        boolean z9 = obj instanceof TLRPC.TL_wallPaper;
        if (z9 || (obj instanceof org.telegram.messenger.kf)) {
            if (z9) {
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
                str = org.telegram.messenger.w7.r(null, tL_wallPaper.document);
                if (!TextUtils.isEmpty(str)) {
                    org.telegram.messenger.w7.G(this.currentAccount);
                    file = org.telegram.messenger.w7.J(tL_wallPaper.document, null, true, true);
                    j3 = tL_wallPaper.document.size;
                } else {
                    return;
                }
            } else {
                org.telegram.messenger.kf kfVar = (org.telegram.messenger.kf) obj;
                TLRPC.Photo photo = kfVar.K;
                if (photo != null) {
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, this.I1, true, null, false);
                    org.telegram.messenger.w7.G(this.currentAccount);
                    A = org.telegram.messenger.w7.J(w10, null, true, true);
                    name = org.telegram.messenger.w7.r(null, w10);
                    i7 = w10.size;
                } else {
                    A = org.telegram.messenger.gc.A(kfVar.C);
                    name = A.getName();
                    i7 = kfVar.G;
                }
                j3 = i7;
                String str2 = name;
                file = A;
                str = str2;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
            }
            boolean exists = file.exists();
            int i10 = this.f50269b;
            if (exists) {
                org.telegram.messenger.z5.q(this.currentAccount).v(this);
                this.f50331y0.invalidate();
                if (i10 == 2) {
                    if (j3 != 0 && this.K1 == 0) {
                        this.f50318t0.setSubtitle(org.telegram.messenger.g0.i0(j3, false, false));
                    } else {
                        this.f50318t0.setSubtitle(null);
                    }
                }
            } else {
                org.telegram.messenger.z5.q(this.currentAccount).a(str, null, this);
                if (i10 == 2 && this.K1 == 0) {
                    this.f50318t0.setSubtitle(org.telegram.messenger.hd.M0(2131748777, null));
                }
                this.f50331y0.invalidate();
            }
            float f12 = 0.5f;
            if (this.X0 == null && (frameLayout = this.f50333z0) != null) {
                if (exists) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.5f;
                }
                frameLayout.setAlpha(f11);
            }
            if (i10 == 0) {
                this.f50277d0.setEnabled(exists);
                TextView textView = this.f50277d0;
                if (exists) {
                    f12 = 1.0f;
                }
                textView.setAlpha(f12);
            } else if (i10 == 2) {
                this.D0.setEnabled(exists);
                l71 l71Var = this.A1;
                if (l71Var != null) {
                    if (exists) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.5f;
                    }
                    l71Var.setAlpha(f10);
                }
                l71 l71Var2 = this.B1;
                if (l71Var2 != null) {
                    if (exists) {
                        f12 = 1.0f;
                    }
                    l71Var2.setAlpha(f12);
                }
            } else {
                this.f50283f.setEnabled(exists);
                org.telegram.ui.ActionBar.r0 r0Var = this.f50283f;
                if (exists) {
                    f12 = 1.0f;
                }
                r0Var.setAlpha(f12);
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z9) {
        if (!U0(z9)) {
            return false;
        }
        S0(true);
        return super.onBackPressed(z9);
    }

    @Override
    public final void onBottomSheetCreated() {
        super.onBottomSheetCreated();
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && q4Var.getBottomSheet() != null) {
            this.parentLayout.getBottomSheet().O(getThemedColor(org.telegram.ui.ActionBar.k6.f27922h5));
            if (this.f50269b == 2 && this.K1 != 0) {
                this.parentLayout.getBottomSheet().E0(-16777216);
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f25045p3);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25009i4);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25014j4);
        getNotificationCenter().c(this, org.telegram.messenger.qs.f25080u5);
        int i7 = this.f50269b;
        if (i7 == 1 || i7 == 0) {
            org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25113z4);
        }
        if (i7 == 2 || i7 == 1) {
            org.telegram.ui.ActionBar.k6.N = true;
        }
        if (i7 == 0 && this.f50324w == null) {
            this.F1 = org.telegram.ui.ActionBar.k6.f27935i0;
        } else {
            Point point = org.telegram.messenger.g0.f22544q;
            int min = Math.min(point.x, point.y);
            int max = Math.max(point.x, point.y);
            StringBuilder sb2 = new StringBuilder();
            sb2.append((int) (min / org.telegram.messenger.g0.f22543p));
            sb2.append("_");
            this.H1 = a8.p0.n((int) (max / org.telegram.messenger.g0.f22543p), "_f", sb2);
            this.I1 = Math.max(point.x, point.y);
            org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f24991f4);
            org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f24985e4);
            this.f50321u1 = org.telegram.messenger.z5.q(this.currentAccount).k();
            if (this.V0 == null) {
                this.V0 = new ArrayList();
                org.telegram.messenger.yr.a0(this.currentAccount).p0();
            }
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f25045p3);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25009i4);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25014j4);
        getNotificationCenter().n(this, org.telegram.messenger.qs.f25080u5);
        bi.x5 x5Var = this.f50302l0;
        if (x5Var != null && this.R != null) {
            x5Var.getViewTreeObserver().removeOnGlobalLayoutListener(this.R);
        }
        int i7 = this.f50269b;
        if ((i7 == 2 || i7 == 1) && this.f50311q1 == null) {
            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.l10(28));
        }
        int i10 = org.telegram.messenger.qs.f25113z4;
        if (i7 == 2) {
            Bitmap bitmap = this.f50329x1;
            if (bitmap != null) {
                bitmap.recycle();
                this.f50329x1 = null;
            }
            this.f50265a.k(null, null, null);
            org.telegram.messenger.qs.e().k(i10, new Object[0]);
        } else if (i7 == 1 || i7 == 0) {
            org.telegram.messenger.qs.e().n(this, i10);
        }
        if (i7 != 0 || this.f50324w != null) {
            org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f24991f4);
            org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f24985e4);
        }
        super.onFragmentDestroy();
        T0(null);
    }

    @Override
    public final void onPause() {
        super.onPause();
        if (this.F1) {
            this.f50326w1.c(false);
        }
        org.telegram.ui.ActionBar.k6.f27805b = false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        l4 l4Var = this.f50308p0;
        if (l4Var != null) {
            l4Var.f();
        }
        q71 q71Var = this.f50325w0;
        if (q71Var != null) {
            q71Var.f();
        }
        if (this.F1) {
            this.f50326w1.c(true);
        }
        org.telegram.ui.ActionBar.k6.f27805b = true;
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            V0();
            try {
                c5.k kVar = this.f50299k0;
                if (kVar != null) {
                    org.telegram.messenger.g0.C3(kVar, getThemedColor(org.telegram.ui.ActionBar.k6.f28129s8));
                }
                org.telegram.ui.Cells.h0 h0Var = this.U0;
                if (h0Var != null) {
                    h0Var.setOuterColor(getThemedColor(org.telegram.ui.ActionBar.k6.Jj));
                    this.U0.invalidate();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z9, boolean z10) {
        super.onTransitionAnimationStart(z9, z10);
        if (!z9 && this.f50269b == 2) {
            this.f50265a.k(null, null, null);
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25113z4, new Object[0]);
        }
    }

    public final void p1() {
        this.f50331y0.getImageReceiver().setAlpha(Math.abs(this.f50303m1));
        this.f50331y0.invalidate();
        this.Q0.g1();
        if (this.f50303m1 >= 0.0f) {
            this.f50331y0.getImageReceiver().m0(null);
        } else {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f50331y0.getImageReceiver().Z(null);
            }
            if (this.f50331y0.getBackground() instanceof org.telegram.ui.Components.qa0) {
                this.f50331y0.getImageReceiver().m0(((org.telegram.ui.Components.qa0) this.f50331y0.getBackground()).f37230k);
            }
        }
        this.f50265a.k(this.f50331y0.getBackground(), this.f50331y0.getBackground(), Float.valueOf(this.f50303m1));
        a1();
    }

    public final void q1() {
        char c10;
        float f10;
        boolean z9;
        boolean z10;
        float f11;
        float f12 = 1.0f;
        float f13 = 0.0f;
        int i7 = this.f50269b;
        if (i7 != 1 && i7 != 2) {
            boolean isEnabled = this.K0[0].isEnabled();
            TLRPC.TL_wallPaper tL_wallPaper = this.X0;
            if (tL_wallPaper != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (isEnabled == z9) {
                return;
            }
            if (tL_wallPaper == null) {
                this.K0[0].a(false, true);
            }
            org.telegram.ui.Components.w61 w61Var = this.K0[0];
            if (this.X0 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            w61Var.setEnabled(z10);
            if (this.X0 != null) {
                this.K0[0].setVisibility(0);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            int L = (org.telegram.messenger.g0.L(9.0f) + ((FrameLayout.LayoutParams) this.K0[1].getLayoutParams()).width) / 2;
            org.telegram.ui.Components.w61 w61Var2 = this.K0[0];
            Property property = View.ALPHA;
            if (this.X0 == null) {
                f12 = 0.0f;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(w61Var2, property, f12));
            org.telegram.ui.Components.w61 w61Var3 = this.K0[0];
            Property property2 = View.TRANSLATION_X;
            if (this.X0 != null) {
                f11 = 0.0f;
            } else {
                f11 = L;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(w61Var3, property2, f11));
            org.telegram.ui.Components.w61 w61Var4 = this.K0[1];
            if (this.X0 == null) {
                f13 = -L;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(w61Var4, property2, f13));
            animatorSet.setInterpolator(org.telegram.ui.Components.xq.f40346g);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new b71(this));
            animatorSet.start();
            return;
        }
        if (this.X0 == null && (this.C1 instanceof oc1)) {
            this.K0[2].a(false, true);
        }
        org.telegram.ui.Components.w61[] w61VarArr = this.K0;
        if (this.X0 != null) {
            c10 = 2;
        } else {
            c10 = 0;
        }
        w61VarArr[c10].setVisibility(0);
        AnimatorSet animatorSet2 = new AnimatorSet();
        org.telegram.ui.Components.w61 w61Var5 = this.K0[2];
        Property property3 = View.ALPHA;
        if (this.X0 != null) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(w61Var5, property3, f10);
        org.telegram.ui.Components.w61 w61Var6 = this.K0[0];
        if (this.X0 != null) {
            f12 = 0.0f;
        }
        animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(w61Var6, property3, f12));
        animatorSet2.addListener(new a71(this));
        animatorSet2.setInterpolator(org.telegram.ui.Components.xq.f40346g);
        animatorSet2.setDuration(200L);
        animatorSet2.start();
    }

    public final void r1(boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u71.r1(boolean):void");
    }

    public final void s1() {
        int childCount = this.Q0.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = this.Q0.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.i5) {
                ((org.telegram.ui.Cells.i5) childAt).w(true);
            }
        }
    }

    @Override
    public final void setResourceProvider(org.telegram.ui.ActionBar.f6 f6Var) {
        this.f50265a.f50583a = f6Var;
    }

    public u71(org.telegram.ui.ActionBar.j6 j6Var, boolean z9, int i7, boolean z10, boolean z11) {
        super(null);
        this.f50265a = new v61(this);
        this.d = true;
        this.f50304n = 1;
        org.telegram.ui.ActionBar.q5 q5Var = new org.telegram.ui.ActionBar.q5(this, 0, false);
        this.S = q5Var;
        org.telegram.ui.ActionBar.q5 q5Var2 = new org.telegram.ui.ActionBar.q5(this, 0, true);
        this.T = q5Var2;
        org.telegram.ui.ActionBar.q5 q5Var3 = new org.telegram.ui.ActionBar.q5(this, 1, false);
        this.U = q5Var3;
        org.telegram.ui.ActionBar.q5 q5Var4 = new org.telegram.ui.ActionBar.q5(this, 1, true);
        this.V = q5Var4;
        this.Y = -1;
        this.Z = new i61(this, 0);
        this.f50328x0 = new k71[2];
        this.M0 = new FrameLayout[2];
        this.N0 = new TextView[2];
        this.O0 = new TextView[2];
        this.P0 = new FrameLayout[2];
        this.W0 = new HashMap();
        this.f50303m1 = 0.5f;
        this.f50307o1 = 0.0f;
        this.f50319t1 = PorterDuff.Mode.SRC_IN;
        this.f50334z1 = 1.0f;
        this.H1 = "640_360";
        this.I1 = 1920;
        this.L1 = true;
        this.T1 = new org.telegram.ui.Components.z00(getParentActivity(), new x61(this));
        this.U1 = false;
        this.V1 = false;
        this.f50269b = i7;
        this.f50287g0 = z11;
        this.f50284f0 = j6Var;
        this.f50293i0 = z9;
        this.f50290h0 = z10;
        if (i7 == 1) {
            org.telegram.ui.ActionBar.h6 k10 = j6Var.k(!z10);
            this.f50324w = k10;
            if (k10 != null) {
                this.d = false;
                this.f50330y = k10.f27518c;
                this.D = k10.d;
                this.E = k10.f27519e;
                this.F = k10.f27520f;
                this.G = k10.f27521g;
                this.H = k10.h;
                this.I = k10.f27522i;
                this.J = k10.f27523j;
                this.K = k10.f27524k;
                this.L = k10.f27525l;
                this.M = k10.f27526m;
                this.N = k10.f27529p;
                this.O = k10.f27528o;
                this.P = k10.f27527n;
            }
        } else {
            if (i7 == 0) {
                this.d = false;
            }
            org.telegram.ui.ActionBar.h6 k11 = j6Var.k(false);
            this.f50324w = k11;
            if (k11 != null) {
                this.X0 = k11.f27532s;
            }
        }
        org.telegram.ui.ActionBar.h6 h6Var = this.f50324w;
        if (h6Var != null) {
            this.F1 = h6Var.f27530q;
            if (!TextUtils.isEmpty(h6Var.f27528o)) {
                this.f50303m1 = this.f50324w.f27529p;
            }
            org.telegram.ui.ActionBar.k6.M = org.telegram.ui.ActionBar.k6.D0();
            org.telegram.ui.ActionBar.k6.O = true;
            org.telegram.ui.ActionBar.k6.P = true;
            org.telegram.ui.ActionBar.k6.u(j6Var, false, false);
        }
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25079u4, new Object[0]);
        q5Var.v = true;
        q5Var3.v = true;
        q5Var2.v = true;
        q5Var4.v = true;
    }

    @Override
    public final void i(long j3, long j10) {
    }

    @Override
    public final void o(long j3, long j10) {
    }

    public u71(org.telegram.ui.ActionBar.j6 j6Var) {
        this(j6Var, false, 0, false, false);
    }
}
