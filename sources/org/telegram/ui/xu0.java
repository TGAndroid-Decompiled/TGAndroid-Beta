package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimatedFileDrawableStream;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
public class xu0 {
    public float A;
    public float B;
    public ValueAnimator C;
    public MessageObject D;
    public tu0 E;
    public uu0 F;
    public float G;
    public float H;
    public float I;
    public float J;
    public float K;
    public boolean L;
    public int M;
    public int N;
    public float O;
    public float P;
    public final float[] Q;
    public boolean R;
    public ColorMatrixColorFilter S;
    public final ViewGroup f43460a;
    public final ViewGroup f43461b;
    public final boolean f43462c;
    public wu0 d;
    public View f43463e;
    public ImageReceiver f43464f;
    public ImageReceiver f43465g;
    public ImageReceiver h;
    public boolean f43466i;
    public final jh.k f43467j;
    public jh.j f43468k;
    public final Path f43469l;
    public final float[] f43470m;
    public boolean f43471n;
    public float f43472o;
    public float f43473p;
    public float f43474q;
    public float f43475r;
    public float f43476s;
    public float f43477t;
    public float f43478u;
    public float v;
    public float f43479w;
    public float f43480x;
    public float f43481y;
    public float f43482z;

    public xu0(ViewGroup viewGroup, ViewGroup viewGroup2) {
        this.f43465g = new ImageReceiver();
        this.h = new ImageReceiver();
        this.f43467j = new jh.k();
        this.f43469l = new Path();
        this.f43470m = new float[8];
        this.Q = new float[2];
        this.f43460a = viewGroup;
        this.f43461b = viewGroup2;
        this.f43462c = false;
    }

    public final boolean a(MotionEvent motionEvent, ViewGroup viewGroup, ImageReceiver imageReceiver, MessageObject messageObject, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z4;
        if (!j(viewGroup, imageReceiver)) {
            return false;
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && this.L) {
                int i15 = -1;
                int i16 = -1;
                for (int i17 = 0; i17 < motionEvent.getPointerCount(); i17++) {
                    if (this.M == motionEvent.getPointerId(i17)) {
                        i15 = i17;
                    }
                    if (this.N == motionEvent.getPointerId(i17)) {
                        i16 = i17;
                    }
                }
                if (i15 != -1 && i16 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i16) - motionEvent.getX(i15), motionEvent.getY(i16) - motionEvent.getY(i15))) / this.I;
                    this.O = hypot;
                    if (hypot > 1.005f && !this.f43471n) {
                        this.I = (float) Math.hypot(motionEvent.getX(i16) - motionEvent.getX(i15), motionEvent.getY(i16) - motionEvent.getY(i15));
                        float x10 = (motionEvent.getX(i16) + motionEvent.getX(i15)) / 2.0f;
                        this.f43476s = x10;
                        this.G = x10;
                        float y10 = (motionEvent.getY(i16) + motionEvent.getY(i15)) / 2.0f;
                        this.f43477t = y10;
                        this.H = y10;
                        this.O = 1.0f;
                        this.J = 0.0f;
                        this.K = 0.0f;
                        viewGroup.getParent().requestDisallowInterceptTouchEvent(true);
                        this.f43463e = viewGroup;
                        this.D = messageObject;
                        wu0 wu0Var = this.d;
                        ViewGroup viewGroup2 = this.f43460a;
                        boolean z10 = this.f43462c;
                        if (wu0Var == null && !z10) {
                            i13 = -1;
                            wu0 wu0Var2 = new wu0(this, viewGroup2.getContext());
                            this.d = wu0Var2;
                            wu0Var2.setFocusable(false);
                            this.d.setFocusableInTouchMode(false);
                            this.d.setEnabled(false);
                        } else {
                            i13 = -1;
                        }
                        if (this.f43465g == null) {
                            ImageReceiver imageReceiver2 = new ImageReceiver();
                            this.f43465g = imageReceiver2;
                            imageReceiver2.setCrossfadeAlpha((byte) 2);
                            this.f43465g.setCrossfadeWithOldImage(false);
                            this.f43465g.onAttachedToWindow();
                            ImageReceiver imageReceiver3 = new ImageReceiver();
                            this.h = imageReceiver3;
                            imageReceiver3.setCrossfadeAlpha((byte) 2);
                            this.h.setCrossfadeWithOldImage(false);
                            this.h.onAttachedToWindow();
                        }
                        this.f43471n = true;
                        this.A = 1.0f;
                        this.B = 0.0f;
                        if (!z10) {
                            viewGroup2.addView(this.d);
                            if (messageObject != null && messageObject.hasMediaSpoilers() && !messageObject.isMediaSpoilersRevealed) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            this.f43466i = z4;
                            if (z4 && this.f43468k == null) {
                                jh.j e6 = jh.j.e(this.d);
                                this.f43468k = e6;
                                if (e6 != null) {
                                    e6.f10130k.put(this.d, Integer.valueOf(i10));
                                }
                            }
                            ImageLocation imageLocation = null;
                            if (this.h.getBitmap() != null) {
                                this.h.getBitmap().recycle();
                                this.h.setImageBitmap((Bitmap) null);
                            }
                            if (imageReceiver.getBitmap() != null && !imageReceiver.getBitmap().isRecycled() && this.f43466i) {
                                this.h.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver.getBitmap()));
                                ImageReceiver imageReceiver4 = this.h;
                                if (this.S == null) {
                                    ColorMatrix colorMatrix = new ColorMatrix();
                                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
                                    AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.6f);
                                    this.S = new ColorMatrixColorFilter(colorMatrix);
                                }
                                imageReceiver4.setColorFilter(this.S);
                            } else {
                                this.h.setColorFilter(null);
                            }
                            if (messageObject == null || !messageObject.isPhoto()) {
                                i14 = i15;
                                i11 = i16;
                            } else {
                                int[] iArr = new int[1];
                                TLRPC.Message message = messageObject.messageOwner;
                                if (message instanceof TLRPC.TL_messageService) {
                                    if (!(message.action instanceof TLRPC.TL_messageActionUserUpdatedPhoto)) {
                                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize());
                                        if (closestPhotoSizeWithSize != null) {
                                            int i18 = closestPhotoSizeWithSize.size;
                                            iArr[0] = i18;
                                            if (i18 == 0) {
                                                iArr[0] = i13;
                                            }
                                            imageLocation = ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject.photoThumbsObject);
                                        } else {
                                            iArr[0] = i13;
                                        }
                                    }
                                } else {
                                    TLRPC.MessageMedia messageMedia = message.media;
                                    if (((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && messageMedia.photo != null) || ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && messageMedia.webpage != null)) {
                                        if (messageObject.isGif()) {
                                            imageLocation = ImageLocation.getForDocument(messageObject.getDocument());
                                        } else {
                                            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize(), false, null, true);
                                            if (closestPhotoSizeWithSize2 != null) {
                                                int i19 = closestPhotoSizeWithSize2.size;
                                                iArr[0] = i19;
                                                if (i19 == 0) {
                                                    iArr[0] = i13;
                                                }
                                                imageLocation = ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject.photoThumbsObject);
                                            } else {
                                                iArr[0] = i13;
                                            }
                                        }
                                    } else if (messageMedia instanceof TLRPC.TL_messageMediaInvoice) {
                                        imageLocation = ImageLocation.getForWebFile(WebFile.createWithWebDocument(((TLRPC.TL_messageMediaInvoice) messageMedia).webPhoto));
                                    } else if (messageObject.getDocument() != null) {
                                        TLRPC.Document document = messageObject.getDocument();
                                        if (MessageObject.isDocumentHasThumb(messageObject.getDocument())) {
                                            TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                                            int i20 = closestPhotoSizeWithSize3.size;
                                            iArr[0] = i20;
                                            if (i20 == 0) {
                                                iArr[0] = i13;
                                            }
                                            imageLocation = ImageLocation.getForDocument(closestPhotoSizeWithSize3, document);
                                        }
                                    }
                                }
                                if (imageLocation != null) {
                                    i11 = i16;
                                    i14 = i15;
                                    this.f43465g.setImage(imageLocation, null, null, null, null, iArr[0], null, messageObject, messageObject.isWebpage() ? 1 : 0);
                                    this.f43465g.setCrossfadeAlpha((byte) 2);
                                } else {
                                    i14 = i15;
                                    i11 = i16;
                                }
                                i();
                            }
                            this.f43478u = imageReceiver.getImageX();
                            this.v = imageReceiver.getImageY() + viewGroup.getPaddingTop();
                            this.f43479w = imageReceiver.getImageHeight();
                            this.f43480x = imageReceiver.getImageWidth();
                            this.f43481y = imageReceiver.getBitmapHeight();
                            float bitmapWidth = imageReceiver.getBitmapWidth();
                            this.f43482z = bitmapWidth;
                            float f10 = this.f43481y;
                            float f11 = f10 / bitmapWidth;
                            float f12 = this.f43479w;
                            float f13 = this.f43480x;
                            float f14 = f12 / f13;
                            if (f11 != f14) {
                                if (f11 < f14) {
                                    this.f43482z = (bitmapWidth / f10) * f12;
                                    this.f43481y = f12;
                                } else {
                                    this.f43481y = f11 * f13;
                                    this.f43482z = f13;
                                }
                            } else {
                                this.f43481y = f12;
                                this.f43482z = f13;
                            }
                            if (messageObject != null && messageObject.isVideo() && MediaController.getInstance().isPlayingMessage(messageObject)) {
                                this.R = true;
                                MediaController mediaController = MediaController.getInstance();
                                wu0 wu0Var3 = this.d;
                                mediaController.setTextureView(wu0Var3.f42890b, wu0Var3.f42891c, wu0Var3.f42889a, true);
                                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.f42889a.getLayoutParams();
                                this.d.f42889a.setTag(R.id.parent_tag, imageReceiver);
                                if (layoutParams.width != imageReceiver.getImageWidth() || layoutParams.height != imageReceiver.getImageHeight()) {
                                    this.d.f42891c.setResizeMode(3);
                                    layoutParams.width = (int) imageReceiver.getImageWidth();
                                    layoutParams.height = (int) imageReceiver.getImageHeight();
                                    this.d.f42889a.setLayoutParams(layoutParams);
                                }
                                this.d.f42890b.setScaleX(1.0f);
                                this.d.f42890b.setScaleY(1.0f);
                                tu0 tu0Var = this.E;
                                if (tu0Var != null) {
                                    this.d.d.setImageBitmap(tu0Var.h0().getBitmap((int) this.f43482z, (int) this.f43481y));
                                    this.d.d.s((int) this.f43482z, (int) this.f43481y);
                                    this.d.d.getImageReceiver().setRoundRadius(imageReceiver.getRoundRadius(true));
                                }
                                this.d.f42889a.setVisibility(0);
                            } else {
                                this.R = false;
                                ImageReceiver imageReceiver5 = new ImageReceiver();
                                this.f43464f = imageReceiver5;
                                imageReceiver5.onAttachedToWindow();
                                Drawable drawable = imageReceiver.getDrawable();
                                this.f43464f.setImageBitmap(drawable);
                                if (drawable instanceof org.telegram.ui.Components.y5) {
                                    org.telegram.ui.Components.y5 y5Var = (org.telegram.ui.Components.y5) drawable;
                                    y5Var.f(this.d);
                                    y5Var.O = true;
                                }
                                this.f43464f.setImageCoords(this.f43478u, this.v, this.f43480x, this.f43479w);
                                this.f43464f.setAspectFit(imageReceiver.isAspectFit());
                                this.f43464f.setRoundRadius(imageReceiver.getRoundRadius(true));
                                this.f43465g.setRoundRadius(imageReceiver.getRoundRadius(true));
                                this.f43465g.setAspectFit(imageReceiver.isAspectFit());
                                this.d.f42889a.setVisibility(8);
                            }
                        } else {
                            i14 = i15;
                            i11 = i16;
                        }
                        tu0 tu0Var2 = this.E;
                        if (tu0Var2 != null) {
                            tu0Var2.y0(messageObject);
                        }
                        this.P = 0.0f;
                        i12 = i14;
                    } else {
                        i11 = i16;
                        i12 = i15;
                    }
                    float x11 = motionEvent.getX(i12);
                    int i21 = i11;
                    float y11 = motionEvent.getY(i12);
                    float x12 = this.G - ((motionEvent.getX(i21) + x11) / 2.0f);
                    float y12 = this.H - ((motionEvent.getY(i21) + y11) / 2.0f);
                    float f15 = -x12;
                    float f16 = this.O;
                    this.J = f15 / f16;
                    this.K = (-y12) / f16;
                    e();
                } else {
                    this.L = false;
                    viewGroup.getParent().requestDisallowInterceptTouchEvent(false);
                    d();
                    return false;
                }
            } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.M == motionEvent.getPointerId(0) && this.N == motionEvent.getPointerId(1)) || (this.M == motionEvent.getPointerId(1) && this.N == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.L) {
                this.L = false;
                if (viewGroup != null && viewGroup.getParent() != null) {
                    viewGroup.getParent().requestDisallowInterceptTouchEvent(false);
                }
                d();
            }
        } else if (!this.L && motionEvent.getPointerCount() == 2) {
            this.I = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
            float x13 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
            this.f43476s = x13;
            this.G = x13;
            float y13 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
            this.f43477t = y13;
            this.H = y13;
            this.O = 1.0f;
            this.M = motionEvent.getPointerId(0);
            this.N = motionEvent.getPointerId(1);
            this.L = true;
        }
        return f(viewGroup);
    }

    public final void b() {
        if (this.f43471n) {
            tu0 tu0Var = this.E;
            if (tu0Var != null) {
                tu0Var.G(this.D);
            }
            this.f43471n = false;
        }
        wu0 wu0Var = this.d;
        if (wu0Var != null && wu0Var.getParent() != null) {
            this.f43460a.removeView(this.d);
            this.d.d.getImageReceiver().clearImage();
            jh.j jVar = this.f43468k;
            if (jVar != null) {
                jVar.b(this.d);
                this.f43468k = null;
            }
            ImageReceiver imageReceiver = this.f43464f;
            if (imageReceiver != null) {
                Drawable drawable = imageReceiver.getDrawable();
                if (drawable instanceof org.telegram.ui.Components.y5) {
                    ((org.telegram.ui.Components.y5) drawable).w(this.d);
                }
            }
        }
        View view = this.f43463e;
        if (view != null) {
            view.invalidate();
            this.f43463e = null;
        }
        ImageReceiver imageReceiver2 = this.f43464f;
        if (imageReceiver2 != null) {
            imageReceiver2.onDetachedFromWindow();
            this.f43464f.clearImage();
            this.f43464f = null;
        }
        ImageReceiver imageReceiver3 = this.f43465g;
        if (imageReceiver3 != null) {
            imageReceiver3.onDetachedFromWindow();
            this.f43465g.clearImage();
            this.f43465g = null;
        }
        ImageReceiver imageReceiver4 = this.h;
        if (imageReceiver4 != null) {
            imageReceiver4.onDetachedFromWindow();
            this.h.clearImage();
            this.h = null;
        }
        this.D = null;
    }

    public final void d() {
        if (this.C == null && this.f43471n) {
            if (!this.f43462c && !i()) {
                b();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.C = ofFloat;
            ofFloat.addUpdateListener(new e3(this, 25));
            this.C.addListener(new ns0(this, 9));
            this.C.setDuration(220L);
            this.C.setInterpolator(org.telegram.ui.Components.pr.f30183f);
            this.C.start();
        }
    }

    public void e() {
        View view;
        if (this.f43462c && (view = this.f43463e) != null) {
            view.invalidate();
        }
        wu0 wu0Var = this.d;
        if (wu0Var != null) {
            wu0Var.invalidate();
        }
    }

    public final boolean f(View view) {
        if (this.f43471n && view == this.f43463e) {
            return true;
        }
        return false;
    }

    public final boolean g(MotionEvent motionEvent) {
        if (i() && this.f43463e != null) {
            motionEvent.offsetLocation(-this.f43474q, -this.f43475r);
            return this.f43463e.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void h(te teVar) {
        this.F = teVar;
    }

    public final boolean i() {
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        for (View view = this.f43463e; view != this.f43460a; view = (View) view.getParent()) {
            if (view == null) {
                return false;
            }
            f11 += view.getLeft();
            f12 += view.getTop();
            if (!(view.getParent() instanceof View)) {
                break;
            }
        }
        float f13 = 0.0f;
        for (View view2 = this.f43463e; view2 != this.f43461b; view2 = (View) view2.getParent()) {
            if (view2 == null) {
                return false;
            }
            f10 += view2.getLeft();
            f13 += view2.getTop();
        }
        this.f43474q = f10;
        this.f43475r = f13;
        this.f43472o = f11;
        this.f43473p = f12;
        return true;
    }

    public boolean j(View view, ImageReceiver imageReceiver) {
        if (!this.f43462c) {
            if (imageReceiver.getDrawable() instanceof org.telegram.ui.Components.y5) {
                AnimatedFileDrawableStream animatedFileDrawableStream = ((org.telegram.ui.Components.y5) imageReceiver.getDrawable()).f33329r0;
                if (animatedFileDrawableStream != null && animatedFileDrawableStream.isWaitingForLoad()) {
                    return false;
                }
                return true;
            }
            return imageReceiver.hasNotThumbOrOnlyStaticThumb();
        }
        return true;
    }

    public xu0() {
        this.f43465g = new ImageReceiver();
        this.h = new ImageReceiver();
        this.f43467j = new jh.k();
        this.f43469l = new Path();
        this.f43470m = new float[8];
        this.Q = new float[2];
        this.f43460a = null;
        this.f43461b = null;
        this.f43462c = true;
    }

    public void c(Canvas canvas, float f10, float f11, float f12, float f13, float f14) {
    }
}
