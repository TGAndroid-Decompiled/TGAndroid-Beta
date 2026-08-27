package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableString;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.widget.TextView;
import j$.time.YearMonth;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

public final class w7 extends f2.q0 {

    public final int f43636c;
    public final Object d;

    public w7(Object obj, int i10) {
        this.f43636c = i10;
        this.d = obj;
    }

    @Override
    public final int h() {
        switch (this.f43636c) {
            case 0:
                return ((h8) this.d).G;
            case 1:
                return ((org.telegram.ui.Cells.t) this.d).T2.size();
            case 2:
                return ((org.telegram.ui.Components.s8) this.d).T2.size() + 1;
            case 3:
                return 1;
            default:
                return 1;
        }
    }

    @Override
    public long i(int i10) {
        switch (this.f43636c) {
            case 0:
                h8 h8Var = (h8) this.d;
                return (((long) (h8Var.E - (i10 / 12))) * 100) + ((long) (h8Var.F - (i10 % 12)));
            case 1:
            default:
                return super.i(i10);
            case 2:
                org.telegram.ui.Components.s8 s8Var = (org.telegram.ui.Components.s8) this.d;
                if (i10 >= s8Var.T2.size()) {
                    return 1L;
                }
                return ((org.telegram.ui.Components.r8) s8Var.T2.get(i10)).f32099a;
        }
    }

    @Override
    public int j(int i10) {
        switch (this.f43636c) {
            case 2:
                return i10 >= ((org.telegram.ui.Components.s8) this.d).T2.size() ? 1 : 0;
            default:
                return super.j(i10);
        }
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        boolean z10;
        switch (this.f43636c) {
            case 0:
                e8 e8Var = (e8) o1Var.f5789a;
                h8 h8Var = (h8) this.d;
                int i11 = h8Var.E - (i10 / 12);
                int i12 = h8Var.F - (i10 % 12);
                if (i12 < 0) {
                    i12 += 12;
                    i11--;
                }
                if (e8Var.f37654b == i11) {
                    int i13 = e8Var.f37655c;
                }
                SparseArray sparseArray = (SparseArray) h8Var.O.get((i11 * 100) + i12);
                h8 h8Var2 = e8Var.f37662x;
                boolean z11 = (i11 == e8Var.f37654b && i12 == e8Var.f37655c) ? false : true;
                e8Var.f37654b = i11;
                e8Var.f37655c = i12;
                e8Var.f37658n = sparseArray;
                boolean z12 = false;
                if (z11 && e8Var.f37659r != null) {
                    for (int i14 = 0; i14 < e8Var.f37659r.size(); i14++) {
                        ((ImageReceiver) e8Var.f37659r.valueAt(i14)).onDetachedFromWindow();
                        ((ImageReceiver) e8Var.f37659r.valueAt(i14)).setParentView(null);
                    }
                    e8Var.f37659r = null;
                }
                if (sparseArray != null) {
                    if (e8Var.f37659r == null) {
                        e8Var.f37659r = new SparseArray();
                    }
                    int i15 = 0;
                    while (i15 < sparseArray.size()) {
                        int iKeyAt = sparseArray.keyAt(i15);
                        if (e8Var.f37659r.get(iKeyAt, z12) == null && ((f8) sparseArray.get(iKeyAt)).f37963g) {
                            ImageReceiver imageReceiver = new ImageReceiver();
                            imageReceiver.setParentView(e8Var);
                            MessageObject messageObject = ((f8) sparseArray.get(iKeyAt)).f37958a;
                            if (messageObject != null) {
                                boolean zHasMediaSpoilers = messageObject.hasMediaSpoilers();
                                if (messageObject.isVideo()) {
                                    TLRPC.Document document = messageObject.getDocument();
                                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 50);
                                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320);
                                    if (closestPhotoSizeWithSize == closestPhotoSizeWithSize2) {
                                        closestPhotoSizeWithSize2 = null;
                                    }
                                    if (closestPhotoSizeWithSize != null) {
                                        if (messageObject.strippedThumb != null) {
                                            imageReceiver.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), zHasMediaSpoilers ? "5_5_b" : "44_44", messageObject.strippedThumb, null, messageObject, 0);
                                        } else {
                                            imageReceiver.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), zHasMediaSpoilers ? "5_5_b" : "44_44", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "b", (String) null, messageObject, 0);
                                        }
                                    }
                                } else {
                                    TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                                    if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && messageMedia.photo != null && !messageObject.photoThumbs.isEmpty()) {
                                        TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 50);
                                        TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 320, false, closestPhotoSizeWithSize3, false);
                                        if (messageObject.mediaExists || DownloadController.getInstance(((org.telegram.ui.ActionBar.n2) h8Var2).currentAccount).canDownloadMedia(messageObject)) {
                                            if (closestPhotoSizeWithSize4 == closestPhotoSizeWithSize3) {
                                                closestPhotoSizeWithSize3 = null;
                                            }
                                            long j10 = 0;
                                            if (messageObject.strippedThumb != null) {
                                                ImageLocation forObject = ImageLocation.getForObject(closestPhotoSizeWithSize4, messageObject.photoThumbsObject);
                                                String str = zHasMediaSpoilers ? "5_5_b" : "44_44";
                                                BitmapDrawable bitmapDrawable = messageObject.strippedThumb;
                                                if (closestPhotoSizeWithSize4 != null) {
                                                    j10 = closestPhotoSizeWithSize4.size;
                                                }
                                                imageReceiver.setImage(forObject, str, null, null, bitmapDrawable, j10, null, messageObject, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 1);
                                            } else {
                                                imageReceiver.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize4, messageObject.photoThumbsObject), zHasMediaSpoilers ? "5_5_b" : "44_44", ImageLocation.getForObject(closestPhotoSizeWithSize3, messageObject.photoThumbsObject), "b", closestPhotoSizeWithSize4 != null ? closestPhotoSizeWithSize4.size : 0L, null, messageObject, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 1);
                                            }
                                        } else {
                                            BitmapDrawable bitmapDrawable2 = messageObject.strippedThumb;
                                            if (bitmapDrawable2 != null) {
                                                imageReceiver.setImage(null, null, bitmapDrawable2, null, messageObject, 0);
                                            } else {
                                                imageReceiver.setImage((ImageLocation) null, (String) null, ImageLocation.getForObject(closestPhotoSizeWithSize3, messageObject.photoThumbsObject), "b", (String) null, messageObject, 0);
                                            }
                                        }
                                    }
                                }
                                imageReceiver.setRoundRadius(AndroidUtilities.dp(22.0f));
                                e8Var.f37659r.put(iKeyAt, imageReceiver);
                            }
                        }
                        i15++;
                        z12 = false;
                    }
                }
                int i16 = i12 + 1;
                e8Var.d = YearMonth.of(i11, i16).lengthOfMonth();
                Calendar calendar = Calendar.getInstance();
                calendar.set(i11, i12, 0);
                e8Var.f37656e = (calendar.get(7) + 6) % 7;
                e8Var.h = (int) (calendar.getTimeInMillis() / 1000);
                int i17 = e8Var.d + e8Var.f37656e;
                e8Var.f37657f = ((int) (i17 / 7.0f)) + (i17 % 7 == 0 ? 0 : 1);
                calendar.set(i11, i16, 0);
                e8Var.f37653a.l(LocaleController.formatYearMont(calendar.getTimeInMillis() / 1000, true), false);
                h8Var2.s0(e8Var, false);
                e8.a(e8Var, h8Var.L, h8Var.M);
                e8.b(e8Var, 1.0f);
                h8Var.s0(e8Var, false);
                break;
            case 1:
                org.telegram.ui.Cells.s sVar = (org.telegram.ui.Cells.s) o1Var.f5789a;
                ta0 ta0Var = (ta0) ((org.telegram.ui.Cells.t) this.d).T2.get(i10);
                org.telegram.ui.Cells.q qVar = sVar.f25249c;
                int i18 = ta0Var.f42843b;
                int i19 = ta0Var.d;
                qVar.setImageResource(i18);
                TextView textView = sVar.d;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                if (!ta0Var.f42845e || UserConfig.hasPremiumOnAccounts()) {
                    marginLayoutParams.rightMargin = 0;
                    textView.setText(LocaleController.getString(i19));
                } else {
                    SpannableString spannableString = new SpannableString(org.telegram.messenger.y1.i(i19, new StringBuilder("d ")));
                    org.telegram.ui.Components.cq cqVar = new org.telegram.ui.Components.cq(R.drawable.msg_mini_premiumlock, 0);
                    cqVar.setTopOffset(1);
                    cqVar.setSize(AndroidUtilities.dp(13.0f));
                    spannableString.setSpan(cqVar, 0, 1, 33);
                    marginLayoutParams.rightMargin = AndroidUtilities.dp(4.0f);
                    textView.setText(spannableString);
                }
                sVar.b(h7.g6.a(ta0Var), false);
                int iDp = AndroidUtilities.dp(18.0f);
                qVar.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp, iDp, iDp, iDp, 0, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23144i6, false), -16777216));
                qVar.setForeground(ta0Var.f42844c);
                break;
            case 2:
                org.telegram.ui.Components.s8 s8Var = (org.telegram.ui.Components.s8) this.d;
                org.telegram.ui.Components.v8 v8Var = s8Var.Y2;
                ArrayList arrayList = s8Var.T2;
                org.telegram.ui.Components.t8 t8Var = (org.telegram.ui.Components.t8) o1Var.f5789a;
                if (o1Var.f5793f == 0) {
                    t8Var.d = false;
                    org.telegram.ui.Components.r8 r8Var = (org.telegram.ui.Components.r8) arrayList.get(i10);
                    boolean z13 = r8Var.f32100b && !UserConfig.getInstance(((org.telegram.ui.ActionBar.n2) v8Var).currentAccount).isPremium();
                    if (t8Var.v != z13) {
                        t8Var.v = z13;
                        t8Var.invalidate();
                    }
                    t8Var.f32682a = r8Var;
                    z10 = s8Var.V2 == ((org.telegram.ui.Components.r8) arrayList.get(i10)).f32099a;
                    if (t8Var.f32684c != z10) {
                        t8Var.f32684c = z10;
                        t8Var.invalidate();
                    }
                } else {
                    t8Var.d = true;
                    boolean z14 = !UserConfig.getInstance(((org.telegram.ui.ActionBar.n2) v8Var).currentAccount).isPremium();
                    if (t8Var.v != z14) {
                        t8Var.v = z14;
                        t8Var.invalidate();
                    }
                    t8Var.f32682a = s8Var.X2;
                    z10 = s8Var.V2 == 1;
                    if (t8Var.f32684c != z10) {
                        t8Var.f32684c = z10;
                        t8Var.invalidate();
                    }
                }
                break;
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        switch (this.f43636c) {
            case 0:
                return new org.telegram.ui.Components.lk0(new e8((h8) this.d, viewGroup.getContext()));
            case 1:
                Context context = viewGroup.getContext();
                org.telegram.ui.Cells.s sVar = new org.telegram.ui.Cells.s(context);
                Paint paint = new Paint(1);
                sVar.f25247a = paint;
                Paint paint2 = new Paint(1);
                sVar.f25248b = paint2;
                sVar.setOrientation(1);
                sVar.setWillNotDraw(false);
                org.telegram.ui.Cells.q qVar = new org.telegram.ui.Cells.q(context);
                sVar.f25249c = qVar;
                qVar.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                sVar.addView(qVar, h7.z5.q(58, 58, 1));
                TextView textView = new TextView(context);
                sVar.d = textView;
                textView.setSingleLine();
                textView.setTextSize(1, 13.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
                sVar.addView(textView, h7.z5.t(-2, -2, 1, 0, 4, 0, 0));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(Math.max(2, AndroidUtilities.dp(0.5f)));
                paint2.setColor(-1);
                return new org.telegram.ui.Components.lk0(sVar);
            case 2:
                org.telegram.ui.Components.s8 s8Var = (org.telegram.ui.Components.s8) this.d;
                return new org.telegram.ui.Components.lk0(new org.telegram.ui.Components.t8(s8Var.Y2, s8Var.getContext()));
            case 3:
                return new org.telegram.ui.Components.lk0(((org.telegram.ui.Components.em) this.d).v);
            default:
                return new org.telegram.ui.Components.lk0(new ag.s0(this, ((org.telegram.ui.Components.jn) this.d).getContext(), 14));
        }
    }

    private final void D(f2.o1 o1Var, int i10) {
    }

    private final void E(f2.o1 o1Var, int i10) {
    }
}
