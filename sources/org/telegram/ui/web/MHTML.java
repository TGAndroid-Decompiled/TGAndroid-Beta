package org.telegram.ui.web;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.net.Uri;
import android.opengl.GLES20;
import android.os.AsyncTask;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Base64InputStream;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import androidx.activity.ComponentDialog$$ExternalSyntheticLambda1;
import androidx.car.app.HostException;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.core.util.AtomicFile;
import com.google.android.datatransport.runtime.backends.MetadataBackendRegistry;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.ttml.DeleteTextSpan;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.text.ttml.TtmlRegion;
import com.google.android.exoplayer2.util.Util;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.media.ImageHints;
import com.google.android.gms.cast.framework.media.internal.zzf;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.zzah;
import com.google.android.gms.internal.cast.zzab;
import com.google.android.gms.internal.cast.zzad;
import com.google.android.gms.internal.cast.zzg;
import com.google.android.gms.internal.cast.zznd;
import com.google.android.gms.internal.cast.zzne;
import com.google.android.gms.internal.cast.zznn;
import com.google.android.gms.internal.cast.zzno;
import com.google.android.gms.internal.cast.zznp;
import com.google.android.gms.internal.cast.zznq;
import com.google.android.gms.internal.cast.zznr;
import com.google.android.gms.internal.cast.zzns;
import com.google.android.gms.internal.cast.zznt;
import com.google.android.gms.internal.cast.zznu;
import com.google.android.gms.internal.cast.zznv;
import com.google.android.gms.internal.cast.zznw;
import com.google.android.gms.internal.cast.zznx;
import com.google.android.gms.internal.cast.zzny;
import com.google.android.gms.internal.cast.zzoj;
import com.google.android.gms.internal.cast.zzok;
import com.google.android.gms.internal.cast.zzq;
import com.google.android.gms.internal.cast.zzx;
import com.google.android.gms.internal.cast.zzz;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.OptionalProvider;
import com.google.firebase.components.Qualified;
import com.google.firebase.components.RestrictedComponentContainer$RestrictedPublisher;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame;
import com.google.firebase.events.Publisher;
import j$.util.DesugarCollections;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.SecureRandom;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import javax.inject.Provider;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.commonmark.internal.DocumentParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.BottomSheetTabs;
import org.telegram.ui.Components.BlurringShader;
import org.telegram.ui.Components.CanvasButton;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Paint.Views.ReactionWidgetEntityView;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.ReactionsContainerLayout;
import org.telegram.ui.Components.chat.layouts.ChatActivityActionsButtonsLayout;
import org.telegram.ui.Stories.recorder.PaintView;
import org.telegram.ui.WearAuthSheet;

public final class MHTML implements Factory, Subtitle, ComponentContainer, FactorAnimator.Target, ReactionsContainerLayout.ReactionsContainerDelegate {
    public Object boundary;
    public Object entries;
    public Object entriesByLocation;
    public Object file;
    public Object filePos;

    public final class Entry {
        public long end;
        public File file;
        public final HashMap headers = new HashMap();
        public long start;

        public final FilterInputStream getInputStream() {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new BoundedInputStream(this.file, this.start, this.end));
            HashMap map = this.headers;
            HeaderValue headerValue = (HeaderValue) map.get("content-transfer-encoding");
            if ("base64".equals(headerValue == null ? null : headerValue.value)) {
                return new Base64InputStream(bufferedInputStream, 0);
            }
            HeaderValue headerValue2 = (HeaderValue) map.get("content-transfer-encoding");
            return "quoted-printable".equalsIgnoreCase(headerValue2 != null ? headerValue2.value : null) ? new QuotedPrintableInputStream(bufferedInputStream) : bufferedInputStream;
        }
    }

    public final class HeaderValue {
        public final HashMap props = new HashMap();
        public String value;
    }

    public MHTML(Context context) {
        this(context, new ImageHints(-1, 0, 0));
    }

    public static void appendHeader(String str, String str2, HashMap map) {
        HeaderValue headerValue = new HeaderValue();
        String[] strArrSplit = str2.split(";(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
        for (int i = 0; i < strArrSplit.length; i++) {
            String strTrim = strArrSplit[i].trim();
            if (!strTrim.isEmpty()) {
                int iIndexOf = strTrim.indexOf(61);
                if (i == 0 || iIndexOf < 0) {
                    headerValue.value = strTrim;
                } else {
                    String strTrim2 = strTrim.substring(0, iIndexOf).trim();
                    String strTrim3 = strTrim.substring(iIndexOf + 1).trim();
                    if (strTrim3.length() >= 2 && strTrim3.charAt(0) == '\"' && strTrim3.charAt(strTrim3.length() - 1) == '\"') {
                        strTrim3 = SurfaceContainer$$ExternalSyntheticOutline0.m(1, 1, strTrim3);
                    }
                    headerValue.props.put(strTrim2, strTrim3);
                }
            }
        }
        map.put(str.trim().toLowerCase(), headerValue);
    }

    public static MHTML createInstance(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        MHTML mhtml = new MHTML();
        mhtml.entriesByLocation = new ArrayDeque();
        mhtml.file = sharedPreferences;
        mhtml.boundary = "topic_operation_queue";
        mhtml.entries = ",";
        mhtml.filePos = scheduledThreadPoolExecutor;
        synchronized (((ArrayDeque) mhtml.entriesByLocation)) {
            try {
                ((ArrayDeque) mhtml.entriesByLocation).clear();
                String string = ((SharedPreferences) mhtml.file).getString((String) mhtml.boundary, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) mhtml.entries)) {
                    String[] strArrSplit = string.split((String) mhtml.entries, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) mhtml.entriesByLocation).add(str);
                        }
                    }
                    return mhtml;
                }
                return mhtml;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static float[] getPreparedSplineCurve(ArrayList arrayList) {
        double d;
        double d2;
        float f;
        double[] dArr;
        ArrayList arrayList2;
        float f2;
        int i;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            PointF pointF = (PointF) arrayList.get(i2);
            pointF.x *= 255.0f;
            pointF.y *= 255.0f;
        }
        int size2 = arrayList.size();
        double d3 = 1.0d;
        if (size2 <= 0 || size2 == 1) {
            d = 1.0d;
            d2 = 6.0d;
            f = 255.0f;
            dArr = null;
        } else {
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size2, 3);
            double[] dArr3 = new double[size2];
            double[] dArr4 = dArr2[0];
            dArr4[1] = 1.0d;
            double d4 = 0.0d;
            dArr4[0] = 0.0d;
            dArr4[2] = 0.0d;
            int i3 = 1;
            while (true) {
                i = size2 - 1;
                if (i3 >= i) {
                    break;
                }
                PointF pointF2 = (PointF) arrayList.get(i3 - 1);
                PointF pointF3 = (PointF) arrayList.get(i3);
                int i4 = i3 + 1;
                double d5 = d3;
                PointF pointF4 = (PointF) arrayList.get(i4);
                double[] dArr5 = dArr2[i3];
                float f3 = pointF3.x;
                double d6 = d4;
                float f4 = pointF2.x;
                double d7 = f3 - f4;
                dArr5[0] = d7 / 6.0d;
                float f5 = pointF4.x;
                dArr5[1] = ((double) (f5 - f4)) / 3.0d;
                double d8 = f5 - f3;
                dArr5[2] = d8 / 6.0d;
                float f6 = pointF4.y;
                float f7 = pointF3.y;
                dArr3[i3] = (((double) (f6 - f7)) / d8) - (((double) (f7 - pointF2.y)) / d7);
                i3 = i4;
                d3 = d5;
                d4 = d6;
            }
            d = d3;
            double d9 = d4;
            d2 = 6.0d;
            f = 255.0f;
            dArr3[0] = d9;
            dArr3[i] = d9;
            double[] dArr6 = dArr2[i];
            dArr6[1] = d;
            dArr6[0] = d9;
            dArr6[2] = d9;
            for (int i5 = 1; i5 < size2; i5++) {
                double[] dArr7 = dArr2[i5];
                double d10 = dArr7[0];
                int i6 = i5 - 1;
                double[] dArr8 = dArr2[i6];
                double d11 = d10 / dArr8[1];
                dArr7[1] = dArr7[1] - (dArr8[2] * d11);
                dArr7[0] = d9;
                dArr3[i5] = dArr3[i5] - (d11 * dArr3[i6]);
            }
            for (int i7 = size2 - 2; i7 >= 0; i7--) {
                double[] dArr9 = dArr2[i7];
                double d12 = dArr9[2];
                int i8 = i7 + 1;
                double[] dArr10 = dArr2[i8];
                double d13 = d12 / dArr10[1];
                dArr9[1] = dArr9[1] - (dArr10[0] * d13);
                dArr9[2] = d9;
                dArr3[i7] = dArr3[i7] - (d13 * dArr3[i8]);
            }
            dArr = new double[size2];
            for (int i9 = 0; i9 < size2; i9++) {
                dArr[i9] = dArr3[i9] / dArr2[i9][1];
            }
        }
        int length = dArr.length;
        if (length < 1) {
            arrayList2 = null;
            f2 = 0.0f;
        } else {
            arrayList2 = new ArrayList(length + 1);
            int i10 = 0;
            while (i10 < length - 1) {
                PointF pointF5 = (PointF) arrayList.get(i10);
                int i11 = i10 + 1;
                PointF pointF6 = (PointF) arrayList.get(i11);
                int i12 = (int) pointF5.x;
                while (true) {
                    float f8 = pointF6.x;
                    if (i12 < ((int) f8)) {
                        float f9 = i12;
                        float f10 = pointF5.x;
                        PointF pointF7 = pointF5;
                        double d14 = f8 - f10;
                        double d15 = ((double) (f9 - f10)) / d14;
                        double d16 = d - d15;
                        int i13 = length;
                        double[] dArr11 = dArr;
                        float f11 = (float) (((((((d15 * d15) * d15) - d15) * dArr11[i11]) + ((((d16 * d16) * d16) - d16) * dArr11[i10])) * ((d14 * d14) / d2)) + (((double) pointF6.y) * d15) + (((double) pointF7.y) * d16));
                        if (f11 > f) {
                            f11 = 255.0f;
                        } else if (f11 < 0.0f) {
                            f11 = 0.0f;
                        }
                        arrayList2.add(new PointF(f9, f11));
                        i12++;
                        dArr = dArr11;
                        pointF5 = pointF7;
                        length = i13;
                    }
                }
                i10 = i11;
            }
            f2 = 0.0f;
            arrayList2.add((PointF) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList));
        }
        float f12 = ((PointF) arrayList2.get(0)).x;
        if (f12 > f2) {
            for (int i14 = (int) f12; i14 >= 0; i14--) {
                arrayList2.add(0, new PointF(i14, 0.0f));
            }
        }
        float f13 = ((PointF) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList2)).x;
        if (f13 < f) {
            for (int i15 = ((int) f13) + 1; i15 <= 255; i15++) {
                arrayList2.add(new PointF(i15, 255.0f));
            }
        }
        float[] fArr = new float[arrayList2.size()];
        int size3 = arrayList2.size();
        for (int i16 = 0; i16 < size3; i16++) {
            PointF pointF8 = (PointF) arrayList2.get(i16);
            float fSqrt = (float) Math.sqrt(Math.pow(pointF8.x - pointF8.y, 2.0d));
            if (pointF8.x > pointF8.y) {
                fSqrt = -fSqrt;
            }
            fArr[i16] = fSqrt;
        }
        return fArr;
    }

    public static void zzf(MHTML mhtml, zzz zzzVar) {
        int i = zzzVar.zze;
        if (i == 2 && ((zzx) mhtml.entriesByLocation) != null) {
            mhtml.zzh();
        }
        if (i == 2) {
            mhtml.entriesByLocation = new zzx((zzg) mhtml.file, (String) mhtml.boundary);
        } else {
            mhtml.entriesByLocation = mhtml.zzg();
        }
        zzx zzxVar = (zzx) mhtml.entriesByLocation;
        zzah.checkNotNull(zzxVar);
        zzzVar.zzd = zzxVar.zzn;
        zzxVar.zzh.add(zzzVar);
    }

    public byte[] acceptAndBuildAnswer() {
        SecureRandom secureRandom = new SecureRandom();
        BigInteger bigInteger = new BigInteger(2048, secureRandom);
        BigInteger bigInteger2 = WearAuthSheet.DH_G;
        BigInteger bigInteger3 = WearAuthSheet.DH_P;
        BigInteger bigIntegerModPow = bigInteger2.modPow(bigInteger, bigInteger3);
        BigInteger bigInteger4 = BigInteger.ONE;
        if (bigIntegerModPow.compareTo(bigInteger4) <= 0 || bigIntegerModPow.compareTo(bigInteger3.subtract(bigInteger4)) >= 0) {
            throw new IllegalStateException("our pubkey invalid (extremely unlikely)");
        }
        byte[] bArrAccess$300 = WearAuthSheet.access$300(bigIntegerModPow);
        byte[] bArr = (byte[]) this.entriesByLocation;
        BigInteger bigInteger5 = new BigInteger(1, bArr);
        if (bigInteger5.compareTo(bigInteger4) <= 0 || bigInteger5.compareTo(bigInteger3.subtract(bigInteger4)) >= 0) {
            throw new IllegalArgumentException("peer pubkey out of range");
        }
        byte[] bArrAccess$301 = WearAuthSheet.access$300(bigInteger5.modPow(bigInteger, bigInteger3));
        byte[] bArr2 = new byte[16];
        secureRandom.nextBytes(bArr2);
        byte[] bArr3 = (byte[]) this.file;
        byte[] bArrAccess$400 = WearAuthSheet.access$400(new byte[][]{bArrAccess$301, bArr3, bArr2});
        byte[] bArrAccess$401 = WearAuthSheet.access$400(new byte[][]{bArrAccess$301, bArr});
        this.filePos = bArrAccess$400;
        String[] strArr = {"👋", "👍", "👎", "👌", "👊", "🤟", "🫵", "👏", "🤝", "✍", "💪", "👀", "👅", "🥶", "🤡", "💀", "👽", "😈", "😎", "🤠", "🤩", "😍", "🤯", "🦄", "🐶", "🐷", "🐔", "🐥", "🦊", "🐙", "🐸", "🐳", "🦉", "🦆", "🐢", "🦖", "🐵", "🐝", "🦁", "🐧", "🦋", "🐬", "🦀", "🐌", "🦠", "🐠", "🌵", "💐", "💐", "🎄", "🍄", "🍔", "🍕", "☕", "🍩", "🍪", "🎂", "🍫", "🍭", "🍎", "🥥", "🍒", "🌶", "🥒", "🥦", "🍇", "🍋", "🍓", "🍌", "🍍", "🍆", "🌽", "🍺", "🍷", "🍾", "🍦", "🍰", "🍞", "🍖", "🌭", "🧊", "🍳", "⭐", "☁", "🚀", "🎈", "💎", "💡", "🔑", "❄", "🔎", "👠", "👕", "👗", "👖", "👙", "👜", "👓", "🎀", "💄", "💍", "♠", "❤", "♦", "♣", "🌈", "🌊", "🎃", "👻", "🎁", "🔮", "🎥", "💿", "💻", "📡", "🔉", "⏳", "🔒", "🚗", "🔱", "🔗", "🎲", "🎮", "⚽", "🎳", "🏁", "🏆", "🎸", "💣", "🚽", "🎹", "🎤", "🎨", "🔫", "💊", "💰", "📦", "📅", "📚", "❗", "❓", "💯", "💦", "💤", "🌍", "🏝", "🚂", "🛢", "🛹", "🚢", "✈", "🛎", "🧳", "🌖", "🌞", "🔥", "🏓", "🎰", "🧸", "🪩", "🎭", "👑", "🎩", "🧢", "🔈", "🔋", "🕯", "✏", "💼", "📌", "✂", "🗑", "🛡", "⚙", "🧲", "\u1fa8f", "⚖", "🧪", "🚪", "🫧", "🛒", "🪑", "🗿", "🏁", "🏴\u200d☠", "📊", "🥁", "🎧", "🎵", "🧩", "⛳", "🥇", "🥈", "🥈", "🌪", "⛺", "🧭", "\u1fac6", "🧠", "💋"};
        ArrayList arrayList = new ArrayList(4);
        int i = 0;
        for (int i2 = 4; i < i2; i2 = 4) {
            int i3 = i * 8;
            arrayList.add(strArr[(int) ((((((((((((long) bArrAccess$401[i3]) & 127) << 56) | ((((long) bArrAccess$401[i3 + 1]) & 255) << 48)) | ((((long) bArrAccess$401[i3 + 2]) & 255) << 40)) | ((((long) bArrAccess$401[i3 + 3]) & 255) << 32)) | ((((long) bArrAccess$401[i3 + 4]) & 255) << 24)) | ((((long) bArrAccess$401[i3 + 5]) & 255) << 16)) | ((((long) bArrAccess$401[i3 + 6]) & 255) << 8)) | (((long) bArrAccess$401[i3 + 7]) & 255)) % ((long) 200))]);
            i++;
        }
        this.entries = arrayList;
        StringBuilder sb = new StringBuilder("wear-auth: built answer; session ");
        StringBuilder sb2 = new StringBuilder(bArr3.length * 2);
        for (byte b : bArr3) {
            sb2.append(String.format("%02x", Byte.valueOf(b)));
        }
        sb.append(sb2.toString());
        sb.append(" emojis=");
        sb.append((ArrayList) this.entries);
        FileLog.d(sb.toString());
        byte[] bArr4 = new byte[288];
        System.arraycopy(bArr3, 0, bArr4, 0, 16);
        System.arraycopy(bArr2, 0, bArr4, 16, 16);
        System.arraycopy(bArrAccess$300, 0, bArr4, 32, 256);
        return bArr4;
    }

    @Override
    public boolean allowLongPress() {
        return true;
    }

    public AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame build() {
        String strM$1 = ((Long) this.file) == null ? " pc" : "";
        if (((String) this.boundary) == null) {
            strM$1 = strM$1.concat(" symbol");
        }
        if (((Long) this.entriesByLocation) == null) {
            strM$1 = SurfaceContainer$$ExternalSyntheticOutline0.m$1(strM$1, " offset");
        }
        if (((Integer) this.filePos) == null) {
            strM$1 = SurfaceContainer$$ExternalSyntheticOutline0.m$1(strM$1, " importance");
        }
        if (strM$1.isEmpty()) {
            return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame(((Long) this.file).longValue(), (String) this.boundary, (String) this.entries, ((Long) this.entriesByLocation).longValue(), ((Integer) this.filePos).intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strM$1));
    }

    public void clip(Canvas canvas, boolean z, boolean z2, int i, float f) {
        BottomSheetTabs bottomSheetTabs = (BottomSheetTabs) this.file;
        int i2 = (int) ((z2 ? 0 : (int) bottomSheetTabs.bottomTabsProgress) * f);
        int iDp = AndroidUtilities.dp(10.0f) * Math.min(1, i2 / AndroidUtilities.dp(60.0f));
        if (i2 <= 0) {
            return;
        }
        float[] fArr = (float[]) this.entries;
        fArr[3] = 0.0f;
        fArr[2] = 0.0f;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        float f2 = iDp;
        fArr[7] = f2;
        fArr[6] = f2;
        fArr[5] = f2;
        fArr[4] = f2;
        Path path = (Path) this.entriesByLocation;
        path.rewind();
        RectF rectF = (RectF) this.boundary;
        rectF.set(0.0f, 0.0f, i, (bottomSheetTabs.getY() + bottomSheetTabs.getHeight()) - i2);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        Paint paint = (Paint) this.filePos;
        paint.setAlpha(0);
        if (z) {
            paint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(1.0f), 268435456);
            canvas.drawPath(path, paint);
        }
        canvas.clipPath(path);
    }

    @Override
    public boolean drawBackground() {
        return true;
    }

    @Override
    public void drawRoundRect(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
        Paint paint;
        BlurringShader.BlurManager blurManager;
        BlurringShader.StoryBlurDrawer storyBlurDrawer = (BlurringShader.StoryBlurDrawer) this.entries;
        Paint paint2 = (Paint) this.entriesByLocation;
        PaintView paintView = (PaintView) this.filePos;
        if (!z && (blurManager = paintView.blurManager) != null && blurManager.hasRenderNode()) {
            if (z) {
                storyBlurDrawer = (BlurringShader.StoryBlurDrawer) this.file;
            }
            Path path = (Path) this.boundary;
            path.rewind();
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            storyBlurDrawer.drawRect(canvas, true);
            paint2.setAlpha((int) (i * 0.4f));
            canvas.drawPaint(paint2);
            canvas.restore();
            return;
        }
        if (z) {
            if (((BlurringShader.StoryBlurDrawer) this.file) == null) {
                this.file = new BlurringShader.StoryBlurDrawer(paintView.blurManager, paintView.reactionLayout.getReactionsWindow().windowView, 0, false);
            }
            float f4 = -f2;
            float f5 = -f3;
            ((BlurringShader.StoryBlurDrawer) this.file).setBounds(f4, f5, paintView.getMeasuredWidth() + f4, paintView.getMeasuredHeight() + f5);
            paint = ((BlurringShader.StoryBlurDrawer) this.file).paint;
        } else {
            float f6 = -f2;
            float f7 = -f3;
            storyBlurDrawer.setBounds(f6, f7, paintView.getMeasuredWidth() + f6, paintView.getMeasuredHeight() + f7);
            paint = storyBlurDrawer.paint;
        }
        paint.setAlpha(i);
        paint2.setAlpha((int) (i * 0.4f));
        canvas.drawRoundRect(rectF, f, f, paint);
        canvas.drawRoundRect(rectF, f, f, paint2);
    }

    @Override
    public Object get() {
        return new DefaultScheduler((Executor) ((Provider) this.file).get(), (MetadataBackendRegistry) ((Provider) this.boundary).get(), (JobInfoScheduler) ((AtomicFile) this.entries).get(), (EventStore) ((Provider) this.entriesByLocation).get(), (SynchronizationGuard) ((Provider) this.filePos).get());
    }

    @Override
    public List getCues(long j) {
        TtmlNode ttmlNode = (TtmlNode) this.file;
        ArrayList arrayList = new ArrayList();
        ttmlNode.traverseForImage(j, ttmlNode.regionId, arrayList);
        TreeMap treeMap = new TreeMap();
        ttmlNode.traverseForText(j, false, ttmlNode.regionId, treeMap);
        HashMap map = (HashMap) this.entriesByLocation;
        ttmlNode.traverseForStyle(j, (Map) this.boundary, map, ttmlNode.regionId, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Pair pair = (Pair) obj;
            String str = (String) ((HashMap) this.entries).get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                TtmlRegion ttmlRegion = (TtmlRegion) map.get(pair.first);
                ttmlRegion.getClass();
                arrayList2.add(new Cue(null, null, null, bitmapDecodeByteArray, ttmlRegion.line, 0, ttmlRegion.lineAnchor, ttmlRegion.position, 0, Integer.MIN_VALUE, -3.4028235E38f, ttmlRegion.width, ttmlRegion.height, false, -16777216, ttmlRegion.verticalType, 0.0f));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            TtmlRegion ttmlRegion2 = (TtmlRegion) map.get(entry.getKey());
            ttmlRegion2.getClass();
            Cue.Builder builder = (Cue.Builder) entry.getValue();
            CharSequence charSequence = builder.text;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (DeleteTextSpan deleteTextSpan : (DeleteTextSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), DeleteTextSpan.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(deleteTextSpan), spannableStringBuilder.getSpanEnd(deleteTextSpan), (CharSequence) "");
            }
            for (int i2 = 0; i2 < spannableStringBuilder.length(); i2++) {
                if (spannableStringBuilder.charAt(i2) == ' ') {
                    int i3 = i2 + 1;
                    int i4 = i3;
                    while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                        i4++;
                    }
                    int i5 = i4 - i3;
                    if (i5 > 0) {
                        spannableStringBuilder.delete(i2, i5 + i2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i6 = 0; i6 < spannableStringBuilder.length() - 1; i6++) {
                if (spannableStringBuilder.charAt(i6) == '\n') {
                    int i7 = i6 + 1;
                    if (spannableStringBuilder.charAt(i7) == ' ') {
                        spannableStringBuilder.delete(i7, i6 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i8 = 0; i8 < spannableStringBuilder.length() - 1; i8++) {
                if (spannableStringBuilder.charAt(i8) == ' ') {
                    int i9 = i8 + 1;
                    if (spannableStringBuilder.charAt(i9) == '\n') {
                        spannableStringBuilder.delete(i8, i9);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            builder.line = ttmlRegion2.line;
            builder.lineType = ttmlRegion2.lineType;
            builder.lineAnchor = ttmlRegion2.lineAnchor;
            builder.position = ttmlRegion2.position;
            builder.size = ttmlRegion2.width;
            builder.textSize = ttmlRegion2.textSize;
            builder.textSizeType = ttmlRegion2.textSizeType;
            builder.verticalType = ttmlRegion2.verticalType;
            arrayList2.add(builder.build());
        }
        return arrayList2;
    }

    public OptionalProvider getDeferred(Class cls) {
        return getDeferred(Qualified.unqualified(cls));
    }

    @Override
    public long getEventTime(int i) {
        return ((long[]) this.filePos)[i];
    }

    @Override
    public int getEventTimeCount() {
        return ((long[]) this.filePos).length;
    }

    @Override
    public int getNextEventTimeIndex(long j) {
        long[] jArr = (long[]) this.filePos;
        int iBinarySearchCeil = Util.binarySearchCeil(jArr, j, false);
        if (iBinarySearchCeil < jArr.length) {
            return iBinarySearchCeil;
        }
        return -1;
    }

    @Override
    public com.google.firebase.inject.Provider getProvider(Class cls) {
        return getProvider(Qualified.unqualified(cls));
    }

    @Override
    public boolean needEnterText() {
        return false;
    }

    @Override
    public void onEmojiWindowDismissed() {
    }

    @Override
    public void onFactorChangeFinished(float f, int i) {
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        ((TextView) this.boundary).setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, ((BoolAnimator) this.entriesByLocation).floatValue));
        ((ChatActivityActionsButtonsLayout) this.filePos).checkHolderPositionsAndVisibility(this);
    }

    @Override
    public void onReactionClicked(View view, ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z, boolean z2) {
        PaintView paintView = (PaintView) this.filePos;
        ReactionWidgetEntityView reactionWidgetEntityView = paintView.reactionForEntity;
        if (reactionWidgetEntityView == null) {
            return;
        }
        reactionWidgetEntityView.setCurrentReaction(visibleReaction, true);
        paintView.showReactionsLayout(false);
    }

    public HashMap parseHeaders(BufferedReader bufferedReader) throws IOException {
        String str;
        StringBuilder sb;
        HashMap map = new HashMap();
        loop0: while (true) {
            str = null;
            sb = null;
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break loop0;
                }
                long[] jArr = (long[]) this.filePos;
                jArr[0] = jArr[0] + ((long) (line.getBytes().length + 2));
                String strTrim = line.trim();
                if (strTrim.isEmpty()) {
                    break loop0;
                }
                if (str == null || sb == null) {
                    int iIndexOf = strTrim.indexOf(58);
                    if (iIndexOf >= 0) {
                        String strTrim2 = strTrim.substring(0, iIndexOf).trim();
                        String strTrim3 = strTrim.substring(iIndexOf + 1).trim();
                        if (strTrim3.endsWith(";")) {
                            sb = new StringBuilder();
                            sb.append(strTrim3);
                            str = strTrim2;
                        } else {
                            appendHeader(strTrim2, strTrim3, map);
                        }
                    }
                } else {
                    sb.append(strTrim);
                    if (!strTrim.endsWith(";")) {
                        break;
                    }
                }
            }
            appendHeader(str, sb.toString(), map);
        }
        if (str != null && sb != null) {
            appendHeader(str, sb.toString(), map);
        }
        return map;
    }

    public String peek() {
        String str;
        synchronized (((ArrayDeque) this.entriesByLocation)) {
            str = (String) ((ArrayDeque) this.entriesByLocation).peek();
        }
        return str;
    }

    public boolean remove(Object obj) {
        boolean zRemove;
        synchronized (((ArrayDeque) this.entriesByLocation)) {
            zRemove = ((ArrayDeque) this.entriesByLocation).remove(obj);
            if (zRemove) {
                ((ScheduledThreadPoolExecutor) this.filePos).execute(new ComponentDialog$$ExternalSyntheticLambda1(this, 20));
            }
        }
        return zRemove;
    }

    public Set setOf(Class cls) {
        return setOf(Qualified.unqualified(cls));
    }

    public void setPlaceholder(Bitmap bitmap) {
        if (((Bitmap) this.entries) == bitmap) {
            return;
        }
        stopPlaceholderForActivity();
        stopPlaceholderForSource();
        this.entries = bitmap;
        CanvasButton.AnonymousClass2 anonymousClass2 = new CanvasButton.AnonymousClass2((Bitmap) this.entries);
        this.filePos = anonymousClass2;
        ((View) this.file).setBackground(anonymousClass2);
        View view = (View) this.boundary;
        if (view != null) {
            CanvasButton.AnonymousClass2 anonymousClass3 = new CanvasButton.AnonymousClass2((Bitmap) this.entries);
            this.entriesByLocation = anonymousClass3;
            view.setBackground(anonymousClass3);
        }
    }

    public void stopPlaceholderForActivity() {
        Bitmap bitmap;
        if (((CanvasButton.AnonymousClass2) this.filePos) != null) {
            ((View) this.file).setBackground(null);
            this.filePos = null;
        }
        if (((CanvasButton.AnonymousClass2) this.entriesByLocation) == null && ((CanvasButton.AnonymousClass2) this.filePos) == null && (bitmap = (Bitmap) this.entries) != null) {
            bitmap.recycle();
            this.entries = null;
        }
    }

    public void stopPlaceholderForSource() {
        Bitmap bitmap;
        if (((CanvasButton.AnonymousClass2) this.entriesByLocation) != null) {
            this.entriesByLocation = null;
            View view = (View) this.boundary;
            if (view != null) {
                view.setBackground(null);
            }
        }
        if (((CanvasButton.AnonymousClass2) this.entriesByLocation) == null && ((CanvasButton.AnonymousClass2) this.filePos) == null && (bitmap = (Bitmap) this.entries) != null) {
            bitmap.recycle();
            this.entries = null;
        }
    }

    public void zzd(Uri uri) {
        int i;
        if (uri == null) {
            zze();
            return;
        }
        if (uri.equals((Uri) this.entries)) {
            return;
        }
        zze();
        this.entries = uri;
        ImageHints imageHints = (ImageHints) this.boundary;
        int i2 = imageHints.zzb;
        Context context = (Context) this.file;
        if (i2 == 0 || (i = imageHints.zzc) == 0) {
            this.entriesByLocation = new zzf(context, 0, 0, this);
        } else {
            this.entriesByLocation = new zzf(context, i2, i, this);
        }
        zzf zzfVar = (zzf) this.entriesByLocation;
        zzah.checkNotNull(zzfVar);
        Uri uri2 = (Uri) this.entries;
        zzah.checkNotNull(uri2);
        zzfVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, uri2);
    }

    public void zze() {
        zzf zzfVar = (zzf) this.entriesByLocation;
        if (zzfVar != null) {
            zzfVar.cancel(true);
            this.entriesByLocation = null;
        }
        this.entries = null;
    }

    public zzx zzg() {
        if (((zzx) this.entriesByLocation) == null) {
            zzx zzxVar = new zzx((zzg) this.file, (String) this.boundary);
            this.entriesByLocation = zzxVar;
            zzxVar.zzh(1);
        }
        return (zzx) this.entriesByLocation;
    }

    public void zzh() {
        long jLongValue;
        zznn zznnVar;
        int i;
        zzx zzxVar = (zzx) this.entriesByLocation;
        if (zzxVar != null) {
            CastSession castSession = zzxVar.zza;
            if (castSession != null) {
                castSession.zzm = null;
                zzxVar.zza = null;
            }
            zznn zznnVarZzc$1 = zzno.zzc$1();
            zznnVarZzc$1.zzu();
            zzno.zzk((zzno) zznnVarZzc$1.zza, zzxVar.zzo);
            String str = zzxVar.zzq;
            if (str != null) {
                zznnVarZzc$1.zzu();
                zzno.zzp((zzno) zznnVarZzc$1.zza, str);
            }
            String str2 = zzxVar.zzr;
            if (str2 != null) {
                zznnVarZzc$1.zzu();
                zzno.zzl((zzno) zznnVarZzc$1.zza, str2);
            }
            zznd zzndVarZza = zzne.zza();
            String str3 = zzx.zze;
            zzndVarZza.zzu();
            zzne.zze((zzne) zzndVarZza.zza, str3);
            zzndVarZza.zzu();
            zzne.zzd((zzne) zzndVarZza.zza, zzxVar.zzm);
            zzne zzneVar = (zzne) zzndVarZza.zzq();
            zznnVarZzc$1.zzu();
            zzno.zzi((zzno) zznnVarZzc$1.zza, zzneVar);
            zznt zzntVarZza$1 = zznu.zza$1();
            Object objZza = zzxVar.zzg.zza();
            if (objZza != null) {
                zzoj zzojVarZza = zzok.zza();
                zzojVarZza.zzu();
                zzok.zzd((zzok) zzojVarZza.zza, (String) objZza);
                zzok zzokVar = (zzok) zzojVarZza.zzq();
                zzntVarZza$1.zzu();
                zznu.zzd((zznu) zzntVarZza$1.zza, zzokVar);
            }
            String str4 = zzxVar.zzp;
            if (str4 != null) {
                try {
                    String strReplace = str4.replace("-", "");
                    jLongValue = new BigInteger(strReplace.substring(0, Math.min(16, strReplace.length())), 16).longValue();
                } catch (NumberFormatException e) {
                    Object[] objArr = {str4};
                    Logger logger = zzx.zzd;
                    Log.w(logger.zza, logger.zza("receiverSessionId %s is not valid for hash", objArr), e);
                    jLongValue = 0;
                }
                zzntVarZza$1.zzu();
                zznu.zze((zznu) zzntVarZza$1.zza, jLongValue);
            }
            List<zzz> list = zzxVar.zzh;
            if (!list.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (zzz zzzVar : list) {
                    zzzVar.getClass();
                    zznr zznrVarZza$1 = zzns.zza$1();
                    zznrVarZza$1.zzu();
                    zzns.zzg((zzns) zznrVarZza$1.zza, zzzVar.zze);
                    int i2 = (int) (zzzVar.zza - zzzVar.zzd);
                    zznrVarZza$1.zzu();
                    zzns.zzd((zzns) zznrVarZza$1.zza, i2);
                    Integer num = zzzVar.zzb;
                    if (num != null) {
                        int iIntValue = num.intValue();
                        zznrVarZza$1.zzu();
                        zzns.zze((zzns) zznrVarZza$1.zza, iIntValue);
                    }
                    Boolean bool = zzzVar.zzc;
                    if (bool != null) {
                        boolean zBooleanValue = bool.booleanValue();
                        zznrVarZza$1.zzu();
                        zzns.zzf((zzns) zznrVarZza$1.zza, zBooleanValue);
                    }
                    arrayList.add((zzns) zznrVarZza$1.zzq());
                }
                zzntVarZza$1.zzu();
                zznu.zzf((zznu) zzntVarZza$1.zza, arrayList);
            }
            List<zzab> list2 = zzxVar.zzi;
            if (list2.isEmpty()) {
                zznnVar = zznnVarZzc$1;
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (zzab zzabVar : list2) {
                    zzabVar.getClass();
                    zznx zznxVarZza$1 = zzny.zza$1();
                    zznn zznnVar2 = zznnVarZzc$1;
                    int i3 = (int) (zzabVar.zzb - zzabVar.zzc);
                    zznxVarZza$1.zzu();
                    zzny.zzd((zzny) zznxVarZza$1.zza, i3);
                    int i4 = zzabVar.zza;
                    if (i4 == 1) {
                        i = 2;
                    } else if (i4 != 2) {
                        i = i4 != 3 ? 1 : 4;
                    } else {
                        i = 3;
                    }
                    zznxVarZza$1.zzu();
                    zzny.zze((zzny) zznxVarZza$1.zza, i);
                    arrayList2.add((zzny) zznxVarZza$1.zzq());
                    zznnVarZzc$1 = zznnVar2;
                }
                zznnVar = zznnVarZzc$1;
                zzntVarZza$1.zzu();
                zznu.zzh((zznu) zzntVarZza$1.zza, arrayList2);
            }
            List<zzq> list3 = zzxVar.zzj;
            if (!list3.isEmpty()) {
                ArrayList arrayList3 = new ArrayList();
                for (zzq zzqVar : list3) {
                    zzqVar.getClass();
                    zznp zznpVarZza$1 = zznq.zza$1();
                    int i5 = 11;
                    switch (zzqVar.zza) {
                        case "load":
                            i5 = 2;
                            break;
                        case "play":
                            i5 = 3;
                            break;
                        case "pause":
                            i5 = 4;
                            break;
                        case "stop":
                            i5 = 5;
                            break;
                        case "seek":
                            i5 = 6;
                            break;
                        case "volume":
                            i5 = 7;
                            break;
                        case "mute":
                            i5 = 8;
                            break;
                        case "volume-mute":
                            i5 = 9;
                            break;
                        case "status":
                            i5 = 10;
                            break;
                        case "activeTracks":
                            break;
                        case "trackStyle":
                            i5 = 12;
                            break;
                        case "queueInsert":
                            i5 = 13;
                            break;
                        case "queueUpdate":
                            i5 = 14;
                            break;
                        case "queueRemove":
                            i5 = 15;
                            break;
                        case "queueReorder":
                            i5 = 16;
                            break;
                        case "queueFetchItemIds":
                            i5 = 17;
                            break;
                        case "queueFetchItemRange":
                            i5 = 18;
                            break;
                        case "queueFetchItems":
                            i5 = 19;
                            break;
                        case "setPlaybackRate":
                            i5 = 20;
                            break;
                        case "skipAd":
                            i5 = 21;
                            break;
                        case "launch":
                            i5 = 22;
                            break;
                        case "setPlaybackDevices":
                            i5 = 23;
                            break;
                        default:
                            i5 = 1;
                            break;
                    }
                    zznpVarZza$1.zzu();
                    zznq.zzh((zznq) zznpVarZza$1.zza, i5);
                    int i6 = (int) zzqVar.zzb;
                    zznpVarZza$1.zzu();
                    zznq.zzd((zznq) zznpVarZza$1.zza, i6);
                    zznpVarZza$1.zzu();
                    zznq.zze((zznq) zznpVarZza$1.zza, zzqVar.zzc);
                    int i7 = (int) (zzqVar.zzd - zzqVar.zzf);
                    zznpVarZza$1.zzu();
                    zznq.zzf((zznq) zznpVarZza$1.zza, i7);
                    int i8 = (int) (zzqVar.zze - zzqVar.zzf);
                    zznpVarZza$1.zzu();
                    zznq.zzg((zznq) zznpVarZza$1.zza, i8);
                    arrayList3.add((zznq) zznpVarZza$1.zzq());
                }
                zzntVarZza$1.zzu();
                zznu.zzg((zznu) zzntVarZza$1.zza, arrayList3);
            }
            Map map = zzxVar.zzk;
            if (!map.isEmpty()) {
                ArrayList arrayList4 = new ArrayList();
                for (zzad zzadVar : map.values()) {
                    zzadVar.getClass();
                    zznv zznvVarZza$1 = zznw.zza$1();
                    zznvVarZza$1.zzu();
                    zznw.zzg((zznw) zznvVarZza$1.zza, zzadVar.zze);
                    int i9 = zzadVar.zzd.get();
                    zznvVarZza$1.zzu();
                    zznw.zzd((zznw) zznvVarZza$1.zza, i9);
                    int i10 = (int) (zzadVar.zza - zzadVar.zzc);
                    zznvVarZza$1.zzu();
                    zznw.zze((zznw) zznvVarZza$1.zza, i10);
                    int i11 = (int) (zzadVar.zzb - zzadVar.zzc);
                    zznvVarZza$1.zzu();
                    zznw.zzf((zznw) zznvVarZza$1.zza, i11);
                    arrayList4.add((zznw) zznvVarZza$1.zzq());
                }
                zzntVarZza$1.zzu();
                zznu.zzi((zznu) zzntVarZza$1.zza, arrayList4);
            }
            zznu zznuVar = (zznu) zzntVarZza$1.zzq();
            zznnVar.zzu();
            zznn zznnVar3 = zznnVar;
            zzno.zzh((zzno) zznnVar3.zza, zznuVar);
            zzxVar.zzl.zze((zzno) zznnVar3.zzq(), 233);
            this.entriesByLocation = null;
        }
    }

    public final class BoundedInputStream extends FileInputStream {
        public final long endOffset;

        public BoundedInputStream(File file, long j, long j2) {
            super(file);
            this.endOffset = j2;
            if (j > 0 && skip(j) != j) {
                throw new RuntimeException("BoundedInputStream failed to skip");
            }
        }

        @Override
        public final int read() {
            if (getChannel().position() >= this.endOffset) {
                return -1;
            }
            return super.read();
        }

        @Override
        public final int read(byte[] bArr, int i, int i2) throws IOException {
            long jPosition = getChannel().position();
            long j = this.endOffset;
            if (jPosition >= j) {
                return -1;
            }
            long jPosition2 = j - getChannel().position();
            if (i2 > jPosition2) {
                i2 = (int) jPosition2;
            }
            return super.read(bArr, i, i2);
        }
    }

    public MHTML(TtmlNode ttmlNode, HashMap map, HashMap map2, HashMap map3) {
        this.file = ttmlNode;
        this.entriesByLocation = map2;
        this.entries = map3;
        this.boundary = DesugarCollections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        ttmlNode.getEventTimes(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.filePos = jArr;
    }

    @Override
    public OptionalProvider getDeferred(Qualified qualified) {
        if (((Set) this.entries).contains(qualified)) {
            return ((ComponentContainer) this.filePos).getDeferred(qualified);
        }
        throw new HostException("Attempting to request an undeclared dependency Deferred<" + qualified + ">.");
    }

    @Override
    public com.google.firebase.inject.Provider getProvider(Qualified qualified) {
        if (((Set) this.boundary).contains(qualified)) {
            return ((ComponentContainer) this.filePos).getProvider(qualified);
        }
        throw new HostException("Attempting to request an undeclared dependency Provider<" + qualified + ">.");
    }

    @Override
    public Set setOf(Qualified qualified) {
        if (((Set) this.entriesByLocation).contains(qualified)) {
            return ((ComponentContainer) this.filePos).setOf(qualified);
        }
        throw new HostException("Attempting to request an undeclared dependency Set<" + qualified + ">.");
    }

    @Override
    public Object get(Class cls) {
        if (((Set) this.file).contains(Qualified.unqualified(cls))) {
            Object obj = ((ComponentContainer) this.filePos).get(cls);
            if (!cls.equals(Publisher.class)) {
                return obj;
            }
            return new RestrictedComponentContainer$RestrictedPublisher();
        }
        throw new HostException("Attempting to request an undeclared dependency " + cls + ".");
    }

    public final class QuotedPrintableInputStream extends FilterInputStream {
        public QuotedPrintableInputStream(BufferedInputStream bufferedInputStream) {
            super(bufferedInputStream);
        }

        public static int hexDigitToInt(int i) {
            if (i >= 48 && i <= 57) {
                return i - 48;
            }
            if (i >= 65 && i <= 70) {
                return i - 55;
            }
            if (i < 97 || i > 102) {
                return 0;
            }
            return i - 87;
        }

        @Override
        public final int read() throws IOException {
            int i = ((FilterInputStream) this).in.read();
            if (i != 61) {
                return i;
            }
            int i2 = ((FilterInputStream) this).in.read();
            int i3 = ((FilterInputStream) this).in.read();
            if (i2 == -1 || i3 == -1) {
                return -1;
            }
            if (i2 == 13 && i3 == 10) {
                return read();
            }
            return (i2 == 10 || i3 == 10) ? i3 : (hexDigitToInt(i2) << 4) | hexDigitToInt(i3);
        }

        @Override
        public final int read(byte[] bArr, int i, int i2) throws IOException {
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = read();
                if (i5 != -1) {
                    bArr[i + i4] = (byte) i5;
                    i3++;
                } else if (i3 == 0) {
                    return -1;
                }
            }
            return i3;
        }
    }

    public MHTML(File file) throws IOException {
        HashMap map = new HashMap();
        this.entries = new ArrayList();
        this.entriesByLocation = new HashMap();
        this.filePos = new long[1];
        this.file = file;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        map.putAll(parseHeaders(bufferedReader));
        HeaderValue headerValue = (HeaderValue) map.get("content-type");
        String str = headerValue == null ? null : (String) headerValue.props.get("boundary");
        this.boundary = str;
        if (str != null) {
            int length = str.length() + 2;
            Entry entry = null;
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                long[] jArr = (long[]) this.filePos;
                jArr[0] = jArr[0] + ((long) (line.getBytes().length + 2));
                if (line.length() == length && line.substring(2).equals((String) this.boundary)) {
                    if (entry != null) {
                        entry.end = (((long[]) this.filePos)[0] - ((long) length)) - 2;
                        ((ArrayList) this.entries).add(entry);
                        HashMap map2 = (HashMap) this.entriesByLocation;
                        HeaderValue headerValue2 = (HeaderValue) entry.headers.get("content-location");
                        map2.put(headerValue2 == null ? null : headerValue2.value, entry);
                    }
                    entry = new Entry();
                    entry.file = (File) this.file;
                    entry.headers.putAll(parseHeaders(bufferedReader));
                    entry.start = ((long[]) this.filePos)[0];
                }
            }
            if (entry != null && entry.start != 0 && entry.end != 0) {
                ((ArrayList) this.entries).add(entry);
                HashMap map3 = (HashMap) this.entriesByLocation;
                HeaderValue headerValue3 = (HeaderValue) entry.headers.get("content-location");
                map3.put(headerValue3 != null ? headerValue3.value : null, entry);
            }
        }
        bufferedReader.close();
    }

    @Override
    public Object get(Qualified qualified) {
        if (((Set) this.file).contains(qualified)) {
            return ((ComponentContainer) this.filePos).get(qualified);
        }
        throw new HostException("Attempting to request an undeclared dependency " + qualified + ".");
    }

    public MHTML(BottomSheetTabs bottomSheetTabs) {
        this.boundary = new RectF();
        this.entries = new float[8];
        this.entriesByLocation = new Path();
        this.filePos = new Paint(1);
        this.file = bottomSheetTabs;
    }

    public MHTML(ChatActivityActionsButtonsLayout chatActivityActionsButtonsLayout) {
        this.filePos = chatActivityActionsButtonsLayout;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.entries = new BoolAnimator(0, this, cubicBezierInterpolator, 320L, true);
        this.entriesByLocation = new BoolAnimator(1, this, cubicBezierInterpolator, 320L, true);
    }

    public MHTML(Context context, ImageHints imageHints) {
        this.file = context;
        this.boundary = imageHints;
        zze();
    }

    public MHTML(int i) {
        switch (i) {
            case 16:
                int[] iArr = new int[1];
                this.filePos = iArr;
                ArrayList arrayList = new ArrayList();
                arrayList.add(new PointF(0.0f, 0.0f));
                arrayList.add(new PointF(0.5f, 0.5f));
                arrayList.add(new PointF(1.0f, 1.0f));
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new PointF(0.0f, 0.0f));
                arrayList2.add(new PointF(0.47f, 0.57f));
                arrayList2.add(new PointF(1.0f, 1.0f));
                float[] preparedSplineCurve = getPreparedSplineCurve(arrayList2);
                this.file = preparedSplineCurve;
                float[] preparedSplineCurve2 = getPreparedSplineCurve(arrayList);
                this.entriesByLocation = preparedSplineCurve2;
                this.entries = preparedSplineCurve2;
                this.boundary = preparedSplineCurve2;
                GLES20.glGenTextures(1, iArr, 0);
                GLES20.glBindTexture(3553, iArr[0]);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, 10240, 9729);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(1024);
                byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                if (preparedSplineCurve2.length >= 256 && preparedSplineCurve2.length >= 256 && preparedSplineCurve2.length >= 256 && preparedSplineCurve.length >= 256) {
                    for (int i2 = 0; i2 < 256; i2++) {
                        float f = i2;
                        int iMin = (int) Math.min(Math.max(((float[]) this.boundary)[i2] + f, 0.0f), 255.0f);
                        int iMin2 = (int) Math.min(Math.max(((float[]) this.entries)[i2] + f, 0.0f), 255.0f);
                        int iMin3 = (int) Math.min(Math.max(f + ((float[]) this.entriesByLocation)[i2], 0.0f), 255.0f);
                        byteBufferAllocateDirect.put((byte) Math.min(Math.max(iMin3 + ((float[]) this.file)[iMin3], 0.0f), 255.0f));
                        byteBufferAllocateDirect.put((byte) Math.min(Math.max(iMin2 + ((float[]) this.file)[iMin2], 0.0f), 255.0f));
                        byteBufferAllocateDirect.put((byte) Math.min(Math.max(iMin + ((float[]) this.file)[iMin], 0.0f), 255.0f));
                        byteBufferAllocateDirect.put((byte) -1);
                    }
                    byteBufferAllocateDirect.position(0);
                    GLES20.glTexImage2D(3553, 0, 6408, 256, 1, 0, 6408, 5121, byteBufferAllocateDirect);
                    break;
                }
                break;
            default:
                this.entries = new ArrayList();
                this.file = new ArrayList();
                this.boundary = new ArrayList();
                this.entriesByLocation = DocumentParser.CORE_FACTORY_TYPES;
                break;
        }
    }
}
