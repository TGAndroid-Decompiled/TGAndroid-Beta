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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
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
public class vd1 extends org.telegram.ui.ActionBar.n2 implements DownloadController.FileDownloadProgressListener, NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.i40 A0;
    public ld1 A1;
    public AnimatorSet B0;
    public Object B1;
    public u4 C0;
    public Bitmap C1;
    public tc1 D0;
    public boolean D1;
    public final int E;
    public tc1 E0;
    public boolean E1;
    public final int F;
    public ImageView F0;
    public boolean F1;
    public final int G;
    public ImageView G0;
    public String G1;
    public final boolean H;
    public AnimatorSet H0;
    public int H1;
    public final long I;
    public AnimatorSet I0;
    public ud1 I1;
    public final long J;
    public org.telegram.ui.Components.y81[] J0;
    public long J1;
    public final long K;
    public org.telegram.ui.Components.y81[] K0;
    public boolean K1;
    public final long L;
    public final FrameLayout[] L0;
    public boolean L1;
    public final float M;
    public final TextView[] M0;
    public boolean M1;
    public final String N;
    public final TextView[] N0;
    public org.telegram.ui.Components.ij0 N1;
    public final int O;
    public final FrameLayout[] O0;
    public org.telegram.ui.ActionBar.v0 O1;
    public long P;
    public dc1 P0;
    public ValueAnimator P1;
    public ha0 Q;
    public td1 Q0;
    public t5 Q1;
    public final org.telegram.ui.ActionBar.q5 R;
    public s4.c0 R0;
    public sc1 R1;
    public final org.telegram.ui.ActionBar.q5 S;
    public org.telegram.ui.Cells.m4 S0;
    public final org.telegram.ui.Components.j20 S1;
    public final org.telegram.ui.ActionBar.q5 T;
    public org.telegram.ui.Cells.j0 T0;
    public boolean T1;
    public final org.telegram.ui.ActionBar.q5 U;
    public ArrayList U0;
    public boolean U1;
    public org.telegram.ui.Components.mq V;
    public final HashMap V0;
    public TL_stories.TL_premium_boostsStatus V1;
    public int W;
    public TLRPC.TL_wallPaper W0;
    public float W1;
    public int X;
    public TLRPC.TL_wallPaper X0;
    public float X1;
    public final Runnable Y;
    public TLRPC.TL_wallPaper Y0;
    public float Y1;
    public boolean Z;
    public int Z0;
    public float Z1;
    public final vc1 f38467a;
    public ci.s6 f38468a0;
    public int f38469a1;
    public boolean a2;
    public final int f38470b;
    public FrameLayout f38471b0;
    public int f38472b1;
    public int f38473b2;
    public Scroller f38474c;
    public TextView f38475c0;
    public int f38476c1;
    public ValueAnimator f38477c2;
    public final boolean d;
    public TextView f38478d0;
    public int f38479d1;
    public boolean f38480d2;
    public org.telegram.ui.Components.yl e;
    public final org.telegram.ui.ActionBar.i6 f38481e0;
    public int f38482e1;
    public TextView f38483e2;
    public org.telegram.ui.ActionBar.v0 f38484f;
    public final boolean f38485f0;
    public int f38486f1;
    public WeakReference f38487f2;
    public final boolean f38488g0;
    public int f38489g1;
    public BitmapDrawable f38490g2;
    public TextView h;
    public final boolean f38491h0;
    public int f38492h1;
    public mc f38493h2;
    public ArrayList f38494i0;
    public int f38495i1;
    public float f38496i2;
    public z4.g f38497j0;
    public int f38498j1;
    public ValueAnimator f38499j2;
    public ci.n6 f38500k0;
    public int f38501k1;
    public UndoView f38502l0;
    public float l1;
    public FrameLayout m0;
    public float f38503m1;
    public int f38504n;
    public org.telegram.ui.Components.wl0 f38505n0;
    public float f38506n1;
    public nd1 f38507o0;
    public float f38508o1;
    public org.telegram.ui.Components.y10 f38509p0;
    public md1 f38510p1;
    public MessageObject f38511q0;
    public org.telegram.ui.Components.oq f38512q1;
    public Drawable f38513r;
    public boolean f38514r0;
    public AnimatorSet f38515r1;
    public final org.telegram.ui.ActionBar.g6 f38516s;
    public org.telegram.ui.ActionBar.k f38517s0;
    public final PorterDuff.Mode f38518s1;
    public org.telegram.ui.ActionBar.q0 f38519t0;
    public int f38520t1;
    public qc1 f38521u0;
    public org.telegram.ui.Components.q9 f38522u1;
    public boolean v;
    public rd1 f38523v0;
    public org.telegram.ui.Components.a91 f38524v1;
    public final int f38525w;
    public final kd1[] f38526w0;
    public Bitmap f38527w1;
    public final int f38528x;
    public kd1 f38529x0;
    public Bitmap f38530x1;
    public final int f38531y;
    public FrameLayout f38532y0;
    public float f38533y1;
    public FrameLayout f38534z0;
    public ld1 f38535z1;

    public vd1(Object obj, Bitmap bitmap, boolean z10) {
        super(null);
        this.f38467a = new vc1(this);
        this.d = true;
        this.f38504n = 1;
        org.telegram.ui.ActionBar.q5 q5Var = new org.telegram.ui.ActionBar.q5(this, 0, false);
        this.R = q5Var;
        org.telegram.ui.ActionBar.q5 q5Var2 = new org.telegram.ui.ActionBar.q5(this, 0, true);
        this.S = q5Var2;
        org.telegram.ui.ActionBar.q5 q5Var3 = new org.telegram.ui.ActionBar.q5(this, 1, false);
        this.T = q5Var3;
        org.telegram.ui.ActionBar.q5 q5Var4 = new org.telegram.ui.ActionBar.q5(this, 1, true);
        this.U = q5Var4;
        this.X = -1;
        this.Y = new ic1(this, 0);
        this.f38526w0 = new kd1[2];
        this.L0 = new FrameLayout[2];
        this.M0 = new TextView[2];
        this.N0 = new TextView[2];
        this.O0 = new FrameLayout[2];
        this.V0 = new HashMap();
        this.l1 = 0.5f;
        this.f38506n1 = 0.0f;
        this.f38518s1 = PorterDuff.Mode.SRC_IN;
        this.f38533y1 = 1.0f;
        this.G1 = "640_360";
        this.H1 = 1920;
        this.K1 = true;
        this.S1 = new org.telegram.ui.Components.j20(getParentActivity(), new xc1(this));
        this.T1 = false;
        this.U1 = false;
        this.f38470b = 2;
        this.B1 = obj;
        this.C1 = bitmap;
        this.D1 = z10;
        if (obj instanceof ej1) {
            ej1 ej1Var = (ej1) obj;
            this.E1 = ej1Var.f33299j;
            TLRPC.TL_wallPaper tL_wallPaper = ej1Var.f33297g;
            this.W0 = tL_wallPaper;
            if (tL_wallPaper != null) {
                float f7 = ej1Var.h;
                this.l1 = f7;
                if (f7 < 0.0f && !org.telegram.ui.ActionBar.j6.I.q()) {
                    this.l1 *= -1.0f;
                }
            }
        }
        q5Var.v = true;
        q5Var3.v = true;
        q5Var2.v = true;
        q5Var4.v = true;
    }

    public static void U(vd1 vd1Var) {
        org.telegram.ui.ActionBar.g6 k10;
        org.telegram.ui.ActionBar.i6 i6Var = org.telegram.ui.ActionBar.j6.M;
        if (i6Var == null) {
            return;
        }
        int i10 = i6Var.Z;
        if (i10 >= 0) {
            k10 = (org.telegram.ui.ActionBar.g6) i6Var.f18942a0.get(i10);
        } else {
            k10 = i6Var.k(false);
        }
        if (vd1Var.f38516s != null) {
            vd1Var.W0();
            org.telegram.ui.ActionBar.j6.t1(vd1Var.f38481e0, true, false, false, false, false);
            if (org.telegram.ui.ActionBar.j6.M != null) {
                org.telegram.ui.ActionBar.j6.O = false;
                org.telegram.ui.ActionBar.j6.P = false;
                org.telegram.ui.ActionBar.j6.M = null;
            }
            org.telegram.ui.ActionBar.j6.t(vd1Var.f38481e0, true, vd1Var.f38485f0);
            ((ActionBarLayout) vd1Var.parentLayout).U(false, false);
        } else {
            ((ActionBarLayout) vd1Var.parentLayout).U(false, false);
            File file = new File(vd1Var.f38481e0.f18943b);
            org.telegram.ui.ActionBar.i6 i6Var2 = vd1Var.f38481e0;
            org.telegram.ui.ActionBar.j6.u(file, i6Var2.f18941a, i6Var2.F, false);
            MessagesController.getInstance(vd1Var.f38481e0.E).saveTheme(vd1Var.f38481e0, null, false, false);
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            edit.putString("lastDayTheme", vd1Var.f38481e0.m());
            edit.commit();
        }
        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) vd1Var.getParentLayout().getFragmentStack().get(Math.max(0, vd1Var.getParentLayout().getFragmentStack().size() - 2));
        vd1Var.finishFragment();
        if (vd1Var.f38470b == 0) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didApplyNewTheme, i6Var, k10, Boolean.valueOf(vd1Var.f38491h0));
        }
        org.telegram.ui.ActionBar.j6.F1(n2Var);
    }

    public static void V(vd1 vd1Var, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (vd1Var.getParentActivity() == null) {
            return;
        }
        rg.j0 j0Var = new rg.j0(23, vd1Var.currentAccount, vd1Var.getParentActivity(), vd1Var, vd1Var.f38467a);
        j0Var.G1(canApplyBoost);
        j0Var.F1(vd1Var.V1, true);
        j0Var.H1(vd1Var.J1);
        if (!vd1Var.U0()) {
            j0Var.Q0 = new ic1(vd1Var, 1);
        }
        vd1Var.showDialog(j0Var);
    }

    public static void W(vd1 vd1Var, TLObject tLObject) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        HashMap hashMap = vd1Var.V0;
        org.telegram.ui.ActionBar.g6 g6Var = vd1Var.f38516s;
        if (tLObject instanceof TL_account.TL_wallPapers) {
            TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
            vd1Var.U0.clear();
            hashMap.clear();
            int size = tL_wallPapers.wallpapers.size();
            boolean z10 = false;
            for (int i10 = 0; i10 < size; i10++) {
                if (tL_wallPapers.wallpapers.get(i10) instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) tL_wallPapers.wallpapers.get(i10);
                    if (tL_wallPaper2.pattern) {
                        TLRPC.Document document = tL_wallPaper2.document;
                        if (document != null && !hashMap.containsKey(Long.valueOf(document.f18302id))) {
                            vd1Var.U0.add(tL_wallPaper2);
                            hashMap.put(Long.valueOf(tL_wallPaper2.document.f18302id), tL_wallPaper2);
                        }
                        if (g6Var != null && (str = g6Var.f18888o) != null && str.equals(tL_wallPaper2.slug)) {
                            vd1Var.W0 = tL_wallPaper2;
                            vd1Var.b1(false);
                            vd1Var.j1();
                        } else if (g6Var == null) {
                            TLRPC.TL_wallPaper tL_wallPaper3 = vd1Var.W0;
                            if (tL_wallPaper3 != null) {
                                String str2 = tL_wallPaper3.slug;
                                if (str2 != null) {
                                    if (!str2.equals(tL_wallPaper2.slug)) {
                                    }
                                }
                            }
                        }
                        z10 = true;
                    }
                }
            }
            if (!z10 && (tL_wallPaper = vd1Var.W0) != null) {
                vd1Var.U0.add(0, tL_wallPaper);
            }
            td1 td1Var = vd1Var.Q0;
            if (td1Var != null) {
                td1Var.l();
            }
            MessagesStorage.getInstance(vd1Var.currentAccount).putWallpapers(tL_wallPapers.wallpapers, 1);
        }
        if (vd1Var.W0 == null && g6Var != null && !TextUtils.isEmpty(g6Var.f18888o)) {
            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
            tL_inputWallPaperSlug.slug = g6Var.f18888o;
            getwallpaper.wallpaper = tL_inputWallPaperSlug;
            ConnectionsManager.getInstance(vd1Var.currentAccount).bindRequestToGuid(vd1Var.getConnectionsManager().sendRequest(getwallpaper, new oc1(vd1Var, 0)), vd1Var.classGuid);
        }
    }

    public static void X(vd1 vd1Var) {
        org.telegram.ui.Components.yl ylVar = vd1Var.e;
        int i10 = 0;
        if (ylVar != null) {
            ylVar.B(vd1Var.getThemedColor(org.telegram.ui.ActionBar.j6.G8));
            vd1Var.e.G(vd1Var.getThemedColor(org.telegram.ui.ActionBar.j6.E8), false);
        }
        Drawable drawable = vd1Var.f38513r;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(vd1Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19062d6), PorterDuff.Mode.MULTIPLY));
        }
        u4 u4Var = vd1Var.C0;
        if (u4Var != null) {
            u4Var.invalidate();
        }
        if (vd1Var.f38510p1 != null) {
            org.telegram.ui.ActionBar.d5 d5Var = vd1Var.parentLayout;
            if (d5Var != null && d5Var.getBottomSheet() != null) {
                vd1Var.parentLayout.getBottomSheet().fixNavigationBar(vd1Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19133h5));
                if (vd1Var.f38470b == 2 && vd1Var.J1 != 0) {
                    vd1Var.parentLayout.getBottomSheet().setOverlayNavBarColor(-16777216);
                }
            } else {
                vd1Var.setNavigationBarColor(vd1Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19133h5));
            }
        }
        if (vd1Var.J0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.y81[] y81VarArr = vd1Var.J0;
                if (i11 >= y81VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.y81 y81Var = y81VarArr[i11];
                if (y81Var != null) {
                    y81Var.invalidate();
                }
                i11++;
            }
        }
        if (vd1Var.K0 != null) {
            while (true) {
                org.telegram.ui.Components.y81[] y81VarArr2 = vd1Var.K0;
                if (i10 >= y81VarArr2.length) {
                    break;
                }
                org.telegram.ui.Components.y81 y81Var2 = y81VarArr2[i10];
                if (y81Var2 != null) {
                    y81Var2.invalidate();
                }
                i10++;
            }
        }
        TextView textView = vd1Var.f38483e2;
        if (textView != null) {
            textView.setTextColor(vd1Var.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
        }
        org.telegram.ui.Components.mq mqVar = vd1Var.V;
        if (mqVar != null) {
            mqVar.invalidate();
        }
        org.telegram.ui.Components.y10 y10Var = vd1Var.f38509p0;
        if (y10Var != null) {
            y10Var.g();
        }
    }

    public final void M0() {
        AnimatorSet animatorSet = this.B0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.B0 = animatorSet2;
        if (this.E1) {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f38529x0, View.SCALE_X, this.f38533y1), ObjectAnimator.ofFloat(this.f38529x0, View.SCALE_Y, this.f38533y1));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f38529x0, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f38529x0, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.f38529x0, View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.f38529x0, View.TRANSLATION_Y, 0.0f));
        }
        this.B0.setInterpolator(org.telegram.ui.Components.qr.f27716g);
        this.B0.addListener(new zc1(this, 1));
        this.B0.start();
    }

    public final void N0(boolean r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vd1.N0(boolean):void");
    }

    public final void O0(boolean z10) {
        int i10 = this.f38470b;
        if (i10 == 2) {
            if (!z10) {
                finishFragment();
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.j6.o();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        org.telegram.ui.ActionBar.g6 g6Var = this.f38516s;
        if (i10 == 1) {
            if (this.f38488g0) {
                g6Var.f18879c = this.f38525w;
                g6Var.d = this.f38528x;
                g6Var.e = this.f38531y;
                g6Var.f18880f = this.E;
                g6Var.f18881g = this.F;
                g6Var.h = this.G;
                g6Var.f18882i = this.H;
                g6Var.f18883j = this.I;
                g6Var.f18884k = this.J;
                g6Var.f18885l = this.K;
                g6Var.f18886m = this.L;
                g6Var.f18887n = this.O;
                g6Var.f18888o = this.N;
                g6Var.f18889p = this.M;
            }
            org.telegram.ui.ActionBar.j6.t1(this.f38481e0, false, true, false, false, false);
        } else {
            if (g6Var != null) {
                org.telegram.ui.ActionBar.j6.t1(this.f38481e0, false, this.f38491h0, false, false, false);
            }
            ((ActionBarLayout) this.parentLayout).U(false, false);
            if (this.f38491h0) {
                org.telegram.ui.ActionBar.i6 i6Var = this.f38481e0;
                if (i6Var.f18943b != null && org.telegram.ui.ActionBar.j6.H.get(i6Var.m()) == null) {
                    new File(i6Var.f18943b).delete();
                }
            }
        }
        if (!z10) {
            finishFragment();
        }
    }

    public final BitmapDrawable P0(Drawable drawable) {
        WeakReference weakReference = this.f38487f2;
        if (weakReference != null && weakReference.get() == drawable) {
            return this.f38490g2;
        }
        WeakReference weakReference2 = this.f38487f2;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.f38487f2 = null;
        if (drawable != null && drawable.getIntrinsicWidth() != 0 && drawable.getIntrinsicHeight() != 0) {
            this.f38487f2 = new WeakReference(drawable);
            int intrinsicWidth = (int) ((drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) * 24.0f);
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, 24, Bitmap.Config.ARGB_8888);
            drawable.setBounds(0, 0, intrinsicWidth, 24);
            ColorFilter colorFilter = drawable.getColorFilter();
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.3f);
            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.94f);
            drawable.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            drawable.draw(new Canvas(createBitmap));
            drawable.setColorFilter(colorFilter);
            Utilities.blurBitmap(createBitmap, 3);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(getParentActivity().getResources(), createBitmap);
            this.f38490g2 = bitmapDrawable;
            bitmapDrawable.setFilterBitmap(true);
            return this.f38490g2;
        }
        this.f38490g2 = null;
        return null;
    }

    public final boolean Q0(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vd1.Q0(boolean):boolean");
    }

    public final int R0() {
        if (ChatObject.isChannelAndNotMegaGroup(-this.J1, this.currentAccount)) {
            return getMessagesController().channelCustomWallpaperLevelMin;
        }
        return getMessagesController().groupCustomWallpaperLevelMin;
    }

    public final ArrayList S0() {
        wy0 wy0Var = new wy0(7, this);
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.m0;
        int i10 = org.telegram.ui.ActionBar.j6.f19062d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(frameLayout, 1, null, null, null, wy0Var, i10));
        z4.g gVar = this.f38497j0;
        int i11 = org.telegram.ui.ActionBar.j6.f19340s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(gVar, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, i11));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.j6.f19359t8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 256, null, null, null, null, i12));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i13 = org.telegram.ui.ActionBar.j6.A8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar2, 128, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.j6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.j6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38517s0, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38517s0, 128, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38517s0, 1024, null, null, null, null, org.telegram.ui.ActionBar.j6.B8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38517s0, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38517s0, Integer.MIN_VALUE, null, null, null, wy0Var, org.telegram.ui.ActionBar.j6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38517s0, 1073741824, null, null, null, wy0Var, org.telegram.ui.ActionBar.j6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38505n0, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38521u0, 32768, null, null, null, null, i11));
        if (!this.d) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38471b0, 1, null, null, null, null, i10));
            TextView textView = this.f38478d0;
            int i14 = org.telegram.ui.ActionBar.j6.Ae;
            arrayList.add(new org.telegram.ui.ActionBar.l6(textView, 4, null, null, null, null, i14));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38475c0, 4, null, null, null, null, i14));
        }
        org.telegram.ui.Components.mq mqVar = this.V;
        if (mqVar != null) {
            org.telegram.ui.ActionBar.v0 v0Var = mqVar.I;
            EditTextBoldCursor[] editTextBoldCursorArr = mqVar.E;
            for (int i15 = 0; i15 < editTextBoldCursorArr.length; i15++) {
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i15];
                int i16 = org.telegram.ui.ActionBar.j6.G6;
                arrayList.add(new org.telegram.ui.ActionBar.l6(editTextBoldCursor, 4, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.l6(editTextBoldCursorArr[i15], 16777216, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.l6(editTextBoldCursorArr[i15], 8388608, null, null, null, null, org.telegram.ui.ActionBar.j6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.l6(editTextBoldCursorArr[i15], 8390656, null, null, null, null, org.telegram.ui.ActionBar.j6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.l6(editTextBoldCursorArr[i15], 32, null, null, null, null, org.telegram.ui.ActionBar.j6.f19190k6));
                arrayList.add(new org.telegram.ui.ActionBar.l6(editTextBoldCursorArr[i15], 65568, null, null, null, null, org.telegram.ui.ActionBar.j6.f19208l6));
            }
            org.telegram.ui.ActionBar.k0 k0Var = mqVar.F;
            int i17 = org.telegram.ui.ActionBar.j6.G6;
            arrayList.add(new org.telegram.ui.ActionBar.l6(k0Var, 8, null, null, null, null, i17));
            org.telegram.ui.ActionBar.k0 k0Var2 = mqVar.F;
            int i18 = org.telegram.ui.ActionBar.j6.I5;
            arrayList.add(new org.telegram.ui.ActionBar.l6(k0Var2, 32, null, null, null, null, i18));
            if (v0Var != null) {
                org.telegram.ui.Components.y6 y6Var = new org.telegram.ui.Components.y6(mqVar, 3);
                arrayList.add(new org.telegram.ui.ActionBar.l6(v0Var, 0, null, null, null, y6Var, i17));
                arrayList.add(new org.telegram.ui.ActionBar.l6(v0Var, 0, null, null, null, y6Var, i18));
                arrayList.add(new org.telegram.ui.ActionBar.l6(v0Var, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.j6.E8));
                arrayList.add(new org.telegram.ui.ActionBar.l6(v0Var, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.j6.F8));
                arrayList.add(new org.telegram.ui.ActionBar.l6(v0Var, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.j6.G8));
            }
        }
        FrameLayout[] frameLayoutArr = this.L0;
        if (frameLayoutArr != null) {
            for (int i19 = 0; i19 < frameLayoutArr.length; i19++) {
                arrayList.add(new org.telegram.ui.ActionBar.l6(frameLayoutArr[i19], 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f19149i3}, null, org.telegram.ui.ActionBar.j6.Td));
                arrayList.add(new org.telegram.ui.ActionBar.l6(frameLayoutArr[i19], 0, null, org.telegram.ui.ActionBar.j6.f19167j2, null, null, org.telegram.ui.ActionBar.j6.Sd));
            }
            int i20 = 0;
            while (true) {
                FrameLayout[] frameLayoutArr2 = this.O0;
                if (i20 >= frameLayoutArr2.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.l6(frameLayoutArr2[i20], 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f19149i3}, null, org.telegram.ui.ActionBar.j6.Td));
                arrayList.add(new org.telegram.ui.ActionBar.l6(frameLayoutArr2[i20], 0, null, org.telegram.ui.ActionBar.j6.f19167j2, null, null, org.telegram.ui.ActionBar.j6.Sd));
                i20++;
            }
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.C0, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f19149i3}, null, org.telegram.ui.ActionBar.j6.Td));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.C0, 0, null, org.telegram.ui.ActionBar.j6.f19167j2, null, null, org.telegram.ui.ActionBar.j6.Sd));
            int i21 = 0;
            while (true) {
                TextView[] textViewArr = this.N0;
                if (i21 >= textViewArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.l6(textViewArr[i21], 4, null, null, null, null, org.telegram.ui.ActionBar.j6.Ae));
                i21++;
            }
            int i22 = 0;
            while (true) {
                TextView[] textViewArr2 = this.M0;
                if (i22 >= textViewArr2.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.l6(textViewArr2[i22], 4, null, null, null, null, org.telegram.ui.ActionBar.j6.Ae));
                i22++;
            }
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.T0, 0, new Class[]{org.telegram.ui.Components.to0.class}, new String[]{"innerPaint1"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Ti));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.T0, 0, new Class[]{org.telegram.ui.Components.to0.class}, new String[]{"outerPaint1"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Vi));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.S0, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38521u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f19224m3, org.telegram.ui.ActionBar.j6.f19298q3}, null, org.telegram.ui.ActionBar.j6.f19323ra));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38521u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f19244n3, org.telegram.ui.ActionBar.j6.f19316r3}, null, org.telegram.ui.ActionBar.j6.f19068dc));
            Drawable[] drawableArr = org.telegram.ui.ActionBar.j6.f19224m3.f18850y;
            int i23 = org.telegram.ui.ActionBar.j6.ta;
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38521u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, drawableArr, null, i23));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38521u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, org.telegram.ui.ActionBar.j6.f19298q3.f18850y, null, i23));
            org.telegram.ui.ActionBar.q5 q5Var = this.R;
            org.telegram.ui.ActionBar.q5 q5Var2 = this.T;
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38521u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{q5Var, q5Var2}, null, org.telegram.ui.ActionBar.j6.Aa));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38521u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{q5Var, q5Var2}, null, org.telegram.ui.ActionBar.j6.Da));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38521u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{q5Var, q5Var2}, null, org.telegram.ui.ActionBar.j6.Ea));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38521u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{q5Var, q5Var2}, null, org.telegram.ui.ActionBar.j6.Fa));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38521u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f19280p3, org.telegram.ui.ActionBar.j6.f19354t3}, null, org.telegram.ui.ActionBar.j6.Ba));
            Drawable[] drawableArr2 = org.telegram.ui.ActionBar.j6.f19261o3.f18850y;
            int i24 = org.telegram.ui.ActionBar.j6.Ca;
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38521u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, drawableArr2, null, i24));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38521u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, org.telegram.ui.ActionBar.j6.f19335s3.f18850y, null, i24));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38521u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.j6.ec));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38521u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19103fc));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38521u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.y3}, null, org.telegram.ui.ActionBar.j6.Ja));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38521u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f19461z3}, null, org.telegram.ui.ActionBar.j6.Ka));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38521u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.A3, org.telegram.ui.ActionBar.j6.C3}, null, org.telegram.ui.ActionBar.j6.La));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38521u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.B3, org.telegram.ui.ActionBar.j6.D3}, null, org.telegram.ui.ActionBar.j6.Ma));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38521u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.F3, org.telegram.ui.ActionBar.j6.G3}, null, org.telegram.ui.ActionBar.j6.f19344sc));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38521u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Uc));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38521u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19010ab));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38521u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Wc));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38521u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.j6.cb));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38521u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Yc));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38521u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19067db));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38521u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19012ad));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38521u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19102fb));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38521u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19252nd));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38521u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19343sb));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38521u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19270od));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38521u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.j6.nb));
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, wy0Var, org.telegram.ui.ActionBar.j6.f19063d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, wy0Var, org.telegram.ui.ActionBar.j6.f19133h5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, wy0Var, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, wy0Var, org.telegram.ui.ActionBar.j6.f19151i5));
        for (int i25 = 0; i25 < arrayList.size(); i25++) {
            ((org.telegram.ui.ActionBar.l6) arrayList.get(i25)).f19585o = this.f38467a;
        }
        return arrayList;
    }

    public final boolean T0(int i10) {
        int B0;
        long j3;
        if (this.f38488g0) {
            return false;
        }
        org.telegram.ui.ActionBar.g6 g6Var = this.f38516s;
        if (i10 == 1 || i10 == 2) {
            long j10 = this.I;
            if (j10 != 0) {
                if (j10 != g6Var.f18883j) {
                    return true;
                }
            } else {
                int B02 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Nd);
                int i11 = (int) g6Var.f18883j;
                if (i11 == 0) {
                    i11 = B02;
                }
                if (i11 != B02) {
                    return true;
                }
            }
            long j11 = this.L;
            long j12 = this.K;
            long j13 = this.J;
            if (j13 == 0 && j12 == 0 && j11 == 0) {
                for (int i12 = 0; i12 < 3; i12++) {
                    if (i12 == 0) {
                        B0 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Od);
                        j3 = g6Var.f18884k;
                    } else if (i12 == 1) {
                        B0 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Pd);
                        j3 = g6Var.f18885l;
                    } else {
                        B0 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Qd);
                        j3 = g6Var.f18886m;
                    }
                    int i13 = (int) j3;
                    if (i13 == 0 && j3 != 0) {
                        i13 = 0;
                    } else if (i13 == 0) {
                        i13 = B0;
                    }
                    if (i13 != B0) {
                        return true;
                    }
                }
            } else if (j13 != g6Var.f18884k || j12 != g6Var.f18885l || j11 != g6Var.f18886m) {
                return true;
            }
            if (g6Var.f18887n != this.O) {
                return true;
            }
        }
        if (i10 == 1 || i10 == 3) {
            if (this.f38525w != g6Var.d) {
                return true;
            }
            int i14 = this.f38531y;
            if (i14 != 0) {
                if (i14 != g6Var.e) {
                    return true;
                }
            } else {
                int i15 = g6Var.e;
                if (i15 != 0 && i15 != g6Var.f18879c) {
                    return true;
                }
            }
            int i16 = this.E;
            if (i16 != 0) {
                if (i16 != g6Var.f18880f) {
                    return true;
                }
            } else if (g6Var.f18880f != 0) {
                return true;
            }
            int i17 = this.F;
            if (i17 != 0) {
                if (i17 != g6Var.f18881g) {
                    return true;
                }
            } else if (g6Var.f18881g != 0) {
                return true;
            }
            int i18 = this.G;
            if (i18 != 0) {
                if (i18 != g6Var.h) {
                    return true;
                }
            } else if (g6Var.h != 0) {
                return true;
            }
            if (this.H != g6Var.f18882i) {
                return true;
            }
        }
        return false;
    }

    public boolean U0() {
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && d5Var.getBottomSheet() != null) {
            return true;
        }
        return false;
    }

    public final void V0() {
        float f7;
        t5 t5Var = this.Q1;
        if (t5Var != null) {
            t5Var.invalidate();
        }
        FrameLayout frameLayout = this.f38532y0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.f38532y0.getChildAt(i10).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.f38534z0;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                this.f38534z0.getChildAt(i11).invalidate();
            }
        }
        if (this.J0 != null) {
            int i12 = 0;
            while (true) {
                org.telegram.ui.Components.y81[] y81VarArr = this.J0;
                if (i12 >= y81VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.y81 y81Var = y81VarArr[i12];
                if (y81Var != null) {
                    if (this.M1) {
                        f7 = this.f38506n1 * this.f38508o1;
                    } else {
                        f7 = 0.0f;
                    }
                    y81Var.setDimAmount(f7);
                    this.J0[i12].invalidate();
                }
                i12++;
            }
        }
        if (this.f38505n0 != null) {
            for (int i13 = 0; i13 < this.f38505n0.getChildCount(); i13++) {
                View childAt = this.f38505n0.getChildAt(i13);
                if (childAt instanceof org.telegram.ui.Cells.w0) {
                    d1((org.telegram.ui.Cells.w0) childAt);
                    childAt.invalidate();
                }
            }
        }
        if (this.f38521u0 != null) {
            for (int i14 = 0; i14 < this.f38521u0.getChildCount(); i14++) {
                View childAt2 = this.f38521u0.getChildAt(i14);
                if (childAt2 instanceof org.telegram.ui.Cells.w0) {
                    d1((org.telegram.ui.Cells.w0) childAt2);
                    childAt2.invalidate();
                }
            }
        }
        ld1 ld1Var = this.f38535z1;
        if (ld1Var != null) {
            ld1Var.invalidate();
        }
        ld1 ld1Var2 = this.A1;
        if (ld1Var2 != null) {
            ld1Var2.invalidate();
        }
        u4 u4Var = this.C0;
        if (u4Var != null) {
            u4Var.invalidate();
        }
    }

    public final void W0() {
        org.telegram.ui.ActionBar.g6 g6Var = this.f38516s;
        if (g6Var != null && !TextUtils.isEmpty(g6Var.f18888o)) {
            try {
                File d = g6Var.d();
                Drawable background = this.f38529x0.getBackground();
                Bitmap bitmap = this.f38529x0.getImageReceiver().getBitmap();
                if (background instanceof org.telegram.ui.Components.lc0) {
                    FileOutputStream fileOutputStream = new FileOutputStream(d);
                    bitmap.compress(Bitmap.CompressFormat.PNG, 87, fileOutputStream);
                    fileOutputStream.close();
                    return;
                }
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                background.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                background.draw(canvas);
                Paint paint = new Paint(2);
                paint.setColorFilter(new PorterDuffColorFilter(this.f38498j1, this.f38518s1));
                paint.setAlpha((int) (this.l1 * 255.0f));
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                FileOutputStream fileOutputStream2 = new FileOutputStream(d);
                createBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream2);
                fileOutputStream2.close();
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
    }

    public final void X0() {
        Y0(2, true);
    }

    public final void Y0(int i10, boolean z10) {
        org.telegram.ui.ActionBar.g6 g6Var;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        if (getParentActivity() != null && this.f38504n != i10 && this.f38515r1 == null && (g6Var = this.f38516s) != null) {
            if (z10 && i10 == 2 && (org.telegram.ui.ActionBar.j6.Z0() || g6Var.f18883j == 4294967296L)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f18622a.R = LocaleController.getString(R.string.ChangeChatBackground);
                if (org.telegram.ui.ActionBar.j6.Z0() && (!org.telegram.ui.ActionBar.j6.Z0() || org.telegram.ui.ActionBar.j6.I.f18953i0.d == 0)) {
                    alertDialog$Builder.f18622a.T = LocaleController.getString(R.string.ChangeWallpaperToColor);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Change), new kc1(this, 7));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                } else {
                    alertDialog$Builder.f18622a.T = LocaleController.getString(R.string.ChangeColorToColor);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new kc1(this, 5));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Continue), new kc1(this, 6));
                }
                showDialog(alertDialog$Builder.f18622a);
                return;
            }
            int i18 = this.f38504n;
            this.f38504n = i10;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        this.h.setText(LocaleController.getString(R.string.ColorPickerMyMessages));
                        if (g6Var.f18880f != 0) {
                            if (g6Var.h != 0) {
                                i17 = 4;
                            } else if (g6Var.f18881g != 0) {
                                i17 = 3;
                            } else {
                                i17 = 2;
                            }
                        } else {
                            i17 = 1;
                        }
                        org.telegram.ui.Components.mq mqVar = this.V;
                        T0(3);
                        mqVar.f(2, 4, i17, true);
                        this.V.e(g6Var.h, 3);
                        this.V.e(g6Var.f18881g, 2);
                        this.V.e(g6Var.f18880f, 1);
                        org.telegram.ui.Components.mq mqVar2 = this.V;
                        int i19 = g6Var.e;
                        if (i19 == 0) {
                            i19 = g6Var.f18879c;
                        }
                        mqVar2.e(i19, 0);
                        this.K0[1].b(0, g6Var.e);
                        this.K0[1].b(1, g6Var.f18880f);
                        this.K0[1].b(2, g6Var.f18881g);
                        this.K0[1].b(3, g6Var.h);
                        if (g6Var.f18881g != 0) {
                            if (i18 == 1) {
                                this.f38523v0.o(0);
                            } else {
                                this.f38523v0.m(0);
                            }
                        } else if (i18 == 2) {
                            this.f38523v0.u(0);
                        }
                        this.f38521u0.w0(0, AndroidUtilities.dp(60.0f), null);
                        e1();
                    }
                } else {
                    this.h.setText(LocaleController.getString(R.string.ColorPickerBackground));
                    int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.Nd);
                    int i20 = org.telegram.ui.ActionBar.j6.Od;
                    if (org.telegram.ui.ActionBar.j6.c1(i20)) {
                        i12 = getThemedColor(i20);
                    } else {
                        i12 = 0;
                    }
                    int i21 = org.telegram.ui.ActionBar.j6.Pd;
                    if (org.telegram.ui.ActionBar.j6.c1(i21)) {
                        i13 = getThemedColor(i21);
                    } else {
                        i13 = 0;
                    }
                    int i22 = org.telegram.ui.ActionBar.j6.Qd;
                    if (org.telegram.ui.ActionBar.j6.c1(i22)) {
                        i14 = getThemedColor(i22);
                    } else {
                        i14 = 0;
                    }
                    long j3 = g6Var.f18884k;
                    int i23 = (int) j3;
                    if (i23 == 0 && j3 != 0) {
                        i12 = 0;
                    }
                    long j10 = g6Var.f18885l;
                    int i24 = (int) j10;
                    if (i24 == 0 && j10 != 0) {
                        i13 = 0;
                    }
                    long j11 = g6Var.f18886m;
                    int i25 = (int) j11;
                    if (i25 == 0 && j11 != 0) {
                        i14 = 0;
                    }
                    int i26 = (int) g6Var.f18883j;
                    if (i23 == 0 && i12 == 0) {
                        i15 = i24;
                        i16 = 1;
                    } else if (i25 == 0 && i14 == 0) {
                        if (i24 == 0 && i13 == 0) {
                            i15 = i24;
                            i16 = 2;
                        } else {
                            i15 = i24;
                            i16 = 3;
                        }
                    } else {
                        i15 = i24;
                        i16 = 4;
                    }
                    org.telegram.ui.Components.mq mqVar3 = this.V;
                    T0(2);
                    mqVar3.f(2, 4, i16, false);
                    org.telegram.ui.Components.mq mqVar4 = this.V;
                    if (i25 == 0) {
                        i25 = i14;
                    }
                    mqVar4.e(i25, 3);
                    org.telegram.ui.Components.mq mqVar5 = this.V;
                    if (i15 != 0) {
                        i13 = i15;
                    }
                    mqVar5.e(i13, 2);
                    org.telegram.ui.Components.mq mqVar6 = this.V;
                    if (i23 == 0) {
                        i23 = i12;
                    }
                    mqVar6.e(i23, 1);
                    org.telegram.ui.Components.mq mqVar7 = this.V;
                    if (i26 != 0) {
                        themedColor = i26;
                    }
                    mqVar7.e(themedColor, 0);
                    if (i18 != 1 && g6Var.f18881g != 0) {
                        this.f38523v0.m(0);
                    } else {
                        this.f38523v0.o(0);
                    }
                    this.f38521u0.w0(0, AndroidUtilities.dp(60.0f), null);
                }
            } else {
                this.h.setText(LocaleController.getString(R.string.ColorPickerMainColor));
                if (g6Var.d != 0) {
                    i11 = 2;
                } else {
                    i11 = 1;
                }
                org.telegram.ui.Components.mq mqVar8 = this.V;
                T0(1);
                mqVar8.f(1, 2, i11, false);
                this.V.e(g6Var.f18879c, 0);
                int i27 = g6Var.d;
                if (i27 != 0) {
                    this.V.e(i27, 1);
                }
                if (i18 == 2 || (i18 == 3 && g6Var.f18881g != 0)) {
                    this.f38523v0.u(0);
                }
            }
            if (i10 != 1 && i10 != 3) {
                this.V.setMinBrightness(0.0f);
                this.V.setMaxBrightness(1.0f);
                return;
            }
            if (i18 == 2 && this.L0[1].getVisibility() == 0) {
                f1(0, true, true);
            }
            if (i10 == 1) {
                if (this.f38481e0.q()) {
                    this.V.setMinBrightness(0.2f);
                    return;
                }
                this.V.setMinBrightness(0.05f);
                this.V.setMaxBrightness(0.8f);
                return;
            }
            this.V.setMinBrightness(0.0f);
            this.V.setMaxBrightness(1.0f);
        }
    }

    public final void Z0(int i10) {
        TLRPC.TL_wallPaper tL_wallPaper;
        if (i10 >= 0 && i10 < this.U0.size()) {
            tL_wallPaper = (TLRPC.TL_wallPaper) this.U0.get(i10);
        } else {
            tL_wallPaper = this.Y0;
        }
        TLRPC.TL_wallPaper tL_wallPaper2 = tL_wallPaper;
        if (tL_wallPaper2 == null) {
            return;
        }
        ValueAnimator valueAnimator = this.f38477c2;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f38477c2.cancel();
        }
        kd1[] kd1VarArr = this.f38526w0;
        kd1 kd1Var = kd1VarArr[0];
        kd1 kd1Var2 = kd1VarArr[1];
        kd1VarArr[0] = kd1Var2;
        kd1VarArr[1] = kd1Var;
        this.f38519t0.removeView(kd1Var2);
        this.f38519t0.addView(kd1VarArr[0], this.f38519t0.indexOfChild(kd1VarArr[1]) + 1);
        kd1 kd1Var3 = kd1VarArr[0];
        this.f38529x0 = kd1Var3;
        kd1Var3.setBackground(kd1VarArr[1].getBackground());
        k1();
        kd1VarArr[1].setVisibility(0);
        kd1VarArr[1].setAlpha(1.0f);
        this.f38529x0.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f38477c2 = ofFloat;
        ofFloat.addUpdateListener(new bj(2, this));
        this.f38477c2.addListener(new zc1(this, 0));
        this.f38477c2.setInterpolator(org.telegram.ui.Components.qr.f27715f);
        this.f38477c2.setDuration(300L);
        this.f38477c2.start();
        this.f38529x0.getImageReceiver().setCrossfadeDuration(300);
        this.f38529x0.getImageReceiver().setImage(ImageLocation.getForDocument(tL_wallPaper2.document), this.G1, null, null, null, tL_wallPaper2.document.size, "jpg", tL_wallPaper2, 1);
        this.f38529x0.d();
        this.W0 = tL_wallPaper2;
        this.E1 = this.J0[2].f30506s;
        j1();
    }

    public final void a1(int i10, int i11, boolean z10) {
        org.telegram.ui.Components.lc0 lc0Var;
        if (i11 == 0) {
            this.Z0 = i10;
        } else if (i11 == 1) {
            this.f38472b1 = i10;
        } else if (i11 == 2) {
            this.f38476c1 = i10;
        } else if (i11 == 3) {
            this.f38479d1 = i10;
        }
        m1(z10);
        if (this.J0 != null) {
            int i12 = 0;
            while (true) {
                org.telegram.ui.Components.y81[] y81VarArr = this.J0;
                if (i12 >= y81VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.y81 y81Var = y81VarArr[i12];
                if (y81Var != null) {
                    y81Var.b(i11, i10);
                }
                i12++;
            }
        }
        if (this.f38476c1 != 0) {
            if (this.T0 != null && org.telegram.ui.ActionBar.j6.I.q()) {
                this.T0.setTwoSided(true);
            }
            Drawable background = this.f38529x0.getBackground();
            if (background instanceof org.telegram.ui.Components.lc0) {
                lc0Var = (org.telegram.ui.Components.lc0) background;
            } else {
                lc0Var = new org.telegram.ui.Components.lc0();
                lc0Var.r(this.f38529x0);
                if (this.D1) {
                    lc0Var.m(false);
                }
            }
            lc0Var.n(this.Z0, this.f38472b1, this.f38476c1, this.f38479d1);
            this.f38529x0.setBackground(lc0Var);
            this.f38498j1 = lc0Var.f();
            this.f38501k1 = 754974720;
        } else if (this.f38472b1 != 0) {
            this.f38529x0.setBackground(new GradientDrawable(org.telegram.ui.Components.v9.d(this.f38492h1), new int[]{this.Z0, this.f38472b1}));
            int patternColor = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(this.Z0, this.f38472b1));
            this.f38501k1 = patternColor;
            this.f38498j1 = patternColor;
        } else {
            this.f38529x0.setBackgroundColor(this.Z0);
            int patternColor2 = AndroidUtilities.getPatternColor(this.Z0);
            this.f38501k1 = patternColor2;
            this.f38498j1 = patternColor2;
        }
        int i13 = org.telegram.ui.ActionBar.j6.f19214lc;
        boolean c12 = org.telegram.ui.ActionBar.j6.c1(i13);
        vc1 vc1Var = this.f38467a;
        if (c12 && !(this.f38529x0.getBackground() instanceof org.telegram.ui.Components.lc0)) {
            if (org.telegram.ui.ActionBar.j6.s0() instanceof org.telegram.ui.Components.lc0) {
                getThemedColor(i13);
                vc1Var.b(this.f38529x0.getBackground(), this.f38529x0.getBackground(), Float.valueOf(this.l1));
            }
        } else {
            vc1Var.b(this.f38529x0.getBackground(), this.f38529x0.getBackground(), Float.valueOf(this.l1));
        }
        ImageView imageView = this.F0;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.f19158ic), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.G0;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.f19158ic), PorterDuff.Mode.MULTIPLY));
        }
        kd1 kd1Var = this.f38529x0;
        if (kd1Var != null) {
            kd1Var.getImageReceiver().setColorFilter(new PorterDuffColorFilter(this.f38498j1, this.f38518s1));
            this.f38529x0.getImageReceiver().setAlpha(Math.abs(this.l1));
            this.f38529x0.invalidate();
            if (org.telegram.ui.ActionBar.j6.I.q() && (this.f38529x0.getBackground() instanceof org.telegram.ui.Components.lc0)) {
                org.telegram.ui.Cells.j0 j0Var = this.T0;
                if (j0Var != null) {
                    j0Var.setTwoSided(true);
                }
                if (this.l1 < 0.0f) {
                    this.f38529x0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.lc0) this.f38529x0.getBackground()).f26109k);
                }
            } else {
                this.f38529x0.getImageReceiver().setGradientBitmap(null);
                org.telegram.ui.Cells.j0 j0Var2 = this.T0;
                if (j0Var2 != null) {
                    j0Var2.setTwoSided(false);
                }
            }
            org.telegram.ui.Cells.j0 j0Var3 = this.T0;
            if (j0Var3 != null) {
                j0Var3.setProgress(this.l1);
            }
        }
        qc1 qc1Var = this.f38521u0;
        if (qc1Var != null) {
            qc1Var.g1();
        }
        FrameLayout frameLayout = this.f38532y0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                this.f38532y0.getChildAt(i14).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.f38534z0;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                this.f38534z0.getChildAt(i15).invalidate();
            }
        }
    }

    public final void b1(boolean z10) {
        org.telegram.ui.Components.lc0 lc0Var;
        org.telegram.ui.Components.lc0 lc0Var2;
        int i10;
        int g10;
        TLRPC.PhotoSize photoSize;
        org.telegram.ui.ActionBar.g6 g6Var = this.f38516s;
        int i11 = this.f38470b;
        if (i11 == 0 && g6Var == null) {
            this.f38529x0.setBackground(org.telegram.ui.ActionBar.j6.r0());
        } else {
            TLRPC.PhotoSize photoSize2 = null;
            BitmapDrawable bitmapDrawable = null;
            if (i11 == 2) {
                Object obj = this.B1;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
                    if (z10) {
                        photoSize = FileLoader.getClosestPhotoSizeWithSize(tL_wallPaper.document.thumbs, 100);
                    } else {
                        photoSize = null;
                    }
                    if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                        bitmapDrawable = new BitmapDrawable(ImageLoader.getStrippedPhotoBitmap(photoSize.bytes, "b"));
                    }
                    kd1 kd1Var = this.f38529x0;
                    kd1Var.f29987a.setImage(ImageLocation.getForDocument(tL_wallPaper.document), this.G1, ImageLocation.getForDocument(photoSize, tL_wallPaper.document), "100_100_b", bitmapDrawable, tL_wallPaper.document.size, "jpg", tL_wallPaper, 1);
                    kd1Var.d();
                } else if (obj instanceof ej1) {
                    ej1 ej1Var = (ej1) obj;
                    int i12 = ej1Var.f33296f;
                    int i13 = ej1Var.e;
                    int i14 = ej1Var.d;
                    int i15 = ej1Var.f33295c;
                    int i16 = ej1Var.f33294b;
                    this.f38492h1 = i12;
                    a1(i16, 0, false);
                    if (i15 != 0) {
                        a1(i15, 1, false);
                    }
                    a1(i14, 2, false);
                    a1(i13, 3, false);
                    TLRPC.TL_wallPaper tL_wallPaper2 = this.W0;
                    if (tL_wallPaper2 != null) {
                        kd1 kd1Var2 = this.f38529x0;
                        ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                        String str = this.G1;
                        TLRPC.TL_wallPaper tL_wallPaper3 = this.W0;
                        kd1Var2.k(forDocument, str, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                    } else if ("d".equals(ej1Var.f33293a)) {
                        Point point = AndroidUtilities.displaySize;
                        int min = Math.min(point.x, point.y);
                        Point point2 = AndroidUtilities.displaySize;
                        int max = Math.max(point2.x, point2.y);
                        if (Build.VERSION.SDK_INT >= 29) {
                            g10 = 1459617792;
                        } else {
                            g10 = org.telegram.ui.Components.lc0.g(i16, i15, i14, i13);
                        }
                        this.f38529x0.setImageBitmap(SvgHelper.getBitmap(R.raw.default_pattern, min, max, g10));
                    }
                } else if (obj instanceof fj1) {
                    Bitmap bitmap = this.C1;
                    if (bitmap != null) {
                        this.f38529x0.setImageBitmap(bitmap);
                    } else {
                        fj1 fj1Var = (fj1) obj;
                        File file = fj1Var.e;
                        if (file != null) {
                            this.f38529x0.f(file.getAbsolutePath(), this.G1, null);
                        } else {
                            File file2 = fj1Var.d;
                            if (file2 != null) {
                                this.f38529x0.f(file2.getAbsolutePath(), this.G1, null);
                            } else if ("t".equals(fj1Var.f33568a)) {
                                kd1 kd1Var3 = this.f38529x0;
                                kd1Var3.setImageDrawable(org.telegram.ui.ActionBar.j6.W0(kd1Var3, false));
                            } else {
                                int i17 = fj1Var.f33569b;
                                if (i17 != 0) {
                                    this.f38529x0.setImageResource(i17);
                                }
                            }
                        }
                    }
                } else if (obj instanceof MediaController.SearchImage) {
                    MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                    TLRPC.Photo photo = searchImage.photo;
                    if (photo != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 100);
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(searchImage.photo.sizes, this.H1, true);
                        if (closestPhotoSizeWithSize2 != closestPhotoSizeWithSize) {
                            photoSize2 = closestPhotoSizeWithSize2;
                        }
                        if (photoSize2 != null) {
                            i10 = photoSize2.size;
                        } else {
                            i10 = 0;
                        }
                        this.f38529x0.k(ImageLocation.getForPhoto(photoSize2, searchImage.photo), this.G1, ImageLocation.getForPhoto(closestPhotoSizeWithSize, searchImage.photo), "100_100_b", i10, "jpg", searchImage, 1);
                    } else {
                        kd1 kd1Var4 = this.f38529x0;
                        String str2 = searchImage.imageUrl;
                        String str3 = this.G1;
                        String str4 = searchImage.thumbUrl;
                        kd1Var4.getClass();
                        kd1Var4.m(ImageLocation.getForPath(str2), str3, ImageLocation.getForPath(str4), "100_100_b", null, null, 0, null);
                    }
                }
            } else if (g6Var == null) {
                this.f38529x0.setBackground(org.telegram.ui.ActionBar.j6.r0());
            } else {
                org.telegram.ui.Components.q9 q9Var = this.f38522u1;
                if (q9Var != null) {
                    q9Var.dispose();
                    this.f38522u1 = null;
                }
                int B0 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Nd);
                int i18 = (int) g6Var.f18883j;
                if (i18 != 0) {
                    B0 = i18;
                }
                int B02 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Od);
                long j3 = g6Var.f18884k;
                int i19 = (int) j3;
                if (i19 == 0 && j3 != 0) {
                    B02 = 0;
                } else if (i19 != 0) {
                    B02 = i19;
                }
                int B03 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Pd);
                long j10 = g6Var.f18885l;
                int i20 = (int) j10;
                if (i20 == 0 && j10 != 0) {
                    B03 = 0;
                } else if (i20 != 0) {
                    B03 = i20;
                }
                int B04 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Qd);
                long j11 = g6Var.f18886m;
                int i21 = (int) j11;
                if (i21 == 0 && j11 != 0) {
                    B04 = 0;
                } else if (i21 != 0) {
                    B04 = i21;
                }
                if (!TextUtils.isEmpty(g6Var.f18888o) && !org.telegram.ui.ActionBar.j6.Z0()) {
                    if (B03 != 0) {
                        Drawable background = this.f38529x0.getBackground();
                        if (background instanceof org.telegram.ui.Components.lc0) {
                            lc0Var2 = (org.telegram.ui.Components.lc0) background;
                        } else {
                            org.telegram.ui.Components.lc0 lc0Var3 = new org.telegram.ui.Components.lc0();
                            lc0Var3.r(this.f38529x0);
                            lc0Var2 = lc0Var3;
                            if (this.D1) {
                                lc0Var3.m(false);
                                lc0Var2 = lc0Var3;
                            }
                        }
                        lc0Var2.n(B0, B02, B03, B04);
                        lc0Var = lc0Var2;
                    } else if (B02 != 0) {
                        org.telegram.ui.Components.v9 v9Var = new org.telegram.ui.Components.v9(org.telegram.ui.Components.v9.d(g6Var.f18887n), new int[]{B0, B02});
                        this.f38522u1 = v9Var.f(n2.e.E(0.5f, 3), new dd1(this, 0), 100L);
                        lc0Var = v9Var;
                    } else {
                        lc0Var = new ColorDrawable(B0);
                    }
                    this.f38529x0.setBackground(lc0Var);
                    TLRPC.TL_wallPaper tL_wallPaper4 = this.W0;
                    if (tL_wallPaper4 != null) {
                        kd1 kd1Var5 = this.f38529x0;
                        ImageLocation forDocument2 = ImageLocation.getForDocument(tL_wallPaper4.document);
                        String str5 = this.G1;
                        TLRPC.TL_wallPaper tL_wallPaper5 = this.W0;
                        kd1Var5.k(forDocument2, str5, null, null, tL_wallPaper5.document.size, "jpg", tL_wallPaper5, 1);
                    }
                } else {
                    Drawable s02 = org.telegram.ui.ActionBar.j6.s0();
                    if (s02 != null) {
                        if (s02 instanceof org.telegram.ui.Components.lc0) {
                            ((org.telegram.ui.Components.lc0) s02).r(this.f38529x0);
                        }
                        this.f38529x0.setBackground(s02);
                    }
                }
                if (B02 == 0) {
                    int patternColor = AndroidUtilities.getPatternColor(B0);
                    this.f38501k1 = patternColor;
                    this.f38498j1 = patternColor;
                } else if (B03 != 0) {
                    this.f38498j1 = org.telegram.ui.Components.lc0.g(B0, B02, B03, B04);
                    this.f38501k1 = 754974720;
                } else {
                    int patternColor2 = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(B0, B02));
                    this.f38501k1 = patternColor2;
                    this.f38498j1 = patternColor2;
                }
                kd1 kd1Var6 = this.f38529x0;
                if (kd1Var6 != null) {
                    kd1Var6.getImageReceiver().setColorFilter(new PorterDuffColorFilter(this.f38498j1, this.f38518s1));
                    this.f38529x0.getImageReceiver().setAlpha(Math.abs(this.l1));
                    this.f38529x0.invalidate();
                    if (org.telegram.ui.ActionBar.j6.I.q() && (this.f38529x0.getBackground() instanceof org.telegram.ui.Components.lc0)) {
                        org.telegram.ui.Cells.j0 j0Var = this.T0;
                        if (j0Var != null) {
                            j0Var.setTwoSided(true);
                        }
                        if (this.l1 < 0.0f) {
                            this.f38529x0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.lc0) this.f38529x0.getBackground()).f26109k);
                        }
                    } else {
                        this.f38529x0.getImageReceiver().setGradientBitmap(null);
                        org.telegram.ui.Cells.j0 j0Var2 = this.T0;
                        if (j0Var2 != null) {
                            j0Var2.setTwoSided(false);
                        }
                    }
                    org.telegram.ui.Cells.j0 j0Var3 = this.T0;
                    if (j0Var3 != null) {
                        j0Var3.setProgress(this.l1);
                    }
                }
                if (this.J0 != null) {
                    int i22 = 0;
                    while (true) {
                        org.telegram.ui.Components.y81[] y81VarArr = this.J0;
                        if (i22 >= y81VarArr.length) {
                            break;
                        }
                        y81VarArr[i22].b(0, B0);
                        this.J0[i22].b(1, B02);
                        this.J0[i22].b(2, B03);
                        this.J0[i22].b(3, B04);
                        i22++;
                    }
                }
                ImageView imageView = this.F0;
                if (imageView != null) {
                    imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.f19158ic), PorterDuff.Mode.MULTIPLY));
                }
                ImageView imageView2 = this.G0;
                if (imageView2 != null) {
                    imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.f19158ic), PorterDuff.Mode.MULTIPLY));
                }
                V0();
            }
        }
        this.D1 = false;
    }

    public final void c1(long j3) {
        boolean z10;
        this.J1 = j3;
        if (j3 != 0 && j3 != getUserConfig().getClientUserId()) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.K1 = z10;
    }

    @Override
    public final android.view.View createView(android.content.Context r48) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vd1.createView(android.content.Context):android.view.View");
    }

    public final void d1(org.telegram.ui.Cells.w0 w0Var) {
        vc1 vc1Var;
        float f7;
        if (this.f38529x0 == null) {
            return;
        }
        Bitmap bitmap = this.f38467a.f38458r;
        float f10 = 0.0f;
        if (bitmap != null) {
            float width = bitmap.getWidth();
            f7 = ((this.f38529x0.getMeasuredWidth() - (Math.max(this.f38529x0.getMeasuredWidth() / width, this.f38529x0.getMeasuredHeight() / vc1Var.f38458r.getHeight()) * width)) / 2.0f) + this.X1 + 0.0f;
        } else {
            f7 = this.X1 + 0.0f;
        }
        float y3 = w0Var.getY() - ((-this.f38529x0.J) + 0.0f);
        int measuredHeight = this.f38529x0.getMeasuredHeight();
        if (this.M1) {
            f10 = this.f38506n1 * this.f38508o1;
        }
        w0Var.f21739w0 = true;
        w0Var.f21736v0 = measuredHeight;
        w0Var.f21732t0 = y3;
        w0Var.f21734u0 = f7;
        w0Var.S1 = f10;
        w0Var.T1.setColor(i0.a.k(-16777216, (int) (f10 * 255.0f)));
        w0Var.invalidate();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        if (i10 == NotificationCenter.chatWasBoostedByUser) {
            if (this.J1 == ((Long) objArr[2]).longValue()) {
                this.V1 = (TL_stories.TL_premium_boostsStatus) objArr[0];
                h1(true);
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            org.telegram.ui.Components.wl0 wl0Var = this.f38505n0;
            if (wl0Var != null) {
                int childCount = wl0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.f38505n0.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.s2) {
                        ((org.telegram.ui.Cells.s2) childAt).b0(0, true);
                    }
                }
            }
        } else if (i10 == NotificationCenter.invalidateMotionBackground) {
            qc1 qc1Var = this.f38521u0;
            if (qc1Var != null) {
                qc1Var.g1();
            }
        } else if (i10 == NotificationCenter.didSetNewWallpapper) {
            if (this.f38519t0 != null) {
                b1(true);
            }
        } else if (i10 == NotificationCenter.wallpapersNeedReload) {
            Object obj = this.B1;
            if (obj instanceof fj1) {
                fj1 fj1Var = (fj1) obj;
                if (fj1Var.f33568a == null) {
                    fj1Var.f33568a = (String) objArr[0];
                }
            }
        } else {
            long j3 = 0;
            if (i10 == NotificationCenter.wallpapersDidLoad) {
                ArrayList arrayList = (ArrayList) objArr[0];
                this.U0.clear();
                HashMap hashMap = this.V0;
                hashMap.clear();
                int size = arrayList.size();
                boolean z10 = false;
                for (int i13 = 0; i13 < size; i13++) {
                    TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) arrayList.get(i13);
                    if ((wallPaper instanceof TLRPC.TL_wallPaper) && wallPaper.pattern) {
                        TLRPC.Document document = wallPaper.document;
                        if (document != null && !hashMap.containsKey(Long.valueOf(document.f18302id))) {
                            this.U0.add(wallPaper);
                            hashMap.put(Long.valueOf(wallPaper.document.f18302id), wallPaper);
                        }
                        org.telegram.ui.ActionBar.g6 g6Var = this.f38516s;
                        if (g6Var != null && (str = g6Var.f18888o) != null && str.equals(wallPaper.slug)) {
                            this.W0 = (TLRPC.TL_wallPaper) wallPaper;
                            b1(false);
                            j1();
                        } else if (g6Var == null) {
                            TLRPC.TL_wallPaper tL_wallPaper2 = this.W0;
                            if (tL_wallPaper2 != null) {
                                String str2 = tL_wallPaper2.slug;
                                if (str2 != null) {
                                    if (!str2.equals(wallPaper.slug)) {
                                    }
                                }
                            }
                        }
                        z10 = true;
                    }
                }
                if (!z10 && (tL_wallPaper = this.W0) != null) {
                    this.U0.add(0, tL_wallPaper);
                }
                td1 td1Var = this.Q0;
                if (td1Var != null) {
                    td1Var.l();
                }
                int size2 = arrayList.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) arrayList.get(i14);
                    if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                        j3 = MediaDataController.calcHash(j3, wallPaper2.f18448id);
                    }
                }
                TL_account.getWallPapers getwallpapers = new TL_account.getWallPapers();
                getwallpapers.hash = j3;
                ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new oc1(this, 1)), this.classGuid);
            } else if (i10 == NotificationCenter.wallpaperSettedToUser && this.J1 != 0) {
                finishFragment();
            }
        }
    }

    public final void e1() {
        if (this.f38519t0 != null && this.K0 != null && this.f38516s.f18881g != 0) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("bganimationhint", false)) {
                if (this.A0 == null) {
                    org.telegram.ui.Components.i40 i40Var = new org.telegram.ui.Components.i40(getParentActivity(), 8);
                    this.A0 = i40Var;
                    i40Var.setShowingDuration(5000L);
                    this.A0.setAlpha(0.0f);
                    this.A0.setVisibility(4);
                    this.A0.setText(LocaleController.getString(R.string.BackgroundAnimateInfo));
                    this.A0.setExtraTranslationY(AndroidUtilities.dp(6.0f));
                    this.f38500k0.addView(this.A0, w7.y5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                }
                AndroidUtilities.runOnUIThread(new x81(5, this, globalMainSettings), 500L);
            }
        }
    }

    public final void f1(int i10, boolean z10, boolean z11) {
        boolean z12;
        char c10;
        char c11;
        FrameLayout frameLayout;
        float f7;
        int i11;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        int i12;
        FrameLayout frameLayout2;
        int i13;
        float f15;
        FrameLayout frameLayout3;
        float f16;
        float f17;
        float f18;
        int i14;
        int i15;
        int i16;
        char c12 = 0;
        if (z10 && i10 == 1 && this.W0 != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        int i17 = this.f38470b;
        if (z10) {
            if (i10 == 0) {
                if (i17 == 2) {
                    this.f38469a1 = this.Z0;
                    int i18 = this.f38472b1;
                    this.f38482e1 = i18;
                    int i19 = this.f38476c1;
                    this.f38486f1 = i19;
                    int i20 = this.f38479d1;
                    this.f38489g1 = i20;
                    this.f38495i1 = this.O;
                    if (i20 != 0) {
                        i16 = 4;
                    } else if (i19 != 0) {
                        i16 = 3;
                    } else if (i18 != 0) {
                        i16 = 2;
                    } else {
                        i16 = 1;
                    }
                    this.V.f(0, 4, i16, false);
                    this.V.e(this.f38479d1, 3);
                    this.V.e(this.f38476c1, 2);
                    this.V.e(this.f38472b1, 1);
                    this.V.e(this.Z0, 0);
                }
            } else {
                this.X0 = this.W0;
                this.f38503m1 = this.l1;
                this.Q0.l();
                ArrayList arrayList = this.U0;
                if (arrayList != null) {
                    TLRPC.TL_wallPaper tL_wallPaper = this.W0;
                    if (tL_wallPaper == null) {
                        i15 = 0;
                    } else {
                        int indexOf = arrayList.indexOf(tL_wallPaper);
                        if (i17 == 2) {
                            i14 = 1;
                        } else {
                            i14 = 0;
                        }
                        i15 = indexOf + i14;
                    }
                    this.R0.h1(i15, (this.P0.getMeasuredWidth() - AndroidUtilities.dp(124.0f)) / 2);
                }
            }
        }
        if (i17 == 1 || i17 == 2) {
            org.telegram.ui.Components.y81[] y81VarArr = this.J0;
            if (z12) {
                c10 = 2;
            } else {
                c10 = 0;
            }
            y81VarArr[c10].setVisibility(0);
        }
        if (i10 == 1) {
            org.telegram.ui.Cells.j0 j0Var = this.T0;
            if (!j0Var.L) {
                float f19 = this.l1;
                if (f19 < 0.0f) {
                    float f20 = -f19;
                    this.l1 = f20;
                    j0Var.setProgress(f20);
                }
            }
        }
        int i21 = 58;
        float f21 = 1.0f;
        FrameLayout[] frameLayoutArr = this.L0;
        if (z11) {
            this.f38515r1 = new AnimatorSet();
            ArrayList arrayList2 = new ArrayList();
            if (i10 == 0) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            if (z10) {
                frameLayoutArr[i10].setVisibility(0);
                if (i17 == 1) {
                    qc1 qc1Var = this.f38521u0;
                    Property property = View.TRANSLATION_Y;
                    if (i10 == 1) {
                        f16 = -AndroidUtilities.dp(21.0f);
                    } else {
                        f16 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(qc1Var, property, f16));
                    org.telegram.ui.Components.y81 y81Var = this.J0[2];
                    Property property2 = View.ALPHA;
                    if (z12) {
                        f17 = 1.0f;
                    } else {
                        f17 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(y81Var, property2, f17));
                    org.telegram.ui.Components.y81 y81Var2 = this.J0[0];
                    if (z12) {
                        f18 = 0.0f;
                    } else {
                        f18 = 1.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(y81Var2, property2, f18));
                    if (i10 == 1) {
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], property2, 0.0f, 1.0f));
                    } else {
                        frameLayoutArr[i10].setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i12], property2, 0.0f));
                    }
                    AndroidUtilities.hideKeyboard(this.V.E[1]);
                } else if (i17 == 2) {
                    qc1 qc1Var2 = this.f38521u0;
                    Property property3 = View.TRANSLATION_Y;
                    int i22 = -frameLayoutArr[i10].getMeasuredHeight();
                    if (this.A1 == null) {
                        i21 = 0;
                    }
                    int dp = AndroidUtilities.dp(i21 + 72) + i22;
                    if (U0()) {
                        i13 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i13 = 0;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(qc1Var2, property3, dp + i13));
                    org.telegram.ui.Components.y81 y81Var3 = this.J0[2];
                    Property property4 = View.ALPHA;
                    if (z12) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(y81Var3, property4, f15));
                    org.telegram.ui.Components.y81 y81Var4 = this.J0[0];
                    if (z12) {
                        f21 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(y81Var4, property4, f21));
                    if (frameLayoutArr[i12].getVisibility() == 0) {
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i12], property4, 0.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], property4, 0.0f, 1.0f));
                        frameLayoutArr[i10].setTranslationY(0.0f);
                    } else {
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], property3, frameLayout3.getMeasuredHeight(), 0.0f));
                    }
                } else {
                    if (i10 == 1) {
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], View.ALPHA, 0.0f, 1.0f));
                    } else {
                        frameLayoutArr[i10].setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i12], View.ALPHA, 0.0f));
                    }
                    AndroidUtilities.hideKeyboard(this.V.E[1]);
                }
            } else {
                qc1 qc1Var3 = this.f38521u0;
                Property property5 = View.TRANSLATION_Y;
                arrayList2.add(ObjectAnimator.ofFloat(qc1Var3, property5, 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], property5, frameLayout2.getMeasuredHeight()));
                org.telegram.ui.Components.y81 y81Var5 = this.J0[0];
                Property property6 = View.ALPHA;
                arrayList2.add(ObjectAnimator.ofFloat(y81Var5, property6, 1.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.J0[2], property6, 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.f38529x0, property6, 1.0f));
            }
            this.f38515r1.playTogether(arrayList2);
            this.f38515r1.addListener(new cd1(this, z10, i12, i10, z12));
            this.f38515r1.setInterpolator(org.telegram.ui.Components.qr.f27716g);
            this.f38515r1.setDuration(200L);
            this.f38515r1.start();
            return;
        }
        if (i10 == 0) {
            c11 = 1;
        } else {
            c11 = 0;
        }
        if (z10) {
            frameLayoutArr[i10].setVisibility(0);
            if (i17 == 1) {
                qc1 qc1Var4 = this.f38521u0;
                if (i10 == 1) {
                    f12 = -AndroidUtilities.dp(21.0f);
                } else {
                    f12 = 0.0f;
                }
                qc1Var4.setTranslationY(f12);
                org.telegram.ui.Components.y81 y81Var6 = this.J0[2];
                if (z12) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                y81Var6.setAlpha(f13);
                org.telegram.ui.Components.y81 y81Var7 = this.J0[0];
                if (z12) {
                    f14 = 0.0f;
                } else {
                    f14 = 1.0f;
                }
                y81Var7.setAlpha(f14);
                if (i10 == 1) {
                    frameLayoutArr[i10].setAlpha(1.0f);
                } else {
                    frameLayoutArr[i10].setAlpha(1.0f);
                    frameLayoutArr[c11].setAlpha(0.0f);
                }
                AndroidUtilities.hideKeyboard(this.V.E[1]);
            } else if (i17 == 2) {
                qc1 qc1Var5 = this.f38521u0;
                if (i10 == 0) {
                    f7 = 343.0f;
                } else {
                    f7 = 316.0f;
                }
                int i23 = -AndroidUtilities.dp(f7);
                if (this.A1 == null) {
                    i21 = 0;
                }
                int dp2 = AndroidUtilities.dp(i21 + 72) + i23;
                if (U0()) {
                    i11 = AndroidUtilities.navigationBarHeight;
                } else {
                    i11 = 0;
                }
                qc1Var5.setTranslationY(dp2 + i11);
                org.telegram.ui.Components.y81 y81Var8 = this.J0[2];
                if (z12) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                y81Var8.setAlpha(f10);
                org.telegram.ui.Components.y81 y81Var9 = this.J0[0];
                if (z12) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                y81Var9.setAlpha(f11);
                if (frameLayoutArr[c11].getVisibility() == 0) {
                    frameLayoutArr[c11].setAlpha(0.0f);
                    frameLayoutArr[i10].setAlpha(1.0f);
                    frameLayoutArr[i10].setTranslationY(0.0f);
                } else {
                    frameLayoutArr[i10].setTranslationY(0.0f);
                }
            } else {
                if (i10 == 1) {
                    frameLayoutArr[i10].setAlpha(1.0f);
                } else {
                    frameLayoutArr[i10].setAlpha(1.0f);
                    frameLayoutArr[c11].setAlpha(0.0f);
                }
                AndroidUtilities.hideKeyboard(this.V.E[1]);
            }
        } else {
            this.f38521u0.setTranslationY(0.0f);
            frameLayoutArr[i10].setTranslationY(frameLayout.getMeasuredHeight());
            this.J0[0].setAlpha(1.0f);
            this.J0[2].setAlpha(1.0f);
            this.f38529x0.setAlpha(1.0f);
        }
        if (z10 && frameLayoutArr[c11].getVisibility() == 0) {
            frameLayoutArr[c11].setAlpha(1.0f);
            frameLayoutArr[c11].setVisibility(4);
        } else if (!z10) {
            frameLayoutArr[i10].setVisibility(4);
        }
        if (i17 != 1 && i17 != 2) {
            if (i10 == 1) {
                frameLayoutArr[c11].setAlpha(0.0f);
                return;
            }
            return;
        }
        org.telegram.ui.Components.y81[] y81VarArr2 = this.J0;
        if (!z12) {
            c12 = 2;
        }
        y81VarArr2[c12].setVisibility(4);
    }

    public final void g1() {
        Window window;
        if (this.f38493h2 != null) {
            return;
        }
        if (U0()) {
            window = this.parentLayout.getBottomSheet().getWindow();
        } else {
            window = getParentActivity().getWindow();
        }
        FrameLayout frameLayout = (FrameLayout) window.getDecorView();
        Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        this.O1.setAlpha(0.0f);
        frameLayout.draw(canvas);
        this.O1.setAlpha(1.0f);
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        paint2.setFilterBitmap(true);
        int[] iArr = new int[2];
        this.O1.getLocationInWindow(iArr);
        float f7 = iArr[0];
        float f10 = iArr[1];
        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        mc mcVar = new mc(this, getParentActivity(), canvas, (this.O1.getMeasuredWidth() / 2.0f) + f7, (this.O1.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 2);
        this.f38493h2 = mcVar;
        mcVar.setOnTouchListener(new bi.d(2));
        this.f38496i2 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f38499j2 = ofFloat;
        ofFloat.addUpdateListener(new ci.xb(this, 3));
        this.f38499j2.addListener(new zc1(this, 4));
        this.f38499j2.setDuration(400L);
        this.f38499j2.setInterpolator(org.telegram.ui.Components.kt.e);
        this.f38499j2.start();
        frameLayout.addView(this.f38493h2, new ViewGroup.LayoutParams(-1, -1));
        AndroidUtilities.runOnUIThread(new ic1(this, 2));
    }

    @Override
    public final int getObserverTag() {
        return this.f38520t1;
    }

    @Override
    public final org.telegram.ui.ActionBar.e6 getResourceProvider() {
        return this.f38467a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        if (this.L1) {
            return S0();
        }
        return super.getThemeDescriptions();
    }

    public final void h1(boolean z10) {
        int i10 = (this.J1 > 0L ? 1 : (this.J1 == 0L ? 0 : -1));
        if (i10 > 0) {
            this.f38535z1.d(LocaleController.getString(R.string.ApplyWallpaperForMe));
        } else if (i10 < 0) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.J1));
            if (chat != null) {
                this.f38535z1.d(LocaleController.formatString(R.string.ApplyWallpaperForChannel, chat.title));
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.V1;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < R0()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                    if (this.f38512q1 == null) {
                        org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(R.drawable.mini_switch_lock, 0);
                        this.f38512q1 = oqVar;
                        oqVar.setTopOffset(1);
                    }
                    spannableStringBuilder.setSpan(this.f38512q1, 0, 1, 33);
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.formatPluralString("ReactionLevelRequiredBtn", R0(), new Object[0]));
                    this.f38535z1.c(spannableStringBuilder, z10);
                    return;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.V1;
                if (tL_premium_boostsStatus2 == null) {
                    if (this.J1 < 0 && !this.T1 && !this.U1 && tL_premium_boostsStatus2 == null) {
                        this.T1 = true;
                        getMessagesController().getBoostsController().getBoostsStats(this.J1, new nc1(this, 0));
                        return;
                    }
                    return;
                }
                this.f38535z1.c(null, z10);
                return;
            }
            this.f38535z1.d(LocaleController.formatString(R.string.ApplyWallpaperForChannel, LocaleController.getString(R.string.AccDescrChannel).toLowerCase()));
        } else {
            this.f38535z1.d(LocaleController.getString(R.string.ApplyWallpaper));
        }
    }

    public final void i1() {
        if (this.F1 && this.f38527w1 == null) {
            Bitmap bitmap = this.C1;
            if (bitmap != null) {
                this.f38530x1 = bitmap;
                this.f38527w1 = Utilities.blurWallpaper(bitmap);
            } else {
                ImageReceiver imageReceiver = this.f38529x0.getImageReceiver();
                if (imageReceiver.hasNotThumb() || imageReceiver.hasStaticThumb()) {
                    this.f38530x1 = imageReceiver.getBitmap();
                    this.f38527w1 = Utilities.blurWallpaper(imageReceiver.getBitmap());
                }
            }
        }
        if (this.F1) {
            Bitmap bitmap2 = this.f38527w1;
            if (bitmap2 != null) {
                this.f38529x0.setImageBitmap(bitmap2);
                return;
            }
            return;
        }
        b1(false);
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.f38470b == 2) {
            if (this.a2 && motionEvent != null) {
                if (motionEvent.getY() > org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public final void j1() {
        File httpFilePath;
        String name;
        int i10;
        long j3;
        File file;
        String str;
        float f7;
        FrameLayout frameLayout;
        float f10;
        Object obj = this.W0;
        if (obj == null) {
            obj = this.B1;
        }
        boolean z10 = obj instanceof TLRPC.TL_wallPaper;
        if (z10 || (obj instanceof MediaController.SearchImage)) {
            if (z10) {
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
                str = FileLoader.getAttachFileName(tL_wallPaper.document);
                if (!TextUtils.isEmpty(str)) {
                    file = FileLoader.getInstance(this.currentAccount).getPathToAttach(tL_wallPaper.document, true);
                    j3 = tL_wallPaper.document.size;
                } else {
                    return;
                }
            } else {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                TLRPC.Photo photo = searchImage.photo;
                if (photo != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, this.H1, true);
                    httpFilePath = FileLoader.getInstance(this.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true);
                    name = FileLoader.getAttachFileName(closestPhotoSizeWithSize);
                    i10 = closestPhotoSizeWithSize.size;
                } else {
                    httpFilePath = ImageLoader.getHttpFilePath(searchImage.imageUrl, "jpg");
                    name = httpFilePath.getName();
                    i10 = searchImage.size;
                }
                j3 = i10;
                String str2 = name;
                file = httpFilePath;
                str = str2;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
            }
            boolean exists = file.exists();
            int i11 = this.f38470b;
            if (exists) {
                DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
                this.f38529x0.invalidate();
                if (i11 == 2) {
                    if (j3 != 0 && this.J1 == 0) {
                        this.f38517s0.setSubtitle(AndroidUtilities.formatFileSize(j3));
                    } else {
                        this.f38517s0.setSubtitle(null);
                    }
                }
            } else {
                DownloadController.getInstance(this.currentAccount).addLoadingFileObserver(str, null, this);
                if (i11 == 2 && this.J1 == 0) {
                    this.f38517s0.setSubtitle(LocaleController.getString(R.string.LoadingFullImage));
                }
                this.f38529x0.invalidate();
            }
            float f11 = 0.5f;
            if (this.W0 == null && (frameLayout = this.f38532y0) != null) {
                if (exists) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.5f;
                }
                frameLayout.setAlpha(f10);
            }
            if (i11 == 0) {
                this.f38475c0.setEnabled(exists);
                TextView textView = this.f38475c0;
                if (exists) {
                    f11 = 1.0f;
                }
                textView.setAlpha(f11);
            } else if (i11 == 2) {
                this.C0.setEnabled(exists);
                ld1 ld1Var = this.f38535z1;
                if (ld1Var != null) {
                    if (exists) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.5f;
                    }
                    ld1Var.setAlpha(f7);
                }
                ld1 ld1Var2 = this.A1;
                if (ld1Var2 != null) {
                    if (exists) {
                        f11 = 1.0f;
                    }
                    ld1Var2.setAlpha(f11);
                }
            } else {
                this.f38484f.setEnabled(exists);
                org.telegram.ui.ActionBar.v0 v0Var = this.f38484f;
                if (exists) {
                    f11 = 1.0f;
                }
                v0Var.setAlpha(f11);
            }
        }
    }

    public final void k1() {
        this.f38529x0.getImageReceiver().setAlpha(Math.abs(this.l1));
        this.f38529x0.invalidate();
        this.P0.g1();
        if (this.l1 >= 0.0f) {
            this.f38529x0.getImageReceiver().setGradientBitmap(null);
        } else {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f38529x0.getImageReceiver().setBlendMode(null);
            }
            if (this.f38529x0.getBackground() instanceof org.telegram.ui.Components.lc0) {
                this.f38529x0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.lc0) this.f38529x0.getBackground()).f26109k);
            }
        }
        this.f38467a.b(this.f38529x0.getBackground(), this.f38529x0.getBackground(), Float.valueOf(this.l1));
        V0();
    }

    public final void l1() {
        char c10;
        float f7;
        boolean z10;
        boolean z11;
        float f10;
        float f11 = 1.0f;
        float f12 = 0.0f;
        int i10 = this.f38470b;
        if (i10 != 1 && i10 != 2) {
            boolean isEnabled = this.J0[0].isEnabled();
            TLRPC.TL_wallPaper tL_wallPaper = this.W0;
            if (tL_wallPaper != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (isEnabled == z10) {
                return;
            }
            if (tL_wallPaper == null) {
                this.J0[0].a(false, true);
            }
            org.telegram.ui.Components.y81 y81Var = this.J0[0];
            if (this.W0 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            y81Var.setEnabled(z11);
            if (this.W0 != null) {
                this.J0[0].setVisibility(0);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            int dp = (AndroidUtilities.dp(9.0f) + ((FrameLayout.LayoutParams) this.J0[1].getLayoutParams()).width) / 2;
            org.telegram.ui.Components.y81 y81Var2 = this.J0[0];
            Property property = View.ALPHA;
            if (this.W0 == null) {
                f11 = 0.0f;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(y81Var2, property, f11));
            org.telegram.ui.Components.y81 y81Var3 = this.J0[0];
            Property property2 = View.TRANSLATION_X;
            if (this.W0 != null) {
                f10 = 0.0f;
            } else {
                f10 = dp;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(y81Var3, property2, f10));
            org.telegram.ui.Components.y81 y81Var4 = this.J0[1];
            if (this.W0 == null) {
                f12 = -dp;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(y81Var4, property2, f12));
            animatorSet.setInterpolator(org.telegram.ui.Components.qr.f27716g);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new bd1(this));
            animatorSet.start();
            return;
        }
        if (this.W0 == null && (this.B1 instanceof ej1)) {
            this.J0[2].a(false, true);
        }
        org.telegram.ui.Components.y81[] y81VarArr = this.J0;
        if (this.W0 != null) {
            c10 = 2;
        } else {
            c10 = 0;
        }
        y81VarArr[c10].setVisibility(0);
        AnimatorSet animatorSet2 = new AnimatorSet();
        org.telegram.ui.Components.y81 y81Var5 = this.J0[2];
        Property property3 = View.ALPHA;
        if (this.W0 != null) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y81Var5, property3, f7);
        org.telegram.ui.Components.y81 y81Var6 = this.J0[0];
        if (this.W0 != null) {
            f11 = 0.0f;
        }
        animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(y81Var6, property3, f11));
        animatorSet2.addListener(new ad1(this));
        animatorSet2.setInterpolator(org.telegram.ui.Components.qr.f27716g);
        animatorSet2.setDuration(200L);
        animatorSet2.start();
    }

    public final void m1(boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vd1.m1(boolean):void");
    }

    public final void n1() {
        int childCount = this.P0.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.P0.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.k5) {
                ((org.telegram.ui.Cells.k5) childAt).u(true);
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!Q0(z10)) {
            return false;
        }
        O0(true);
        return super.onBackPressed(z10);
    }

    @Override
    public final void onBottomSheetCreated() {
        super.onBottomSheetCreated();
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && d5Var.getBottomSheet() != null) {
            this.parentLayout.getBottomSheet().fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.j6.f19133h5));
            if (this.f38470b == 2 && this.J1 != 0) {
                this.parentLayout.getBottomSheet().setOverlayNavBarColor(-16777216);
            }
        }
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
        j1();
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatWasBoostedByUser);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.invalidateMotionBackground);
        getNotificationCenter().addObserver(this, NotificationCenter.wallpaperSettedToUser);
        int i10 = this.f38470b;
        if (i10 == 1 || i10 == 0) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewWallpapper);
        }
        if (i10 == 2 || i10 == 1) {
            org.telegram.ui.ActionBar.j6.N = true;
        }
        if (i10 == 0 && this.f38516s == null) {
            this.E1 = org.telegram.ui.ActionBar.j6.f19146i0;
        } else {
            Point point = AndroidUtilities.displaySize;
            int min = Math.min(point.x, point.y);
            Point point2 = AndroidUtilities.displaySize;
            int max = Math.max(point2.x, point2.y);
            StringBuilder sb2 = new StringBuilder();
            sb2.append((int) (min / AndroidUtilities.density));
            sb2.append("_");
            this.G1 = a4.a.n((int) (max / AndroidUtilities.density), "_f", sb2);
            Point point3 = AndroidUtilities.displaySize;
            this.H1 = Math.max(point3.x, point3.y);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersNeedReload);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersDidLoad);
            this.f38520t1 = DownloadController.getInstance(this.currentAccount).generateObserverTag();
            if (this.U0 == null) {
                this.U0 = new ArrayList();
                MessagesStorage.getInstance(this.currentAccount).getWallpapers();
            }
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatWasBoostedByUser);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.invalidateMotionBackground);
        getNotificationCenter().removeObserver(this, NotificationCenter.wallpaperSettedToUser);
        ci.n6 n6Var = this.f38500k0;
        if (n6Var != null && this.Q != null) {
            n6Var.getViewTreeObserver().removeOnGlobalLayoutListener(this.Q);
        }
        int i10 = this.f38470b;
        if ((i10 == 2 || i10 == 1) && this.f38510p1 == null) {
            AndroidUtilities.runOnUIThread(new o91(1));
        }
        if (i10 == 2) {
            Bitmap bitmap = this.f38527w1;
            if (bitmap != null) {
                bitmap.recycle();
                this.f38527w1 = null;
            }
            this.f38467a.b(null, null, null);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
        } else if (i10 == 1 || i10 == 0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        }
        if (i10 != 0 || this.f38516s != null) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersNeedReload);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersDidLoad);
        }
        super.onFragmentDestroy();
        P0(null);
    }

    @Override
    public final void onPause() {
        super.onPause();
        if (this.E1) {
            this.f38524v1.c(false);
        }
        org.telegram.ui.ActionBar.j6.f19018b = false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        nd1 nd1Var = this.f38507o0;
        if (nd1Var != null) {
            nd1Var.l();
        }
        rd1 rd1Var = this.f38523v0;
        if (rd1Var != null) {
            rd1Var.l();
        }
        if (this.E1) {
            this.f38524v1.c(true);
        }
        org.telegram.ui.ActionBar.j6.f19018b = true;
    }

    @Override
    public final void onSuccessDownload(String str) {
        j1();
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        if (!z10 && this.f38470b == 2) {
            this.f38467a.b(null, null, null);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
        }
    }

    @Override
    public final void setResourceProvider(org.telegram.ui.ActionBar.e6 e6Var) {
        this.f38467a.f38453a = e6Var;
    }

    public vd1(org.telegram.ui.ActionBar.i6 i6Var, boolean z10, int i10, boolean z11, boolean z12) {
        super(null);
        this.f38467a = new vc1(this);
        this.d = true;
        this.f38504n = 1;
        org.telegram.ui.ActionBar.q5 q5Var = new org.telegram.ui.ActionBar.q5(this, 0, false);
        this.R = q5Var;
        org.telegram.ui.ActionBar.q5 q5Var2 = new org.telegram.ui.ActionBar.q5(this, 0, true);
        this.S = q5Var2;
        org.telegram.ui.ActionBar.q5 q5Var3 = new org.telegram.ui.ActionBar.q5(this, 1, false);
        this.T = q5Var3;
        org.telegram.ui.ActionBar.q5 q5Var4 = new org.telegram.ui.ActionBar.q5(this, 1, true);
        this.U = q5Var4;
        this.X = -1;
        this.Y = new ic1(this, 0);
        this.f38526w0 = new kd1[2];
        this.L0 = new FrameLayout[2];
        this.M0 = new TextView[2];
        this.N0 = new TextView[2];
        this.O0 = new FrameLayout[2];
        this.V0 = new HashMap();
        this.l1 = 0.5f;
        this.f38506n1 = 0.0f;
        this.f38518s1 = PorterDuff.Mode.SRC_IN;
        this.f38533y1 = 1.0f;
        this.G1 = "640_360";
        this.H1 = 1920;
        this.K1 = true;
        this.S1 = new org.telegram.ui.Components.j20(getParentActivity(), new xc1(this));
        this.T1 = false;
        this.U1 = false;
        this.f38470b = i10;
        this.f38485f0 = z12;
        this.f38481e0 = i6Var;
        this.f38491h0 = z10;
        this.f38488g0 = z11;
        if (i10 == 1) {
            org.telegram.ui.ActionBar.g6 k10 = i6Var.k(!z11);
            this.f38516s = k10;
            if (k10 != null) {
                this.d = false;
                this.f38525w = k10.f18879c;
                this.f38528x = k10.d;
                this.f38531y = k10.e;
                this.E = k10.f18880f;
                this.F = k10.f18881g;
                this.G = k10.h;
                this.H = k10.f18882i;
                this.I = k10.f18883j;
                this.J = k10.f18884k;
                this.K = k10.f18885l;
                this.L = k10.f18886m;
                this.M = k10.f18889p;
                this.N = k10.f18888o;
                this.O = k10.f18887n;
            }
        } else {
            if (i10 == 0) {
                this.d = false;
            }
            org.telegram.ui.ActionBar.g6 k11 = i6Var.k(false);
            this.f38516s = k11;
            if (k11 != null) {
                this.W0 = k11.f18892s;
            }
        }
        org.telegram.ui.ActionBar.g6 g6Var = this.f38516s;
        if (g6Var != null) {
            this.E1 = g6Var.f18890q;
            if (!TextUtils.isEmpty(g6Var.f18888o)) {
                this.l1 = this.f38516s.f18889p;
            }
            org.telegram.ui.ActionBar.j6.M = org.telegram.ui.ActionBar.j6.A0();
            org.telegram.ui.ActionBar.j6.O = true;
            org.telegram.ui.ActionBar.j6.P = true;
            org.telegram.ui.ActionBar.j6.t(i6Var, false, false);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.goingToPreviewTheme, new Object[0]);
        q5Var.v = true;
        q5Var3.v = true;
        q5Var2.v = true;
        q5Var4.v = true;
    }

    @Override
    public final void onProgressDownload(String str, long j3, long j10) {
    }

    public vd1(org.telegram.ui.ActionBar.i6 i6Var) {
        this(i6Var, false, 0, false, false);
    }

    @Override
    public final void onProgressUpload(String str, long j3, long j10, boolean z10) {
    }
}
