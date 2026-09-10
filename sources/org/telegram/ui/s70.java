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
public final class s70 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public org.telegram.ui.ActionBar.w0 L;
    public boolean M;
    public final boolean N;
    public p70 O;
    public FrameLayout f36566a;
    public org.telegram.ui.Components.jx0 f36567b;
    public org.telegram.ui.Components.a10 f36568c;
    public org.telegram.ui.Components.vl0 d;
    public q70 e;
    public r70 f36569f;
    public s4.c0 h;
    public int f36570n;
    public TLRPC.TL_messages_stickerSet f36571r;
    public boolean f36572s;
    public TLRPC.ChatFull v;
    public final long f36573w;
    public int f36574x;
    public int f36575y;

    public s70(long j3) {
        super(null);
        this.f36570n = -1;
        this.f36573w = j3;
    }

    public static void U(s70 s70Var, View view, int i10) {
        if (s70Var.getParentActivity() != null) {
            if (s70Var.M) {
                if (i10 > s70Var.f36569f.d.size()) {
                    boolean a2 = ((org.telegram.ui.Cells.n8) view).a();
                    r70 r70Var = s70Var.f36569f;
                    s70Var.d0((TLRPC.TL_messages_stickerSet) r70Var.e.get((i10 - r70Var.d.size()) - 1), a2, false);
                    return;
                } else if (i10 != s70Var.f36569f.d.size()) {
                    s70Var.d0((TLRPC.TL_messages_stickerSet) s70Var.f36569f.d.get(i10), ((org.telegram.ui.Cells.n8) view).a(), true);
                    return;
                } else {
                    return;
                }
            }
            if (i10 >= s70Var.E && i10 < s70Var.F) {
                s70Var.d0(MediaDataController.getInstance(s70Var.currentAccount).getStickerSets(s70Var.c0()).get(i10 - s70Var.E), ((org.telegram.ui.Cells.n8) view).a(), false);
            }
            if (i10 == s70Var.J) {
                s70Var.d0(s70Var.f36571r, true, false);
            }
        }
    }

    public static void V(s70 s70Var, TLRPC.TL_error tL_error) {
        boolean z10 = s70Var.N;
        if (tL_error == null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = s70Var.f36571r;
            if (tL_messages_stickerSet == null) {
                if (z10) {
                    s70Var.v.emojiset = null;
                } else {
                    s70Var.v.stickerset = null;
                }
            } else {
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                if (z10) {
                    s70Var.v.emojiset = stickerSet;
                } else {
                    s70Var.v.stickerset = stickerSet;
                }
                MediaDataController.getInstance(s70Var.currentAccount).putGroupStickerSet(s70Var.f36571r);
            }
            s70Var.h0();
            if (z10) {
                TLRPC.ChatFull chatFull = s70Var.v;
                if (chatFull.emojiset != null) {
                    chatFull.flags2 |= 1024;
                } else {
                    chatFull.flags2 &= -1025;
                }
            } else {
                TLRPC.ChatFull chatFull2 = s70Var.v;
                if (chatFull2.stickerset == null) {
                    chatFull2.flags |= 256;
                } else {
                    chatFull2.flags &= -257;
                }
            }
            MessagesStorage.getInstance(s70Var.currentAccount).updateChatInfo(s70Var.v, false);
            NotificationCenter.getInstance(s70Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatInfoDidLoad, s70Var.v, 0, Boolean.TRUE, Boolean.FALSE);
            NotificationCenter.getInstance(s70Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupPackUpdated, Long.valueOf(s70Var.v.f17196id), Boolean.valueOf(z10));
            s70Var.finishFragment();
        } else if (s70Var.getParentActivity() != null) {
            Activity parentActivity = s70Var.getParentActivity();
            StringBuilder sb2 = new StringBuilder();
            org.telegram.messenger.em.l(R.string.ErrorOccurred, "\n", sb2);
            sb2.append(tL_error.text);
            Toast.makeText(parentActivity, sb2.toString(), 0).show();
        }
    }

    public static int X(s70 s70Var) {
        return s70Var.currentAccount;
    }

    public static void a0(s70 s70Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i10 = s70Var.f36570n;
        if (tL_messages_stickerSet == null) {
            if (s70Var.f36571r != null) {
                org.telegram.messenger.a2.o(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.wc.a0(s70Var), R.raw.done, 36);
            }
            s70Var.f36571r = null;
            s70Var.f36572s = true;
        } else {
            s70Var.f36571r = tL_messages_stickerSet;
            s70Var.f36572s = false;
            org.telegram.messenger.a2.o(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.wc.a0(s70Var), R.raw.done, 36);
        }
        s70Var.h0();
        s70Var.f0(s70Var.f36571r, false);
        if (i10 != -1) {
            if (!s70Var.M) {
                for (int i11 = 0; i11 < s70Var.d.getChildCount(); i11++) {
                    View childAt = s70Var.d.getChildAt(i11);
                    if (s70Var.d.T(childAt).b() == s70Var.E + i10) {
                        ((org.telegram.ui.Cells.n8) childAt).b(false, true);
                        break;
                    }
                }
            }
            s70Var.e.m(s70Var.E + i10);
        }
        if (s70Var.f36570n != -1) {
            if (!s70Var.M) {
                for (int i12 = 0; i12 < s70Var.d.getChildCount(); i12++) {
                    View childAt2 = s70Var.d.getChildAt(i12);
                    if (s70Var.d.T(childAt2).b() == s70Var.E + s70Var.f36570n) {
                        ((org.telegram.ui.Cells.n8) childAt2).b(true, true);
                        return;
                    }
                }
            }
            s70Var.e.m(s70Var.E + s70Var.f36570n);
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
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (this.N) {
            i10 = R.string.GroupEmojiPack;
        } else {
            i10 = R.string.GroupStickers;
        }
        lVar.setTitle(LocaleController.getString(i10));
        this.actionBar.setActionBarMenuOnItemClick(new vo(this, 29));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        this.L = a2;
        a2.F();
        a2.H = new gg.m2(this, 10);
        this.L.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.e = new q70(this, context);
        this.f36569f = new r70(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17872a7, false));
        this.d = new org.telegram.ui.Components.vl0(context, null);
        s4.j jVar = new s4.j();
        jVar.n(200L);
        jVar.f41645m = true;
        this.d.setItemAnimator(jVar);
        s4.c0 c0Var = new s4.c0();
        this.h = c0Var;
        c0Var.j1(1);
        this.d.setLayoutManager(this.h);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f36566a = frameLayout2;
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
        org.telegram.ui.Components.a10 a10Var = new org.telegram.ui.Components.a10(context, getResourceProvider());
        this.f36568c = a10Var;
        a10Var.setViewType(19);
        this.f36568c.setIsSingleCell(true);
        this.f36568c.setItemsCount((int) Math.ceil(AndroidUtilities.displaySize.y / AndroidUtilities.dpf2(58.0f)));
        this.f36566a.addView(this.f36568c, w7.a6.c(-1.0f, -1));
        org.telegram.ui.Components.jx0 jx0Var = new org.telegram.ui.Components.jx0(context, this.f36568c, 1, null);
        this.f36567b = jx0Var;
        og.u0.e(jx0Var);
        this.f36566a.addView(this.f36567b);
        frameLayout.addView(this.f36566a);
        this.f36566a.setVisibility(8);
        this.d.setEmptyView(this.f36566a);
        frameLayout.addView(this.d, w7.a6.c(-1.0f, -1));
        this.d.setAdapter(this.e);
        this.d.setOnItemClickListener(new i(this, 13));
        this.d.setOnScrollListener(new j3(this, 15));
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
        org.telegram.ui.Components.hy0 hy0Var = new org.telegram.ui.Components.hy0(parentActivity, this, tL_inputStickerSetShortName, tL_messages_stickerSet2, null, null);
        hy0Var.f23808d0 = new n70(this, z10, tL_messages_stickerSet);
        hy0Var.B0();
        AndroidUtilities.hideKeyboard(getParentActivity().getCurrentFocus());
        hy0Var.show();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.stickersDidLoad) {
            if (((Integer) objArr[0]).intValue() == c0()) {
                g0(true);
            }
        } else if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f17196id == this.f36573w) {
                if (this.v == null && b0(chatFull) != null) {
                    this.f36571r = MediaDataController.getInstance(this.currentAccount).getGroupStickerSetById(b0(chatFull));
                }
                this.v = chatFull;
                g0(true);
            }
        } else if (i10 == NotificationCenter.groupStickersDidLoad) {
            long longValue = ((Long) objArr[0]).longValue();
            if (b0(this.v) != null && b0(this.v).f17222id == longValue) {
                g0(true);
            }
        }
    }

    public final void e0(TLRPC.ChatFull chatFull) {
        this.v = chatFull;
        if (b0(chatFull) != null) {
            this.f36571r = MediaDataController.getInstance(this.currentAccount).getGroupStickerSetById(b0(this.v));
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
            this.f36571r = tL_messages_stickerSet;
            g0(false);
            if (z11) {
                this.e.o(this.J);
            } else {
                this.e.m(this.J);
            }
            if (z10) {
                this.e.m(this.I);
            }
            p70 p70Var = this.O;
            p70Var.f35693b = true;
            p70Var.invalidate();
            return;
        }
        int i10 = this.J;
        if (i10 <= 0) {
            z12 = false;
        }
        this.f36571r = null;
        if (z12) {
            this.e.u(i10);
            if (z10) {
                this.e.m(this.I);
            }
        }
        g0(false);
        p70 p70Var2 = this.O;
        p70Var2.f35693b = false;
        p70Var2.invalidate();
    }

    public final void g0(boolean z10) {
        q70 q70Var;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.G = 0;
        if (this.N) {
            this.H = 0;
            this.G = 2;
            this.I = 1;
            if (this.f36571r != null) {
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
            this.f36575y = i11;
            this.E = i12;
            this.F = stickerSets.size() + i12;
            this.G = stickerSets.size() + this.G;
        } else {
            this.f36575y = -1;
            this.E = -1;
            this.F = -1;
        }
        int i13 = this.G;
        this.G = i13 + 1;
        this.f36574x = i13;
        h0();
        if (z10 && (q70Var = this.e) != null) {
            q70Var.l();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 16, new Class[]{org.telegram.ui.Cells.n8.class, org.telegram.ui.Cells.ga.class}, null, null, null, org.telegram.ui.ActionBar.j6.f17928d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f17872a7));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f18201s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(lVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f18256v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f18220t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f18017i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f18049k0, null, null, org.telegram.ui.ActionBar.j6.f17929d7));
        int i11 = org.telegram.ui.ActionBar.j6.f17892b7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 2, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.J6));
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.ga.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.ga.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 32, new Class[]{org.telegram.ui.Cells.c7.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18325z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 196608, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"optionsButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"optionsButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Uh));
        return arrayList;
    }

    public final void h0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s70.h0():void");
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
        if ((this.f36571r != null || this.f36572s) && (chatFull = this.v) != null) {
            if (b0(chatFull) == null || (tL_messages_stickerSet = this.f36571r) == null || tL_messages_stickerSet.set.f17222id != b0(this.v).f17222id) {
                if (b0(this.v) != null || this.f36571r != null) {
                    boolean z10 = this.N;
                    long j3 = this.f36573w;
                    if (z10) {
                        TLRPC.TL_channels_setEmojiStickers tL_channels_setEmojiStickers = new TLRPC.TL_channels_setEmojiStickers();
                        tL_channels_setEmojiStickers.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j3);
                        if (this.f36572s) {
                            tL_channels_setEmojiStickers.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                            tL_channels_setStickers = tL_channels_setEmojiStickers;
                        } else {
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            tL_channels_setEmojiStickers.stickerset = tL_inputStickerSetID;
                            TLRPC.StickerSet stickerSet = this.f36571r.set;
                            tL_inputStickerSetID.f17215id = stickerSet.f17222id;
                            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                            tL_channels_setStickers = tL_channels_setEmojiStickers;
                        }
                    } else {
                        TLRPC.TL_channels_setStickers tL_channels_setStickers2 = new TLRPC.TL_channels_setStickers();
                        tL_channels_setStickers2.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j3);
                        if (this.f36572s) {
                            tL_channels_setStickers2.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                            tL_channels_setStickers = tL_channels_setStickers2;
                        } else {
                            SharedPreferences.Editor edit = MessagesController.getEmojiSettings(this.currentAccount).edit();
                            edit.remove("group_hide_stickers_" + this.v.f17196id).apply();
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                            tL_channels_setStickers2.stickerset = tL_inputStickerSetID2;
                            TLRPC.StickerSet stickerSet2 = this.f36571r.set;
                            tL_inputStickerSetID2.f17215id = stickerSet2.f17222id;
                            tL_inputStickerSetID2.access_hash = stickerSet2.access_hash;
                            tL_channels_setStickers = tL_channels_setStickers2;
                        }
                    }
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_setStickers, new m(this, 9));
                }
            }
        }
    }

    public s70(long j3, int i10) {
        super(null);
        this.f36570n = -1;
        this.f36573w = j3;
        this.N = true;
    }
}
