package org.telegram.ui.web;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Base64InputStream;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import androidx.car.app.HostException;
import androidx.core.app.ActivityCompat$$ExternalSyntheticLambda0;
import androidx.core.util.AtomicFile;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
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
import java.math.BigInteger;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.BottomSheetTabs;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.chat.layouts.ChatActivityActionsButtonsLayout;
import org.telegram.ui.Gifts.ProfileGiftsContainer;

public final class MHTML implements Factory, Subtitle, ComponentContainer, FactorAnimator.Target {
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

    public static void appendHeader(HashMap map, String str, String str2) {
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
                        strTrim3 = Fragment$$ExternalSyntheticOutline0.m(1, 1, strTrim3);
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

    public AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame build() {
        String strM$1 = ((Long) this.file) == null ? " pc" : "";
        if (((String) this.boundary) == null) {
            strM$1 = strM$1.concat(" symbol");
        }
        if (((Long) this.entriesByLocation) == null) {
            strM$1 = Fragment$$ExternalSyntheticOutline0.m$1(strM$1, " offset");
        }
        if (((Integer) this.filePos) == null) {
            strM$1 = Fragment$$ExternalSyntheticOutline0.m$1(strM$1, " importance");
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
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        ((TextView) this.boundary).setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, ((BoolAnimator) this.entriesByLocation).floatValue));
        ((ChatActivityActionsButtonsLayout) this.filePos).checkHolderPositionsAndVisibility(this);
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
                            appendHeader(map, strTrim2, strTrim3);
                        }
                    }
                } else {
                    sb.append(strTrim);
                    if (!strTrim.endsWith(";")) {
                        break;
                    }
                }
            }
            appendHeader(map, str, sb.toString());
        }
        if (str != null && sb != null) {
            appendHeader(map, str, sb.toString());
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
                ((ScheduledThreadPoolExecutor) this.filePos).execute(new ActivityCompat$$ExternalSyntheticLambda0(this, 19));
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
        ProfileGiftsContainer.AnonymousClass3 anonymousClass3 = new ProfileGiftsContainer.AnonymousClass3((Bitmap) this.entries);
        this.filePos = anonymousClass3;
        ((View) this.file).setBackground(anonymousClass3);
        View view = (View) this.boundary;
        if (view != null) {
            ProfileGiftsContainer.AnonymousClass3 anonymousClass4 = new ProfileGiftsContainer.AnonymousClass3((Bitmap) this.entries);
            this.entriesByLocation = anonymousClass4;
            view.setBackground(anonymousClass4);
        }
    }

    public void stopPlaceholderForActivity() {
        Bitmap bitmap;
        if (((ProfileGiftsContainer.AnonymousClass3) this.filePos) != null) {
            ((View) this.file).setBackground(null);
            this.filePos = null;
        }
        if (((ProfileGiftsContainer.AnonymousClass3) this.entriesByLocation) == null && ((ProfileGiftsContainer.AnonymousClass3) this.filePos) == null && (bitmap = (Bitmap) this.entries) != null) {
            bitmap.recycle();
            this.entries = null;
        }
    }

    public void stopPlaceholderForSource() {
        Bitmap bitmap;
        if (((ProfileGiftsContainer.AnonymousClass3) this.entriesByLocation) != null) {
            this.entriesByLocation = null;
            View view = (View) this.boundary;
            if (view != null) {
                view.setBackground(null);
            }
        }
        if (((ProfileGiftsContainer.AnonymousClass3) this.entriesByLocation) == null && ((ProfileGiftsContainer.AnonymousClass3) this.filePos) == null && (bitmap = (Bitmap) this.entries) != null) {
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
}
