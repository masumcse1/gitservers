package com.gityou.server;
 
import org.eclipse.jgit.errors.RepositoryNotFoundException;
import org.eclipse.jgit.internal.storage.file.FileRepository;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.transport.ServiceMayNotContinueException;
import org.eclipse.jgit.transport.resolver.RepositoryResolver;
import org.eclipse.jgit.transport.resolver.ServiceNotAuthorizedException;
import org.eclipse.jgit.transport.resolver.ServiceNotEnabledException;
 
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
 
public class GitHttpResolver implements RepositoryResolver<HttpServletRequest> {
    @Override
    public Repository open(HttpServletRequest request, String name) throws RepositoryNotFoundException, ServiceNotAuthorizedException, ServiceNotEnabledException, ServiceMayNotContinueException {
        System.out.println("ServletPath: " + request.getServletPath());
        System.out.println("name: " + name);
 
        try {
            return new FileRepository("D:\\github learning-m\\ourgit\\repository\\masum\\url.git\\.git");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}