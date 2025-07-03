package ${package};

import io.quarkus.grpc.GrpcService;

import com.orta.gos.model.ClientApi.ProcessInput;
import com.orta.gos.model.ClientApi.ProcessOutcome;
import com.orta.gos.model.Process;

import io.smallrye.mutiny.Uni;

@GrpcService
public class ProcessGrpcService implements Process {

  @Override
    public Uni<ProcessOutcome> process(ProcessInput request) {
      throw new UnsupportedOperationException("This method is not implemented yet.");
    }

}
