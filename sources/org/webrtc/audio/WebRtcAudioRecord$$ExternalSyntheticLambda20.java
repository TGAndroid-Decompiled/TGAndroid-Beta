package org.webrtc.audio;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.media.AudioRecord;
import android.util.Log;
import com.google.firebase.messaging.WakeLockHolder;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import org.commonmark.parser.Parser;

public final class WebRtcAudioRecord$$ExternalSyntheticLambda20 implements Callable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public WebRtcAudioRecord$$ExternalSyntheticLambda20(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final Object call() {
        String str;
        ServiceInfo serviceInfo;
        String str2;
        int i;
        ComponentName componentNameStartService;
        switch (this.$r8$classId) {
            case 0:
                return ((WebRtcAudioRecord) this.f$0).lambda$scheduleLogRecordingConfigurationsTask$0((AudioRecord) this.f$1);
            default:
                Context context = (Context) this.f$0;
                Intent intent = (Intent) this.f$1;
                Parser parser = Parser.getInstance();
                parser.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((ArrayDeque) parser.inlineParserFactory).offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (parser) {
                    try {
                        str = (String) parser.blockParserFactories;
                        if (str == null) {
                            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent2, 0);
                            if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null) {
                                Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                            } else if (!context.getPackageName().equals(serviceInfo.packageName) || (str2 = serviceInfo.name) == null) {
                                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                            } else {
                                if (str2.startsWith(".")) {
                                    parser.blockParserFactories = context.getPackageName() + serviceInfo.name;
                                } else {
                                    parser.blockParserFactories = serviceInfo.name;
                                }
                                str = (String) parser.blockParserFactories;
                            }
                            str = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (str != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str));
                    }
                    intent2.setClassName(context.getPackageName(), str);
                }
                try {
                    if (parser.hasWakeLockPermission(context)) {
                        componentNameStartService = WakeLockHolder.startWakefulService(context, intent2);
                    } else {
                        componentNameStartService = context.startService(intent2);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (componentNameStartService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i = 404;
                    } else {
                        i = -1;
                    }
                } catch (IllegalStateException e) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e);
                    i = 402;
                } catch (SecurityException e2) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e2);
                    i = 401;
                }
                return Integer.valueOf(i);
        }
    }
}
