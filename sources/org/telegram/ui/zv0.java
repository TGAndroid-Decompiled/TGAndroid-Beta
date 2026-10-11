package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class zv0 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.tw0 {
    public boolean A0;
    public boolean B0;
    public CharSequence E;
    public Editable F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public final int N;
    public int O;
    public boolean P;
    public org.telegram.ui.Components.qz0 Q;
    public org.telegram.ui.Components.b00 R;
    public ci.h4 S;
    public boolean T;
    public boolean U;
    public int V;
    public int W;
    public int X;
    public boolean Y;
    public int Z;
    public org.telegram.ui.ActionBar.u0 f45088a;
    public boolean f45089a0;
    public xv0 f45090b;
    public org.telegram.ui.Cells.d6 f45091b0;
    public ec1 f45092c;
    public final boolean f45093c0;
    public s4.d0 d;
    public final boolean f45094d0;
    public hd f45095e;
    public yv0 f45096e0;
    public final zn f45097f;
    public boolean f45098f0;
    public int f45099g0;
    public org.telegram.ui.Components.a50 h;
    public int f45100h0;
    public int f45101i0;
    public int f45102j0;
    public int f45103k0;
    public int f45104l0;
    public int m0;
    public final int f45105n;
    public int f45106n0;
    public int f45107o0;
    public int f45108p0;
    public int f45109q0;
    public int[] f45110r;
    public int f45111r0;
    public int f45112s;
    public int f45113s0;
    public int f45114t0;
    public int f45115u0;
    public final CharSequence[] v;
    public int f45116v0;
    public final boolean[] f45117w;
    public int f45118w0;
    public int f45119x;
    public int f45120x0;
    public int f45121y;
    public final v5 f45122y0;
    public TLRPC.MessageMedia f45123z0;

    public zv0(zn znVar) {
        super(null);
        this.f45121y = 1;
        this.G = true;
        this.H = false;
        this.J = true;
        this.O = AndroidUtilities.dp(3.0f);
        this.f45099g0 = -1;
        this.f45122y0 = new v5(this, 12);
        this.f45094d0 = true;
        int i10 = getMessagesController().todoItemsMax;
        this.f45105n = i10;
        this.v = new CharSequence[i10];
        this.f45117w = new boolean[i10];
        this.f45097f = znVar;
        this.f45093c0 = AccountInstance.getInstance(this.currentAccount).getUserConfig().isPremium();
        this.L = false;
        this.N = 2;
    }

    public static org.telegram.ui.ActionBar.k Z(zv0 zv0Var) {
        return zv0Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k a0(zv0 zv0Var) {
        return zv0Var.actionBar;
    }

    public static void c0(zv0 zv0Var, View view, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z10 = zv0Var.f45094d0;
        if (view instanceof org.telegram.ui.Cells.d6) {
            org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view;
            if (i10 == zv0Var.f45101i0) {
                if (z10) {
                    i14 = zv0Var.getMessagesController().todoTitleLengthMax;
                } else {
                    i14 = 255;
                }
                CharSequence charSequence = zv0Var.E;
                if (charSequence != null) {
                    i17 = charSequence.length();
                } else {
                    i17 = 0;
                }
                i13 = i14 - i17;
            } else if (i10 == zv0Var.f45102j0) {
                Editable editable = zv0Var.F;
                if (editable != null) {
                    i15 = editable.length();
                } else {
                    i15 = 0;
                }
                i14 = 200;
                i13 = 200 - i15;
            } else {
                int i18 = zv0Var.f45106n0;
                if (i10 >= i18 && i10 < zv0Var.f45121y + i18) {
                    int i19 = i10 - i18;
                    if (z10) {
                        i11 = zv0Var.getMessagesController().todoItemLengthMax;
                    } else {
                        i11 = 100;
                    }
                    CharSequence charSequence2 = zv0Var.v[i19];
                    if (charSequence2 != null) {
                        i12 = charSequence2.length();
                    } else {
                        i12 = 0;
                    }
                    i13 = i11 - i12;
                    i14 = i11;
                } else {
                    return;
                }
            }
            float f7 = i14;
            if (i13 <= f7 - (0.7f * f7)) {
                d6Var.setText2(String.format("%d", Integer.valueOf(i13)));
                org.telegram.ui.ActionBar.h5 textView2 = d6Var.getTextView2();
                if (i13 < 0) {
                    i16 = org.telegram.ui.ActionBar.h6.f21007p7;
                } else {
                    i16 = org.telegram.ui.ActionBar.h6.A6;
                }
                textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i16, false));
                textView2.setTag(Integer.valueOf(i16));
                return;
            }
            d6Var.setText2("");
        }
    }

    public static void d0(zv0 zv0Var, org.telegram.ui.Cells.d6 d6Var, boolean z10) {
        s4.d1 T;
        if (zv0Var.f45093c0 && z10) {
            if (zv0Var.f45091b0 == d6Var && zv0Var.P && zv0Var.B0) {
                zv0Var.j0();
                zv0Var.P = false;
            }
            org.telegram.ui.Cells.d6 d6Var2 = zv0Var.f45091b0;
            zv0Var.f45091b0 = d6Var;
            d6Var.setEmojiButtonVisibility(true);
            org.telegram.ui.Components.dh emojiButton = d6Var.getEmojiButton();
            org.telegram.ui.Components.bh bhVar = org.telegram.ui.Components.bh.f24958e;
            emojiButton.j(bhVar, false);
            ec1 ec1Var = zv0Var.f45092c;
            View F = ec1Var.F(d6Var);
            if (F == null) {
                T = null;
            } else {
                T = ec1Var.T(F);
            }
            org.telegram.ui.Components.qz0 qz0Var = zv0Var.Q;
            if (qz0Var != null) {
                qz0Var.f();
                org.telegram.ui.Components.qz0 qz0Var2 = zv0Var.Q;
                if (qz0Var2 != null && T != null) {
                    View view = T.f47748a;
                    if ((view instanceof org.telegram.ui.Cells.d6) && qz0Var2.getDelegate() != view) {
                        zv0Var.Q.setDelegate((org.telegram.ui.Cells.d6) view);
                    }
                }
            }
            if (d6Var2 != null && d6Var2 != d6Var) {
                if (zv0Var.P) {
                    zv0Var.j0();
                    zv0Var.k0(false);
                    zv0Var.m0();
                }
                d6Var2.setEmojiButtonVisibility(false);
                d6Var2.getEmojiButton().j(bhVar, false);
            }
        }
    }

    public static void e0(zv0 zv0Var, org.telegram.ui.Cells.d6 d6Var) {
        zv0Var.f45091b0 = d6Var;
        if (zv0Var.P) {
            zv0Var.j0();
            zv0Var.m0();
            return;
        }
        zv0Var.q0(1);
    }

    @Override
    public final void H(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        int dp;
        if (this.f45093c0) {
            if (i10 > AndroidUtilities.dp(50.0f) && this.Y && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                if (z10) {
                    this.X = i10;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.X).commit();
                } else {
                    this.W = i10;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.W).commit();
                }
            }
            if (this.P) {
                if (z10) {
                    i11 = this.X;
                } else {
                    i11 = this.W;
                }
                if (this.B0) {
                    i11 += AndroidUtilities.dp(120.0f);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.R.getLayoutParams();
                int i12 = layoutParams.width;
                int i13 = AndroidUtilities.displaySize.x;
                if (i12 != i13 || layoutParams.height != i11 || this.A0 != this.B0) {
                    layoutParams.width = i13;
                    layoutParams.height = i11;
                    this.R.setLayoutParams(layoutParams);
                    this.V = layoutParams.height;
                    this.S.a();
                    this.f45095e.requestLayout();
                    boolean z13 = this.A0;
                    if (z13 != this.B0) {
                        if (z13) {
                            dp = -AndroidUtilities.dp(120.0f);
                        } else {
                            dp = AndroidUtilities.dp(120.0f);
                        }
                        g0(dp);
                    }
                    this.A0 = this.B0;
                }
            }
            if (this.Z != i10 || this.f45089a0 != z10) {
                this.Z = i10;
                this.f45089a0 = z10;
                boolean z14 = this.Y;
                org.telegram.ui.Cells.d6 d6Var = this.f45091b0;
                if (d6Var != null) {
                    if (d6Var.getEditField().isFocused() && this.S.c() && i10 > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.Y = z12;
                } else {
                    this.Y = false;
                }
                if (this.Y && this.P) {
                    q0(0);
                }
                if (this.V != 0 && !(z11 = this.Y) && z11 != z14 && !this.P) {
                    this.V = 0;
                    this.S.a();
                    this.f45095e.requestLayout();
                }
                if (this.Y && this.T) {
                    this.T = false;
                    AndroidUtilities.cancelRunOnUIThread(this.f45122y0);
                }
            }
        }
    }

    @Override
    public final View createView(Context context) {
        String upperCase;
        int i10;
        int i11;
        this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20786d6));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.h6.G6;
        kVar.D(getThemedColor(i12), false);
        this.actionBar.D(getThemedColor(i12), true);
        this.actionBar.C(getThemedColor(org.telegram.ui.ActionBar.h6.f21191z8), false);
        this.actionBar.setTitleColor(getThemedColor(i12));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        boolean z10 = this.f45094d0;
        if (z10) {
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (this.I) {
                i11 = R.string.TodoAddTasksTitle;
            } else {
                i11 = R.string.TodoEditTitle;
            }
            kVar2.setTitle(LocaleController.getString(i11));
        } else if (this.N == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewQuiz));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewPoll));
        }
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new rv0(this));
        org.telegram.ui.ActionBar.y o9 = this.actionBar.o();
        if (z10) {
            if (this.I) {
                i10 = R.string.TodoAddTasksButton;
            } else {
                i10 = R.string.TodoEditTasksButton;
            }
            upperCase = LocaleController.getString(i10);
        } else {
            upperCase = LocaleController.getString(R.string.Create).toUpperCase();
        }
        this.f45088a = o9.e(1, upperCase);
        this.f45090b = new xv0(this, context);
        hd hdVar = new hd(3, context, this);
        this.f45095e = hdVar;
        hdVar.setDelegate(this);
        hd hdVar2 = this.f45095e;
        this.fragmentView = hdVar2;
        hdVar2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20730a7, false));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        this.f45092c = new ec1(context, 11, null);
        s4.j jVar = new s4.j();
        jVar.f47788m = false;
        jVar.C = false;
        jVar.o(org.telegram.ui.Components.is.h);
        jVar.n(350L);
        this.f45092c.setItemAnimator(jVar);
        this.f45092c.setVerticalScrollBarEnabled(false);
        ((s4.j) this.f45092c.getItemAnimator()).C = false;
        s4.d0 d0Var = new s4.d0(1, false);
        this.d = d0Var;
        this.f45092c.setLayoutManager(d0Var);
        new s4.z(new bi.g(this, 6)).e(this.f45092c);
        frameLayout.addView(this.f45092c, w7.x5.e(-1, -1, 51));
        this.f45092c.setAdapter(this.f45090b);
        this.f45092c.setOnItemClickListener(new i(this, 23));
        this.f45092c.setOnScrollListener(new h3(this, 23));
        org.telegram.ui.Components.a50 a50Var = new org.telegram.ui.Components.a50(context, 4);
        this.h = a50Var;
        a50Var.setText(LocaleController.getString(R.string.PollTapToSelect));
        this.h.setAlpha(0.0f);
        this.h.setVisibility(4);
        frameLayout.addView(this.h, w7.x5.a(-2.0f, 19.0f, 0.0f, 19.0f, 0.0f, -2, 51));
        if (this.f45093c0) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            org.telegram.ui.Components.qz0 qz0Var = new org.telegram.ui.Components.qz0(context, this.currentAccount, null, this.resourceProvider);
            this.Q = qz0Var;
            qz0Var.f30282y = true;
            qz0Var.E = true;
            qz0Var.setHorizontalPadding(AndroidUtilities.dp(24.0f));
            frameLayout.addView(this.Q, w7.x5.e(-2, 160, 51));
        }
        this.S = new ci.h4(this.f45095e, false, null);
        i0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            org.telegram.ui.Components.b00 b00Var = this.R;
            if (b00Var != null) {
                b00Var.P.f1();
            }
            org.telegram.ui.Cells.d6 d6Var = this.f45091b0;
            if (d6Var != null) {
                int currentTextColor = d6Var.getEditField().getCurrentTextColor();
                this.f45091b0.getEditField().setTextColor(-1);
                this.f45091b0.getEditField().setTextColor(currentTextColor);
            }
        }
    }

    public final void f0() {
        int i10;
        org.telegram.ui.Components.qz0 qz0Var = this.Q;
        if (qz0Var != null) {
            qz0Var.setDelegate(null);
            this.Q.f();
        }
        int i11 = this.f45121y;
        this.f45117w[i11] = false;
        int i12 = i11 + 1;
        this.f45121y = i12;
        if (this.f45110r != null) {
            int[] iArr = new int[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                int[] iArr2 = this.f45110r;
                if (i13 < iArr2.length) {
                    i10 = iArr2[i13];
                } else {
                    i10 = this.f45112s + 1;
                    this.f45112s = i10;
                }
                iArr[i13] = i10;
            }
            this.f45110r = iArr;
        }
        if (this.f45121y == this.v.length) {
            this.f45090b.u(this.f45107o0);
        }
        this.f45090b.o(this.f45107o0);
        r0();
        this.f45098f0 = false;
        this.f45099g0 = (this.f45106n0 + this.f45121y) - 1;
        this.f45090b.m(this.f45108p0);
    }

    public final void g0(float f7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new lg(this, f7, 3));
        ofFloat.addListener(new sv0(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.f21407w);
        ofFloat.start();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f45092c, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.r8.class, org.telegram.ui.Cells.d6.class, org.telegram.ui.Cells.w8.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20786d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20730a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f21065s8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f45092c, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21120v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21084t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f45092c, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.L6));
        int i11 = org.telegram.ui.ActionBar.h6.f21007p7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f45092c, 262144, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView2"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f45092c, 262144, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.A6));
        int i12 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f45092c, 4, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f45092c, 8388608, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.H6));
        int i13 = org.telegram.ui.ActionBar.h6.f20951m6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f45092c, 8388608, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"deleteImageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f45092c, 8388608, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"moveImageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f45092c, 196608, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"deleteImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f45092c, 262144, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"textView2"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f45092c, 0, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.h6.f20915k7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f45092c, 0, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f45092c, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f45092c, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21189z6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f45092c, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.M6));
        int i15 = org.telegram.ui.ActionBar.h6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f45092c, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f45092c, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f20877i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f45092c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f20908k0, null, null, org.telegram.ui.ActionBar.h6.f20787d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f45092c, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f45092c, 32, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f45092c, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i14));
        return arrayList;
    }

    public final boolean h0(boolean z10) {
        int i10;
        int i11;
        boolean z11;
        TLRPC.MessageMedia messageMedia = this.f45123z0;
        boolean z12 = messageMedia instanceof TLRPC.TL_messageMediaToDo;
        CharSequence[] charSequenceArr = this.v;
        boolean z13 = false;
        if (z12) {
            TLRPC.TodoList todoList = ((TLRPC.TL_messageMediaToDo) messageMedia).todo;
            int i12 = 0;
            for (int i13 = 0; i13 < Math.min(this.f45121y, charSequenceArr.length); i13++) {
                if (!TextUtils.isEmpty(charSequenceArr[i13])) {
                    i12++;
                }
            }
            if ((!this.I && !TextUtils.equals(todoList.title.text, org.telegram.ui.Components.lo.b0(this.E))) || i12 != todoList.list.size()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                for (int i14 = 0; i14 < i12; i14++) {
                    if (!TextUtils.equals(charSequenceArr[i14].toString(), todoList.list.get(i14).title.text)) {
                        break;
                    }
                }
            }
            z13 = z11;
        } else {
            boolean isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.lo.b0(this.E));
            if (isEmpty) {
                for (int i15 = 0; i15 < this.f45121y && (isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.lo.b0(charSequenceArr[i15]))); i15++) {
                }
            }
            z13 = isEmpty;
        }
        if (z10 && !z13) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            boolean z14 = this.f45094d0;
            if (z14) {
                i10 = R.string.CancelTodoAlertTitle;
            } else {
                i10 = R.string.CancelPollAlertTitle;
            }
            alertDialog$Builder.f20368a.R = LocaleController.getString(i10);
            if (z14) {
                i11 = R.string.CancelTodoAlertText;
            } else {
                i11 = R.string.CancelPollAlertText;
            }
            alertDialog$Builder.f20368a.T = LocaleController.getString(i11);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new gq0(this, 3));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            showDialog(alertDialog$Builder.f20368a);
        }
        return z13;
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        if (this.f45099g0 < 0) {
            return true;
        }
        return false;
    }

    public final void i0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zv0.i0():void");
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20786d6, false);
            if (this.actionBar.t()) {
                x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21138w8, false);
            }
            if (i0.a.f(x02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    public final void j0() {
        if (this.B0) {
            this.R.u(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.R.getLayoutParams();
            layoutParams.height -= AndroidUtilities.dp(120.0f);
            this.R.setLayoutParams(layoutParams);
            this.V = layoutParams.height;
            this.A0 = this.B0;
            this.B0 = false;
            g0(-AndroidUtilities.dp(120.0f));
        }
    }

    public final void k0(boolean z10) {
        if (this.f45093c0) {
            if (this.P) {
                org.telegram.ui.Components.b00 b00Var = this.R;
                b00Var.P.B0();
                b00Var.I.scrollTo(0, 0);
                b00Var.F(1);
                b00Var.Q.h1(0, 0);
                this.R.u(false);
                if (z10) {
                    this.R.C();
                }
                this.B0 = false;
                q0(0);
            }
            if (z10) {
                org.telegram.ui.Components.b00 b00Var2 = this.R;
                if (b00Var2 != null && b00Var2.getVisibility() == 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.R.getMeasuredHeight());
                    ofFloat.addUpdateListener(new qv0(this, 1));
                    ofFloat.addListener(new sv0(this, 2));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.f21407w);
                    ofFloat.start();
                    return;
                }
                l0();
            }
        }
    }

    public final void l0() {
        org.telegram.ui.Components.b00 b00Var;
        org.telegram.ui.Components.dh emojiButton;
        if (!this.P && (b00Var = this.R) != null && b00Var.getVisibility() != 8) {
            org.telegram.ui.Cells.d6 d6Var = this.f45091b0;
            if (d6Var != null && (emojiButton = d6Var.getEmojiButton()) != null) {
                emojiButton.j(org.telegram.ui.Components.bh.f24958e, false);
            }
            this.R.setVisibility(8);
        }
        int i10 = this.V;
        this.V = 0;
        if (i10 != 0) {
            this.S.a();
        }
    }

    public final void m0() {
        int i10;
        this.S.f5160e = true;
        EditTextBoldCursor editField = this.f45091b0.getEditField();
        editField.requestFocus();
        AndroidUtilities.showKeyboard(editField);
        if (AndroidUtilities.usingHardwareInput) {
            i10 = 0;
        } else {
            i10 = 2;
        }
        q0(i10);
        if (!AndroidUtilities.usingHardwareInput && !this.Y && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            this.T = true;
            v5 v5Var = this.f45122y0;
            AndroidUtilities.cancelRunOnUIThread(v5Var);
            AndroidUtilities.runOnUIThread(v5Var, 100L);
        }
    }

    public final void n0(xg xgVar) {
        this.f45096e0 = xgVar;
    }

    public final void o0(TLRPC.MessageMedia messageMedia, boolean z10) {
        p0(messageMedia, z10, -1);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.P) {
            if (z10) {
                k0(true);
                return false;
            }
            return false;
        }
        return h0(z10);
    }

    @Override
    public final void onBecomeFullyVisible() {
        View view;
        super.onBecomeFullyVisible();
        if (this.f45098f0 && this.f45099g0 >= 0) {
            int i10 = 0;
            while (true) {
                if (i10 < this.f45092c.getChildCount()) {
                    view = this.f45092c.getChildAt(i10);
                    this.f45092c.getClass();
                    if (RecyclerView.R(view) == this.f45099g0) {
                        break;
                    }
                    i10++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view instanceof org.telegram.ui.Cells.d6) {
                AndroidUtilities.runOnUIThread(new kh(5, ((org.telegram.ui.Cells.d6) view).getTextView()), 300L);
                this.f45099g0 = -1;
            }
            this.f45098f0 = false;
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        r0();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.U = true;
        if (this.f45093c0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            org.telegram.ui.Components.b00 b00Var = this.R;
            if (b00Var != null) {
                this.f45095e.removeView(b00Var);
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        if (this.f45093c0) {
            k0(false);
            org.telegram.ui.Components.qz0 qz0Var = this.Q;
            if (qz0Var != null) {
                qz0Var.f();
            }
            org.telegram.ui.Cells.d6 d6Var = this.f45091b0;
            if (d6Var != null) {
                d6Var.setEmojiButtonVisibility(false);
                this.f45091b0.getTextView().clearFocus();
                AndroidUtilities.hideKeyboard(this.f45091b0.getEditField());
            }
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        xv0 xv0Var = this.f45090b;
        if (xv0Var != null) {
            xv0Var.l();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    public final void p0(TLRPC.MessageMedia messageMedia, boolean z10, int i10) {
        int i11;
        this.f45123z0 = messageMedia;
        this.I = z10;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_messageMediaToDo.todo.title.text);
            this.E = spannableStringBuilder;
            CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false);
            this.E = replaceEmoji;
            Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(replaceEmoji, tL_messageMediaToDo.todo.title.entities, textPaint.getFontMetricsInt());
            this.E = replaceAnimatedEmoji;
            MessageObject.addEntitiesToText(replaceAnimatedEmoji, tL_messageMediaToDo.todo.title.entities, false, false, false, false);
            int size = tL_messageMediaToDo.todo.list.size();
            this.f45121y = size;
            this.f45119x = size;
            this.f45112s = 0;
            this.f45110r = new int[size];
            int i12 = 0;
            while (true) {
                i11 = this.f45121y;
                if (i12 >= i11) {
                    break;
                }
                TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageMediaToDo.todo.list.get(i12).title;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_textWithEntities.text);
                CharSequence[] charSequenceArr = this.v;
                charSequenceArr[i12] = spannableStringBuilder2;
                charSequenceArr[i12] = Emoji.replaceEmoji(charSequenceArr[i12], textPaint.getFontMetricsInt(), false);
                charSequenceArr[i12] = MessageObject.replaceAnimatedEmoji(charSequenceArr[i12], tL_textWithEntities.entities, textPaint.getFontMetricsInt());
                MessageObject.addEntitiesToText(charSequenceArr[i12], tL_textWithEntities.entities, false, false, false, false);
                this.f45110r[i12] = tL_messageMediaToDo.todo.list.get(i12).f20177id;
                this.f45112s = Math.max(this.f45112s, this.f45110r[i12]);
                i12++;
            }
            TLRPC.TodoList todoList = tL_messageMediaToDo.todo;
            this.J = todoList.others_can_complete;
            this.H = todoList.others_can_append;
            if (this.I) {
                this.f45121y = i11 + 1;
                r0();
                this.f45098f0 = true;
                int i13 = this.f45106n0;
                if (i10 < 0) {
                    i10 = this.f45121y - 1;
                }
                this.f45099g0 = i13 + i10;
            }
        }
    }

    public final void q0(int i10) {
        boolean z10;
        int i11;
        org.telegram.ui.Cells.d6 d6Var;
        if (this.f45093c0) {
            if (i10 == 1) {
                org.telegram.ui.Components.b00 b00Var = this.R;
                if (b00Var != null && b00Var.getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.b00 b00Var2 = this.R;
                if (b00Var2 != null && b00Var2.f24662c1 != UserConfig.selectedAccount) {
                    this.f45095e.removeView(b00Var2);
                    this.R = null;
                }
                if (this.R == null) {
                    org.telegram.ui.Components.b00 b00Var3 = new org.telegram.ui.Components.b00(null, true, false, false, getParentActivity(), true, null, null, true, this.resourceProvider, false, false);
                    this.R = b00Var3;
                    b00Var3.f24727w2 = false;
                    b00Var3.U0 = false;
                    b00Var3.setVisibility(8);
                    if (AndroidUtilities.isTablet()) {
                        this.R.setForseMultiwindowLayout(true);
                    }
                    this.R.setDelegate(new tv0(this));
                    this.f45095e.addView(this.R);
                }
                this.R.setVisibility(0);
                this.P = true;
                org.telegram.ui.Components.b00 b00Var4 = this.R;
                if (this.W <= 0) {
                    if (AndroidUtilities.isTablet()) {
                        this.W = AndroidUtilities.dp(150.0f);
                    } else {
                        this.W = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                    }
                }
                if (this.X <= 0) {
                    if (AndroidUtilities.isTablet()) {
                        this.X = AndroidUtilities.dp(150.0f);
                    } else {
                        this.X = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                    }
                }
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i11 = this.X;
                } else {
                    i11 = this.W;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b00Var4.getLayoutParams();
                layoutParams.height = i11;
                b00Var4.setLayoutParams(layoutParams);
                if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet() && (d6Var = this.f45091b0) != null) {
                    AndroidUtilities.hideKeyboard(d6Var.getEditField());
                }
                this.V = i11;
                this.S.a();
                this.f45095e.requestLayout();
                org.telegram.ui.Components.dh emojiButton = this.f45091b0.getEmojiButton();
                if (emojiButton != null) {
                    emojiButton.j(org.telegram.ui.Components.bh.d, true);
                }
                if (!z10 && !this.Y) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V, 0.0f);
                    ofFloat.addUpdateListener(new qv0(this, 0));
                    ofFloat.addListener(new sv0(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.f21407w);
                    ofFloat.start();
                    return;
                }
                return;
            }
            org.telegram.ui.Components.dh emojiButton2 = this.f45091b0.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(org.telegram.ui.Components.bh.f24958e, true);
            }
            org.telegram.ui.Components.b00 b00Var5 = this.R;
            if (b00Var5 != null) {
                this.P = false;
                this.B0 = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    b00Var5.setVisibility(8);
                }
            }
            if (i10 == 0) {
                this.V = 0;
            }
            this.S.a();
            this.f45095e.requestLayout();
        }
    }

    public final void r0() {
        this.f45100h0 = -1;
        this.f45101i0 = -1;
        this.f45104l0 = -1;
        this.m0 = -1;
        this.f45102j0 = -1;
        this.f45103k0 = -1;
        this.f45106n0 = -1;
        this.f45107o0 = -1;
        this.f45111r0 = -1;
        this.f45113s0 = -1;
        this.f45115u0 = -1;
        this.f45116v0 = -1;
        this.f45114t0 = -1;
        this.f45118w0 = -1;
        this.f45109q0 = -1;
        this.f45120x0 = 0;
        boolean z10 = this.f45094d0;
        if (!z10 || !this.I) {
            this.f45100h0 = 0;
            this.f45101i0 = 1;
            this.f45104l0 = 2;
            this.f45120x0 = 4;
            this.m0 = 3;
        }
        int i10 = this.f45121y;
        if (i10 != 0) {
            int i11 = this.f45120x0;
            this.f45106n0 = i11;
            this.f45120x0 = i11 + i10;
        }
        if (i10 != this.v.length) {
            int i12 = this.f45120x0;
            this.f45120x0 = i12 + 1;
            this.f45107o0 = i12;
        }
        int i13 = this.f45120x0;
        int i14 = i13 + 1;
        this.f45120x0 = i14;
        this.f45108p0 = i13;
        if (!z10 || !this.I) {
            int i15 = i13 + 2;
            this.f45120x0 = i15;
            this.f45109q0 = i14;
            if (z10) {
                int i16 = i13 + 3;
                this.f45120x0 = i16;
                this.f45116v0 = i15;
                if (this.J) {
                    this.f45120x0 = i13 + 4;
                    this.f45115u0 = i16;
                    return;
                }
                return;
            }
            TLRPC.Chat chat = this.f45097f.f44752e;
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                int i17 = this.f45120x0;
                this.f45120x0 = i17 + 1;
                this.f45111r0 = i17;
            }
            int i18 = this.N;
            if (i18 != 1) {
                int i19 = this.f45120x0;
                this.f45120x0 = i19 + 1;
                this.f45113s0 = i19;
            }
            if (i18 == 0) {
                int i20 = this.f45120x0;
                this.f45120x0 = i20 + 1;
                this.f45114t0 = i20;
            }
            int i21 = this.f45120x0;
            int i22 = i21 + 1;
            this.f45120x0 = i22;
            this.f45118w0 = i21;
            if (this.L) {
                this.f45102j0 = i22;
                this.f45120x0 = i21 + 3;
                this.f45103k0 = i21 + 2;
            }
        }
    }
}
