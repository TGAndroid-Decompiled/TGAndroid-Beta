package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class r extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public int B;
    public int C;
    public int D;
    public final int E;
    public boolean F;
    public final a0.h f40725a;
    public q f40726b;
    public org.telegram.ui.Components.oz f40727c;
    public f2.j0 d;
    public org.telegram.ui.Components.tl0 f40728e;
    public final HashSet f40729f;
    public final ArrayList h;
    public boolean f40730n;
    public boolean f40731r;
    public boolean f40732s;
    public org.telegram.messenger.voip.h v;
    public int f40733w;
    public int f40734x;
    public int f40735y;

    public r(int i10) {
        super(null);
        this.f40725a = new a0.h();
        this.f40729f = new HashSet();
        this.h = new ArrayList();
        this.E = i10;
    }

    public static int V(r rVar) {
        return rVar.currentAccount;
    }

    public final void W() {
        long j10;
        boolean z4;
        if (!this.F && !this.f40731r) {
            boolean z10 = true;
            this.F = true;
            org.telegram.ui.Components.oz ozVar = this.f40727c;
            if (ozVar != null && !this.f40730n) {
                ozVar.b();
            }
            q qVar = this.f40726b;
            if (qVar != null) {
                qVar.l();
            }
            TLRPC.TL_messages_getArchivedStickers tL_messages_getArchivedStickers = new TLRPC.TL_messages_getArchivedStickers();
            ArrayList arrayList = this.h;
            if (arrayList.isEmpty()) {
                j10 = 0;
            } else {
                j10 = ((TLRPC.StickerSetCovered) l.d.i(1, arrayList)).set.f20870id;
            }
            tL_messages_getArchivedStickers.offset_id = j10;
            tL_messages_getArchivedStickers.limit = 15;
            int i10 = this.E;
            if (i10 == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            tL_messages_getArchivedStickers.masks = z4;
            if (i10 != 5) {
                z10 = false;
            }
            tL_messages_getArchivedStickers.emojis = z10;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getArchivedStickers, new o(this, 0)), this.classGuid);
        }
    }

    public final void X(TLRPC.TL_messages_archivedStickers tL_messages_archivedStickers) {
        boolean z4;
        if (!this.f40732s) {
            ArrayList<TLRPC.StickerSetCovered> arrayList = tL_messages_archivedStickers.sets;
            int size = arrayList.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                TLRPC.StickerSetCovered stickerSetCovered = arrayList.get(i11);
                i11++;
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                Long valueOf = Long.valueOf(stickerSetCovered2.set.f20870id);
                HashSet hashSet = this.f40729f;
                if (!hashSet.contains(valueOf)) {
                    hashSet.add(Long.valueOf(stickerSetCovered2.set.f20870id));
                    this.h.add(stickerSetCovered2);
                    i10++;
                }
            }
            if (i10 <= 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.f40731r = z4;
            this.F = false;
            this.f40730n = true;
            org.telegram.ui.Components.oz ozVar = this.f40727c;
            if (ozVar != null) {
                ozVar.c();
            }
            Y();
            q qVar = this.f40726b;
            if (qVar != null) {
                qVar.l();
                return;
            }
            return;
        }
        this.v = new org.telegram.messenger.voip.h(14, this, tL_messages_archivedStickers);
    }

    public final void Y() {
        int i10;
        this.D = 0;
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            int i11 = this.E;
            if (i11 != 0 && i11 != 5) {
                i10 = -1;
            } else {
                i10 = this.D;
                this.D = i10 + 1;
            }
            this.f40733w = i10;
            int i12 = this.D;
            this.f40734x = i12;
            this.f40735y = arrayList.size() + i12;
            int size = arrayList.size() + this.D;
            this.D = size;
            if (!this.f40731r) {
                this.D = size + 1;
                this.B = size;
                this.C = -1;
                return;
            }
            this.D = size + 1;
            this.C = size;
            this.B = -1;
            return;
        }
        this.f40733w = -1;
        this.f40734x = -1;
        this.f40735y = -1;
        this.B = -1;
        this.C = -1;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i10 = this.E;
        if (i10 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ArchivedStickers));
        } else if (i10 == 5) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ArchivedEmojiPacks));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.ArchivedMasks));
        }
        this.actionBar.setActionBarMenuOnItemClick(new fg.l1(this, 6));
        this.f40726b = new q(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21605a7, false));
        org.telegram.ui.Components.oz ozVar = new org.telegram.ui.Components.oz(context, null);
        this.f40727c = ozVar;
        if (i10 == 0) {
            ozVar.setText(LocaleController.getString(R.string.ArchivedStickersEmpty));
        } else {
            ozVar.setText(LocaleController.getString(R.string.ArchivedMasksEmpty));
        }
        frameLayout.addView(this.f40727c, k7.c6.c(-1.0f, -1));
        if (this.F) {
            this.f40727c.b();
        } else {
            this.f40727c.c();
        }
        org.telegram.ui.Components.tl0 tl0Var = new org.telegram.ui.Components.tl0(context, null);
        this.f40728e = tl0Var;
        tl0Var.setFocusable(true);
        this.f40728e.setEmptyView(this.f40727c);
        org.telegram.ui.Components.tl0 tl0Var2 = this.f40728e;
        f2.j0 j0Var = new f2.j0(1, false);
        this.d = j0Var;
        tl0Var2.setLayoutManager(j0Var);
        this.f40728e.p1();
        this.actionBar.setAdaptiveBackground(this.f40728e);
        frameLayout.addView(this.f40728e, k7.c6.c(-1.0f, -1));
        this.f40728e.setAdapter(this.f40726b);
        this.f40728e.setOnItemClickListener(new j(this, 1));
        this.f40728e.setOnScrollListener(new l3(this, 1));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.tl0 tl0Var;
        org.telegram.ui.Cells.w wVar;
        TLRPC.StickerSetCovered stickersSet;
        ArrayList arrayList;
        if (i10 == NotificationCenter.needAddArchivedStickers) {
            ArrayList arrayList2 = new ArrayList((List) objArr[0]);
            int size = arrayList2.size() - 1;
            while (true) {
                arrayList = this.h;
                if (size < 0) {
                    break;
                }
                int size2 = arrayList.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size2) {
                        break;
                    } else if (((TLRPC.StickerSetCovered) arrayList.get(i12)).set.f20870id == ((TLRPC.StickerSetCovered) arrayList2.get(size)).set.f20870id) {
                        arrayList2.remove(size);
                        break;
                    } else {
                        i12++;
                    }
                }
                size--;
            }
            if (!arrayList2.isEmpty()) {
                arrayList.addAll(0, arrayList2);
                Y();
                q qVar = this.f40726b;
                if (qVar != null) {
                    qVar.s(this.f40734x, arrayList2.size());
                }
            }
        } else if (i10 == NotificationCenter.stickersDidLoad && (tl0Var = this.f40728e) != null) {
            int childCount = tl0Var.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = this.f40728e.getChildAt(i13);
                if ((childAt instanceof org.telegram.ui.Cells.w) && (stickersSet = (wVar = (org.telegram.ui.Cells.w) childAt).getStickersSet()) != null) {
                    boolean isStickerPackInstalled = MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(stickersSet.set.f20870id);
                    if (isStickerPackInstalled) {
                        this.f40725a.l(stickersSet.set.f20870id);
                        org.telegram.ui.Components.gi0 gi0Var = wVar.f24338f;
                        if (gi0Var != null) {
                            gi0Var.a(false, true);
                        }
                    }
                    wVar.a(isStickerPackInstalled, true, false);
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40728e, 16, new Class[]{org.telegram.ui.Cells.w.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21659d6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21605a7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40728e, 32768, null, null, null, null, org.telegram.ui.ActionBar.k6.f21930s8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.f21981v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.f21946t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40728e, 4096, null, null, null, null, org.telegram.ui.ActionBar.k6.f21750i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40728e, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.f21779k0, null, null, org.telegram.ui.ActionBar.k6.f21660d7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40727c, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.f21642c7));
        org.telegram.ui.Components.oz ozVar = this.f40727c;
        int i10 = org.telegram.ui.ActionBar.k6.f21732h6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(ozVar, 2048, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40728e, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40728e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40728e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f22053z6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40728e, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.B6));
        int i11 = org.telegram.ui.ActionBar.k6.Rh;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40728e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"deleteButton"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40728e, 196608, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"deleteButton"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40728e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40728e, 131072, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40728e, 196608, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Qh));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        W();
        Y();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.needAddArchivedStickers);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.needAddArchivedStickers);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f40728e.setPadding(0, 0, 0, i13);
        this.f40728e.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        q qVar = this.f40726b;
        if (qVar != null) {
            qVar.l();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        this.f40732s = false;
        org.telegram.messenger.voip.h hVar = this.v;
        if (hVar != null) {
            hVar.run();
            this.v = null;
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z4, boolean z10) {
        this.f40732s = true;
    }
}
