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
public final class y70 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public org.telegram.ui.ActionBar.u0 L;
    public boolean M;
    public final boolean N;
    public v70 O;
    public FrameLayout f41760a;
    public org.telegram.ui.Components.wx0 f41761b;
    public org.telegram.ui.Components.f10 f41762c;
    public org.telegram.ui.Components.mm0 d;
    public w70 e;
    public x70 f41763f;
    public s4.b0 h;
    public int f41764n;
    public TLRPC.TL_messages_stickerSet f41765r;
    public boolean f41766s;
    public TLRPC.ChatFull v;
    public final long f41767w;
    public int f41768x;
    public int f41769y;

    public y70(long j10) {
        super(null);
        this.f41764n = -1;
        this.f41767w = j10;
    }

    public static void U(y70 y70Var, View view, int i10) {
        if (y70Var.getParentActivity() != null) {
            if (y70Var.M) {
                if (i10 > y70Var.f41763f.d.size()) {
                    boolean a2 = ((org.telegram.ui.Cells.m8) view).a();
                    x70 x70Var = y70Var.f41763f;
                    y70Var.d0((TLRPC.TL_messages_stickerSet) x70Var.e.get((i10 - x70Var.d.size()) - 1), a2, false);
                    return;
                } else if (i10 != y70Var.f41763f.d.size()) {
                    y70Var.d0((TLRPC.TL_messages_stickerSet) y70Var.f41763f.d.get(i10), ((org.telegram.ui.Cells.m8) view).a(), true);
                    return;
                } else {
                    return;
                }
            }
            if (i10 >= y70Var.E && i10 < y70Var.F) {
                y70Var.d0(MediaDataController.getInstance(y70Var.currentAccount).getStickerSets(y70Var.c0()).get(i10 - y70Var.E), ((org.telegram.ui.Cells.m8) view).a(), false);
            }
            if (i10 == y70Var.J) {
                y70Var.d0(y70Var.f41765r, true, false);
            }
        }
    }

    public static void V(y70 y70Var, TLRPC.TL_error tL_error) {
        boolean z10 = y70Var.N;
        if (tL_error == null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = y70Var.f41765r;
            if (tL_messages_stickerSet == null) {
                if (z10) {
                    y70Var.v.emojiset = null;
                } else {
                    y70Var.v.stickerset = null;
                }
            } else {
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                if (z10) {
                    y70Var.v.emojiset = stickerSet;
                } else {
                    y70Var.v.stickerset = stickerSet;
                }
                MediaDataController.getInstance(y70Var.currentAccount).putGroupStickerSet(y70Var.f41765r);
            }
            y70Var.h0();
            if (z10) {
                TLRPC.ChatFull chatFull = y70Var.v;
                if (chatFull.emojiset != null) {
                    chatFull.flags2 |= 1024;
                } else {
                    chatFull.flags2 &= -1025;
                }
            } else {
                TLRPC.ChatFull chatFull2 = y70Var.v;
                if (chatFull2.stickerset == null) {
                    chatFull2.flags |= 256;
                } else {
                    chatFull2.flags &= -257;
                }
            }
            MessagesStorage.getInstance(y70Var.currentAccount).updateChatInfo(y70Var.v, false);
            NotificationCenter.getInstance(y70Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatInfoDidLoad, y70Var.v, 0, Boolean.TRUE, Boolean.FALSE);
            NotificationCenter.getInstance(y70Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupPackUpdated, Long.valueOf(y70Var.v.f18917id), Boolean.valueOf(z10));
            y70Var.finishFragment();
        } else if (y70Var.getParentActivity() != null) {
            Activity parentActivity = y70Var.getParentActivity();
            StringBuilder sb2 = new StringBuilder();
            org.telegram.ui.Cells.c1.l(R.string.ErrorOccurred, "\n", sb2);
            sb2.append(tL_error.text);
            Toast.makeText(parentActivity, sb2.toString(), 0).show();
        }
    }

    public static int X(y70 y70Var) {
        return y70Var.currentAccount;
    }

    public static void a0(y70 y70Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i10 = y70Var.f41764n;
        if (tL_messages_stickerSet == null) {
            if (y70Var.f41765r != null) {
                org.telegram.messenger.g0.q(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.zc.a0(y70Var), R.raw.done, 36);
            }
            y70Var.f41765r = null;
            y70Var.f41766s = true;
        } else {
            y70Var.f41765r = tL_messages_stickerSet;
            y70Var.f41766s = false;
            org.telegram.messenger.g0.q(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.zc.a0(y70Var), R.raw.done, 36);
        }
        y70Var.h0();
        y70Var.f0(y70Var.f41765r, false);
        if (i10 != -1) {
            if (!y70Var.M) {
                for (int i11 = 0; i11 < y70Var.d.getChildCount(); i11++) {
                    View childAt = y70Var.d.getChildAt(i11);
                    if (y70Var.d.T(childAt).b() == y70Var.E + i10) {
                        ((org.telegram.ui.Cells.m8) childAt).b(false, true);
                        break;
                    }
                }
            }
            y70Var.e.m(y70Var.E + i10);
        }
        if (y70Var.f41764n != -1) {
            if (!y70Var.M) {
                for (int i12 = 0; i12 < y70Var.d.getChildCount(); i12++) {
                    View childAt2 = y70Var.d.getChildAt(i12);
                    if (y70Var.d.T(childAt2).b() == y70Var.E + y70Var.f41764n) {
                        ((org.telegram.ui.Cells.m8) childAt2).b(true, true);
                        return;
                    }
                }
            }
            y70Var.e.m(y70Var.E + y70Var.f41764n);
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
        this.actionBar.setActionBarMenuOnItemClick(new q70(this, 1));
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        this.L = a2;
        a2.F();
        a2.H = new ig.d2(this, 10);
        this.L.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.e = new w70(this, context);
        this.f41763f = new x70(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19543a7, false));
        this.d = new org.telegram.ui.Components.mm0(context, null);
        s4.k kVar2 = new s4.k();
        kVar2.n(200L);
        kVar2.f44872m = true;
        this.d.setItemAnimator(kVar2);
        s4.b0 b0Var = new s4.b0();
        this.h = b0Var;
        b0Var.j1(1);
        this.d.setLayoutManager(this.h);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f41760a = frameLayout2;
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, false));
        org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(context, getResourceProvider());
        this.f41762c = f10Var;
        f10Var.setViewType(19);
        this.f41762c.setIsSingleCell(true);
        this.f41762c.setItemsCount((int) Math.ceil(AndroidUtilities.displaySize.y / AndroidUtilities.dpf2(58.0f)));
        this.f41760a.addView(this.f41762c, w7.z5.d(-1.0f, -1));
        org.telegram.ui.Components.wx0 wx0Var = new org.telegram.ui.Components.wx0(context, this.f41762c, 1, null);
        this.f41761b = wx0Var;
        m.h3.p(wx0Var);
        this.f41760a.addView(this.f41761b);
        frameLayout.addView(this.f41760a);
        this.f41760a.setVisibility(8);
        this.d.setEmptyView(this.f41760a);
        frameLayout.addView(this.d, w7.z5.d(-1.0f, -1));
        this.d.setAdapter(this.e);
        this.d.setOnItemClickListener(new i(this, 14));
        this.d.setOnScrollListener(new k3(this, 15));
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
        org.telegram.ui.Components.uy0 uy0Var = new org.telegram.ui.Components.uy0(parentActivity, this, tL_inputStickerSetShortName, tL_messages_stickerSet2, null, null);
        uy0Var.f29493d0 = new t70(this, z10, tL_messages_stickerSet);
        uy0Var.C0();
        AndroidUtilities.hideKeyboard(getParentActivity().getCurrentFocus());
        uy0Var.show();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.stickersDidLoad) {
            if (((Integer) objArr[0]).intValue() == c0()) {
                g0(true);
            }
        } else if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f18917id == this.f41767w) {
                if (this.v == null && b0(chatFull) != null) {
                    this.f41765r = MediaDataController.getInstance(this.currentAccount).getGroupStickerSetById(b0(chatFull));
                }
                this.v = chatFull;
                g0(true);
            }
        } else if (i10 == NotificationCenter.groupStickersDidLoad) {
            long longValue = ((Long) objArr[0]).longValue();
            if (b0(this.v) != null && b0(this.v).f18943id == longValue) {
                g0(true);
            }
        }
    }

    public final void e0(TLRPC.ChatFull chatFull) {
        this.v = chatFull;
        if (b0(chatFull) != null) {
            this.f41765r = MediaDataController.getInstance(this.currentAccount).getGroupStickerSetById(b0(this.v));
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
            this.f41765r = tL_messages_stickerSet;
            g0(false);
            if (z11) {
                this.e.o(this.J);
            } else {
                this.e.m(this.J);
            }
            if (z10) {
                this.e.m(this.I);
            }
            v70 v70Var = this.O;
            v70Var.f40601b = true;
            v70Var.invalidate();
            return;
        }
        int i10 = this.J;
        if (i10 <= 0) {
            z12 = false;
        }
        this.f41765r = null;
        if (z12) {
            this.e.u(i10);
            if (z10) {
                this.e.m(this.I);
            }
        }
        g0(false);
        v70 v70Var2 = this.O;
        v70Var2.f40601b = false;
        v70Var2.invalidate();
    }

    public final void g0(boolean z10) {
        w70 w70Var;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.G = 0;
        if (this.N) {
            this.H = 0;
            this.G = 2;
            this.I = 1;
            if (this.f41765r != null) {
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
            this.f41769y = i11;
            this.E = i12;
            this.F = stickerSets.size() + i12;
            this.G = stickerSets.size() + this.G;
        } else {
            this.f41769y = -1;
            this.E = -1;
            this.F = -1;
        }
        int i13 = this.G;
        this.G = i13 + 1;
        this.f41768x = i13;
        h0();
        if (z10 && (w70Var = this.e) != null) {
            w70Var.l();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 16, new Class[]{org.telegram.ui.Cells.m8.class, org.telegram.ui.Cells.ca.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19601d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f19543a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.f19880s8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f19935v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f19899t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f19690i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f19722k0, null, null, org.telegram.ui.ActionBar.g6.f19602d7));
        int i11 = org.telegram.ui.ActionBar.g6.f19563b7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 2, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.J6));
        int i12 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 32, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f20005z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 196608, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"optionsButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"optionsButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Uh));
        return arrayList;
    }

    public final void h0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y70.h0():void");
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
        if ((this.f41765r != null || this.f41766s) && (chatFull = this.v) != null) {
            if (b0(chatFull) == null || (tL_messages_stickerSet = this.f41765r) == null || tL_messages_stickerSet.set.f18943id != b0(this.v).f18943id) {
                if (b0(this.v) != null || this.f41765r != null) {
                    boolean z10 = this.N;
                    long j10 = this.f41767w;
                    if (z10) {
                        TLRPC.TL_channels_setEmojiStickers tL_channels_setEmojiStickers = new TLRPC.TL_channels_setEmojiStickers();
                        tL_channels_setEmojiStickers.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j10);
                        if (this.f41766s) {
                            tL_channels_setEmojiStickers.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                            tL_channels_setStickers = tL_channels_setEmojiStickers;
                        } else {
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            tL_channels_setEmojiStickers.stickerset = tL_inputStickerSetID;
                            TLRPC.StickerSet stickerSet = this.f41765r.set;
                            tL_inputStickerSetID.f18936id = stickerSet.f18943id;
                            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                            tL_channels_setStickers = tL_channels_setEmojiStickers;
                        }
                    } else {
                        TLRPC.TL_channels_setStickers tL_channels_setStickers2 = new TLRPC.TL_channels_setStickers();
                        tL_channels_setStickers2.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j10);
                        if (this.f41766s) {
                            tL_channels_setStickers2.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                            tL_channels_setStickers = tL_channels_setStickers2;
                        } else {
                            SharedPreferences.Editor edit = MessagesController.getEmojiSettings(this.currentAccount).edit();
                            edit.remove("group_hide_stickers_" + this.v.f18917id).apply();
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                            tL_channels_setStickers2.stickerset = tL_inputStickerSetID2;
                            TLRPC.StickerSet stickerSet2 = this.f41765r.set;
                            tL_inputStickerSetID2.f18936id = stickerSet2.f18943id;
                            tL_inputStickerSetID2.access_hash = stickerSet2.access_hash;
                            tL_channels_setStickers = tL_channels_setStickers2;
                        }
                    }
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_setStickers, new m(this, 9));
                }
            }
        }
    }

    public y70(long j10, int i10) {
        super(null);
        this.f41764n = -1;
        this.f41767w = j10;
        this.N = true;
    }
}
