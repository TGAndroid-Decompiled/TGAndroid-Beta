package org.telegram.ui;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
public final class st extends org.telegram.ui.Components.sa {
    public final FrameLayout T;
    public final kh.d U;
    public final kh.d V;
    public final ArrayList W;
    public final HashSet X;
    public boolean Y;
    public org.telegram.ui.Components.z41 Z;

    public st(Activity activity, HashSet hashSet) {
        super(activity, null, false, false, false, 1, new ih.b());
        ArrayList arrayList = new ArrayList();
        this.W = arrayList;
        HashSet hashSet2 = new HashSet();
        this.X = hashSet2;
        arrayList.addAll(hashSet);
        hashSet2.addAll(hashSet);
        fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.f6.f23072h5));
        this.drawDoubleNavigationBar = false;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.T = frameLayout;
        LinearLayout f10 = org.telegram.messenger.l0.f(activity, 1);
        frameLayout.addView(f10, g7.e6.e(-1, -1, 119));
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(R.drawable.ic_close_white);
        imageView.setColorFilter(new PorterDuffColorFilter(-8090220, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, g7.e6.d(24, 24.0f, 53, 0.0f, 14.0f, 14.0f, 0.0f));
        g7.g6.a(imageView);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final st f42489b;

            {
                this.f42489b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f42489b.dismiss();
                        return;
                    case 1:
                        this.f42489b.R(false);
                        return;
                    default:
                        this.f42489b.R(true);
                        return;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(activity);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, this.resourcesProvider)));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.filled_calls_users);
        frameLayout2.addView(imageView2, g7.e6.e(56, 56, 17));
        f10.addView(frameLayout2, g7.e6.t(80, 80, 1, 2, 21, 2, 13));
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        org.telegram.ui.Components.l80 a2 = g7.i6.a(activity, 20.0f, i9, true, this.resourcesProvider);
        a2.setText(LocaleController.getString(R.string.GroupCallCreateTitle));
        a2.setGravity(17);
        f10.addView(a2, g7.e6.t(-1, -2, 1, 2, 0, 2, 4));
        org.telegram.ui.Components.l80 a3 = g7.i6.a(activity, 14.0f, i9, false, this.resourcesProvider);
        a3.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallCreateText)));
        a3.setGravity(17);
        a3.setMaxWidth(kh.x3.a(a3.getText(), a3.getPaint()));
        f10.addView(a3, g7.e6.t(-1, -2, 1, 2, 0, 2, 23));
        org.telegram.ui.Components.z41 z41Var = this.Z;
        if (z41Var != null) {
            z41Var.N(false);
        }
        f2.n nVar = new f2.n();
        nVar.f5532m = false;
        nVar.C = false;
        nVar.o(org.telegram.ui.Components.gr.h);
        nVar.n(350L);
        this.d.setItemAnimator(nVar);
        this.d.setOnItemClickListener(new b1(this, 28));
        FrameLayout frameLayout3 = new FrameLayout(activity);
        LinearLayout f11 = org.telegram.messenger.l0.f(activity, 0);
        f11.setPadding(AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f));
        frameLayout3.addView(f11, g7.e6.e(-1, -2, 87));
        kh.d dVar = new kh.d(activity, this.resourcesProvider, true);
        this.U = dVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "x  ");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.eq(R.drawable.profile_phone, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVoice));
        dVar.g(spannableStringBuilder, false, true);
        f11.addView(dVar, g7.e6.p(-1, 48, 1.0f, 119, 0, 0, 6, 0));
        dVar.setOnClickListener(new View.OnClickListener(this) {
            public final st f42489b;

            {
                this.f42489b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f42489b.dismiss();
                        return;
                    case 1:
                        this.f42489b.R(false);
                        return;
                    default:
                        this.f42489b.R(true);
                        return;
                }
            }
        });
        kh.d dVar2 = new kh.d(activity, this.resourcesProvider, true);
        this.V = dVar2;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) "x  ");
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.eq(R.drawable.profile_video, 0), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVideo));
        dVar2.g(spannableStringBuilder2, false, true);
        f11.addView(dVar2, g7.e6.p(-1, 48, 1.0f, 119, 6, 0, 0, 0));
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final st f42489b;

            {
                this.f42489b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f42489b.dismiss();
                        return;
                    case 1:
                        this.f42489b.R(false);
                        return;
                    default:
                        this.f42489b.R(true);
                        return;
                }
            }
        });
        this.containerView.addView(frameLayout3, g7.e6.e(-1, -2, 87));
        org.telegram.ui.Components.wk0 wk0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        wk0Var.setPadding(i10, 0, i10, AndroidUtilities.dp(76.0f));
    }

    public static void P(st stVar, TLObject tLObject, kh.d dVar, boolean z10, HashSet hashSet, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(stVar.currentAccount).putUsers(updates.users, false);
            MessagesController.getInstance(stVar.currentAccount).putChats(updates.chats, false);
            ArrayList findUpdates = MessagesController.findUpdates(updates, TL_update.TL_updateGroupCall.class);
            int size = findUpdates.size();
            TLRPC.GroupCall groupCall = null;
            int i9 = 0;
            while (i9 < size) {
                Object obj = findUpdates.get(i9);
                i9++;
                groupCall = ((TL_update.TL_updateGroupCall) obj).call;
            }
            Utilities.stageQueue.postRunnable(new org.telegram.ui.Components.p61(8, stVar, updates));
            if (groupCall != null && LaunchActivity.C1 != null) {
                TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                tL_inputGroupCall.f22397id = groupCall.f22390id;
                tL_inputGroupCall.access_hash = groupCall.access_hash;
                stVar.dismiss();
                org.telegram.ui.Components.voip.e2.h(LaunchActivity.C1, stVar.currentAccount, tL_inputGroupCall, z10, groupCall, hashSet);
                return;
            }
            stVar.Y = false;
            dVar.setLoading(false);
        } else if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            MessagesController.getInstance(stVar.currentAccount).putUsers(groupcall.users, false);
            MessagesController.getInstance(stVar.currentAccount).putChats(groupcall.chats, false);
            if (LaunchActivity.C1 == null) {
                stVar.Y = false;
                dVar.setLoading(false);
                return;
            }
            TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
            TLRPC.GroupCall groupCall2 = groupcall.call;
            tL_inputGroupCall2.f22397id = groupCall2.f22390id;
            tL_inputGroupCall2.access_hash = groupCall2.access_hash;
            stVar.dismiss();
            org.telegram.ui.Components.voip.e2.h(LaunchActivity.C1, stVar.currentAccount, tL_inputGroupCall2, z10, groupcall.call, hashSet);
        } else if (tL_error != null) {
            org.telegram.ui.Cells.j2.s(stVar.topBulletinContainer, stVar.resourcesProvider, tL_error, false);
        }
    }

    public static void Q(st stVar, ArrayList arrayList) {
        arrayList.add(org.telegram.ui.Components.l41.k(stVar.T));
        arrayList.add(org.telegram.ui.Components.l41.B(null));
        ArrayList arrayList2 = stVar.W;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            org.telegram.ui.Cells.j2.l(R.string.GroupCallCreateAddMembers, arrayList);
            for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                Long l10 = (Long) arrayList2.get(i9);
                l10.getClass();
                TLRPC.User user = MessagesController.getInstance(stVar.currentAccount).getUser(l10);
                if (user != null) {
                    int i10 = fg.o.f6322a;
                    org.telegram.ui.Components.l41 J = org.telegram.ui.Components.l41.J(fg.o.class);
                    J.G = user;
                    J.K(stVar.X.contains(l10));
                    arrayList.add(J);
                } else {
                    return;
                }
            }
        }
    }

    public final void R(boolean z10) {
        kh.d dVar;
        if (this.Y) {
            return;
        }
        this.Y = true;
        if (z10) {
            dVar = this.V;
        } else {
            dVar = this.U;
        }
        dVar.setLoading(true);
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.X);
        TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
        createconferencecall.random_id = Utilities.random.nextInt();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(createconferencecall, new kh.t1(this, dVar, z10, hashSet));
    }

    @Override
    public final org.telegram.ui.Components.vk0 v(org.telegram.ui.Components.wk0 wk0Var) {
        org.telegram.ui.Components.z41 z41Var = new org.telegram.ui.Components.z41(wk0Var, getContext(), this.currentAccount, 0, true, new a5(this, 10), this.resourcesProvider);
        this.Z = z41Var;
        return z41Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.GroupCallCreateTitle);
    }
}
