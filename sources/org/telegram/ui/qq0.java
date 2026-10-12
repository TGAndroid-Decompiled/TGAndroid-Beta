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
public final class qq0 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean E;
    public final fo F;
    public int G;
    public boolean H;
    public org.telegram.ui.ActionBar.m1 I;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout J;
    public org.telegram.ui.ActionBar.e1[] K;
    public FrameLayout L;
    public org.telegram.ui.Components.vu M;
    public l0 N;
    public ImageView O;
    public kq0 P;
    public x50 Q;
    public View R;
    public final TextPaint S;
    public final RectF T;
    public final Paint U;
    public pq0 V;
    public CharSequence f39516a;
    public final HashMap f39517b;
    public final ArrayList f39518c;
    public ArrayList d;
    public boolean e;
    public int f39519f;
    public org.telegram.ui.Components.mm0 h;
    public oq0 f39520n;
    public FrameLayout f39521r;
    public TextView f39522s;
    public boolean v;
    public final int f39523w;
    public boolean f39524x;
    public final boolean f39525y;

    public qq0(int i10, boolean z10, boolean z11, fo foVar) {
        super(null);
        this.f39517b = new HashMap();
        this.f39518c = new ArrayList();
        this.d = null;
        this.e = false;
        this.f39519f = 2;
        this.f39524x = true;
        this.H = true;
        this.S = new TextPaint(1);
        this.T = new RectF();
        this.U = new Paint(1);
        this.F = foVar;
        this.f39523w = i10;
        this.f39525y = z10;
        this.E = z11;
    }

    public static void U(qq0 qq0Var, MediaController.AlbumEntry albumEntry) {
        if (albumEntry != null) {
            hr0 hr0Var = new hr0(0, albumEntry, qq0Var.f39517b, qq0Var.f39518c, qq0Var.f39523w, qq0Var.E, qq0Var.F, false);
            Editable text = qq0Var.M.getText();
            qq0Var.f39516a = text;
            hr0Var.d = text;
            org.telegram.ui.Components.vu vuVar = hr0Var.f36919d0;
            if (vuVar != null) {
                vuVar.setText(text);
            }
            hr0Var.f36937s0 = new lq0(qq0Var);
            hr0Var.f0(qq0Var.G, qq0Var.H);
            qq0Var.presentFragment(hr0Var);
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        if (qq0Var.f39525y) {
            mr0 mr0Var = new mr0(hashMap, arrayList, qq0Var.f39523w, qq0Var.E, qq0Var.F);
            Editable text2 = qq0Var.M.getText();
            qq0Var.f39516a = text2;
            hr0 hr0Var2 = mr0Var.f38318a;
            if (hr0Var2 != null) {
                hr0Var2.d = text2;
                org.telegram.ui.Components.vu vuVar2 = hr0Var2.f36919d0;
                if (vuVar2 != null) {
                    vuVar2.setText(text2);
                }
            }
            mq0 mq0Var = new mq0(qq0Var, hashMap, arrayList);
            hr0 hr0Var3 = mr0Var.f38318a;
            hr0Var3.f36937s0 = mq0Var;
            hr0 hr0Var4 = mr0Var.f38319b;
            hr0Var4.f36937s0 = mq0Var;
            hr0Var3.f36938t0 = new lr0(mr0Var, 0);
            hr0Var4.f36938t0 = new lr0(mr0Var, 1);
            int i10 = qq0Var.G;
            boolean z10 = qq0Var.H;
            hr0Var3.f0(i10, z10);
            mr0Var.f38319b.f0(i10, z10);
            qq0Var.presentFragment(mr0Var);
            return;
        }
        hr0 hr0Var5 = new hr0(0, albumEntry, hashMap, arrayList, qq0Var.f39523w, qq0Var.E, qq0Var.F, false);
        Editable text3 = qq0Var.M.getText();
        qq0Var.f39516a = text3;
        hr0Var5.d = text3;
        org.telegram.ui.Components.vu vuVar3 = hr0Var5.f36919d0;
        if (vuVar3 != null) {
            vuVar3.setText(text3);
        }
        hr0Var5.f36937s0 = new iq0(qq0Var, hashMap, arrayList);
        hr0Var5.f0(qq0Var.G, qq0Var.H);
        qq0Var.presentFragment(hr0Var5);
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
        l0 l0Var = this.N;
        float f13 = 0.2f;
        float f14 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.2f;
        }
        l0Var.setScaleX(f7);
        l0 l0Var2 = this.N;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.2f;
        }
        l0Var2.setScaleY(f10);
        l0 l0Var3 = this.N;
        float f15 = 0.0f;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        l0Var3.setAlpha(f11);
        x50 x50Var = this.Q;
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.2f;
        }
        x50Var.setScaleX(f12);
        x50 x50Var2 = this.Q;
        if (z10) {
            f13 = 1.0f;
        }
        x50Var2.setScaleY(f13);
        x50 x50Var3 = this.Q;
        if (!z10) {
            f14 = 0.0f;
        }
        x50Var3.setAlpha(f14);
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
        int i10 = org.telegram.ui.ActionBar.g6.f19972h5;
        kVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.g6.f20007j5;
        kVar2.setTitleColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
        this.actionBar.D(org.telegram.ui.ActionBar.g6.x0(null, i11, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.I5, false), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new jq0(this));
        org.telegram.ui.ActionBar.y n10 = this.actionBar.n();
        if (this.f39524x) {
            n10.a(2, R.drawable.outline_header_search).setContentDescription(LocaleController.getString(R.string.Search));
        }
        org.telegram.ui.ActionBar.u0 a2 = n10.a(0, R.drawable.ic_ab_other);
        a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        a2.e(1, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
        kq0 kq0Var = new kq0(this, context);
        this.P = kq0Var;
        kq0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
        this.fragmentView = this.P;
        this.actionBar.setTitle(LocaleController.getString(R.string.Gallery));
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.h = mm0Var;
        mm0Var.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(54.0f));
        this.h.setClipToPadding(false);
        this.h.setHorizontalScrollBarEnabled(false);
        this.h.setVerticalScrollBarEnabled(false);
        this.h.setLayoutManager(new s4.b0(1, false));
        this.h.setDrawingCacheEnabled(false);
        this.P.addView(this.h, w7.a6.e(-1, -1, 51));
        org.telegram.ui.Components.mm0 mm0Var2 = this.h;
        oq0 oq0Var = new oq0(this, context);
        this.f39520n = oq0Var;
        mm0Var2.setAdapter(oq0Var);
        this.h.setGlowColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
        TextView textView = new TextView(context);
        this.f39522s = textView;
        textView.setTextColor(-8355712);
        this.f39522s.setTextSize(1, 20.0f);
        this.f39522s.setGravity(17);
        this.f39522s.setVisibility(8);
        this.f39522s.setText(LocaleController.getString(R.string.NoPhotos));
        this.P.addView(this.f39522s, w7.a6.a(-1.0f, 0.0f, 0.0f, 0.0f, 48.0f, -1, 51));
        this.f39522s.setOnTouchListener(new ci.d(2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f39521r = frameLayout;
        frameLayout.setVisibility(8);
        this.P.addView(this.f39521r, w7.a6.a(-1.0f, 0.0f, 0.0f, 0.0f, 48.0f, -1, 51));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        radialProgressView.setProgressColor(-11371101);
        this.f39521r.addView(radialProgressView, w7.a6.e(-2, -2, 17));
        View view = new View(context);
        this.R = view;
        view.setBackgroundResource(R.drawable.header_shadow_reverse);
        this.R.setTranslationY(AndroidUtilities.dp(48.0f));
        this.P.addView(this.R, w7.a6.a(3.0f, 0.0f, 0.0f, 0.0f, 48.0f, -1, 83));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.L = frameLayout2;
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
        this.L.setVisibility(4);
        this.L.setTranslationY(AndroidUtilities.dp(48.0f));
        this.P.addView(this.L, w7.a6.e(-1, 48, 83));
        this.L.setOnTouchListener(new ci.d(2));
        org.telegram.ui.Components.vu vuVar = this.M;
        if (vuVar != null) {
            vuVar.o();
        }
        this.M = new org.telegram.ui.Components.vu(context, this.P, null, 1, false, null);
        this.M.setFilters(new InputFilter[]{new InputFilter.LengthFilter(MessagesController.getInstance(UserConfig.selectedAccount).maxCaptionLength)});
        this.M.setHint(LocaleController.getString(R.string.AddCaption));
        org.telegram.ui.Components.nu editText = this.M.getEditText();
        editText.setMaxLines(1);
        editText.setSingleLine(true);
        this.L.addView(this.M, w7.a6.a(-1.0f, 0.0f, 0.0f, 84.0f, 0.0f, -1, 51));
        CharSequence charSequence = this.f39516a;
        if (charSequence != null) {
            this.M.setText(charSequence);
        }
        l0 l0Var = new l0(this, context, 16);
        this.N = l0Var;
        l0Var.setFocusable(true);
        this.N.setFocusableInTouchMode(true);
        this.N.setVisibility(4);
        this.N.setScaleX(0.2f);
        this.N.setScaleY(0.2f);
        this.N.setAlpha(0.0f);
        this.P.addView(this.N, w7.a6.a(60.0f, 0.0f, 0.0f, 12.0f, 10.0f, 60, 85));
        this.O = new ImageView(context);
        this.O.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.i0(AndroidUtilities.dp(56.0f), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.S5, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.T5, false)));
        this.O.setImageResource(R.drawable.attach_send);
        this.O.setImportantForAccessibility(2);
        this.O.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.U5, false), PorterDuff.Mode.MULTIPLY));
        this.O.setScaleType(ImageView.ScaleType.CENTER);
        this.O.setOutlineProvider(new bi.a2(19));
        this.N.addView(this.O, w7.a6.a(56.0f, 2.0f, 0.0f, 0.0f, 0.0f, 56, 51));
        this.O.setOnClickListener(new t60(this, 16));
        this.O.setOnLongClickListener(new u(this, 3));
        TextPaint textPaint = this.S;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        x50 x50Var = new x50(this, context, 2);
        this.Q = x50Var;
        x50Var.setAlpha(0.0f);
        this.Q.setScaleX(0.2f);
        this.Q.setScaleY(0.2f);
        this.P.addView(this.Q, w7.a6.a(24.0f, 0.0f, 0.0f, -2.0f, 9.0f, 42, 85));
        if (this.f39523w != 0) {
            this.M.setVisibility(8);
        }
        if (this.e && ((arrayList = this.d) == null || arrayList.isEmpty())) {
            this.f39521r.setVisibility(0);
            this.h.setEmptyView(null);
        } else {
            this.f39521r.setVisibility(8);
            this.h.setEmptyView(this.f39522s);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.albumsDidLoad) {
            if (this.classGuid == ((Integer) objArr[0]).intValue()) {
                int i12 = this.f39523w;
                if (i12 != 1 && i12 != 2 && i12 != 10 && this.f39524x) {
                    this.d = (ArrayList) objArr[1];
                } else {
                    this.d = (ArrayList) objArr[2];
                }
                FrameLayout frameLayout = this.f39521r;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
                org.telegram.ui.Components.mm0 mm0Var = this.h;
                if (mm0Var != null && mm0Var.getEmptyView() == null) {
                    this.h.setEmptyView(this.f39522s);
                }
                oq0 oq0Var = this.f39520n;
                if (oq0Var != null) {
                    oq0Var.l();
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
        int i10 = org.telegram.ui.ActionBar.g6.f19972h5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.g6.f20007j5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kVar, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 0, new Class[]{View.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.R4}, null, org.telegram.ui.ActionBar.g6.f19905da));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 0, new Class[]{View.class}, null, null, null, org.telegram.ui.ActionBar.g6.X9));
        return arrayList;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.vu vuVar = this.M;
        if (vuVar != null && vuVar.e) {
            if (z10) {
                vuVar.k(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.mm0 mm0Var = this.h;
        if (mm0Var != null) {
            mm0Var.getViewTreeObserver().addOnPreDrawListener(new ii(this, 3));
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i10 = this.f39523w;
        boolean z10 = true;
        if (i10 != 1 && i10 != 2 && i10 != 10 && this.f39524x) {
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
        org.telegram.ui.Components.vu vuVar = this.M;
        if (vuVar != null) {
            vuVar.o();
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.closeChats);
        super.onFragmentDestroy();
    }

    @Override
    public final void onResume() {
        super.onResume();
        oq0 oq0Var = this.f39520n;
        if (oq0Var != null) {
            oq0Var.l();
        }
        org.telegram.ui.Components.vu vuVar = this.M;
        if (vuVar != null) {
            vuVar.s();
        }
        org.telegram.ui.Components.mm0 mm0Var = this.h;
        if (mm0Var != null) {
            mm0Var.getViewTreeObserver().addOnPreDrawListener(new ii(this, 3));
        }
    }
}
