package v8;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
public final class v extends Fragment {
    public static final int d = 0;
    public int f48249a;
    public u f48250b;
    public boolean f48251c;

    public final void a(Task task) {
        if (!this.f48251c) {
            int i10 = 1;
            this.f48251c = true;
            Activity activity = getActivity();
            activity.getFragmentManager().beginTransaction().remove(this).commit();
            if (task != null) {
                int i11 = this.f48249a;
                int i12 = a.f48173c;
                if (activity.isFinishing()) {
                    if (Log.isLoggable("AutoResolveHelper", 3)) {
                        Log.d("AutoResolveHelper", "Ignoring task result for, Activity is finishing.");
                        return;
                    }
                    return;
                }
                Exception exception = task.getException();
                if (exception instanceof com.google.android.gms.common.api.p) {
                    try {
                        ((com.google.android.gms.common.api.p) exception).getStatus().c(activity, i11);
                        return;
                    } catch (IntentSender.SendIntentException e7) {
                        if (Log.isLoggable("AutoResolveHelper", 6)) {
                            Log.e("AutoResolveHelper", "Error starting pending intent!", e7);
                            return;
                        }
                        return;
                    }
                }
                Intent intent = new Intent();
                if (task.isSuccessful()) {
                    i iVar = (i) task.getResult();
                    iVar.getClass();
                    Parcel obtain = Parcel.obtain();
                    iVar.writeToParcel(obtain, 0);
                    byte[] marshall = obtain.marshall();
                    obtain.recycle();
                    intent.putExtra("com.google.android.gms.wallet.PaymentData", marshall);
                    i10 = -1;
                } else if (exception instanceof com.google.android.gms.common.api.f) {
                    com.google.android.gms.common.api.f fVar = (com.google.android.gms.common.api.f) exception;
                    intent.putExtra("com.google.android.gms.common.api.AutoResolveHelper.status", new Status(fVar.getStatusCode(), fVar.getMessage(), null, null));
                } else {
                    if (Log.isLoggable("AutoResolveHelper", 6)) {
                        Log.e("AutoResolveHelper", "Unexpected non API exception!", exception);
                    }
                    intent.putExtra("com.google.android.gms.common.api.AutoResolveHelper.status", new Status(8, "Unexpected non API exception when trying to deliver the task result to an activity!", null, null));
                }
                a.b(activity, i11, i10, intent);
                return;
            }
            a.b(activity, this.f48249a, 0, new Intent());
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f48249a = getArguments().getInt("requestCode");
        if (a.f48172b != getArguments().getLong("initializationElapsedRealtime")) {
            this.f48250b = null;
        } else {
            this.f48250b = (u) u.f48244e.get(getArguments().getInt("resolveCallId"));
        }
        boolean z10 = false;
        if (bundle != null && bundle.getBoolean("delivered")) {
            z10 = true;
        }
        this.f48251c = z10;
    }

    @Override
    public final void onPause() {
        super.onPause();
        u uVar = this.f48250b;
        if (uVar != null && uVar.f48247b == this) {
            uVar.f48247b = null;
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        u uVar = this.f48250b;
        if (uVar != null) {
            uVar.f48247b = this;
            uVar.a();
            return;
        }
        if (Log.isLoggable("AutoResolveHelper", 5)) {
            Log.w("AutoResolveHelper", "Sending canceled result for garbage collected task!");
        }
        a(null);
    }

    @Override
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("delivered", this.f48251c);
        u uVar = this.f48250b;
        if (uVar != null && uVar.f48247b == this) {
            uVar.f48247b = null;
        }
    }
}
