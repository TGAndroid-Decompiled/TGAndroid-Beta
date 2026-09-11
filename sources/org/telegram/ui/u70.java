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
public final class u70 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public org.telegram.ui.ActionBar.v0 L;
    public boolean M;
    public final boolean N;
    public r70 O;
    public FrameLayout f40954a;
    public org.telegram.ui.Components.xw0 f40955b;
    public org.telegram.ui.Components.t00 f40956c;
    public org.telegram.ui.Components.ll0 d;
    public s70 f40957e;
    public t70 f40958f;
    public s4.c0 h;
    public int f40959n;
    public TLRPC.TL_messages_stickerSet f40960r;
    public boolean f40961s;
    public TLRPC.ChatFull v;
    public final long f40962w;
    public int f40963x;
    public int f40964y;

    public u70(long j3) {
        super(null);
        this.f40959n = -1;
        this.f40962w = j3;
    }

    public static void U(u70 u70Var, View view, int i10) {
        if (u70Var.getParentActivity() != null) {
            if (u70Var.M) {
                if (i10 > u70Var.f40958f.d.size()) {
                    boolean a2 = ((org.telegram.ui.Cells.m8) view).a();
                    t70 t70Var = u70Var.f40958f;
                    u70Var.d0((TLRPC.TL_messages_stickerSet) t70Var.f40644e.get((i10 - t70Var.d.size()) - 1), a2, false);
                    return;
                } else if (i10 != u70Var.f40958f.d.size()) {
                    u70Var.d0((TLRPC.TL_messages_stickerSet) u70Var.f40958f.d.get(i10), ((org.telegram.ui.Cells.m8) view).a(), true);
                    return;
                } else {
                    return;
                }
            }
            if (i10 >= u70Var.E && i10 < u70Var.F) {
                u70Var.d0(MediaDataController.getInstance(u70Var.currentAccount).getStickerSets(u70Var.c0()).get(i10 - u70Var.E), ((org.telegram.ui.Cells.m8) view).a(), false);
            }
            if (i10 == u70Var.J) {
                u70Var.d0(u70Var.f40960r, true, false);
            }
        }
    }

    public static void V(u70 u70Var, TLRPC.TL_error tL_error) {
        boolean z10 = u70Var.N;
        if (tL_error == null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = u70Var.f40960r;
            if (tL_messages_stickerSet == null) {
                if (z10) {
                    u70Var.v.emojiset = null;
                } else {
                    u70Var.v.stickerset = null;
                }
            } else {
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                if (z10) {
                    u70Var.v.emojiset = stickerSet;
                } else {
                    u70Var.v.stickerset = stickerSet;
                }
                MediaDataController.getInstance(u70Var.currentAccount).putGroupStickerSet(u70Var.f40960r);
            }
            u70Var.h0();
            if (z10) {
                TLRPC.ChatFull chatFull = u70Var.v;
                if (chatFull.emojiset != null) {
                    chatFull.flags2 |= 1024;
                } else {
                    chatFull.flags2 &= -1025;
                }
            } else {
                TLRPC.ChatFull chatFull2 = u70Var.v;
                if (chatFull2.stickerset == null) {
                    chatFull2.flags |= 256;
                } else {
                    chatFull2.flags &= -257;
                }
            }
            MessagesStorage.getInstance(u70Var.currentAccount).updateChatInfo(u70Var.v, false);
            NotificationCenter.getInstance(u70Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatInfoDidLoad, u70Var.v, 0, Boolean.TRUE, Boolean.FALSE);
            NotificationCenter.getInstance(u70Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupPackUpdated, Long.valueOf(u70Var.v.f19870id), Boolean.valueOf(z10));
            u70Var.finishFragment();
        } else if (u70Var.getParentActivity() != null) {
            Activity parentActivity = u70Var.getParentActivity();
            StringBuilder sb2 = new StringBuilder();
            org.telegram.messenger.vl.l(R.string.ErrorOccurred, "\n", sb2);
            sb2.append(tL_error.text);
            Toast.makeText(parentActivity, sb2.toString(), 0).show();
        }
    }

    public static int X(u70 u70Var) {
        return u70Var.currentAccount;
    }

    public static void a0(u70 u70Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i10 = u70Var.f40959n;
        if (tL_messages_stickerSet == null) {
            if (u70Var.f40960r != null) {
                org.telegram.messenger.w1.o(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.yc.a0(u70Var), R.raw.done, 36);
            }
            u70Var.f40960r = null;
            u70Var.f40961s = true;
        } else {
            u70Var.f40960r = tL_messages_stickerSet;
            u70Var.f40961s = false;
            org.telegram.messenger.w1.o(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.yc.a0(u70Var), R.raw.done, 36);
        }
        u70Var.h0();
        u70Var.f0(u70Var.f40960r, false);
        if (i10 != -1) {
            if (!u70Var.M) {
                for (int i11 = 0; i11 < u70Var.d.getChildCount(); i11++) {
                    View childAt = u70Var.d.getChildAt(i11);
                    if (u70Var.d.T(childAt).b() == u70Var.E + i10) {
                        ((org.telegram.ui.Cells.m8) childAt).b(false, true);
                        break;
                    }
                }
            }
            u70Var.f40957e.m(u70Var.E + i10);
        }
        if (u70Var.f40959n != -1) {
            if (!u70Var.M) {
                for (int i12 = 0; i12 < u70Var.d.getChildCount(); i12++) {
                    View childAt2 = u70Var.d.getChildAt(i12);
                    if (u70Var.d.T(childAt2).b() == u70Var.E + u70Var.f40959n) {
                        ((org.telegram.ui.Cells.m8) childAt2).b(true, true);
                        return;
                    }
                }
            }
            u70Var.f40957e.m(u70Var.E + u70Var.f40959n);
        }
    }

    public final TLRPC.StickerSet b0(TLRPC.ChatFull chatFull) {
        if (chatFull == null) {
            return null;
        }
        if (this.N) {
            return chatFull.emojiset;
        }
        return chatFull.stickerset;
    }

    public final int c0() {
        if (this.N) {
            return 5;
        }
        return 0;
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (this.N) {
            i10 = R.string.GroupEmojiPack;
        } else {
            i10 = R.string.GroupStickers;
        }
        kVar.setTitle(LocaleController.getString(i10));
        this.actionBar.setActionBarMenuOnItemClick(new o70(this, 0));
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        this.L = a2;
        a2.F();
        a2.H = new ig.d2(this, 10);
        this.L.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f40957e = new s70(this, context);
        this.f40958f = new t70(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20607a7, false));
        this.d = new org.telegram.ui.Components.ll0(context, null);
        s4.j jVar = new s4.j();
        jVar.n(200L);
        jVar.f45777m = true;
        this.d.setItemAnimator(jVar);
        s4.c0 c0Var = new s4.c0();
        this.h = c0Var;
        c0Var.j1(1);
        this.d.setLayoutManager(this.h);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f40954a = frameLayout2;
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20663d6, false));
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, getResourceProvider());
        this.f40956c = t00Var;
        t00Var.setViewType(19);
        this.f40956c.setIsSingleCell(true);
        this.f40956c.setItemsCount((int) Math.ceil(AndroidUtilities.displaySize.y / AndroidUtilities.dpf2(58.0f)));
        this.f40954a.addView(this.f40956c, w7.x5.c(-1.0f, -1));
        org.telegram.ui.Components.xw0 xw0Var = new org.telegram.ui.Components.xw0(context, this.f40956c, 1, null);
        this.f40955b = xw0Var;
        n7.z0.g(xw0Var);
        this.f40954a.addView(this.f40955b);
        frameLayout.addView(this.f40954a);
        this.f40954a.setVisibility(8);
        this.d.setEmptyView(this.f40954a);
        frameLayout.addView(this.d, w7.x5.c(-1.0f, -1));
        this.d.setAdapter(this.f40957e);
        this.d.setOnItemClickListener(new i(this, 13));
        this.d.setOnScrollListener(new i3(this, 15));
        return this.fragmentView;
    }

    public final void d0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z10, boolean z11) {
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
        org.telegram.ui.Components.ux0 ux0Var = new org.telegram.ui.Components.ux0(parentActivity, this, tL_inputStickerSetShortName, tL_messages_stickerSet2, null, null);
        ux0Var.f30996d0 = new p70(this, z10, tL_messages_stickerSet);
        ux0Var.B0();
        AndroidUtilities.hideKeyboard(getParentActivity().getCurrentFocus());
        ux0Var.show();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.stickersDidLoad) {
            if (((Integer) objArr[0]).intValue() == c0()) {
                g0(true);
            }
        } else if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f19870id == this.f40962w) {
                if (this.v == null && b0(chatFull) != null) {
                    this.f40960r = MediaDataController.getInstance(this.currentAccount).getGroupStickerSetById(b0(chatFull));
                }
                this.v = chatFull;
                g0(true);
            }
        } else if (i10 == NotificationCenter.groupStickersDidLoad) {
            long longValue = ((Long) objArr[0]).longValue();
            if (b0(this.v) != null && b0(this.v).f19896id == longValue) {
                g0(true);
            }
        }
    }

    public final void e0(TLRPC.ChatFull chatFull) {
        this.v = chatFull;
        if (b0(chatFull) != null) {
            this.f40960r = MediaDataController.getInstance(this.currentAccount).getGroupStickerSetById(b0(this.v));
        }
    }

    public final void f0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z10) {
        boolean z11;
        if (!this.N) {
            return;
        }
        boolean z12 = true;
        if (tL_messages_stickerSet != null) {
            if (this.J == -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f40960r = tL_messages_stickerSet;
            g0(false);
            if (z11) {
                this.f40957e.o(this.J);
            } else {
                this.f40957e.m(this.J);
            }
            if (z10) {
                this.f40957e.m(this.I);
            }
            r70 r70Var = this.O;
            r70Var.f40085b = true;
            r70Var.invalidate();
            return;
        }
        int i10 = this.J;
        if (i10 <= 0) {
            z12 = false;
        }
        this.f40960r = null;
        if (z12) {
            this.f40957e.u(i10);
            if (z10) {
                this.f40957e.m(this.I);
            }
        }
        g0(false);
        r70 r70Var2 = this.O;
        r70Var2.f40085b = false;
        r70Var2.invalidate();
    }

    public final void g0(boolean z10) {
        s70 s70Var;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.G = 0;
        if (this.N) {
            this.H = 0;
            this.G = 2;
            this.I = 1;
            if (this.f40960r != null) {
                this.G = 3;
                this.J = 2;
            }
            int i10 = this.G;
            this.G = i10 + 1;
            this.K = i10;
        }
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(this.currentAccount).getStickerSets(c0());
        if (!stickerSets.isEmpty()) {
            int i11 = this.G;
            int i12 = i11 + 1;
            this.G = i12;
            this.f40964y = i11;
            this.E = i12;
            this.F = stickerSets.size() + i12;
            this.G = stickerSets.size() + this.G;
        } else {
            this.f40964y = -1;
            this.E = -1;
            this.F = -1;
        }
        int i13 = this.G;
        this.G = i13 + 1;
        this.f40963x = i13;
        h0();
        if (z10 && (s70Var = this.f40957e) != null) {
            s70Var.l();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 16, new Class[]{org.telegram.ui.Cells.m8.class, org.telegram.ui.Cells.ea.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20663d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f20607a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f20937s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20992v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20956t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f20753i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20785k0, null, null, org.telegram.ui.ActionBar.j6.f20664d7));
        int i11 = org.telegram.ui.ActionBar.j6.f20627b7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 2, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.J6));
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 32, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f21061z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 196608, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"optionsButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"optionsButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Uh));
        return arrayList;
    }

    public final void h0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u70.h0():void");
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        MediaDataController.getInstance(this.currentAccount).checkStickers(c0());
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.groupStickersDidLoad);
        g0(true);
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
        if ((this.f40960r != null || this.f40961s) && (chatFull = this.v) != null) {
            if (b0(chatFull) == null || (tL_messages_stickerSet = this.f40960r) == null || tL_messages_stickerSet.set.f19896id != b0(this.v).f19896id) {
                if (b0(this.v) != null || this.f40960r != null) {
                    boolean z10 = this.N;
                    long j3 = this.f40962w;
                    if (z10) {
                        TLRPC.TL_channels_setEmojiStickers tL_channels_setEmojiStickers = new TLRPC.TL_channels_setEmojiStickers();
                        tL_channels_setEmojiStickers.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j3);
                        if (this.f40961s) {
                            tL_channels_setEmojiStickers.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                            tL_channels_setStickers = tL_channels_setEmojiStickers;
                        } else {
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            tL_channels_setEmojiStickers.stickerset = tL_inputStickerSetID;
                            TLRPC.StickerSet stickerSet = this.f40960r.set;
                            tL_inputStickerSetID.f19889id = stickerSet.f19896id;
                            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                            tL_channels_setStickers = tL_channels_setEmojiStickers;
                        }
                    } else {
                        TLRPC.TL_channels_setStickers tL_channels_setStickers2 = new TLRPC.TL_channels_setStickers();
                        tL_channels_setStickers2.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j3);
                        if (this.f40961s) {
                            tL_channels_setStickers2.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                            tL_channels_setStickers = tL_channels_setStickers2;
                        } else {
                            SharedPreferences.Editor edit = MessagesController.getEmojiSettings(this.currentAccount).edit();
                            edit.remove("group_hide_stickers_" + this.v.f19870id).apply();
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                            tL_channels_setStickers2.stickerset = tL_inputStickerSetID2;
                            TLRPC.StickerSet stickerSet2 = this.f40960r.set;
                            tL_inputStickerSetID2.f19889id = stickerSet2.f19896id;
                            tL_inputStickerSetID2.access_hash = stickerSet2.access_hash;
                            tL_channels_setStickers = tL_channels_setStickers2;
                        }
                    }
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_setStickers, new m(this, 9));
                }
            }
        }
    }

    public u70(long j3, int i10) {
        super(null);
        this.f40959n = -1;
        this.f40962w = j3;
        this.N = true;
    }
}
