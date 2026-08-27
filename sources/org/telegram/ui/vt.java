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

public final class vt extends org.telegram.ui.Components.qa {
    public final FrameLayout T;
    public final lh.d U;
    public final lh.d V;
    public final ArrayList W;
    public final HashSet X;
    public boolean Y;
    public org.telegram.ui.Components.b51 Z;

    public vt(Activity activity, HashSet hashSet) {
        super(activity, null, false, false, false, 1, new jh.b());
        ArrayList arrayList = new ArrayList();
        this.W = arrayList;
        HashSet hashSet2 = new HashSet();
        this.X = hashSet2;
        arrayList.addAll(hashSet);
        hashSet2.addAll(hashSet);
        fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5));
        this.drawDoubleNavigationBar = false;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.T = frameLayout;
        LinearLayout linearLayoutF = org.telegram.messenger.y1.f(activity, 1);
        frameLayout.addView(linearLayoutF, h7.z5.e(-1, -1, 119));
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(R.drawable.ic_close_white);
        imageView.setColorFilter(new PorterDuffColorFilter(-8090220, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, h7.z5.d(24, 24.0f, 53, 0.0f, 14.0f, 14.0f, 0.0f));
        h7.b6.a(imageView);
        final int i10 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) {

            public final vt f43284b;

            {
                this.f43284b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.f43284b.dismiss();
                        break;
                    case 1:
                        this.f43284b.S(false);
                        break;
                    default:
                        this.f43284b.S(true);
                        break;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(activity);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, this.resourcesProvider)));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.filled_calls_users);
        frameLayout2.addView(imageView2, h7.z5.e(56, 56, 17));
        linearLayoutF.addView(frameLayout2, h7.z5.t(80, 80, 1, 2, 21, 2, 13));
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.Components.p80 p80VarA = h7.d6.a(activity, 20.0f, i11, true, this.resourcesProvider);
        p80VarA.setText(LocaleController.getString(R.string.GroupCallCreateTitle));
        p80VarA.setGravity(17);
        linearLayoutF.addView(p80VarA, h7.z5.t(-1, -2, 1, 2, 0, 2, 4));
        org.telegram.ui.Components.p80 p80VarA2 = h7.d6.a(activity, 14.0f, i11, false, this.resourcesProvider);
        p80VarA2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallCreateText)));
        p80VarA2.setGravity(17);
        p80VarA2.setMaxWidth(lh.w3.a(p80VarA2.getText(), p80VarA2.getPaint()));
        linearLayoutF.addView(p80VarA2, h7.z5.t(-1, -2, 1, 2, 0, 2, 23));
        org.telegram.ui.Components.b51 b51Var = this.Z;
        if (b51Var != null) {
            b51Var.N(false);
        }
        f2.l lVar = new f2.l();
        lVar.f5819m = false;
        lVar.C = false;
        lVar.o(org.telegram.ui.Components.er.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        this.d.setOnItemClickListener(new c1(this, 28));
        FrameLayout frameLayout3 = new FrameLayout(activity);
        LinearLayout linearLayoutF2 = org.telegram.messenger.y1.f(activity, 0);
        linearLayoutF2.setPadding(AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f));
        frameLayout3.addView(linearLayoutF2, h7.z5.e(-1, -2, 87));
        lh.d dVar = new lh.d(activity, this.resourcesProvider, true);
        this.U = dVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "x  ");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.cq(R.drawable.profile_phone, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVoice));
        dVar.g(spannableStringBuilder, false, true);
        linearLayoutF2.addView(dVar, h7.z5.p(-1, 48, 1.0f, 119, 0, 0, 6, 0));
        final int i12 = 1;
        dVar.setOnClickListener(new View.OnClickListener(this) {

            public final vt f43284b;

            {
                this.f43284b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.f43284b.dismiss();
                        break;
                    case 1:
                        this.f43284b.S(false);
                        break;
                    default:
                        this.f43284b.S(true);
                        break;
                }
            }
        });
        lh.d dVar2 = new lh.d(activity, this.resourcesProvider, true);
        this.V = dVar2;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) "x  ");
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.cq(R.drawable.profile_video, 0), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVideo));
        dVar2.g(spannableStringBuilder2, false, true);
        linearLayoutF2.addView(dVar2, h7.z5.p(-1, 48, 1.0f, 119, 6, 0, 0, 0));
        final int i13 = 2;
        dVar2.setOnClickListener(new View.OnClickListener(this) {

            public final vt f43284b;

            {
                this.f43284b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.f43284b.dismiss();
                        break;
                    case 1:
                        this.f43284b.S(false);
                        break;
                    default:
                        this.f43284b.S(true);
                        break;
                }
            }
        });
        this.containerView.addView(frameLayout3, h7.z5.e(-1, -2, 87));
        org.telegram.ui.Components.zk0 zk0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        zk0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(76.0f));
    }

    public static void Q(vt vtVar, TLObject tLObject, lh.d dVar, boolean z10, HashSet hashSet, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TLRPC.Updates)) {
            if (!(tLObject instanceof TL_phone.groupCall)) {
                if (tL_error != null) {
                    org.telegram.ui.Cells.pa.t(vtVar.topBulletinContainer, vtVar.resourcesProvider, tL_error, false);
                    return;
                }
                return;
            }
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            MessagesController.getInstance(vtVar.currentAccount).putUsers(groupcall.users, false);
            MessagesController.getInstance(vtVar.currentAccount).putChats(groupcall.chats, false);
            if (LaunchActivity.C1 == null) {
                vtVar.Y = false;
                dVar.setLoading(false);
                return;
            }
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            TLRPC.GroupCall groupCall = groupcall.call;
            tL_inputGroupCall.f22397id = groupCall.f22390id;
            tL_inputGroupCall.access_hash = groupCall.access_hash;
            vtVar.dismiss();
            org.telegram.ui.Components.voip.e2.h(LaunchActivity.C1, vtVar.currentAccount, tL_inputGroupCall, z10, groupcall.call, hashSet);
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        MessagesController.getInstance(vtVar.currentAccount).putUsers(updates.users, false);
        MessagesController.getInstance(vtVar.currentAccount).putChats(updates.chats, false);
        ArrayList arrayListFindUpdates = MessagesController.findUpdates(updates, TL_update.TL_updateGroupCall.class);
        int size = arrayListFindUpdates.size();
        TLRPC.GroupCall groupCall2 = null;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayListFindUpdates.get(i10);
            i10++;
            groupCall2 = ((TL_update.TL_updateGroupCall) obj).call;
        }
        Utilities.stageQueue.postRunnable(new org.telegram.ui.Components.r61(8, vtVar, updates));
        if (groupCall2 == null || LaunchActivity.C1 == null) {
            vtVar.Y = false;
            dVar.setLoading(false);
            return;
        }
        TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
        tL_inputGroupCall2.f22397id = groupCall2.f22390id;
        tL_inputGroupCall2.access_hash = groupCall2.access_hash;
        vtVar.dismiss();
        org.telegram.ui.Components.voip.e2.h(LaunchActivity.C1, vtVar.currentAccount, tL_inputGroupCall2, z10, groupCall2, hashSet);
    }

    public static void R(vt vtVar, ArrayList arrayList) {
        arrayList.add(org.telegram.ui.Components.n41.k(vtVar.T));
        arrayList.add(org.telegram.ui.Components.n41.B(null));
        ArrayList arrayList2 = vtVar.W;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        org.telegram.ui.Cells.pa.o(R.string.GroupCallCreateAddMembers, arrayList);
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            Long l10 = (Long) arrayList2.get(i10);
            l10.getClass();
            TLRPC.User user = MessagesController.getInstance(vtVar.currentAccount).getUser(l10);
            if (user == null) {
                return;
            }
            int i11 = gg.n.f7119a;
            org.telegram.ui.Components.n41 n41VarJ = org.telegram.ui.Components.n41.J(gg.n.class);
            n41VarJ.G = user;
            n41VarJ.K(vtVar.X.contains(l10));
            arrayList.add(n41VarJ);
        }
    }

    public final void S(boolean z10) {
        if (this.Y) {
            return;
        }
        this.Y = true;
        lh.d dVar = z10 ? this.V : this.U;
        dVar.setLoading(true);
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.X);
        TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
        createconferencecall.random_id = Utilities.random.nextInt();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(createconferencecall, new lh.r1(this, dVar, z10, hashSet));
    }

    @Override
    public final org.telegram.ui.Components.yk0 w(org.telegram.ui.Components.zk0 zk0Var) {
        org.telegram.ui.Components.b51 b51Var = new org.telegram.ui.Components.b51(zk0Var, getContext(), this.currentAccount, 0, true, new b5(this, 10), this.resourcesProvider);
        this.Z = b51Var;
        return b51Var;
    }

    @Override
    public final CharSequence z() {
        return LocaleController.getString(R.string.GroupCallCreateTitle);
    }
}
