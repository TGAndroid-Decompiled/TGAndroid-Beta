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
public final class r extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public int A;
    public int B;
    public int C;
    public final int D;
    public boolean E;
    public final a0.h f41816a;
    public q f41817b;
    public org.telegram.ui.Components.hz f41818c;
    public f2.j0 d;
    public org.telegram.ui.Components.jl0 f41819e;
    public final HashSet f41820f;
    public final ArrayList h;
    public boolean f41821n;
    public boolean f41822r;
    public boolean f41823s;
    public org.telegram.ui.ActionBar.c v;
    public int f41824w;
    public int f41825x;
    public int f41826y;

    public r(int i10) {
        super(null);
        this.f41816a = new a0.h();
        this.f41820f = new HashSet();
        this.h = new ArrayList();
        this.D = i10;
    }

    public static int V(r rVar) {
        return rVar.currentAccount;
    }

    public final void W() {
        long j10;
        boolean z10;
        if (!this.E && !this.f41822r) {
            boolean z11 = true;
            this.E = true;
            org.telegram.ui.Components.hz hzVar = this.f41818c;
            if (hzVar != null && !this.f41821n) {
                hzVar.b();
            }
            q qVar = this.f41817b;
            if (qVar != null) {
                qVar.l();
            }
            TLRPC.TL_messages_getArchivedStickers tL_messages_getArchivedStickers = new TLRPC.TL_messages_getArchivedStickers();
            ArrayList arrayList = this.h;
            if (arrayList.isEmpty()) {
                j10 = 0;
            } else {
                j10 = ((TLRPC.StickerSetCovered) j7.l1.i(1, arrayList)).set.f22419id;
            }
            tL_messages_getArchivedStickers.offset_id = j10;
            tL_messages_getArchivedStickers.limit = 15;
            int i10 = this.D;
            if (i10 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            tL_messages_getArchivedStickers.masks = z10;
            if (i10 != 5) {
                z11 = false;
            }
            tL_messages_getArchivedStickers.emojis = z11;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getArchivedStickers, new o(this, 0)), this.classGuid);
        }
    }

    public final void X(TLRPC.TL_messages_archivedStickers tL_messages_archivedStickers) {
        boolean z10;
        if (!this.f41823s) {
            ArrayList<TLRPC.StickerSetCovered> arrayList = tL_messages_archivedStickers.sets;
            int size = arrayList.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                TLRPC.StickerSetCovered stickerSetCovered = arrayList.get(i11);
                i11++;
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                Long valueOf = Long.valueOf(stickerSetCovered2.set.f22419id);
                HashSet hashSet = this.f41820f;
                if (!hashSet.contains(valueOf)) {
                    hashSet.add(Long.valueOf(stickerSetCovered2.set.f22419id));
                    this.h.add(stickerSetCovered2);
                    i10++;
                }
            }
            if (i10 <= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f41822r = z10;
            this.E = false;
            this.f41821n = true;
            org.telegram.ui.Components.hz hzVar = this.f41818c;
            if (hzVar != null) {
                hzVar.c();
            }
            Y();
            q qVar = this.f41817b;
            if (qVar != null) {
                qVar.l();
                return;
            }
            return;
        }
        this.v = new org.telegram.ui.ActionBar.c(6, this, tL_messages_archivedStickers);
    }

    public final void Y() {
        int i10;
        this.C = 0;
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            int i11 = this.D;
            if (i11 != 0 && i11 != 5) {
                i10 = -1;
            } else {
                i10 = this.C;
                this.C = i10 + 1;
            }
            this.f41824w = i10;
            int i12 = this.C;
            this.f41825x = i12;
            this.f41826y = arrayList.size() + i12;
            int size = arrayList.size() + this.C;
            this.C = size;
            if (!this.f41822r) {
                this.C = size + 1;
                this.A = size;
                this.B = -1;
                return;
            }
            this.C = size + 1;
            this.B = size;
            this.A = -1;
            return;
        }
        this.f41824w = -1;
        this.f41825x = -1;
        this.f41826y = -1;
        this.A = -1;
        this.B = -1;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i10 = this.D;
        if (i10 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ArchivedStickers));
        } else if (i10 == 5) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ArchivedEmojiPacks));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.ArchivedMasks));
        }
        this.actionBar.setActionBarMenuOnItemClick(new cg.n1(this, 6));
        this.f41817b = new q(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false));
        org.telegram.ui.Components.hz hzVar = new org.telegram.ui.Components.hz(context, null);
        this.f41818c = hzVar;
        if (i10 == 0) {
            hzVar.setText(LocaleController.getString(R.string.ArchivedStickersEmpty));
        } else {
            hzVar.setText(LocaleController.getString(R.string.ArchivedMasksEmpty));
        }
        frameLayout.addView(this.f41818c, i7.f6.c(-1.0f, -1));
        if (this.E) {
            this.f41818c.b();
        } else {
            this.f41818c.c();
        }
        org.telegram.ui.Components.jl0 jl0Var = new org.telegram.ui.Components.jl0(context, null);
        this.f41819e = jl0Var;
        jl0Var.setFocusable(true);
        this.f41819e.setEmptyView(this.f41818c);
        org.telegram.ui.Components.jl0 jl0Var2 = this.f41819e;
        f2.j0 j0Var = new f2.j0(1, false);
        this.d = j0Var;
        jl0Var2.setLayoutManager(j0Var);
        this.f41819e.p1();
        this.actionBar.setAdaptiveBackground(this.f41819e);
        frameLayout.addView(this.f41819e, i7.f6.c(-1.0f, -1));
        this.f41819e.setAdapter(this.f41817b);
        this.f41819e.setOnItemClickListener(new j(this, 1));
        this.f41819e.setOnScrollListener(new m3(this, 1));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.jl0 jl0Var;
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
                    } else if (((TLRPC.StickerSetCovered) arrayList.get(i12)).set.f22419id == ((TLRPC.StickerSetCovered) arrayList2.get(size)).set.f22419id) {
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
                q qVar = this.f41817b;
                if (qVar != null) {
                    qVar.s(this.f41825x, arrayList2.size());
                }
            }
        } else if (i10 == NotificationCenter.stickersDidLoad && (jl0Var = this.f41819e) != null) {
            int childCount = jl0Var.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = this.f41819e.getChildAt(i13);
                if ((childAt instanceof org.telegram.ui.Cells.w) && (stickersSet = (wVar = (org.telegram.ui.Cells.w) childAt).getStickersSet()) != null) {
                    boolean isStickerPackInstalled = MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(stickersSet.set.f22419id);
                    if (isStickerPackInstalled) {
                        this.f41816a.l(stickersSet.set.f22419id);
                        org.telegram.ui.Components.th0 th0Var = wVar.f25853f;
                        if (th0Var != null) {
                            th0Var.a(false, true);
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
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41819e, 16, new Class[]{org.telegram.ui.Cells.w.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23062d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23009a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41819e, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f23329s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23385v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23348t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41819e, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23152i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41819e, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23183k0, null, null, org.telegram.ui.ActionBar.g6.f23063d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41818c, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f23045c7));
        org.telegram.ui.Components.hz hzVar = this.f41818c;
        int i10 = org.telegram.ui.ActionBar.g6.f23134h6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(hzVar, 2048, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41819e, 0, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"progressBar"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41819e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41819e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23450z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41819e, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        int i11 = org.telegram.ui.ActionBar.g6.Rh;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41819e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"deleteButton"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41819e, 196608, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"deleteButton"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41819e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41819e, 131072, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41819e, 196608, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Qh));
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
        this.f41819e.setPadding(0, 0, 0, i13);
        this.f41819e.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        q qVar = this.f41817b;
        if (qVar != null) {
            qVar.l();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        this.f41823s = false;
        org.telegram.ui.ActionBar.c cVar = this.v;
        if (cVar != null) {
            cVar.run();
            this.v = null;
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        this.f41823s = true;
    }
}
