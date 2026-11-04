package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
public final class d extends InputConnectionWrapper {
    public final e f54770a;

    public d(InputConnection inputConnection, e eVar) {
        super(inputConnection, false);
        this.f54770a = eVar;
    }

    @Override
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        Object[] objArr;
        String str2;
        ResultReceiver resultReceiver;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        e eVar = this.f54770a;
        boolean z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        if (bundle != null) {
            if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                objArr = null;
            } else if (TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                objArr = 1;
            }
            if (objArr != null) {
                str2 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
            } else {
                str2 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
            }
            try {
                resultReceiver = (ResultReceiver) bundle.getParcelable(str2);
                if (objArr != null) {
                    str3 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";
                } else {
                    str3 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
                }
            } catch (Throwable th2) {
                th = th2;
                resultReceiver = null;
            }
            try {
                Uri uri = (Uri) bundle.getParcelable(str3);
                if (objArr != null) {
                    str4 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
                } else {
                    str4 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
                }
                ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(str4);
                if (objArr != null) {
                    str5 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
                } else {
                    str5 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
                }
                Uri uri2 = (Uri) bundle.getParcelable(str5);
                if (objArr != null) {
                    str6 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
                } else {
                    str6 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
                }
                int i3 = bundle.getInt(str6);
                if (objArr != null) {
                    str7 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
                } else {
                    str7 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
                }
                Bundle bundle2 = (Bundle) bundle.getParcelable(str7);
                if (uri != null && clipDescription != null) {
                    ?? obj = new Object();
                    if (Build.VERSION.SDK_INT >= 25) {
                        obj.f40562a = new g(uri, clipDescription, uri2);
                    } else {
                        obj.f40562a = new p7.d(uri, clipDescription, uri2, 12);
                    }
                    z10 = eVar.m(obj, i3, bundle2);
                }
                if (resultReceiver != null) {
                    resultReceiver.send(z10 ? 1 : 0, null);
                }
            } catch (Throwable th3) {
                th = th3;
                if (resultReceiver != null) {
                    resultReceiver.send(0, null);
                }
                throw th;
            }
        }
        if (z10) {
            return true;
        }
        return super.performPrivateCommand(str, bundle);
    }
}
