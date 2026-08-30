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
    public final a0.h f37882a;
    public q f37883b;
    public org.telegram.ui.Components.mz f37884c;
    public f2.i0 d;
    public org.telegram.ui.Components.sl0 e;
    public final HashSet f37885f;
    public final ArrayList h;
    public boolean f37886n;
    public boolean f37887r;
    public boolean f37888s;
    public org.telegram.messenger.voip.b v;
    public int f37889w;
    public int f37890x;
    public int f37891y;

    public r(int i10) {
        super(null);
        this.f37882a = new a0.h();
        this.f37885f = new HashSet();
        this.h = new ArrayList();
        this.E = i10;
    }

    public static int V(r rVar) {
        return rVar.currentAccount;
    }

    public final void W() {
        long j10;
        boolean z4;
        if (!this.F && !this.f37887r) {
            boolean z10 = true;
            this.F = true;
            org.telegram.ui.Components.mz mzVar = this.f37884c;
            if (mzVar != null && !this.f37886n) {
                mzVar.b();
            }
            q qVar = this.f37883b;
            if (qVar != null) {
                qVar.l();
            }
            TLRPC.TL_messages_getArchivedStickers tL_messages_getArchivedStickers = new TLRPC.TL_messages_getArchivedStickers();
            ArrayList arrayList = this.h;
            if (arrayList.isEmpty()) {
                j10 = 0;
            } else {
                j10 = ((TLRPC.StickerSetCovered) kh.a2.i(1, arrayList)).set.f19211id;
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
        if (!this.f37888s) {
            ArrayList<TLRPC.StickerSetCovered> arrayList = tL_messages_archivedStickers.sets;
            int size = arrayList.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                TLRPC.StickerSetCovered stickerSetCovered = arrayList.get(i11);
                i11++;
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                Long valueOf = Long.valueOf(stickerSetCovered2.set.f19211id);
                HashSet hashSet = this.f37885f;
                if (!hashSet.contains(valueOf)) {
                    hashSet.add(Long.valueOf(stickerSetCovered2.set.f19211id));
                    this.h.add(stickerSetCovered2);
                    i10++;
                }
            }
            if (i10 <= 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.f37887r = z4;
            this.F = false;
            this.f37886n = true;
            org.telegram.ui.Components.mz mzVar = this.f37884c;
            if (mzVar != null) {
                mzVar.c();
            }
            Y();
            q qVar = this.f37883b;
            if (qVar != null) {
                qVar.l();
                return;
            }
            return;
        }
        this.v = new org.telegram.messenger.voip.b(15, this, tL_messages_archivedStickers);
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
            this.f37889w = i10;
            int i12 = this.D;
            this.f37890x = i12;
            this.f37891y = arrayList.size() + i12;
            int size = arrayList.size() + this.D;
            this.D = size;
            if (!this.f37887r) {
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
        this.f37889w = -1;
        this.f37890x = -1;
        this.f37891y = -1;
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
        this.actionBar.setActionBarMenuOnItemClick(new eg.m1(this, 6));
        this.f37883b = new q(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19852a7, false));
        org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(context, null);
        this.f37884c = mzVar;
        if (i10 == 0) {
            mzVar.setText(LocaleController.getString(R.string.ArchivedStickersEmpty));
        } else {
            mzVar.setText(LocaleController.getString(R.string.ArchivedMasksEmpty));
        }
        frameLayout.addView(this.f37884c, k7.b6.c(-1.0f, -1));
        if (this.F) {
            this.f37884c.b();
        } else {
            this.f37884c.c();
        }
        org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(context, null);
        this.e = sl0Var;
        sl0Var.setFocusable(true);
        this.e.setEmptyView(this.f37884c);
        org.telegram.ui.Components.sl0 sl0Var2 = this.e;
        f2.i0 i0Var = new f2.i0(1, false);
        this.d = i0Var;
        sl0Var2.setLayoutManager(i0Var);
        this.e.p1();
        this.actionBar.setAdaptiveBackground(this.e);
        frameLayout.addView(this.e, k7.b6.c(-1.0f, -1));
        this.e.setAdapter(this.f37883b);
        this.e.setOnItemClickListener(new j(this, 1));
        this.e.setOnScrollListener(new l3(this, 1));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.sl0 sl0Var;
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
                    } else if (((TLRPC.StickerSetCovered) arrayList.get(i12)).set.f19211id == ((TLRPC.StickerSetCovered) arrayList2.get(size)).set.f19211id) {
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
                q qVar = this.f37883b;
                if (qVar != null) {
                    qVar.s(this.f37890x, arrayList2.size());
                }
            }
        } else if (i10 == NotificationCenter.stickersDidLoad && (sl0Var = this.e) != null) {
            int childCount = sl0Var.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = this.e.getChildAt(i13);
                if ((childAt instanceof org.telegram.ui.Cells.w) && (stickersSet = (wVar = (org.telegram.ui.Cells.w) childAt).getStickersSet()) != null) {
                    boolean isStickerPackInstalled = MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(stickersSet.set.f19211id);
                    if (isStickerPackInstalled) {
                        this.f37882a.l(stickersSet.set.f19211id);
                        org.telegram.ui.Components.ei0 ei0Var = wVar.f22522f;
                        if (ei0Var != null) {
                            ei0Var.a(false, true);
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
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 16, new Class[]{org.telegram.ui.Cells.w.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19906d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19852a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f20176s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20227v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20192t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19996i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20025k0, null, null, org.telegram.ui.ActionBar.j6.f19907d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37884c, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f19889c7));
        org.telegram.ui.Components.mz mzVar = this.f37884c;
        int i10 = org.telegram.ui.ActionBar.j6.f19978h6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(mzVar, 2048, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20298z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        int i11 = org.telegram.ui.ActionBar.j6.Rh;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"deleteButton"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 196608, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"deleteButton"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 131072, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 196608, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Qh));
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
        this.e.setPadding(0, 0, 0, i13);
        this.e.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        q qVar = this.f37883b;
        if (qVar != null) {
            qVar.l();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        this.f37888s = false;
        org.telegram.messenger.voip.b bVar = this.v;
        if (bVar != null) {
            bVar.run();
            this.v = null;
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z4, boolean z10) {
        this.f37888s = true;
    }
}
