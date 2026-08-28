package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class vc extends FrameLayout {
    public final int f43428a;
    public final org.telegram.ui.ActionBar.b6 f43429b;
    public final ArrayList f43430c;
    public final va1 d;
    public final org.telegram.ui.Components.e00 f43431e;
    public boolean f43432f;
    public final tc h;
    public boolean f43433n;
    public Utilities.Callback f43434r;
    public String f43435s;
    public TLRPC.WallPaper v;
    public final HashMap f43436w;
    public final HashMap f43437x;

    public vc(int i9, Activity activity, org.telegram.ui.ActionBar.b6 b6Var) {
        super(activity);
        this.f43430c = new ArrayList();
        this.f43436w = new HashMap();
        this.f43437x = new HashMap();
        this.f43428a = i9;
        this.f43429b = b6Var;
        org.telegram.ui.Components.e00 e00Var = new org.telegram.ui.Components.e00(getContext(), b6Var);
        this.f43431e = e00Var;
        e00Var.setViewType(14);
        e00Var.setVisibility(0);
        addView(e00Var, g7.e6.d(-1, 104.0f, 8388611, 16.0f, 13.0f, 16.0f, 6.0f));
        va1 va1Var = new va1(activity, 4, b6Var);
        this.d = va1Var;
        va1Var.setClipToPadding(false);
        va1Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f));
        getContext();
        f2.m0 m0Var = new f2.m0();
        m0Var.j1(0);
        va1Var.setLayoutManager(m0Var);
        va1Var.setAlpha(0.0f);
        tc tcVar = new tc(this, i9, b6Var);
        this.h = tcVar;
        va1Var.setAdapter(tcVar);
        addView(va1Var, g7.e6.c(130.0f, -1));
        va1Var.setOnItemClickListener(new i(this, 2));
        ChatThemeController chatThemeController = ChatThemeController.getInstance(i9);
        chatThemeController.preloadAllWallpaperThumbs(true);
        chatThemeController.preloadAllWallpaperThumbs(false);
        chatThemeController.preloadAllWallpaperImages(true);
        chatThemeController.preloadAllWallpaperImages(false);
        chatThemeController.requestAllChatThemes(new uc(this, i9), true);
        if (!this.f43433n) {
            AndroidUtilities.updateViewVisibilityAnimated(e00Var, true, 1.0f, true, false);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(e00Var, false, 1.0f, true, false);
        }
    }

    public final void a(String str, boolean z10) {
        ArrayList arrayList;
        int R;
        this.f43435s = str;
        int i9 = -1;
        int i10 = 0;
        while (true) {
            arrayList = this.f43430c;
            boolean z11 = true;
            if (i10 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.bp bpVar = (org.telegram.ui.Components.bp) arrayList.get(i10);
            if (!TextUtils.equals(this.f43435s, bpVar.a()) && (!TextUtils.isEmpty(str) || !bpVar.f27261a.f22748a)) {
                z11 = false;
            }
            bpVar.d = z11;
            if (z11) {
                i9 = i10;
            }
            i10++;
        }
        va1 va1Var = this.d;
        if (i9 >= 0 && !z10 && (va1Var.getLayoutManager() instanceof f2.m0)) {
            ((f2.m0) va1Var.getLayoutManager()).h1(i9, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(83.0f)) / 2);
        }
        for (int i11 = 0; i11 < va1Var.getChildCount(); i11++) {
            View childAt = va1Var.getChildAt(i11);
            if ((childAt instanceof org.telegram.ui.Components.a11) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                ((org.telegram.ui.Components.a11) childAt).g(((org.telegram.ui.Components.bp) arrayList.get(R)).d, true);
            }
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), i10);
    }

    public void setGalleryWallpaper(TLRPC.WallPaper wallPaper) {
        this.v = wallPaper;
        AndroidUtilities.forEachViews((RecyclerView) this.d, (d5.d) new qc(this, 1));
        if (this.v != null) {
            ArrayList arrayList = this.f43430c;
            if ((arrayList.isEmpty() || ((org.telegram.ui.Components.bp) arrayList.get(0)).f27261a.f22748a) && this.f43432f) {
                arrayList.add(0, new org.telegram.ui.Components.bp(org.telegram.ui.ActionBar.b4.a(this.f43428a)));
                this.h.l();
            }
        }
    }

    public void setOnEmoticonSelected(Utilities.Callback<String> callback) {
        this.f43434r = callback;
    }

    public void setWithRemovedStub(boolean z10) {
        this.f43432f = z10;
    }
}
