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
public final class zv0 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.nv0 {
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
    public org.telegram.ui.Components.kz R;
    public di.j4 S;
    public boolean T;
    public boolean U;
    public int V;
    public int W;
    public int X;
    public boolean Y;
    public int Z;
    public org.telegram.ui.ActionBar.v0 f43554a;
    public boolean f43555a0;
    public xv0 f43556b;
    public org.telegram.ui.Cells.c6 f43557b0;
    public ec1 f43558c;
    public final boolean f43559c0;
    public s4.c0 d;
    public final boolean f43560d0;
    public id f43561e;
    public yv0 f43562e0;
    public final co f43563f;
    public boolean f43564f0;
    public int f43565g0;
    public org.telegram.ui.Components.i40 h;
    public int f43566h0;
    public int f43567i0;
    public int f43568j0;
    public int f43569k0;
    public int f43570l0;
    public int m0;
    public final int f43571n;
    public int f43572n0;
    public int f43573o0;
    public int f43574p0;
    public int f43575q0;
    public int[] f43576r;
    public int f43577r0;
    public int f43578s;
    public int f43579s0;
    public int f43580t0;
    public int f43581u0;
    public final CharSequence[] v;
    public int f43582v0;
    public final boolean[] f43583w;
    public int f43584w0;
    public int f43585x;
    public int f43586x0;
    public int f43587y;
    public final w5 f43588y0;
    public TLRPC.MessageMedia f43589z0;

    public zv0(co coVar) {
        super(null);
        this.f43587y = 1;
        this.G = true;
        this.H = false;
        this.J = true;
        this.O = AndroidUtilities.dp(3.0f);
        this.f43565g0 = -1;
        this.f43588y0 = new w5(this, 12);
        this.f43560d0 = true;
        int i10 = getMessagesController().todoItemsMax;
        this.f43571n = i10;
        this.v = new CharSequence[i10];
        this.f43583w = new boolean[i10];
        this.f43563f = coVar;
        this.f43559c0 = AccountInstance.getInstance(this.currentAccount).getUserConfig().isPremium();
        this.L = false;
        this.N = 2;
    }

    public static void c0(zv0 zv0Var, View view, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z10 = zv0Var.f43560d0;
        if (view instanceof org.telegram.ui.Cells.c6) {
            org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
            if (i10 == zv0Var.f43567i0) {
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
            } else if (i10 == zv0Var.f43568j0) {
                Editable editable = zv0Var.F;
                if (editable != null) {
                    i15 = editable.length();
                } else {
                    i15 = 0;
                }
                i14 = 200;
                i13 = 200 - i15;
            } else {
                int i18 = zv0Var.f43572n0;
                if (i10 >= i18 && i10 < zv0Var.f43587y + i18) {
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
                c6Var.setText2(String.format("%d", Integer.valueOf(i13)));
                org.telegram.ui.ActionBar.j5 textView2 = c6Var.getTextView2();
                if (i13 < 0) {
                    i16 = org.telegram.ui.ActionBar.j6.f20907p7;
                } else {
                    i16 = org.telegram.ui.ActionBar.j6.A6;
                }
                textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
                textView2.setTag(Integer.valueOf(i16));
                return;
            }
            c6Var.setText2("");
        }
    }

    public static void d0(zv0 zv0Var, org.telegram.ui.Cells.c6 c6Var, boolean z10) {
        s4.c1 T;
        if (zv0Var.f43559c0 && z10) {
            if (zv0Var.f43557b0 == c6Var && zv0Var.P && zv0Var.B0) {
                zv0Var.j0();
                zv0Var.P = false;
            }
            org.telegram.ui.Cells.c6 c6Var2 = zv0Var.f43557b0;
            zv0Var.f43557b0 = c6Var;
            c6Var.setEmojiButtonVisibility(true);
            org.telegram.ui.Components.bh emojiButton = c6Var.getEmojiButton();
            org.telegram.ui.Components.zg zgVar = org.telegram.ui.Components.zg.f33179e;
            emojiButton.j(zgVar, false);
            ec1 ec1Var = zv0Var.f43558c;
            View F = ec1Var.F(c6Var);
            if (F == null) {
                T = null;
            } else {
                T = ec1Var.T(F);
            }
            org.telegram.ui.Components.my0 my0Var = zv0Var.Q;
            if (my0Var != null) {
                my0Var.f();
                org.telegram.ui.Components.my0 my0Var2 = zv0Var.Q;
                if (my0Var2 != null && T != null) {
                    View view = T.f45766a;
                    if ((view instanceof org.telegram.ui.Cells.c6) && my0Var2.getDelegate() != view) {
                        zv0Var.Q.setDelegate((org.telegram.ui.Cells.c6) view);
                    }
                }
            }
            if (c6Var2 != null && c6Var2 != c6Var) {
                if (zv0Var.P) {
                    zv0Var.j0();
                    zv0Var.k0(false);
                    zv0Var.m0();
                }
                c6Var2.setEmojiButtonVisibility(false);
                c6Var2.getEmojiButton().j(zgVar, false);
            }
        }
    }

    public static void e0(zv0 zv0Var, org.telegram.ui.Cells.c6 c6Var) {
        zv0Var.f43557b0 = c6Var;
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
        if (this.f43559c0) {
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
                    this.f43561e.requestLayout();
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
            if (this.Z != i10 || this.f43555a0 != z10) {
                this.Z = i10;
                this.f43555a0 = z10;
                boolean z14 = this.Y;
                org.telegram.ui.Cells.c6 c6Var = this.f43557b0;
                if (c6Var != null) {
                    if (c6Var.getEditField().isFocused() && this.S.c() && i10 > 0) {
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
                    this.f43561e.requestLayout();
                }
                if (this.Y && this.T) {
                    this.T = false;
                    AndroidUtilities.cancelRunOnUIThread(this.f43588y0);
                }
            }
        }
    }

    @Override
    public final View createView(Context context) {
        String upperCase;
        int i10;
        int i11;
        this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20690d6));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        kVar.C(getThemedColor(i12), false);
        this.actionBar.C(getThemedColor(i12), true);
        this.actionBar.B(getThemedColor(org.telegram.ui.ActionBar.j6.f21090z8), false);
        this.actionBar.setTitleColor(getThemedColor(i12));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        boolean z10 = this.f43560d0;
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
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new rv0(this));
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
        this.f43554a = n10.e(1, upperCase);
        this.f43556b = new xv0(this, context);
        id idVar = new id(3, context, this);
        this.f43561e = idVar;
        idVar.setDelegate(this);
        id idVar2 = this.f43561e;
        this.fragmentView = idVar2;
        idVar2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20634a7, false));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        this.f43558c = new ec1(context, 11, null);
        s4.j jVar = new s4.j();
        jVar.f45805m = false;
        jVar.C = false;
        jVar.o(org.telegram.ui.Components.pr.h);
        jVar.n(350L);
        this.f43558c.setItemAnimator(jVar);
        this.f43558c.setVerticalScrollBarEnabled(false);
        ((s4.j) this.f43558c.getItemAnimator()).C = false;
        s4.c0 c0Var = new s4.c0(1, false);
        this.d = c0Var;
        this.f43558c.setLayoutManager(c0Var);
        new s4.y(new ci.f(this, 6)).d(this.f43558c);
        frameLayout.addView(this.f43558c, w7.x5.e(-1, -1, 51));
        this.f43558c.setAdapter(this.f43556b);
        this.f43558c.setOnItemClickListener(new i(this, 23));
        this.f43558c.setOnScrollListener(new i3(this, 23));
        org.telegram.ui.Components.i40 i40Var = new org.telegram.ui.Components.i40(context, 4);
        this.h = i40Var;
        i40Var.setText(LocaleController.getString(R.string.PollTapToSelect));
        this.h.setAlpha(0.0f);
        this.h.setVisibility(4);
        frameLayout.addView(this.h, w7.x5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        if (this.f43559c0) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            org.telegram.ui.Components.my0 my0Var = new org.telegram.ui.Components.my0(context, this.currentAccount, null, this.resourceProvider);
            this.Q = my0Var;
            my0Var.f28596y = true;
            my0Var.E = true;
            my0Var.setHorizontalPadding(AndroidUtilities.dp(24.0f));
            frameLayout.addView(this.Q, w7.x5.e(-2, 160, 51));
        }
        this.S = new di.j4(this.f43561e, false, null);
        i0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            org.telegram.ui.Components.kz kzVar = this.R;
            if (kzVar != null) {
                kzVar.P.e1();
            }
            org.telegram.ui.Cells.c6 c6Var = this.f43557b0;
            if (c6Var != null) {
                int currentTextColor = c6Var.getEditField().getCurrentTextColor();
                this.f43557b0.getEditField().setTextColor(-1);
                this.f43557b0.getEditField().setTextColor(currentTextColor);
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
        int i11 = this.f43587y;
        this.f43583w[i11] = false;
        int i12 = i11 + 1;
        this.f43587y = i12;
        if (this.f43576r != null) {
            int[] iArr = new int[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                int[] iArr2 = this.f43576r;
                if (i13 < iArr2.length) {
                    i10 = iArr2[i13];
                } else {
                    i10 = this.f43578s + 1;
                    this.f43578s = i10;
                }
                iArr[i13] = i10;
            }
            this.f43576r = iArr;
        }
        if (this.f43587y == this.v.length) {
            this.f43556b.u(this.f43573o0);
        }
        this.f43556b.o(this.f43573o0);
        r0();
        this.f43564f0 = false;
        this.f43565g0 = (this.f43572n0 + this.f43587y) - 1;
        this.f43556b.m(this.f43574p0);
    }

    public final void g0(float f7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ng(this, f7, 3));
        ofFloat.addListener(new sv0(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.p1.f21302w);
        ofFloat.start();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43558c, 16, new Class[]{org.telegram.ui.Cells.l4.class, org.telegram.ui.Cells.r8.class, org.telegram.ui.Cells.c6.class, org.telegram.ui.Cells.w8.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20690d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f20634a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f20964s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43558c, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f21019v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20983t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43558c, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        int i11 = org.telegram.ui.ActionBar.j6.f20907p7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43558c, 262144, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView2"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43558c, 262144, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.A6));
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43558c, 4, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43558c, 8388608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.H6));
        int i13 = org.telegram.ui.ActionBar.j6.f20854m6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43558c, 8388608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"deleteImageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43558c, 8388608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"moveImageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43558c, 196608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"deleteImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43558c, 262144, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView2"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43558c, 0, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.j6.f20819k7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43558c, 0, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43558c, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43558c, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f21088z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43558c, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.M6));
        int i15 = org.telegram.ui.ActionBar.j6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43558c, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43558c, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f20780i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43558c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20812k0, null, null, org.telegram.ui.ActionBar.j6.f20691d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43558c, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43558c, 32, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43558c, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i14));
        return arrayList;
    }

    public final boolean h0(boolean z10) {
        int i10;
        int i11;
        boolean z11;
        TLRPC.MessageMedia messageMedia = this.f43589z0;
        boolean z12 = messageMedia instanceof TLRPC.TL_messageMediaToDo;
        CharSequence[] charSequenceArr = this.v;
        boolean z13 = false;
        if (z12) {
            TLRPC.TodoList todoList = ((TLRPC.TL_messageMediaToDo) messageMedia).todo;
            int i12 = 0;
            for (int i13 = 0; i13 < Math.min(this.f43587y, charSequenceArr.length); i13++) {
                if (!TextUtils.isEmpty(charSequenceArr[i13])) {
                    i12++;
                }
            }
            if ((!this.I && !TextUtils.equals(todoList.title.text, org.telegram.ui.Components.tn.Y(this.E))) || i12 != todoList.list.size()) {
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
            boolean isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.tn.Y(this.E));
            if (isEmpty) {
                for (int i15 = 0; i15 < this.f43587y && (isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.tn.Y(charSequenceArr[i15]))); i15++) {
                }
            }
            z13 = isEmpty;
        }
        if (z10 && !z13) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            boolean z14 = this.f43560d0;
            if (z14) {
                i10 = R.string.CancelTodoAlertTitle;
            } else {
                i10 = R.string.CancelPollAlertTitle;
            }
            alertDialog$Builder.f20225a.R = LocaleController.getString(i10);
            if (z14) {
                i11 = R.string.CancelTodoAlertText;
            } else {
                i11 = R.string.CancelPollAlertText;
            }
            alertDialog$Builder.f20225a.T = LocaleController.getString(i11);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new vl0(this, 4));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            showDialog(alertDialog$Builder.f20225a);
        }
        return z13;
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        if (this.f43565g0 < 0) {
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
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20690d6, false);
            if (this.actionBar.s()) {
                w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f21037w8, false);
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
        if (this.f43559c0) {
            if (this.P) {
                org.telegram.ui.Components.kz kzVar = this.R;
                kzVar.P.B0();
                kzVar.I.scrollTo(0, 0);
                kzVar.H(1);
                kzVar.Q.h1(0, 0);
                this.R.t(false);
                if (z10) {
                    this.R.B();
                }
                this.B0 = false;
                q0(0);
            }
            if (z10) {
                org.telegram.ui.Components.kz kzVar2 = this.R;
                if (kzVar2 != null && kzVar2.getVisibility() == 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.R.getMeasuredHeight());
                    ofFloat.addUpdateListener(new pv0(this, 1));
                    ofFloat.addListener(new sv0(this, 2));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.p1.f21302w);
                    ofFloat.start();
                    return;
                }
                l0();
            }
        }
    }

    public final void l0() {
        org.telegram.ui.Components.kz kzVar;
        org.telegram.ui.Components.bh emojiButton;
        if (!this.P && (kzVar = this.R) != null && kzVar.getVisibility() != 8) {
            org.telegram.ui.Cells.c6 c6Var = this.f43557b0;
            if (c6Var != null && (emojiButton = c6Var.getEmojiButton()) != null) {
                emojiButton.j(org.telegram.ui.Components.zg.f33179e, false);
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
        this.S.f7457e = true;
        EditTextBoldCursor editField = this.f43557b0.getEditField();
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
            w5 w5Var = this.f43588y0;
            AndroidUtilities.cancelRunOnUIThread(w5Var);
            AndroidUtilities.runOnUIThread(w5Var, 100L);
        }
    }

    public final void n0(yg ygVar) {
        this.f43562e0 = ygVar;
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
        if (this.f43564f0 && this.f43565g0 >= 0) {
            int i10 = 0;
            while (true) {
                if (i10 < this.f43558c.getChildCount()) {
                    view = this.f43558c.getChildAt(i10);
                    this.f43558c.getClass();
                    if (RecyclerView.R(view) == this.f43565g0) {
                        break;
                    }
                    i10++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view instanceof org.telegram.ui.Cells.c6) {
                AndroidUtilities.runOnUIThread(new kh(5, ((org.telegram.ui.Cells.c6) view).getTextView()), 300L);
                this.f43565g0 = -1;
            }
            this.f43564f0 = false;
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
        if (this.f43559c0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            org.telegram.ui.Components.kz kzVar = this.R;
            if (kzVar != null) {
                this.f43561e.removeView(kzVar);
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        if (this.f43559c0) {
            k0(false);
            org.telegram.ui.Components.my0 my0Var = this.Q;
            if (my0Var != null) {
                my0Var.f();
            }
            org.telegram.ui.Cells.c6 c6Var = this.f43557b0;
            if (c6Var != null) {
                c6Var.setEmojiButtonVisibility(false);
                this.f43557b0.getTextView().clearFocus();
                AndroidUtilities.hideKeyboard(this.f43557b0.getEditField());
            }
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        xv0 xv0Var = this.f43556b;
        if (xv0Var != null) {
            xv0Var.l();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    public final void p0(TLRPC.MessageMedia messageMedia, boolean z10, int i10) {
        int i11;
        this.f43589z0 = messageMedia;
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
            this.f43587y = size;
            this.f43585x = size;
            this.f43578s = 0;
            this.f43576r = new int[size];
            int i12 = 0;
            while (true) {
                i11 = this.f43587y;
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
                this.f43576r[i12] = tL_messageMediaToDo.todo.list.get(i12).f20041id;
                this.f43578s = Math.max(this.f43578s, this.f43576r[i12]);
                i12++;
            }
            TLRPC.TodoList todoList = tL_messageMediaToDo.todo;
            this.J = todoList.others_can_complete;
            this.H = todoList.others_can_append;
            if (this.I) {
                this.f43587y = i11 + 1;
                r0();
                this.f43564f0 = true;
                int i13 = this.f43572n0;
                if (i10 < 0) {
                    i10 = this.f43587y - 1;
                }
                this.f43565g0 = i13 + i10;
            }
        }
    }

    public final void q0(int i10) {
        boolean z10;
        int i11;
        org.telegram.ui.Cells.c6 c6Var;
        if (this.f43559c0) {
            if (i10 == 1) {
                org.telegram.ui.Components.kz kzVar = this.R;
                if (kzVar != null && kzVar.getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.kz kzVar2 = this.R;
                if (kzVar2 != null && kzVar2.f27959c1 != UserConfig.selectedAccount) {
                    this.f43561e.removeView(kzVar2);
                    this.R = null;
                }
                if (this.R == null) {
                    org.telegram.ui.Components.kz kzVar3 = new org.telegram.ui.Components.kz(null, true, false, false, getParentActivity(), true, null, null, true, this.resourceProvider, false, false);
                    this.R = kzVar3;
                    kzVar3.f28028x2 = false;
                    kzVar3.U0 = false;
                    kzVar3.setVisibility(8);
                    if (AndroidUtilities.isTablet()) {
                        this.R.setForseMultiwindowLayout(true);
                    }
                    this.R.setDelegate(new tv0(this));
                    this.f43561e.addView(this.R);
                }
                this.R.setVisibility(0);
                this.P = true;
                org.telegram.ui.Components.kz kzVar4 = this.R;
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
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kzVar4.getLayoutParams();
                layoutParams.height = i11;
                kzVar4.setLayoutParams(layoutParams);
                if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet() && (c6Var = this.f43557b0) != null) {
                    AndroidUtilities.hideKeyboard(c6Var.getEditField());
                }
                this.V = i11;
                this.S.a();
                this.f43561e.requestLayout();
                org.telegram.ui.Components.bh emojiButton = this.f43557b0.getEmojiButton();
                if (emojiButton != null) {
                    emojiButton.j(org.telegram.ui.Components.zg.d, true);
                }
                if (!z10 && !this.Y) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V, 0.0f);
                    ofFloat.addUpdateListener(new pv0(this, 0));
                    ofFloat.addListener(new sv0(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.p1.f21302w);
                    ofFloat.start();
                    return;
                }
                return;
            }
            org.telegram.ui.Components.bh emojiButton2 = this.f43557b0.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(org.telegram.ui.Components.zg.f33179e, true);
            }
            org.telegram.ui.Components.kz kzVar5 = this.R;
            if (kzVar5 != null) {
                this.P = false;
                this.B0 = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    kzVar5.setVisibility(8);
                }
            }
            if (i10 == 0) {
                this.V = 0;
            }
            this.S.a();
            this.f43561e.requestLayout();
        }
    }

    public final void r0() {
        this.f43566h0 = -1;
        this.f43567i0 = -1;
        this.f43570l0 = -1;
        this.m0 = -1;
        this.f43568j0 = -1;
        this.f43569k0 = -1;
        this.f43572n0 = -1;
        this.f43573o0 = -1;
        this.f43577r0 = -1;
        this.f43579s0 = -1;
        this.f43581u0 = -1;
        this.f43582v0 = -1;
        this.f43580t0 = -1;
        this.f43584w0 = -1;
        this.f43575q0 = -1;
        this.f43586x0 = 0;
        boolean z10 = this.f43560d0;
        if (!z10 || !this.I) {
            this.f43566h0 = 0;
            this.f43567i0 = 1;
            this.f43570l0 = 2;
            this.f43586x0 = 4;
            this.m0 = 3;
        }
        int i10 = this.f43587y;
        if (i10 != 0) {
            int i11 = this.f43586x0;
            this.f43572n0 = i11;
            this.f43586x0 = i11 + i10;
        }
        if (i10 != this.v.length) {
            int i12 = this.f43586x0;
            this.f43586x0 = i12 + 1;
            this.f43573o0 = i12;
        }
        int i13 = this.f43586x0;
        int i14 = i13 + 1;
        this.f43586x0 = i14;
        this.f43574p0 = i13;
        if (!z10 || !this.I) {
            int i15 = i13 + 2;
            this.f43586x0 = i15;
            this.f43575q0 = i14;
            if (z10) {
                int i16 = i13 + 3;
                this.f43586x0 = i16;
                this.f43582v0 = i15;
                if (this.J) {
                    this.f43586x0 = i13 + 4;
                    this.f43581u0 = i16;
                    return;
                }
                return;
            }
            TLRPC.Chat chat = this.f43563f.f35264e;
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                int i17 = this.f43586x0;
                this.f43586x0 = i17 + 1;
                this.f43577r0 = i17;
            }
            int i18 = this.N;
            if (i18 != 1) {
                int i19 = this.f43586x0;
                this.f43586x0 = i19 + 1;
                this.f43579s0 = i19;
            }
            if (i18 == 0) {
                int i20 = this.f43586x0;
                this.f43586x0 = i20 + 1;
                this.f43580t0 = i20;
            }
            int i21 = this.f43586x0;
            int i22 = i21 + 1;
            this.f43586x0 = i22;
            this.f43584w0 = i21;
            if (this.L) {
                this.f43568j0 = i22;
                this.f43586x0 = i21 + 3;
                this.f43569k0 = i21 + 2;
            }
        }
    }
}
