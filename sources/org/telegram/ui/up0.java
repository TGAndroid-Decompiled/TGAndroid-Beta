package org.telegram.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.RadialProgressView;
public final class up0 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean E;
    public final sn F;
    public int G;
    public boolean H;
    public org.telegram.ui.ActionBar.m1 I;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout J;
    public org.telegram.ui.ActionBar.e1[] K;
    public FrameLayout L;
    public org.telegram.ui.Components.qu M;
    public m0 N;
    public ImageView O;
    public op0 P;
    public x10 Q;
    public View R;
    public final TextPaint S;
    public final RectF T;
    public final Paint U;
    public tp0 V;
    public CharSequence f42041a;
    public final HashMap f42042b;
    public final ArrayList f42043c;
    public ArrayList d;
    public boolean e;
    public int f42044f;
    public org.telegram.ui.Components.im0 h;
    public sp0 f42045n;
    public FrameLayout f42046r;
    public TextView f42047s;
    public boolean v;
    public final int f42048w;
    public boolean f42049x;
    public final boolean f42050y;

    public up0(int i10, boolean z10, boolean z11, sn snVar) {
        super(null);
        this.f42042b = new HashMap();
        this.f42043c = new ArrayList();
        this.d = null;
        this.e = false;
        this.f42044f = 2;
        this.f42049x = true;
        this.H = true;
        this.S = new TextPaint(1);
        this.T = new RectF();
        this.U = new Paint(1);
        this.F = snVar;
        this.f42048w = i10;
        this.f42050y = z10;
        this.E = z11;
    }

    public static void U(up0 up0Var, MediaController.AlbumEntry albumEntry) {
        if (albumEntry != null) {
            lq0 lq0Var = new lq0(0, albumEntry, up0Var.f42042b, up0Var.f42043c, up0Var.f42048w, up0Var.E, up0Var.F, false);
            Editable text = up0Var.M.getText();
            up0Var.f42041a = text;
            lq0Var.d = text;
            org.telegram.ui.Components.qu quVar = lq0Var.f38917d0;
            if (quVar != null) {
                quVar.setText(text);
            }
            lq0Var.f38935s0 = new pp0(up0Var);
            lq0Var.f0(up0Var.G, up0Var.H);
            up0Var.presentFragment(lq0Var);
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        if (up0Var.f42050y) {
            qq0 qq0Var = new qq0(hashMap, arrayList, up0Var.f42048w, up0Var.E, up0Var.F);
            Editable text2 = up0Var.M.getText();
            up0Var.f42041a = text2;
            lq0 lq0Var2 = qq0Var.f40505a;
            if (lq0Var2 != null) {
                lq0Var2.d = text2;
                org.telegram.ui.Components.qu quVar2 = lq0Var2.f38917d0;
                if (quVar2 != null) {
                    quVar2.setText(text2);
                }
            }
            qp0 qp0Var = new qp0(up0Var, hashMap, arrayList);
            lq0 lq0Var3 = qq0Var.f40505a;
            lq0Var3.f38935s0 = qp0Var;
            lq0 lq0Var4 = qq0Var.f40506b;
            lq0Var4.f38935s0 = qp0Var;
            lq0Var3.f38936t0 = new pq0(qq0Var, 0);
            lq0Var4.f38936t0 = new pq0(qq0Var, 1);
            int i10 = up0Var.G;
            boolean z10 = up0Var.H;
            lq0Var3.f0(i10, z10);
            qq0Var.f40506b.f0(i10, z10);
            up0Var.presentFragment(qq0Var);
            return;
        }
        lq0 lq0Var5 = new lq0(0, albumEntry, hashMap, arrayList, up0Var.f42048w, up0Var.E, up0Var.F, false);
        Editable text3 = up0Var.M.getText();
        up0Var.f42041a = text3;
        lq0Var5.d = text3;
        org.telegram.ui.Components.qu quVar3 = lq0Var5.f38917d0;
        if (quVar3 != null) {
            quVar3.setText(text3);
        }
        lq0Var5.f38935s0 = new mp0(up0Var, hashMap, arrayList);
        lq0Var5.f0(up0Var.G, up0Var.H);
        up0Var.presentFragment(lq0Var5);
    }

    public final void V(HashMap hashMap, ArrayList arrayList, boolean z10, int i10) {
        if (!hashMap.isEmpty() && this.V != null && !this.v) {
            this.v = true;
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                Object obj = hashMap.get(arrayList.get(i11));
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                arrayList2.add(sendingMediaInfo);
                String str = null;
                if (obj instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                    String str2 = photoEntry.imagePath;
                    if (str2 != null) {
                        sendingMediaInfo.path = str2;
                    } else {
                        sendingMediaInfo.path = photoEntry.path;
                    }
                    sendingMediaInfo.thumbPath = photoEntry.thumbPath;
                    sendingMediaInfo.coverPath = photoEntry.coverPath;
                    sendingMediaInfo.videoEditedInfo = photoEntry.editedInfo;
                    sendingMediaInfo.isVideo = photoEntry.isVideo;
                    CharSequence charSequence = photoEntry.caption;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    }
                    sendingMediaInfo.caption = str;
                    sendingMediaInfo.entities = photoEntry.entities;
                    sendingMediaInfo.masks = photoEntry.stickers;
                    sendingMediaInfo.ttl = photoEntry.ttl;
                } else if (obj instanceof MediaController.SearchImage) {
                    MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                    String str3 = searchImage.imagePath;
                    if (str3 != null) {
                        sendingMediaInfo.path = str3;
                    } else {
                        sendingMediaInfo.searchImage = searchImage;
                    }
                    sendingMediaInfo.thumbPath = searchImage.thumbPath;
                    sendingMediaInfo.coverPath = searchImage.coverPath;
                    sendingMediaInfo.videoEditedInfo = searchImage.editedInfo;
                    CharSequence charSequence2 = searchImage.caption;
                    if (charSequence2 != null) {
                        str = charSequence2.toString();
                    }
                    sendingMediaInfo.caption = str;
                    sendingMediaInfo.entities = searchImage.entities;
                    sendingMediaInfo.masks = searchImage.stickers;
                    sendingMediaInfo.ttl = searchImage.ttl;
                    TLRPC.BotInlineResult botInlineResult = searchImage.inlineResult;
                    if (botInlineResult != null && searchImage.type == 1) {
                        sendingMediaInfo.inlineResult = botInlineResult;
                        sendingMediaInfo.params = searchImage.params;
                    }
                    searchImage.date = (int) (System.currentTimeMillis() / 1000);
                }
            }
            this.V.a(arrayList2);
        }
    }

    public final void W(boolean z10) {
        boolean z11;
        Integer num;
        float f7;
        float f10;
        float f11;
        float f12;
        float dp;
        if (this.L.getTag() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 == z11) {
            return;
        }
        FrameLayout frameLayout = this.L;
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        frameLayout.setTag(num);
        if (this.M.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(this.M.getEditText());
        }
        this.M.k(true);
        if (z10) {
            this.L.setVisibility(0);
            this.N.setVisibility(0);
        } else {
            this.L.setVisibility(4);
            this.N.setVisibility(4);
        }
        m0 m0Var = this.N;
        float f13 = 0.2f;
        float f14 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.2f;
        }
        m0Var.setScaleX(f7);
        m0 m0Var2 = this.N;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.2f;
        }
        m0Var2.setScaleY(f10);
        m0 m0Var3 = this.N;
        float f15 = 0.0f;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        m0Var3.setAlpha(f11);
        x10 x10Var = this.Q;
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.2f;
        }
        x10Var.setScaleX(f12);
        x10 x10Var2 = this.Q;
        if (z10) {
            f13 = 1.0f;
        }
        x10Var2.setScaleY(f13);
        x10 x10Var3 = this.Q;
        if (!z10) {
            f14 = 0.0f;
        }
        x10Var3.setAlpha(f14);
        FrameLayout frameLayout2 = this.L;
        if (z10) {
            dp = 0.0f;
        } else {
            dp = AndroidUtilities.dp(48.0f);
        }
        frameLayout2.setTranslationY(dp);
        View view = this.R;
        if (!z10) {
            f15 = AndroidUtilities.dp(48.0f);
        }
        view.setTranslationY(f15);
    }

    @Override
    public final View createView(Context context) {
        ArrayList arrayList;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f21064h5;
        kVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.h6.f21099j5;
        kVar2.setTitleColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        this.actionBar.C(org.telegram.ui.ActionBar.h6.x0(null, i11, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.I5, false), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new np0(this));
        org.telegram.ui.ActionBar.y n10 = this.actionBar.n();
        if (this.f42049x) {
            n10.a(2, R.drawable.outline_header_search).setContentDescription(LocaleController.getString(R.string.Search));
        }
        org.telegram.ui.ActionBar.u0 a2 = n10.a(0, R.drawable.ic_ab_other);
        a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        a2.e(1, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
        op0 op0Var = new op0(this, context);
        this.P = op0Var;
        op0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        this.fragmentView = this.P;
        this.actionBar.setTitle(LocaleController.getString(R.string.Gallery));
        org.telegram.ui.Components.im0 im0Var = new org.telegram.ui.Components.im0(context, null);
        this.h = im0Var;
        im0Var.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(54.0f));
        this.h.setClipToPadding(false);
        this.h.setHorizontalScrollBarEnabled(false);
        this.h.setVerticalScrollBarEnabled(false);
        this.h.setLayoutManager(new s4.b0(1, false));
        this.h.setDrawingCacheEnabled(false);
        this.P.addView(this.h, w7.z5.e(-1, -1, 51));
        org.telegram.ui.Components.im0 im0Var2 = this.h;
        sp0 sp0Var = new sp0(this, context);
        this.f42045n = sp0Var;
        im0Var2.setAdapter(sp0Var);
        this.h.setGlowColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        TextView textView = new TextView(context);
        this.f42047s = textView;
        textView.setTextColor(-8355712);
        this.f42047s.setTextSize(1, 20.0f);
        this.f42047s.setGravity(17);
        this.f42047s.setVisibility(8);
        this.f42047s.setText(LocaleController.getString(R.string.NoPhotos));
        this.P.addView(this.f42047s, w7.z5.a(-1.0f, 0.0f, 0.0f, 0.0f, 48.0f, -1, 51));
        this.f42047s.setOnTouchListener(new di.d(2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f42046r = frameLayout;
        frameLayout.setVisibility(8);
        this.P.addView(this.f42046r, w7.z5.a(-1.0f, 0.0f, 0.0f, 0.0f, 48.0f, -1, 51));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        radialProgressView.setProgressColor(-11371101);
        this.f42046r.addView(radialProgressView, w7.z5.e(-2, -2, 17));
        View view = new View(context);
        this.R = view;
        view.setBackgroundResource(R.drawable.header_shadow_reverse);
        this.R.setTranslationY(AndroidUtilities.dp(48.0f));
        this.P.addView(this.R, w7.z5.a(3.0f, 0.0f, 0.0f, 0.0f, 48.0f, -1, 83));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.L = frameLayout2;
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        this.L.setVisibility(4);
        this.L.setTranslationY(AndroidUtilities.dp(48.0f));
        this.P.addView(this.L, w7.z5.e(-1, 48, 83));
        this.L.setOnTouchListener(new di.d(2));
        org.telegram.ui.Components.qu quVar = this.M;
        if (quVar != null) {
            quVar.o();
        }
        this.M = new org.telegram.ui.Components.qu(context, this.P, null, 1, false, null);
        this.M.setFilters(new InputFilter[]{new InputFilter.LengthFilter(MessagesController.getInstance(UserConfig.selectedAccount).maxCaptionLength)});
        this.M.setHint(LocaleController.getString(R.string.AddCaption));
        org.telegram.ui.Components.iu editText = this.M.getEditText();
        editText.setMaxLines(1);
        editText.setSingleLine(true);
        this.L.addView(this.M, w7.z5.a(-1.0f, 0.0f, 0.0f, 84.0f, 0.0f, -1, 51));
        CharSequence charSequence = this.f42041a;
        if (charSequence != null) {
            this.M.setText(charSequence);
        }
        m0 m0Var = new m0(this, context, 16);
        this.N = m0Var;
        m0Var.setFocusable(true);
        this.N.setFocusableInTouchMode(true);
        this.N.setVisibility(4);
        this.N.setScaleX(0.2f);
        this.N.setScaleY(0.2f);
        this.N.setAlpha(0.0f);
        this.P.addView(this.N, w7.z5.a(60.0f, 0.0f, 0.0f, 12.0f, 10.0f, 60, 85));
        this.O = new ImageView(context);
        this.O.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.i0(AndroidUtilities.dp(56.0f), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.S5, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.T5, false)));
        this.O.setImageResource(R.drawable.attach_send);
        this.O.setImportantForAccessibility(2);
        this.O.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.U5, false), PorterDuff.Mode.MULTIPLY));
        this.O.setScaleType(ImageView.ScaleType.CENTER);
        this.O.setOutlineProvider(new ci.o1(19));
        this.N.addView(this.O, w7.z5.a(56.0f, 2.0f, 0.0f, 0.0f, 0.0f, 56, 51));
        this.O.setOnClickListener(new y50(this, 16));
        this.O.setOnLongClickListener(new u(this, 3));
        TextPaint textPaint = this.S;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        x10 x10Var = new x10(this, context, 3);
        this.Q = x10Var;
        x10Var.setAlpha(0.0f);
        this.Q.setScaleX(0.2f);
        this.Q.setScaleY(0.2f);
        this.P.addView(this.Q, w7.z5.a(24.0f, 0.0f, 0.0f, -2.0f, 9.0f, 42, 85));
        if (this.f42048w != 0) {
            this.M.setVisibility(8);
        }
        if (this.e && ((arrayList = this.d) == null || arrayList.isEmpty())) {
            this.f42046r.setVisibility(0);
            this.h.setEmptyView(null);
        } else {
            this.f42046r.setVisibility(8);
            this.h.setEmptyView(this.f42047s);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.albumsDidLoad) {
            if (this.classGuid == ((Integer) objArr[0]).intValue()) {
                int i12 = this.f42048w;
                if (i12 != 1 && i12 != 2 && i12 != 10 && this.f42049x) {
                    this.d = (ArrayList) objArr[1];
                } else {
                    this.d = (ArrayList) objArr[2];
                }
                FrameLayout frameLayout = this.f42046r;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
                org.telegram.ui.Components.im0 im0Var = this.h;
                if (im0Var != null && im0Var.getEmptyView() == null) {
                    this.h.setEmptyView(this.f42047s);
                }
                sp0 sp0Var = this.f42045n;
                if (sp0Var != null) {
                    sp0Var.l();
                }
                this.e = false;
            }
        } else if (i10 == NotificationCenter.closeChats) {
            removeSelfFromStack(true);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.h6.f21064h5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.h6.f21099j5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 0, new Class[]{View.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.R4}, null, org.telegram.ui.ActionBar.h6.f20997da));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 0, new Class[]{View.class}, null, null, null, org.telegram.ui.ActionBar.h6.X9));
        return arrayList;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.qu quVar = this.M;
        if (quVar != null && quVar.e) {
            if (z10) {
                quVar.k(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.im0 im0Var = this.h;
        if (im0Var != null) {
            im0Var.getViewTreeObserver().addOnPreDrawListener(new xh(this, 3));
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i10 = this.f42048w;
        boolean z10 = true;
        if (i10 != 1 && i10 != 2 && i10 != 10 && this.f42049x) {
            this.d = MediaController.allMediaAlbums;
        } else {
            this.d = MediaController.allPhotoAlbums;
        }
        if (this.d != null) {
            z10 = false;
        }
        this.e = z10;
        MediaController.loadGalleryPhotosAlbums(this.classGuid);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.closeChats);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        org.telegram.ui.Components.qu quVar = this.M;
        if (quVar != null) {
            quVar.o();
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.closeChats);
        super.onFragmentDestroy();
    }

    @Override
    public final void onResume() {
        super.onResume();
        sp0 sp0Var = this.f42045n;
        if (sp0Var != null) {
            sp0Var.l();
        }
        org.telegram.ui.Components.qu quVar = this.M;
        if (quVar != null) {
            quVar.s();
        }
        org.telegram.ui.Components.im0 im0Var = this.h;
        if (im0Var != null) {
            im0Var.getViewTreeObserver().addOnPreDrawListener(new xh(this, 3));
        }
    }
}
