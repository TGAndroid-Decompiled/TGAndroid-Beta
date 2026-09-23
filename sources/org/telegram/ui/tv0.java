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
public final class tv0 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.ov0 {
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
    public org.telegram.ui.Components.my0 Q;
    public org.telegram.ui.Components.lz R;
    public ci.i4 S;
    public boolean T;
    public boolean U;
    public int V;
    public int W;
    public int X;
    public boolean Y;
    public int Z;
    public org.telegram.ui.ActionBar.v0 f37767a;
    public boolean f37768a0;
    public rv0 f37769b;
    public org.telegram.ui.Cells.d6 f37770b0;
    public wb1 f37771c;
    public final boolean f37772c0;
    public s4.c0 d;
    public final boolean f37773d0;
    public hd e;
    public sv0 f37774e0;
    public final xn f37775f;
    public boolean f37776f0;
    public int f37777g0;
    public org.telegram.ui.Components.j40 h;
    public int f37778h0;
    public int f37779i0;
    public int f37780j0;
    public int f37781k0;
    public int f37782l0;
    public int m0;
    public final int f37783n;
    public int f37784n0;
    public int f37785o0;
    public int f37786p0;
    public int f37787q0;
    public int[] f37788r;
    public int f37789r0;
    public int f37790s;
    public int f37791s0;
    public int f37792t0;
    public int f37793u0;
    public final CharSequence[] v;
    public int f37794v0;
    public final boolean[] f37795w;
    public int f37796w0;
    public int f37797x;
    public int f37798x0;
    public int f37799y;
    public final x5 f37800y0;
    public TLRPC.MessageMedia f37801z0;

    public tv0(xn xnVar) {
        super(null);
        this.f37799y = 1;
        this.G = true;
        this.H = false;
        this.J = true;
        this.O = AndroidUtilities.dp(3.0f);
        this.f37777g0 = -1;
        this.f37800y0 = new x5(this, 12);
        this.f37773d0 = true;
        int i10 = getMessagesController().todoItemsMax;
        this.f37783n = i10;
        this.v = new CharSequence[i10];
        this.f37795w = new boolean[i10];
        this.f37775f = xnVar;
        this.f37772c0 = AccountInstance.getInstance(this.currentAccount).getUserConfig().isPremium();
        this.L = false;
        this.N = 2;
    }

    public static void c0(tv0 tv0Var, View view, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z10 = tv0Var.f37773d0;
        if (view instanceof org.telegram.ui.Cells.d6) {
            org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view;
            if (i10 == tv0Var.f37779i0) {
                if (z10) {
                    i14 = tv0Var.getMessagesController().todoTitleLengthMax;
                } else {
                    i14 = 255;
                }
                CharSequence charSequence = tv0Var.E;
                if (charSequence != null) {
                    i17 = charSequence.length();
                } else {
                    i17 = 0;
                }
                i13 = i14 - i17;
            } else if (i10 == tv0Var.f37780j0) {
                Editable editable = tv0Var.F;
                if (editable != null) {
                    i15 = editable.length();
                } else {
                    i15 = 0;
                }
                i14 = 200;
                i13 = 200 - i15;
            } else {
                int i18 = tv0Var.f37784n0;
                if (i10 >= i18 && i10 < tv0Var.f37799y + i18) {
                    int i19 = i10 - i18;
                    if (z10) {
                        i11 = tv0Var.getMessagesController().todoItemLengthMax;
                    } else {
                        i11 = 100;
                    }
                    CharSequence charSequence2 = tv0Var.v[i19];
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
                org.telegram.ui.ActionBar.i5 textView2 = d6Var.getTextView2();
                if (i13 < 0) {
                    i16 = org.telegram.ui.ActionBar.h6.f19008p7;
                } else {
                    i16 = org.telegram.ui.ActionBar.h6.A6;
                }
                textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i16, false));
                textView2.setTag(Integer.valueOf(i16));
                return;
            }
            d6Var.setText2("");
        }
    }

    public static void d0(tv0 tv0Var, org.telegram.ui.Cells.d6 d6Var, boolean z10) {
        s4.c1 T;
        if (tv0Var.f37772c0 && z10) {
            if (tv0Var.f37770b0 == d6Var && tv0Var.P && tv0Var.B0) {
                tv0Var.j0();
                tv0Var.P = false;
            }
            org.telegram.ui.Cells.d6 d6Var2 = tv0Var.f37770b0;
            tv0Var.f37770b0 = d6Var;
            d6Var.setEmojiButtonVisibility(true);
            org.telegram.ui.Components.ah emojiButton = d6Var.getEmojiButton();
            org.telegram.ui.Components.yg ygVar = org.telegram.ui.Components.yg.e;
            emojiButton.j(ygVar, false);
            wb1 wb1Var = tv0Var.f37771c;
            View F = wb1Var.F(d6Var);
            if (F == null) {
                T = null;
            } else {
                T = wb1Var.T(F);
            }
            org.telegram.ui.Components.my0 my0Var = tv0Var.Q;
            if (my0Var != null) {
                my0Var.f();
                org.telegram.ui.Components.my0 my0Var2 = tv0Var.Q;
                if (my0Var2 != null && T != null) {
                    View view = T.f42627a;
                    if ((view instanceof org.telegram.ui.Cells.d6) && my0Var2.getDelegate() != view) {
                        tv0Var.Q.setDelegate((org.telegram.ui.Cells.d6) view);
                    }
                }
            }
            if (d6Var2 != null && d6Var2 != d6Var) {
                if (tv0Var.P) {
                    tv0Var.j0();
                    tv0Var.k0(false);
                    tv0Var.m0();
                }
                d6Var2.setEmojiButtonVisibility(false);
                d6Var2.getEmojiButton().j(ygVar, false);
            }
        }
    }

    public static void e0(tv0 tv0Var, org.telegram.ui.Cells.d6 d6Var) {
        tv0Var.f37770b0 = d6Var;
        if (tv0Var.P) {
            tv0Var.j0();
            tv0Var.m0();
            return;
        }
        tv0Var.q0(1);
    }

    @Override
    public final void H(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        int dp;
        if (this.f37772c0) {
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
                    this.e.requestLayout();
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
            if (this.Z != i10 || this.f37768a0 != z10) {
                this.Z = i10;
                this.f37768a0 = z10;
                boolean z14 = this.Y;
                org.telegram.ui.Cells.d6 d6Var = this.f37770b0;
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
                    this.e.requestLayout();
                }
                if (this.Y && this.T) {
                    this.T = false;
                    AndroidUtilities.cancelRunOnUIThread(this.f37800y0);
                }
            }
        }
    }

    @Override
    public final View createView(Context context) {
        String upperCase;
        int i10;
        int i11;
        this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.f18789d6));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.h6.G6;
        kVar.B(getThemedColor(i12), false);
        this.actionBar.B(getThemedColor(i12), true);
        this.actionBar.A(getThemedColor(org.telegram.ui.ActionBar.h6.f19191z8), false);
        this.actionBar.setTitleColor(getThemedColor(i12));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        boolean z10 = this.f37773d0;
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
        org.telegram.ui.ActionBar.c5 c5Var = this.parentLayout;
        if (c5Var != null && ((ActionBarLayout) c5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new lv0(this));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
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
        this.f37767a = n10.e(1, upperCase);
        this.f37769b = new rv0(this, context);
        hd hdVar = new hd(3, context, this);
        this.e = hdVar;
        hdVar.setDelegate(this);
        hd hdVar2 = this.e;
        this.fragmentView = hdVar2;
        hdVar2.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18733a7, false));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        this.f37771c = new wb1(context, 11, null);
        s4.j jVar = new s4.j();
        jVar.f42662m = false;
        jVar.C = false;
        jVar.o(org.telegram.ui.Components.rr.h);
        jVar.n(350L);
        this.f37771c.setItemAnimator(jVar);
        this.f37771c.setVerticalScrollBarEnabled(false);
        ((s4.j) this.f37771c.getItemAnimator()).C = false;
        s4.c0 c0Var = new s4.c0(1, false);
        this.d = c0Var;
        this.f37771c.setLayoutManager(c0Var);
        new s4.y(new bi.g(this, 6)).e(this.f37771c);
        frameLayout.addView(this.f37771c, w7.x5.e(-1, -1, 51));
        this.f37771c.setAdapter(this.f37769b);
        this.f37771c.setOnItemClickListener(new i(this, 23));
        this.f37771c.setOnScrollListener(new i3(this, 23));
        org.telegram.ui.Components.j40 j40Var = new org.telegram.ui.Components.j40(context, 4);
        this.h = j40Var;
        j40Var.setText(LocaleController.getString(R.string.PollTapToSelect));
        this.h.setAlpha(0.0f);
        this.h.setVisibility(4);
        frameLayout.addView(this.h, w7.x5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        if (this.f37772c0) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            org.telegram.ui.Components.my0 my0Var = new org.telegram.ui.Components.my0(context, this.currentAccount, null, this.resourceProvider);
            this.Q = my0Var;
            my0Var.f26301y = true;
            my0Var.E = true;
            my0Var.setHorizontalPadding(AndroidUtilities.dp(24.0f));
            frameLayout.addView(this.Q, w7.x5.e(-2, 160, 51));
        }
        this.S = new ci.i4(this.e, false, null);
        i0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            org.telegram.ui.Components.lz lzVar = this.R;
            if (lzVar != null) {
                lzVar.P.f1();
            }
            org.telegram.ui.Cells.d6 d6Var = this.f37770b0;
            if (d6Var != null) {
                int currentTextColor = d6Var.getEditField().getCurrentTextColor();
                this.f37770b0.getEditField().setTextColor(-1);
                this.f37770b0.getEditField().setTextColor(currentTextColor);
            }
        }
    }

    public final void f0() {
        int i10;
        org.telegram.ui.Components.my0 my0Var = this.Q;
        if (my0Var != null) {
            my0Var.setDelegate(null);
            this.Q.f();
        }
        int i11 = this.f37799y;
        this.f37795w[i11] = false;
        int i12 = i11 + 1;
        this.f37799y = i12;
        if (this.f37788r != null) {
            int[] iArr = new int[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                int[] iArr2 = this.f37788r;
                if (i13 < iArr2.length) {
                    i10 = iArr2[i13];
                } else {
                    i10 = this.f37790s + 1;
                    this.f37790s = i10;
                }
                iArr[i13] = i10;
            }
            this.f37788r = iArr;
        }
        if (this.f37799y == this.v.length) {
            this.f37769b.u(this.f37785o0);
        }
        this.f37769b.o(this.f37785o0);
        r0();
        this.f37776f0 = false;
        this.f37777g0 = (this.f37784n0 + this.f37799y) - 1;
        this.f37769b.m(this.f37786p0);
    }

    public final void g0(float f7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new lg(this, f7, 3));
        ofFloat.addListener(new mv0(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.p1.f19441w);
        ofFloat.start();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37771c, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.s8.class, org.telegram.ui.Cells.d6.class, org.telegram.ui.Cells.x8.class}, null, null, null, org.telegram.ui.ActionBar.h6.f18789d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f18733a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f19065s8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37771c, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f19120v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f19084t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37771c, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.L6));
        int i11 = org.telegram.ui.ActionBar.h6.f19008p7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37771c, 262144, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView2"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37771c, 262144, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.A6));
        int i12 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37771c, 4, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37771c, 8388608, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.H6));
        int i13 = org.telegram.ui.ActionBar.h6.f18953m6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37771c, 8388608, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"deleteImageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37771c, 8388608, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"moveImageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37771c, 196608, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"deleteImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37771c, 262144, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"textView2"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37771c, 0, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.h6.f18917k7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37771c, 0, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37771c, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37771c, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19189z6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37771c, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.M6));
        int i15 = org.telegram.ui.ActionBar.h6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37771c, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"checkBox"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37771c, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f18878i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37771c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f18910k0, null, null, org.telegram.ui.ActionBar.h6.f18790d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37771c, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37771c, 32, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"imageView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37771c, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"imageView"}, null, null, -1, null, i14));
        return arrayList;
    }

    public final boolean h0(boolean z10) {
        int i10;
        int i11;
        boolean z11;
        TLRPC.MessageMedia messageMedia = this.f37801z0;
        boolean z12 = messageMedia instanceof TLRPC.TL_messageMediaToDo;
        CharSequence[] charSequenceArr = this.v;
        boolean z13 = false;
        if (z12) {
            TLRPC.TodoList todoList = ((TLRPC.TL_messageMediaToDo) messageMedia).todo;
            int i12 = 0;
            for (int i13 = 0; i13 < Math.min(this.f37799y, charSequenceArr.length); i13++) {
                if (!TextUtils.isEmpty(charSequenceArr[i13])) {
                    i12++;
                }
            }
            if ((!this.I && !TextUtils.equals(todoList.title.text, org.telegram.ui.Components.vn.Y(this.E))) || i12 != todoList.list.size()) {
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
            boolean isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.vn.Y(this.E));
            if (isEmpty) {
                for (int i15 = 0; i15 < this.f37799y && (isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.vn.Y(charSequenceArr[i15]))); i15++) {
                }
            }
            z13 = isEmpty;
        }
        if (z10 && !z13) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            boolean z14 = this.f37773d0;
            if (z14) {
                i10 = R.string.CancelTodoAlertTitle;
            } else {
                i10 = R.string.CancelPollAlertTitle;
            }
            alertDialog$Builder.f18409a.R = LocaleController.getString(i10);
            if (z14) {
                i11 = R.string.CancelTodoAlertText;
            } else {
                i11 = R.string.CancelPollAlertText;
            }
            alertDialog$Builder.f18409a.T = LocaleController.getString(i11);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new nl0(this, 4));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            showDialog(alertDialog$Builder.f18409a);
        }
        return z13;
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        if (this.f37777g0 < 0) {
            return true;
        }
        return false;
    }

    public final void i0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tv0.i0():void");
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false);
            if (this.actionBar.s()) {
                w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19138w8, false);
            }
            if (i0.a.f(w02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    public final void j0() {
        if (this.B0) {
            this.R.t(false);
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
        if (this.f37772c0) {
            if (this.P) {
                org.telegram.ui.Components.lz lzVar = this.R;
                lzVar.P.B0();
                lzVar.I.scrollTo(0, 0);
                lzVar.F(1);
                lzVar.Q.h1(0, 0);
                this.R.t(false);
                if (z10) {
                    this.R.A();
                }
                this.B0 = false;
                q0(0);
            }
            if (z10) {
                org.telegram.ui.Components.lz lzVar2 = this.R;
                if (lzVar2 != null && lzVar2.getVisibility() == 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.R.getMeasuredHeight());
                    ofFloat.addUpdateListener(new jv0(this, 1));
                    ofFloat.addListener(new mv0(this, 2));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.p1.f19441w);
                    ofFloat.start();
                    return;
                }
                l0();
            }
        }
    }

    public final void l0() {
        org.telegram.ui.Components.lz lzVar;
        org.telegram.ui.Components.ah emojiButton;
        if (!this.P && (lzVar = this.R) != null && lzVar.getVisibility() != 8) {
            org.telegram.ui.Cells.d6 d6Var = this.f37770b0;
            if (d6Var != null && (emojiButton = d6Var.getEmojiButton()) != null) {
                emojiButton.j(org.telegram.ui.Components.yg.e, false);
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
        this.S.e = true;
        EditTextBoldCursor editField = this.f37770b0.getEditField();
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
            x5 x5Var = this.f37800y0;
            AndroidUtilities.cancelRunOnUIThread(x5Var);
            AndroidUtilities.runOnUIThread(x5Var, 100L);
        }
    }

    public final void n0(wg wgVar) {
        this.f37774e0 = wgVar;
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
        if (this.f37776f0 && this.f37777g0 >= 0) {
            int i10 = 0;
            while (true) {
                if (i10 < this.f37771c.getChildCount()) {
                    view = this.f37771c.getChildAt(i10);
                    this.f37771c.getClass();
                    if (RecyclerView.R(view) == this.f37777g0) {
                        break;
                    }
                    i10++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view instanceof org.telegram.ui.Cells.d6) {
                AndroidUtilities.runOnUIThread(new hh(5, ((org.telegram.ui.Cells.d6) view).getTextView()), 300L);
                this.f37777g0 = -1;
            }
            this.f37776f0 = false;
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
        if (this.f37772c0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            org.telegram.ui.Components.lz lzVar = this.R;
            if (lzVar != null) {
                this.e.removeView(lzVar);
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        if (this.f37772c0) {
            k0(false);
            org.telegram.ui.Components.my0 my0Var = this.Q;
            if (my0Var != null) {
                my0Var.f();
            }
            org.telegram.ui.Cells.d6 d6Var = this.f37770b0;
            if (d6Var != null) {
                d6Var.setEmojiButtonVisibility(false);
                this.f37770b0.getTextView().clearFocus();
                AndroidUtilities.hideKeyboard(this.f37770b0.getEditField());
            }
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        rv0 rv0Var = this.f37769b;
        if (rv0Var != null) {
            rv0Var.l();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    public final void p0(TLRPC.MessageMedia messageMedia, boolean z10, int i10) {
        int i11;
        this.f37801z0 = messageMedia;
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
            this.f37799y = size;
            this.f37797x = size;
            this.f37790s = 0;
            this.f37788r = new int[size];
            int i12 = 0;
            while (true) {
                i11 = this.f37799y;
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
                this.f37788r[i12] = tL_messageMediaToDo.todo.list.get(i12).f18228id;
                this.f37790s = Math.max(this.f37790s, this.f37788r[i12]);
                i12++;
            }
            TLRPC.TodoList todoList = tL_messageMediaToDo.todo;
            this.J = todoList.others_can_complete;
            this.H = todoList.others_can_append;
            if (this.I) {
                this.f37799y = i11 + 1;
                r0();
                this.f37776f0 = true;
                int i13 = this.f37784n0;
                if (i10 < 0) {
                    i10 = this.f37799y - 1;
                }
                this.f37777g0 = i13 + i10;
            }
        }
    }

    public final void q0(int i10) {
        boolean z10;
        int i11;
        org.telegram.ui.Cells.d6 d6Var;
        if (this.f37772c0) {
            if (i10 == 1) {
                org.telegram.ui.Components.lz lzVar = this.R;
                if (lzVar != null && lzVar.getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.lz lzVar2 = this.R;
                if (lzVar2 != null && lzVar2.f25968c1 != UserConfig.selectedAccount) {
                    this.e.removeView(lzVar2);
                    this.R = null;
                }
                if (this.R == null) {
                    org.telegram.ui.Components.lz lzVar3 = new org.telegram.ui.Components.lz(null, true, false, false, getParentActivity(), true, null, null, true, this.resourceProvider, false, false);
                    this.R = lzVar3;
                    lzVar3.f26032w2 = false;
                    lzVar3.U0 = false;
                    lzVar3.setVisibility(8);
                    if (AndroidUtilities.isTablet()) {
                        this.R.setForseMultiwindowLayout(true);
                    }
                    this.R.setDelegate(new nv0(this));
                    this.e.addView(this.R);
                }
                this.R.setVisibility(0);
                this.P = true;
                org.telegram.ui.Components.lz lzVar4 = this.R;
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
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) lzVar4.getLayoutParams();
                layoutParams.height = i11;
                lzVar4.setLayoutParams(layoutParams);
                if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet() && (d6Var = this.f37770b0) != null) {
                    AndroidUtilities.hideKeyboard(d6Var.getEditField());
                }
                this.V = i11;
                this.S.a();
                this.e.requestLayout();
                org.telegram.ui.Components.ah emojiButton = this.f37770b0.getEmojiButton();
                if (emojiButton != null) {
                    emojiButton.j(org.telegram.ui.Components.yg.d, true);
                }
                if (!z10 && !this.Y) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V, 0.0f);
                    ofFloat.addUpdateListener(new jv0(this, 0));
                    ofFloat.addListener(new mv0(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.p1.f19441w);
                    ofFloat.start();
                    return;
                }
                return;
            }
            org.telegram.ui.Components.ah emojiButton2 = this.f37770b0.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(org.telegram.ui.Components.yg.e, true);
            }
            org.telegram.ui.Components.lz lzVar5 = this.R;
            if (lzVar5 != null) {
                this.P = false;
                this.B0 = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    lzVar5.setVisibility(8);
                }
            }
            if (i10 == 0) {
                this.V = 0;
            }
            this.S.a();
            this.e.requestLayout();
        }
    }

    public final void r0() {
        this.f37778h0 = -1;
        this.f37779i0 = -1;
        this.f37782l0 = -1;
        this.m0 = -1;
        this.f37780j0 = -1;
        this.f37781k0 = -1;
        this.f37784n0 = -1;
        this.f37785o0 = -1;
        this.f37789r0 = -1;
        this.f37791s0 = -1;
        this.f37793u0 = -1;
        this.f37794v0 = -1;
        this.f37792t0 = -1;
        this.f37796w0 = -1;
        this.f37787q0 = -1;
        this.f37798x0 = 0;
        boolean z10 = this.f37773d0;
        if (!z10 || !this.I) {
            this.f37778h0 = 0;
            this.f37779i0 = 1;
            this.f37782l0 = 2;
            this.f37798x0 = 4;
            this.m0 = 3;
        }
        int i10 = this.f37799y;
        if (i10 != 0) {
            int i11 = this.f37798x0;
            this.f37784n0 = i11;
            this.f37798x0 = i11 + i10;
        }
        if (i10 != this.v.length) {
            int i12 = this.f37798x0;
            this.f37798x0 = i12 + 1;
            this.f37785o0 = i12;
        }
        int i13 = this.f37798x0;
        int i14 = i13 + 1;
        this.f37798x0 = i14;
        this.f37786p0 = i13;
        if (!z10 || !this.I) {
            int i15 = i13 + 2;
            this.f37798x0 = i15;
            this.f37787q0 = i14;
            if (z10) {
                int i16 = i13 + 3;
                this.f37798x0 = i16;
                this.f37794v0 = i15;
                if (this.J) {
                    this.f37798x0 = i13 + 4;
                    this.f37793u0 = i16;
                    return;
                }
                return;
            }
            TLRPC.Chat chat = this.f37775f.e;
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                int i17 = this.f37798x0;
                this.f37798x0 = i17 + 1;
                this.f37789r0 = i17;
            }
            int i18 = this.N;
            if (i18 != 1) {
                int i19 = this.f37798x0;
                this.f37798x0 = i19 + 1;
                this.f37791s0 = i19;
            }
            if (i18 == 0) {
                int i20 = this.f37798x0;
                this.f37798x0 = i20 + 1;
                this.f37792t0 = i20;
            }
            int i21 = this.f37798x0;
            int i22 = i21 + 1;
            this.f37798x0 = i22;
            this.f37796w0 = i21;
            if (this.L) {
                this.f37780j0 = i22;
                this.f37798x0 = i21 + 3;
                this.f37781k0 = i21 + 2;
            }
        }
    }
}
