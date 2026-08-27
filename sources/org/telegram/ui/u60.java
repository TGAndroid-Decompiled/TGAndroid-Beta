package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

public final class u60 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.i40 {
    public TLRPC.FileLocation A;
    public TLRPC.InputFile B;
    public TLRPC.InputFile C;
    public TLRPC.VideoSize D;
    public String E;
    public double F;
    public ArrayList G;
    public boolean H;
    public boolean I;
    public org.telegram.ui.Components.j40 J;
    public String K;
    public final int L;
    public final boolean M;
    public org.telegram.ui.Components.oi0 N;
    public final boolean O;
    public String P;
    public final Location Q;
    public int R;
    public int S;
    public org.telegram.ui.Components.dz T;
    public t60 U;

    public s60 f43133a;

    public org.telegram.ui.Components.zk0 f43134b;

    public org.telegram.ui.Components.tt f43135c;
    public jh.z3 d;

    public ag.t0 f43136e;

    public fd f43137f;
    public AnimatorSet h;

    public gd f43138n;

    public final org.telegram.ui.Components.y8 f43139r;

    public FrameLayout f43140s;
    public org.telegram.ui.Components.m10 v;

    public org.telegram.ui.ActionBar.n1 f43141w;

    public Drawable f43142x;

    public TLRPC.FileLocation f43143y;

    public u60(Bundle bundle) {
        super(bundle);
        this.L = bundle.getInt("chatType", 0);
        this.f43139r = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        this.P = bundle.getString("address");
        this.Q = (Location) bundle.getParcelable("location");
        this.O = bundle.getBoolean("forImport", false);
        this.K = bundle.getString("title", null);
        this.M = bundle.getBoolean("canToggleTopics", true);
    }

    public static void U(u60 u60Var, ArrayList arrayList, ArrayList arrayList2, CountDownLatch countDownLatch) {
        arrayList.addAll(MessagesStorage.getInstance(u60Var.currentAccount).getUsers(arrayList2));
        countDownLatch.countDown();
    }

    @Override
    public final void E(float f10) {
        gd gdVar = this.f43138n;
        if (gdVar == null) {
            return;
        }
        gdVar.setProgress(f10);
    }

    @Override
    public final void J(boolean z10, boolean z11) {
        gd gdVar = this.f43138n;
        if (gdVar == null) {
            return;
        }
        gdVar.setProgress(0.0f);
    }

    @Override
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new oh.k(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 4));
    }

    public final String Y(int i10) {
        return getMessagesController().getUser((Long) this.G.get(i10)).first_name;
    }

    public final void Z(boolean z10, boolean z11) {
        if (this.f43137f == null) {
            return;
        }
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        if (!z11) {
            if (z10) {
                this.f43137f.setAlpha(1.0f);
                this.f43137f.setVisibility(4);
                this.f43138n.setAlpha(1.0f);
                this.f43138n.setVisibility(0);
                return;
            }
            this.f43137f.setAlpha(1.0f);
            this.f43137f.setVisibility(0);
            this.f43138n.setAlpha(0.0f);
            this.f43138n.setVisibility(4);
            return;
        }
        this.h = new AnimatorSet();
        int i10 = 1;
        if (z10) {
            this.f43138n.setVisibility(0);
            AnimatorSet animatorSet2 = this.h;
            fd fdVar = this.f43137f;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(fdVar, (Property<fd, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.f43138n, (Property<gd, Float>) property, 1.0f));
        } else {
            this.f43137f.setVisibility(0);
            AnimatorSet animatorSet3 = this.h;
            fd fdVar2 = this.f43137f;
            Property property2 = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(fdVar2, (Property<fd, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.f43138n, (Property<gd, Float>) property2, 0.0f));
        }
        this.h.setDuration(180L);
        this.h.addListener(new n40(i10, this, z10));
        this.h.start();
    }

    @Override
    public final View createView(Context context) {
        String string;
        org.telegram.ui.Components.tt ttVar = this.f43135c;
        if (ttVar != null) {
            ttVar.o();
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i10 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.NewGroup));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.g6.f22999a7;
        kVar.setBackgroundColor(getThemedColor(i11));
        final int i12 = 0;
        this.actionBar.setCastShadows(false);
        this.actionBar.setActionBarMenuOnItemClick(new zp(this, 23));
        ed edVar = new ed(2, context, this);
        edVar.setBackgroundColor(getThemedColor(i11));
        this.fragmentView = edVar;
        edVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.fragmentView.setOnTouchListener(new kh.e(2));
        this.f43142x = context.getResources().getDrawable(R.drawable.greydivider_top).mutate();
        ra1 ra1Var = new ra1(this, context, 15);
        ra1Var.setOrientation(1);
        edVar.addView(ra1Var, h7.z5.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f43140s = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.d0(AndroidUtilities.dp(16.0f), getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6)));
        ra1Var.addView(this.f43140s, h7.z5.k(9.0f, 0.0f, 9.0f, 0.0f, -1, -2));
        jh.z3 z3Var = new jh.z3(this, context, 8);
        this.d = z3Var;
        int i13 = this.L;
        z3Var.setRoundRadius(AndroidUtilities.dp(i13 == 5 ? 16.0f : 32.0f));
        org.telegram.ui.Components.y8 y8Var = this.f43139r;
        y8Var.n(5L, null, null);
        this.d.setImageDrawable(y8Var);
        this.d.setContentDescription(LocaleController.getString(R.string.ChoosePhoto));
        FrameLayout frameLayout2 = this.f43140s;
        jh.z3 z3Var2 = this.d;
        boolean z10 = LocaleController.isRTL;
        frameLayout2.addView(z3Var2, h7.z5.d(64, 64.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 16.0f, 16.0f, z10 ? 16.0f : 0.0f, 16.0f));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        ag.t0 t0Var = new ag.t0(this, context, paint, 11);
        this.f43136e = t0Var;
        FrameLayout frameLayout3 = this.f43140s;
        boolean z11 = LocaleController.isRTL;
        frameLayout3.addView(t0Var, h7.z5.d(64, 64.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 16.0f, 16.0f, z11 ? 16.0f : 0.0f, 16.0f));
        this.f43136e.setOnClickListener(new View.OnClickListener(this) {

            public final u60 f41284b;

            {
                this.f41284b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        u60 u60Var = this.f41284b;
                        u60Var.J.o(u60Var.f43143y != null, new r00(u60Var, 8), new s5(u60Var, 7), 0);
                        u60Var.N.K(0);
                        u60Var.N.N(43);
                        u60Var.f43137f.d();
                        break;
                    default:
                        u60 u60Var2 = this.f41284b;
                        if (!u60Var2.I) {
                            if (u60Var2.f43135c.f32875a.length() != 0) {
                                u60Var2.I = true;
                                AndroidUtilities.hideKeyboard(u60Var2.f43135c);
                                u60Var2.f43135c.setEnabled(false);
                                if (!u60Var2.J.h()) {
                                    org.telegram.ui.Components.m10 m10Var = u60Var2.v;
                                    if (m10Var != null) {
                                        m10Var.f(true, true);
                                    }
                                    u60Var2.R = u60Var2.getMessagesController().createChat(u60Var2.f43135c.getText().toString(), u60Var2.G, null, u60Var2.L, u60Var2.O, u60Var2.Q, u60Var2.P, u60Var2.S, u60Var2);
                                } else {
                                    u60Var2.H = true;
                                }
                            } else {
                                Vibrator vibrator = (Vibrator) u60Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(u60Var2.f43135c);
                            }
                            break;
                        }
                        break;
                }
            }
        });
        this.N = new org.telegram.ui.Components.oi0(R.raw.camera, "" + R.raw.camera, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false, null);
        fd fdVar = new fd(this, context, 2);
        this.f43137f = fdVar;
        fdVar.setScaleType(ImageView.ScaleType.CENTER);
        this.f43137f.setAnimation(this.N);
        this.f43137f.setEnabled(false);
        this.f43137f.setClickable(false);
        this.f43137f.setPadding(AndroidUtilities.dp(0.0f), 0, 0, AndroidUtilities.dp(1.0f));
        FrameLayout frameLayout4 = this.f43140s;
        fd fdVar2 = this.f43137f;
        boolean z12 = LocaleController.isRTL;
        frameLayout4.addView(fdVar2, h7.z5.d(64, 64.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 15.0f, 16.0f, z12 ? 15.0f : 0.0f, 16.0f));
        gd gdVar = new gd(this, context, i10);
        this.f43138n = gdVar;
        gdVar.setSize(AndroidUtilities.dp(30.0f));
        this.f43138n.setProgressColor(-1);
        this.f43138n.setNoProgress(false);
        FrameLayout frameLayout5 = this.f43140s;
        gd gdVar2 = this.f43138n;
        boolean z13 = LocaleController.isRTL;
        frameLayout5.addView(gdVar2, h7.z5.d(64, 64.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 16.0f, 16.0f, z13 ? 16.0f : 0.0f, 16.0f));
        Z(false, false);
        org.telegram.ui.Components.tt ttVar2 = new org.telegram.ui.Components.tt(context, edVar, this, 0, false, null);
        this.f43135c = ttVar2;
        ttVar2.setHint(LocaleController.getString((i13 == 0 || i13 == 4 || i13 == 5) ? R.string.EnterGroupNamePlaceholder : R.string.EnterListName));
        String str = this.K;
        if (str != null) {
            this.f43135c.setText(str);
            org.telegram.ui.Components.tt ttVar3 = this.f43135c;
            ttVar3.setSelection(ttVar3.getText().length());
            this.K = null;
        }
        TLRPC.User currentUser = getUserConfig().getCurrentUser();
        int size = this.G.size() + 1;
        if (size >= 2 && size <= 5 && TextUtils.isEmpty(this.f43135c.getText())) {
            try {
                if (size == 2) {
                    string = LocaleController.formatString("GroupCreateMembersTwo", R.string.GroupCreateMembersTwo, currentUser.first_name, Y(0));
                } else if (size == 3) {
                    string = LocaleController.formatString("GroupCreateMembersThree", R.string.GroupCreateMembersThree, currentUser.first_name, Y(0), Y(1));
                } else if (size != 4) {
                    if (size != 5) {
                        string = "";
                    } else {
                        string = LocaleController.formatString("GroupCreateMembersFive", R.string.GroupCreateMembersFive, currentUser.first_name, Y(0), Y(1), Y(2), Y(3));
                    }
                    if (!TextUtils.isEmpty(string)) {
                        this.f43135c.setText(string);
                        org.telegram.ui.Components.tt ttVar4 = this.f43135c;
                        ttVar4.w(0, ttVar4.getText().length());
                    }
                } else {
                    string = LocaleController.formatString("GroupCreateMembersFour", R.string.GroupCreateMembersFour, currentUser.first_name, Y(0), Y(1), Y(2));
                }
            } catch (Exception e9) {
                FileLog.e(e9);
            }
            if (!TextUtils.isEmpty(string)) {
                this.f43135c.setText(string);
                org.telegram.ui.Components.tt ttVar5 = this.f43135c;
                ttVar5.w(0, ttVar5.getText().length());
            }
        }
        this.f43135c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
        FrameLayout frameLayout6 = this.f43140s;
        org.telegram.ui.Components.tt ttVar6 = this.f43135c;
        boolean z14 = LocaleController.isRTL;
        frameLayout6.addView(ttVar6, h7.z5.d(-1, -2.0f, 16, z14 ? 5.0f : 96.0f, 0.0f, z14 ? 96.0f : 5.0f, 0.0f));
        org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(context, null);
        this.f43134b = zk0Var;
        zk0Var.p1();
        this.T = new org.telegram.ui.Components.dz(this.f43134b, 1);
        org.telegram.ui.Components.zk0 zk0Var2 = this.f43134b;
        s60 s60Var = new s60(this, context);
        this.f43133a = s60Var;
        zk0Var2.setAdapter(s60Var);
        this.f43134b.setLayoutManager(this.T);
        this.f43134b.setVerticalScrollBarEnabled(false);
        this.f43134b.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        ra1Var.addView(this.f43134b, h7.z5.n(-1, -1));
        this.f43134b.setOnScrollListener(new m3(this, 14));
        this.f43134b.setOnItemClickListener(new q60(this));
        org.telegram.ui.Components.m10 m10Var = new org.telegram.ui.Components.m10(context, this.resourceProvider, false);
        this.v = m10Var;
        i6.q2(m10Var);
        edVar.addView(this.v, org.telegram.ui.Components.m10.b());
        this.v.setOnClickListener(new View.OnClickListener(this) {

            public final u60 f41284b;

            {
                this.f41284b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        u60 u60Var = this.f41284b;
                        u60Var.J.o(u60Var.f43143y != null, new r00(u60Var, 8), new s5(u60Var, 7), 0);
                        u60Var.N.K(0);
                        u60Var.N.N(43);
                        u60Var.f43137f.d();
                        break;
                    default:
                        u60 u60Var2 = this.f41284b;
                        if (!u60Var2.I) {
                            if (u60Var2.f43135c.f32875a.length() != 0) {
                                u60Var2.I = true;
                                AndroidUtilities.hideKeyboard(u60Var2.f43135c);
                                u60Var2.f43135c.setEnabled(false);
                                if (!u60Var2.J.h()) {
                                    org.telegram.ui.Components.m10 m10Var2 = u60Var2.v;
                                    if (m10Var2 != null) {
                                        m10Var2.f(true, true);
                                    }
                                    u60Var2.R = u60Var2.getMessagesController().createChat(u60Var2.f43135c.getText().toString(), u60Var2.G, null, u60Var2.L, u60Var2.O, u60Var2.Q, u60Var2.P, u60Var2.S, u60Var2);
                                } else {
                                    u60Var2.H = true;
                                }
                            } else {
                                Vibrator vibrator = (Vibrator) u60Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(u60Var2.f43135c);
                            }
                            break;
                        }
                        break;
                }
            }
        });
        this.v.setContentDescription(LocaleController.getString(R.string.Done));
        this.v.f30519c.setImageResource(R.drawable.checkbig);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.updateInterfaces) {
            if (this.f43134b == null) {
                return;
            }
            int iIntValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_AVATAR & iIntValue) == 0 && (MessagesController.UPDATE_MASK_NAME & iIntValue) == 0 && (MessagesController.UPDATE_MASK_STATUS & iIntValue) == 0) {
                return;
            }
            int childCount = this.f43134b.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.f43134b.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.d4) {
                    ((org.telegram.ui.Cells.d4) childAt).f(iIntValue);
                }
            }
            return;
        }
        if (i10 == NotificationCenter.chatDidFailCreate) {
            this.R = 0;
            this.I = false;
            org.telegram.ui.Components.m10 m10Var = this.v;
            if (m10Var != null) {
                m10Var.f(false, true);
            }
            org.telegram.ui.Components.tt ttVar = this.f43135c;
            if (ttVar != null) {
                ttVar.setEnabled(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.chatDidCreated) {
            this.R = 0;
            long jLongValue = ((Long) objArr[0]).longValue();
            t60 t60Var = this.U;
            if (t60Var != null) {
                t60Var.a(this, jLongValue);
            } else {
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", jLongValue);
                bundle.putBoolean("just_created_chat", true);
                presentFragment(new rn(bundle), true);
            }
            if (this.B == null && this.C == null && this.D == null) {
                return;
            }
            getMessagesController().changeChatAvatar(jLongValue, null, this.B, this.C, this.D, this.F, this.E, this.f43143y, this.A, null);
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        if (this.J.g(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.J.f29571c && super.dismissDialogOnPause(dialog);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final cu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return this.f43135c.getText().toString();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 17);
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23053d6));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.f22999a7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43134b, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f23322s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23375v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23341t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43134b, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23144i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43134b, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.f23199l7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43134b, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.f23216m7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43134b, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.f23235n7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43134b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23175k0, null, null, org.telegram.ui.ActionBar.g6.f23054d7));
        org.telegram.ui.Components.tt ttVar = this.f43135c;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(ttVar, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43135c, 8388608, null, null, null, null, org.telegram.ui.ActionBar.g6.Xh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43135c, 16777216, null, null, null, null, org.telegram.ui.ActionBar.g6.Yh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43135c, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.f23181k6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43135c, 65568, null, null, null, null, org.telegram.ui.ActionBar.g6.f23198l6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43134b, 32, new Class[]{org.telegram.ui.Cells.w6.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23018b7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43134b, 48, new Class[]{org.telegram.ui.Cells.w6.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43134b, 0, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43134b, 4, new Class[]{org.telegram.ui.Cells.d4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.ai));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43134b, 262148, new Class[]{org.telegram.ui.Cells.d4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23234n6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43134b, 262148, new Class[]{org.telegram.ui.Cells.d4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23423y6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43134b, 0, new Class[]{org.telegram.ui.Cells.d4.class}, null, org.telegram.ui.ActionBar.g6.f23295r0, eVar, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43134b, 0, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43135c, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43135c, 8388608, null, null, null, null, org.telegram.ui.ActionBar.g6.H6));
        return arrayList;
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        return false;
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        this.J.i(i10, i11, intent);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.tt ttVar = this.f43135c;
        if (ttVar == null || !ttVar.f32878e) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        ttVar.k(true);
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        u60 u60Var;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidFailCreate);
        org.telegram.ui.Components.j40 j40Var = new org.telegram.ui.Components.j40(2, true, true);
        this.J = j40Var;
        j40Var.f29569a = this;
        j40Var.f29570b = this;
        long[] longArray = getArguments().getLongArray("result");
        int i10 = 0;
        if (longArray != null) {
            this.G = new ArrayList(longArray.length);
            int iF = 0;
            while (iF < longArray.length) {
                iF = com.google.android.recaptcha.internal.a.f(longArray[iF], this.G, iF, 1);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < this.G.size(); i11++) {
            Long l10 = (Long) this.G.get(i11);
            if (getMessagesController().getUser(l10) == null) {
                arrayList.add(l10);
            }
        }
        if (arrayList.isEmpty()) {
            u60Var = this;
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ArrayList arrayList2 = new ArrayList();
            u60Var = this;
            MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new org.telegram.ui.Components.l11(u60Var, arrayList2, arrayList, countDownLatch, 6));
            try {
                countDownLatch.await();
            } catch (Exception e9) {
                FileLog.e(e9);
            }
            if (arrayList.size() != arrayList2.size() || arrayList2.isEmpty()) {
                return false;
            }
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                getMessagesController().putUser((TLRPC.User) obj, true);
            }
        }
        u60Var.S = getUserConfig().getGlobalTTl() * 60;
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidFailCreate);
        this.J.e();
        if (this.R != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.R, true);
        }
        org.telegram.ui.Components.tt ttVar = this.f43135c;
        if (ttVar != null) {
            ttVar.o();
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.tt ttVar = this.f43135c;
        if (ttVar != null) {
            ttVar.r();
        }
        this.J.j();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        this.J.k(i10, strArr, iArr);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.tt ttVar = this.f43135c;
        if (ttVar != null) {
            ttVar.s();
        }
        s60 s60Var = this.f43133a;
        if (s60Var != null) {
            s60Var.l();
        }
        this.J.l();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            org.telegram.ui.Components.ot otVar = this.f43135c.f32875a;
            otVar.requestFocus();
            AndroidUtilities.showKeyboard(otVar);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.j40 j40Var = this.J;
        if (j40Var != null) {
            j40Var.f29573f = bundle.getString("path");
        }
        String string = bundle.getString("nameTextView");
        if (string != null) {
            org.telegram.ui.Components.tt ttVar = this.f43135c;
            if (ttVar != null) {
                ttVar.setText(string);
            } else {
                this.K = string;
            }
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.j40 j40Var = this.J;
        if (j40Var != null && (str = j40Var.f29573f) != null) {
            bundle.putString("path", str);
        }
        org.telegram.ui.Components.tt ttVar = this.f43135c;
        if (ttVar != null) {
            String string = ttVar.getText().toString();
            if (string.length() != 0) {
                bundle.putString("nameTextView", string);
            }
        }
    }

    @Override
    public final boolean v() {
        return false;
    }

    @Override
    public final void P() {
    }
}
