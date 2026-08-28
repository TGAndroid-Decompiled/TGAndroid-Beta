package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class z60 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public org.telegram.ui.ActionBar.w0 H;
    public boolean I;
    public final boolean J;
    public w60 K;
    public FrameLayout f45041a;
    public org.telegram.ui.Components.gw0 f45042b;
    public org.telegram.ui.Components.e00 f45043c;
    public org.telegram.ui.Components.wk0 d;
    public x60 f45044e;
    public y60 f45045f;
    public f2.m0 h;
    public int f45046n;
    public TLRPC.TL_messages_stickerSet f45047r;
    public boolean f45048s;
    public TLRPC.ChatFull v;
    public final long f45049w;
    public int f45050x;
    public int f45051y;

    public z60(long j10) {
        super(null);
        this.f45046n = -1;
        this.f45049w = j10;
    }

    public static void T(z60 z60Var, View view, int i9) {
        if (z60Var.getParentActivity() != null) {
            if (z60Var.I) {
                if (i9 > z60Var.f45045f.d.size()) {
                    boolean a2 = ((org.telegram.ui.Cells.k8) view).a();
                    y60 y60Var = z60Var.f45045f;
                    z60Var.c0((TLRPC.TL_messages_stickerSet) y60Var.f44754e.get((i9 - y60Var.d.size()) - 1), a2, false);
                    return;
                } else if (i9 != z60Var.f45045f.d.size()) {
                    z60Var.c0((TLRPC.TL_messages_stickerSet) z60Var.f45045f.d.get(i9), ((org.telegram.ui.Cells.k8) view).a(), true);
                    return;
                } else {
                    return;
                }
            }
            if (i9 >= z60Var.A && i9 < z60Var.B) {
                z60Var.c0(MediaDataController.getInstance(z60Var.currentAccount).getStickerSets(z60Var.b0()).get(i9 - z60Var.A), ((org.telegram.ui.Cells.k8) view).a(), false);
            }
            if (i9 == z60Var.F) {
                z60Var.c0(z60Var.f45047r, true, false);
            }
        }
    }

    public static void U(z60 z60Var, TLRPC.TL_error tL_error) {
        boolean z10 = z60Var.J;
        if (tL_error == null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = z60Var.f45047r;
            if (tL_messages_stickerSet == null) {
                if (z10) {
                    z60Var.v.emojiset = null;
                } else {
                    z60Var.v.stickerset = null;
                }
            } else {
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                if (z10) {
                    z60Var.v.emojiset = stickerSet;
                } else {
                    z60Var.v.stickerset = stickerSet;
                }
                MediaDataController.getInstance(z60Var.currentAccount).putGroupStickerSet(z60Var.f45047r);
            }
            z60Var.g0();
            if (z10) {
                TLRPC.ChatFull chatFull = z60Var.v;
                if (chatFull.emojiset != null) {
                    chatFull.flags2 |= 1024;
                } else {
                    chatFull.flags2 &= -1025;
                }
            } else {
                TLRPC.ChatFull chatFull2 = z60Var.v;
                if (chatFull2.stickerset == null) {
                    chatFull2.flags |= 256;
                } else {
                    chatFull2.flags &= -257;
                }
            }
            MessagesStorage.getInstance(z60Var.currentAccount).updateChatInfo(z60Var.v, false);
            NotificationCenter.getInstance(z60Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatInfoDidLoad, z60Var.v, 0, Boolean.TRUE, Boolean.FALSE);
            NotificationCenter.getInstance(z60Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupPackUpdated, Long.valueOf(z60Var.v.f22381id), Boolean.valueOf(z10));
            z60Var.finishFragment();
        } else if (z60Var.getParentActivity() != null) {
            Activity parentActivity = z60Var.getParentActivity();
            StringBuilder sb2 = new StringBuilder();
            org.telegram.ui.Cells.j2.k(R.string.ErrorOccurred, "\n", sb2);
            sb2.append(tL_error.text);
            Toast.makeText(parentActivity, sb2.toString(), 0).show();
        }
    }

    public static int W(z60 z60Var) {
        return z60Var.currentAccount;
    }

    public static void Z(z60 z60Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i9 = z60Var.f45046n;
        if (tL_messages_stickerSet == null) {
            if (z60Var.f45047r != null) {
                org.telegram.messenger.l0.p(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.oc.a0(z60Var), R.raw.done, 36);
            }
            z60Var.f45047r = null;
            z60Var.f45048s = true;
        } else {
            z60Var.f45047r = tL_messages_stickerSet;
            z60Var.f45048s = false;
            org.telegram.messenger.l0.p(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.oc.a0(z60Var), R.raw.done, 36);
        }
        z60Var.g0();
        z60Var.e0(z60Var.f45047r, false);
        if (i9 != -1) {
            if (!z60Var.I) {
                for (int i10 = 0; i10 < z60Var.d.getChildCount(); i10++) {
                    View childAt = z60Var.d.getChildAt(i10);
                    if (z60Var.d.T(childAt).b() == z60Var.A + i9) {
                        ((org.telegram.ui.Cells.k8) childAt).b(false, true);
                        break;
                    }
                }
            }
            z60Var.f45044e.m(z60Var.A + i9);
        }
        if (z60Var.f45046n != -1) {
            if (!z60Var.I) {
                for (int i11 = 0; i11 < z60Var.d.getChildCount(); i11++) {
                    View childAt2 = z60Var.d.getChildAt(i11);
                    if (z60Var.d.T(childAt2).b() == z60Var.A + z60Var.f45046n) {
                        ((org.telegram.ui.Cells.k8) childAt2).b(true, true);
                        return;
                    }
                }
            }
            z60Var.f45044e.m(z60Var.A + z60Var.f45046n);
        }
    }

    public final TLRPC.StickerSet a0(TLRPC.ChatFull chatFull) {
        if (chatFull == null) {
            return null;
        }
        if (this.J) {
            return chatFull.emojiset;
        }
        return chatFull.stickerset;
    }

    public final int b0() {
        if (this.J) {
            return 5;
        }
        return 0;
    }

    public final void c0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z10, boolean z11) {
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
        if (z11) {
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName2.short_name = tL_messages_stickerSet.set.short_name;
            tL_inputStickerSetShortName = tL_inputStickerSetShortName2;
        } else {
            tL_inputStickerSetShortName = null;
        }
        Activity parentActivity = getParentActivity();
        if (!z11) {
            tL_messages_stickerSet2 = tL_messages_stickerSet;
        } else {
            tL_messages_stickerSet2 = null;
        }
        org.telegram.ui.Components.cx0 cx0Var = new org.telegram.ui.Components.cx0(parentActivity, this, tL_inputStickerSetShortName, tL_messages_stickerSet2, null, null);
        cx0Var.Z = new u60(this, z10, tL_messages_stickerSet);
        cx0Var.A0();
        AndroidUtilities.hideKeyboard(getParentActivity().getCurrentFocus());
        cx0Var.show();
    }

    @Override
    public final View createView(Context context) {
        int i9;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (this.J) {
            i9 = R.string.GroupEmojiPack;
        } else {
            i9 = R.string.GroupStickers;
        }
        kVar.setTitle(LocaleController.getString(i9));
        this.actionBar.setActionBarMenuOnItemClick(new tq(this, 24));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        this.H = a2;
        a2.F();
        a2.D = new cb(this, 9);
        this.H.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f45044e = new x60(this, context);
        this.f45045f = new y60(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false));
        this.d = new org.telegram.ui.Components.wk0(context, null);
        f2.n nVar = new f2.n();
        nVar.n(200L);
        nVar.f5532m = true;
        this.d.setItemAnimator(nVar);
        f2.m0 m0Var = new f2.m0();
        this.h = m0Var;
        m0Var.j1(1);
        this.d.setLayoutManager(this.h);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f45041a = frameLayout2;
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
        org.telegram.ui.Components.e00 e00Var = new org.telegram.ui.Components.e00(context, getResourceProvider());
        this.f45043c = e00Var;
        e00Var.setViewType(19);
        this.f45043c.setIsSingleCell(true);
        this.f45043c.setItemsCount((int) Math.ceil(AndroidUtilities.displaySize.y / AndroidUtilities.dpf2(58.0f)));
        this.f45041a.addView(this.f45043c, g7.e6.c(-1.0f, -1));
        org.telegram.ui.Components.gw0 gw0Var = new org.telegram.ui.Components.gw0(context, this.f45043c, 1, null);
        this.f45042b = gw0Var;
        org.telegram.ui.Cells.e3.s2(gw0Var);
        this.f45041a.addView(this.f45042b);
        frameLayout.addView(this.f45041a);
        this.f45041a.setVisibility(8);
        this.d.setEmptyView(this.f45041a);
        frameLayout.addView(this.d, g7.e6.c(-1.0f, -1));
        this.d.setAdapter(this.f45044e);
        this.d.setOnItemClickListener(new i(this, 13));
        this.d.setOnScrollListener(new l3(this, 15));
        return this.fragmentView;
    }

    public final void d0(TLRPC.ChatFull chatFull) {
        this.v = chatFull;
        if (a0(chatFull) != null) {
            this.f45047r = MediaDataController.getInstance(this.currentAccount).getGroupStickerSetById(a0(this.v));
        }
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.stickersDidLoad) {
            if (((Integer) objArr[0]).intValue() == b0()) {
                f0(true);
            }
        } else if (i9 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f22381id == this.f45049w) {
                if (this.v == null && a0(chatFull) != null) {
                    this.f45047r = MediaDataController.getInstance(this.currentAccount).getGroupStickerSetById(a0(chatFull));
                }
                this.v = chatFull;
                f0(true);
            }
        } else if (i9 == NotificationCenter.groupStickersDidLoad) {
            long longValue = ((Long) objArr[0]).longValue();
            if (a0(this.v) != null && a0(this.v).f22407id == longValue) {
                f0(true);
            }
        }
    }

    public final void e0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z10) {
        boolean z11;
        if (!this.J) {
            return;
        }
        boolean z12 = true;
        if (tL_messages_stickerSet != null) {
            if (this.F == -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f45047r = tL_messages_stickerSet;
            f0(false);
            if (z11) {
                this.f45044e.o(this.F);
            } else {
                this.f45044e.m(this.F);
            }
            if (z10) {
                this.f45044e.m(this.E);
            }
            w60 w60Var = this.K;
            w60Var.f43681b = true;
            w60Var.invalidate();
            return;
        }
        int i9 = this.F;
        if (i9 <= 0) {
            z12 = false;
        }
        this.f45047r = null;
        if (z12) {
            this.f45044e.u(i9);
            if (z10) {
                this.f45044e.m(this.E);
            }
        }
        f0(false);
        w60 w60Var2 = this.K;
        w60Var2.f43681b = false;
        w60Var2.invalidate();
    }

    public final void f0(boolean z10) {
        x60 x60Var;
        this.D = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.C = 0;
        if (this.J) {
            this.D = 0;
            this.C = 2;
            this.E = 1;
            if (this.f45047r != null) {
                this.C = 3;
                this.F = 2;
            }
            int i9 = this.C;
            this.C = i9 + 1;
            this.G = i9;
        }
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(this.currentAccount).getStickerSets(b0());
        if (!stickerSets.isEmpty()) {
            int i10 = this.C;
            int i11 = i10 + 1;
            this.C = i11;
            this.f45051y = i10;
            this.A = i11;
            this.B = stickerSets.size() + i11;
            this.C = stickerSets.size() + this.C;
        } else {
            this.f45051y = -1;
            this.A = -1;
            this.B = -1;
        }
        int i12 = this.C;
        this.C = i12 + 1;
        this.f45050x = i12;
        g0();
        if (z10 && (x60Var = this.f45044e) != null) {
            x60Var.l();
        }
    }

    public final void g0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z60.g0():void");
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 16, new Class[]{org.telegram.ui.Cells.k8.class, org.telegram.ui.Cells.ba.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23001d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f22947a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i9 = org.telegram.ui.ActionBar.f6.f23269s8;
        arrayList.add(new org.telegram.ui.ActionBar.h6(kVar, 1, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 32768, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.f23321v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.f23287t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.f23092i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.f23121k0, null, null, org.telegram.ui.ActionBar.f6.f23002d7));
        int i10 = org.telegram.ui.ActionBar.f6.f22966b7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 32, new Class[]{org.telegram.ui.Cells.b9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 2, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.J6));
        int i11 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23386z6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 196608, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"optionsButton"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"optionsButton"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Uh));
        return arrayList;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        MediaDataController.getInstance(this.currentAccount).checkStickers(b0());
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.groupStickersDidLoad);
        f0(true);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        TLRPC.ChatFull chatFull;
        TLRPC.TL_channels_setStickers tL_channels_setStickers;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        if ((this.f45047r != null || this.f45048s) && (chatFull = this.v) != null) {
            if (a0(chatFull) == null || (tL_messages_stickerSet = this.f45047r) == null || tL_messages_stickerSet.set.f22407id != a0(this.v).f22407id) {
                if (a0(this.v) != null || this.f45047r != null) {
                    boolean z10 = this.J;
                    long j10 = this.f45049w;
                    if (z10) {
                        TLRPC.TL_channels_setEmojiStickers tL_channels_setEmojiStickers = new TLRPC.TL_channels_setEmojiStickers();
                        tL_channels_setEmojiStickers.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j10);
                        if (this.f45048s) {
                            tL_channels_setEmojiStickers.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                            tL_channels_setStickers = tL_channels_setEmojiStickers;
                        } else {
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            tL_channels_setEmojiStickers.stickerset = tL_inputStickerSetID;
                            TLRPC.StickerSet stickerSet = this.f45047r.set;
                            tL_inputStickerSetID.f22400id = stickerSet.f22407id;
                            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                            tL_channels_setStickers = tL_channels_setEmojiStickers;
                        }
                    } else {
                        TLRPC.TL_channels_setStickers tL_channels_setStickers2 = new TLRPC.TL_channels_setStickers();
                        tL_channels_setStickers2.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j10);
                        if (this.f45048s) {
                            tL_channels_setStickers2.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                            tL_channels_setStickers = tL_channels_setStickers2;
                        } else {
                            SharedPreferences.Editor edit = MessagesController.getEmojiSettings(this.currentAccount).edit();
                            edit.remove("group_hide_stickers_" + this.v.f22381id).apply();
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                            tL_channels_setStickers2.stickerset = tL_inputStickerSetID2;
                            TLRPC.StickerSet stickerSet2 = this.f45047r.set;
                            tL_inputStickerSetID2.f22400id = stickerSet2.f22407id;
                            tL_inputStickerSetID2.access_hash = stickerSet2.access_hash;
                            tL_channels_setStickers = tL_channels_setStickers2;
                        }
                    }
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_setStickers, new m(this, 9));
                }
            }
        }
    }

    public z60(long j10, int i9) {
        super(null);
        this.f45046n = -1;
        this.f45049w = j10;
        this.J = true;
    }
}
