package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
public final class d extends InputConnectionWrapper {
    public final e f47863a;

    public d(InputConnection inputConnection, e eVar) {
        super(inputConnection, false);
        this.f47863a = eVar;
    }

    @Override
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z4;
        String str2;
        ResultReceiver resultReceiver;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        e eVar = this.f47863a;
        boolean z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        if (bundle != null) {
            if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                z4 = false;
            } else {
                z4 = TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str) ? true : true;
            }
            if (z4) {
                str2 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
            } else {
                str2 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
            }
            try {
                resultReceiver = (ResultReceiver) bundle.getParcelable(str2);
                if (z4) {
                    str3 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";
                } else {
                    str3 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
                }
                try {
                    Uri uri = (Uri) bundle.getParcelable(str3);
                    if (z4) {
                        str4 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
                    } else {
                        str4 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
                    }
                    ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(str4);
                    if (z4) {
                        str5 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
                    } else {
                        str5 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
                    }
                    Uri uri2 = (Uri) bundle.getParcelable(str5);
                    if (z4) {
                        str6 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
                    } else {
                        str6 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
                    }
                    int i10 = bundle.getInt(str6);
                    if (z4) {
                        str7 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
                    } else {
                        str7 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
                    }
                    Bundle bundle2 = (Bundle) bundle.getParcelable(str7);
                    if (uri != null && clipDescription != null) {
                        z10 = eVar.d(new i(uri, clipDescription, uri2), i10, bundle2);
                    }
                    if (resultReceiver != null) {
                        resultReceiver.send(z10 ? 1 : 0, null);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (resultReceiver != null) {
                        resultReceiver.send(0, null);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                resultReceiver = null;
            }
        }
        if (z10) {
            return true;
        }
        return super.performPrivateCommand(str, bundle);
    }
}
